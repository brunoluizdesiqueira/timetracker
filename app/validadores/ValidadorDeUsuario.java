package validadores;

import daos.UsuarioDAO;
import models.Usuario;
import play.data.Form;
import play.data.validation.ValidationError;

import javax.inject.Inject;

public class ValidadorDeUsuario {
    @Inject
    private UsuarioDAO usuarioDAO;

    public boolean temErros(Form<Usuario> formulario) {
        validaEmail(formulario);
        validaSenha(formulario);
        return formulario.hasErrors();
    }

    private void validaEmail(Form<Usuario> formulario) {
        String email = formulario.field("email").valueOr("");
        if (usuarioDAO.comEmail(email).isPresent()) {
            formulario.reject(new ValidationError("email", "Já existente uma pessoa cadastrado com esse e-mail!"));
        }
    }

    private void validaSenha(Form<Usuario> formulario) {
        String senha = formulario.field("senha").valueOr("");
        String confirmaSenha = formulario.field("confirmaSenha").valueOr("");

        if (confirmaSenha.isEmpty()) {
            formulario.reject(new ValidationError("confirmaSenha", "Você precida fornecer uma confirmação de senha!"));
        } else if (!senha.equals(confirmaSenha)) {
            formulario.reject(new ValidationError("senha", ""));
            formulario.reject(new ValidationError("confirmaSenha", "As senhas precisam ser iguais!"));
        }
    }
}
