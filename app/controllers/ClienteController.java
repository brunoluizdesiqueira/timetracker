package controllers;

import daos.ClienteDAO;
import models.Cliente;
import play.data.Form;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Result;
import validadores.ValidadorDeCliente;
import views.html.formularioDeNovoCliente;

import javax.inject.Inject;
import java.util.concurrent.CompletionStage;

public class ClienteController extends Controller {


    private final FormFactory formularios;
    private final ValidadorDeCliente validadorDeCliente;
    private final ClienteDAO clienteDAO;
    private final HttpExecutionContext httpExecutionContext;

    @Inject
    public ClienteController(FormFactory formularios,
                             ValidadorDeCliente validadorDeCliente,
                             ClienteDAO clienteDAO,
                             HttpExecutionContext httpExecutionContext) {
        this.formularios = formularios;
        this.validadorDeCliente = validadorDeCliente;
        this.clienteDAO = clienteDAO;
        this.httpExecutionContext = httpExecutionContext;
    }

    /**
     * Display the paginated list of computers.
     *
     * @param page   Current page number (starts from 0)
     * @param sortBy Column to be sorted
     * @param order  Sort order (either asc or desc)
     * @param filter Filter applied on computer names
     */
    public CompletionStage<Result> list(int page, String sortBy, String order, String filter) {
        // Run a db operation in another thread (using DatabaseExecutionContext)
        return clienteDAO.page(page, 10, sortBy, order, filter).thenApplyAsync(list -> {
            // This is the HTTP rendering thread context
            return ok(views.html.listaClientes.render(list, sortBy, order, filter));
        }, httpExecutionContext.current());
    }

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