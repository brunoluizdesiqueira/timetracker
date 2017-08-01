package validadores;

import daos.ClienteDAO;
import models.Cliente;
import play.data.Form;
import play.data.validation.ValidationError;

import javax.inject.Inject;

/**
 * Classe criada para centralizar validações do cadastro de clientes
 */
public class ValidadorDeCliente {

    @Inject
    ClienteDAO clienteDAO;

    public boolean temErros(Form<Cliente> formulario) {
        validaNome(formulario);
        return formulario.hasErrors();
    }

    public void validaNome(Form<Cliente> formulario) {
        String nome = formulario.field("nome").valueOr("");

        if (clienteDAO.comNome(nome).isPresent()) {
            formulario.reject(new ValidationError("nome", "Já existente um cliente cadastrado com esse nome!"));
        }
    }
}