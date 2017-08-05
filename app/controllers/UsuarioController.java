package controllers;

import autenticadores.UsuarioAutenticado;
import daos.TokenDeCadastroDAO;
import daos.UsuarioDAO;
import models.EmailDeCadastro;
import models.TokenDaApi;
import models.TokenDeCadastro;
import models.Usuario;
import org.mindrot.jbcrypt.BCrypt;
import play.api.libs.mailer.MailerClient;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Security.Authenticated;
import validadores.ValidadorDeUsuario;
import views.html.formularioDeLogin;
import views.html.formularioDeLoginTeste;
import views.html.formularioDeNovoUsuario;

import javax.inject.Inject;
import java.util.Optional;

public class UsuarioController extends Controller {

    public static final String AUTH = "AUTH";

    @Inject
    private FormFactory formularios;
    @Inject
    private MailerClient enviador;
    @Inject
    private ValidadorDeUsuario validadorDeUsuario;
    @Inject
    private UsuarioDAO usuarioDAO;
    @Inject
    private TokenDeCadastroDAO tokenDeCadastroDAO;

    public Result formularioDeNovoUsuario() {
        Form<Usuario> formulario = formularios.form(Usuario.class);
        return ok(formularioDeNovoUsuario.render(formulario));
    }

    public Result salvaNovoUsuario() {
        Form<Usuario> formulario = formularios.form(Usuario.class).bindFromRequest();

        if (validadorDeUsuario.temErros(formulario)) {
            flash("danger", "Há erros no formulário de cadastro!");
            return badRequest(formularioDeNovoUsuario.render(formulario));
        }

        Usuario usuario = formulario.get();
        usuario.setSenha(BCrypt.hashpw(usuario.getSenha(), BCrypt.gensalt(8)));
        usuario.save();

        TokenDeCadastro token = new TokenDeCadastro(usuario);
        token.save();

        enviador.send(new EmailDeCadastro(token));
        flash("success", "Um e-mail foi enviado para confiramar o cadastro!");
        return redirect(routes.UsuarioController.formularioDeLogin());
    }

    public Result formularioDeLogin() {
        return ok(formularioDeLogin.render(formularios.form()));
    }

    public Result formularioDeLoginTeste() {
        return ok(formularioDeLoginTeste.render(formularios.form()));
    }

    public Result fazLogin() {
        DynamicForm formulario = formularios.form().bindFromRequest();
        String email = formulario.get("email");
        String senha = formulario.get("senha");

        Optional<Usuario> possivelUsuario = usuarioDAO.comEmail(email);
        if (possivelUsuario.isPresent()) {
            Usuario usuario = possivelUsuario.get();

            if (usuario.isVerificado() && BCrypt.checkpw(senha, usuario.getSenha())) {
                insereUsuarioNaSessao(usuario);
                return redirect(routes.UsuarioController.painel());
            } else {
                flash("warning", "Usuário ainda não confirmado! Verifique seu e-mail!");
            }
        } else {
            flash("danger", "Credenciais inválidas!");
        }
        return redirect(routes.HomeController.home());
    }

    public Result confirmaUsuario(String email, String codigo) {
        Optional<Usuario> possivelUsuario = usuarioDAO.comEmail(email);
        Optional<TokenDeCadastro> possivelToken = tokenDeCadastroDAO.comCodigo(codigo);

        if (possivelToken.isPresent() && possivelUsuario.isPresent()) {
            TokenDeCadastro token = possivelToken.get();
            Usuario usuario = possivelUsuario.get();
            if (token.getUsuario().equals(usuario)) {
                token.delete();
                usuario.setVerificado(true);
                TokenDaApi tokenDaApi = new TokenDaApi(usuario);
                tokenDaApi.save();
                usuario.setToken(tokenDaApi);
                usuario.update();
                flash("success", "Cadastro confirmado com suacesso!");
                insereUsuarioNaSessao(usuario);
                return redirect(routes.UsuarioController.painel());
            }
        }
        flash("danger", "Algo deu errado ao tentar confirmar o cadastro!");
        return redirect(routes.UsuarioController.formularioDeLogin());
    }

    private void insereUsuarioNaSessao(Usuario usuario) {
        session(AUTH, usuario.getToken().getCodigo());
    }

    @Authenticated(UsuarioAutenticado.class)
    public Result painel() {
        String codigo = session(AUTH);
        Usuario usuario = usuarioDAO.comToken(codigo).get();

        return ok(views.html.painel.render(usuario));
    }

    @Authenticated(UsuarioAutenticado.class)
    public Result fazLogout() {
        session().clear();
        flash("success", "Logout efetuado com sucesso!");
        return redirect(routes.UsuarioController.formularioDeLogin());
    }
}
