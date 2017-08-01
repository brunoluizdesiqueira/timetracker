package controllers;

import models.Cliente;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import validadores.ValidadorDeCliente;
import views.html.formularioDeNovoCliente;

import javax.inject.Inject;

public class ClienteController extends Controller {

    @Inject
    private FormFactory formularios;
    @Inject
    private ValidadorDeCliente validadorDeCliente;

    public Result formularioDeNovoCliente() {
        Form<Cliente> formulario = formularios.form(Cliente.class);
        return ok(formularioDeNovoCliente.render(formulario));
    }

    public Result salvaNovoCliente() {
        Form<Cliente> formulario = formularios.form(Cliente.class).bindFromRequest();

        Cliente cliente = formulario.get();

        if (validadorDeCliente.temErros(formulario)) {
            flash("danger", "Há erros no formulário de cadastro de cliente!");
            return badRequest(formularioDeNovoCliente.render(formulario));
        }

        cliente.save();
        return redirect(routes.ClienteController.formularioDeNovoCliente());
    }
}