package validadores;

import daos.TarefaDAO;
import models.Tarefa;
import play.data.Form;
import play.data.validation.ValidationError;

import javax.inject.Inject;

public class ValidadorDeTarefa {

    @Inject
    TarefaDAO tarefaDAO;

    public boolean temErros(Form<Tarefa> formulario) {
        validaTitulo(formulario);
        return formulario.hasErrors();
    }

    public void validaTitulo(Form<Tarefa> formulario) {
        String titulo = formulario.field("titulo").valueOr("");

        if (tarefaDAO.comTitulo(titulo).isPresent()) {
            formulario.reject(new ValidationError("nome", "Já existente uma tarefa cadastrada com esse título!"));
        }
    }
}