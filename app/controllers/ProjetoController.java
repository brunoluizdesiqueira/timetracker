package controllers;


import daos.ClienteDAO;
import daos.ProjetoDAO;
import models.Cliente;
import models.Projeto;
import play.data.Form;
import play.data.FormFactory;
import play.db.ebean.Transactional;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Result;
import validadores.ValidadorDeProjeto;
import views.html.formularioDeNovoProjeto;

import javax.inject.Inject;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletionStage;

public class ProjetoController extends Controller {


    private final FormFactory formularios;
    private final ValidadorDeProjeto validadorDeProjeto;
    private final ClienteDAO clienteDAO;
    private final ProjetoDAO projetoDAO;
    private final HttpExecutionContext httpExecutionContext;

    @Inject
    public ProjetoController(FormFactory formularios,
                             ValidadorDeProjeto validadorDeProjeto,
                             ClienteDAO clienteDAO,
                             ProjetoDAO projetoDAO, HttpExecutionContext httpExecutionContext) {

        this.validadorDeProjeto = validadorDeProjeto;
        this.formularios = formularios;
        this.clienteDAO = clienteDAO;
        this.projetoDAO = projetoDAO;
        this.httpExecutionContext = httpExecutionContext;
    }

    public CompletionStage<Result> modalDeNovoProjeto() {

        Form<Projeto> form = formularios.form(Projeto.class);

        // Run clientes db operation and then render the form
        return clienteDAO.options().thenApplyAsync((Map<String, String> opClientes) -> {
            // This is the HTTP rendering thread context
            return ok(views.html.modalDeNovoProjeto.render(form, opClientes));
        }, httpExecutionContext.current());
    }

    public CompletionStage<Result> formularioDeNovoProjeto() {

        Form<Projeto> formulario = formularios.form(Projeto.class);

        // Run clientes db operation and then render the form
        return clienteDAO.options().thenApplyAsync((Map<String, String> opClientes) -> {
            // This is the HTTP rendering thread context
            return ok(views.html.formularioDeNovoProjeto.render(formulario, opClientes));
        }, httpExecutionContext.current());
    }

    @Transactional
    public CompletionStage<Result> salvaNovoProjeto() {

        Form<Projeto> formulario = formularios.form(Projeto.class).bindFromRequest();

        Projeto projeto = formulario.get();

        if (validadorDeProjeto.temErros(formulario)) {
            flash("danger", "Há erros no formulário de cadastro de projeto!");

            return clienteDAO.options().thenApplyAsync((Map<String, String> opClientes) -> {
                // This is the HTTP rendering thread context
                return badRequest(formularioDeNovoProjeto.render(formulario, opClientes));
            }, httpExecutionContext.current());
        }

        String cliente_id = formulario.field("cliente_id").valueOr("");

        if (cliente_id.isEmpty()) {
            formulario.reject("Cliente não foi encontrado!");
        } else {
            Optional<Cliente> clienteSelecionado = clienteDAO.comId(Long.parseLong(cliente_id));

            if (clienteSelecionado.isPresent()) {
                Cliente cliente = clienteSelecionado.get();
                projeto.setCliente(cliente);
            }
        }

        return projetoDAO.save(projeto).thenApplyAsync(data -> {
            flash("success", "Gravado com sucesso!");
            return ok();
        }, httpExecutionContext.current());

    }

}