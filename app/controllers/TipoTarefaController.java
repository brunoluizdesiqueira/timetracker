package controllers;

import models.TipoTarefa;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import validadores.ValidadorDeTipoTarefa;
import views.html.formularioDeNovoTipoTarefa;

import javax.inject.Inject;

public class TipoTarefaController extends Controller {

    @Inject
    private FormFactory formularios;

    @Inject
    private ValidadorDeTipoTarefa validadorDeTipoTarefa;

    public Result formularioDeNovoTipoTarefa() {
        Form<TipoTarefa> formulario = formularios.form(TipoTarefa.class);
        return ok(formularioDeNovoTipoTarefa.render(formulario));
    }

    public Result salvaNovoTipoTarefa() {
        Form<TipoTarefa> formulario = formularios.form(TipoTarefa.class).bindFromRequest();
        TipoTarefa tipoTarefa = formulario.get();

        if (validadorDeTipoTarefa.temErros(formulario)) {
            flash("danger", "Há erros no formulário de cadastro de tipo de tarefa!");
            return badRequest(formularioDeNovoTipoTarefa.render(formulario));
        }

        tipoTarefa.save();
        return redirect(routes.TarefaController.formularioDeNovaTarefa());
    }
}