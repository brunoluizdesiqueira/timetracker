package validadores;

import daos.TipoTarefaDAO;
import models.TipoTarefa;
import play.data.Form;
import play.data.validation.ValidationError;

import javax.inject.Inject;

/**
 * Created by Bruno on 07/05/17.
 */
public class ValidadorDeTipoTarefa {
    @Inject
    TipoTarefaDAO tipoTarefaDAO;

    public boolean temErros(Form<TipoTarefa> formulario) {
        validaNome(formulario);
        return formulario.hasErrors();
    }

    public void validaNome(Form<TipoTarefa> formulario) {
        String nome = formulario.field("nome").valueOr("");

        if (tipoTarefaDAO.comNome(nome).isPresent()) {
            formulario.reject(new ValidationError("nome", "Já existente um tipo de tarefa cadastrada com esse nome!"));
        }
    }
}
