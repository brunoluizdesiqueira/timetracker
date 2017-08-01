package controllers;

import daos.*;
import models.Evento;
import models.Projeto;
import models.Tarefa;
import models.TipoTarefa;
import models.enumeradores.TipoTransicao;
import play.data.Form;
import play.data.FormFactory;
import play.libs.concurrent.HttpExecutionContext;
import play.mvc.Controller;
import play.mvc.Result;
import validadores.ValidadorDeTarefa;
import views.html.formularioDeNovaTarefa;

import javax.inject.Inject;
import java.time.LocalDate;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class TarefaController extends Controller {

    private final FormFactory formularios;
    private final ValidadorDeTarefa validadorDeTarefa;
    private final TipoTarefaDAO tipoTarefaDAO;
    private final ProjetoDAO projetoDAO;
    private final TarefaDAO tarefaDAO;
    private final UsuarioDAO usuarioDAO;
    private final ClienteDAO clienteDAO;
    private final HttpExecutionContext httpExecutionContext;

    @Inject
    public TarefaController(FormFactory formularios,
                            ValidadorDeTarefa validadorDeTarefa,
                            TipoTarefaDAO tipoTarefaDAO,
                            ProjetoDAO projetoDAO,
                            TarefaDAO tarefaDAO, UsuarioDAO usuarioDAO,
                            ClienteDAO clienteDAO,
                            HttpExecutionContext httpExecutionContext) {

        this.formularios = formularios;
        this.validadorDeTarefa = validadorDeTarefa;
        this.tipoTarefaDAO = tipoTarefaDAO;
        this.projetoDAO = projetoDAO;
        this.tarefaDAO = tarefaDAO;
        this.usuarioDAO = usuarioDAO;
        this.clienteDAO = clienteDAO;
        this.httpExecutionContext = httpExecutionContext;
    }

    public CompletionStage<Result> formularioDeNovaTarefa() {
        Form<Tarefa> formTarefa = this.formularios.form(Tarefa.class);
        Form<Projeto> formProjeto = this.formularios.form(Projeto.class);

        CompletableFuture<Map<String, String>> csProjetos = projetoDAO.options().toCompletableFuture();
        CompletableFuture<Map<String, String>> csClientes = clienteDAO.options().toCompletableFuture();
        CompletableFuture<Map<String, String>> csTipos = tipoTarefaDAO.options().toCompletableFuture();
        CompletableFuture<Map<String, String>> csResponsaveis = usuarioDAO.options().toCompletableFuture();
        CompletableFuture<Map<String, String>> csMembros = usuarioDAO.options().toCompletableFuture();

        return CompletableFuture.allOf(csProjetos, csClientes, csTipos, csResponsaveis, csMembros)
                .thenApplyAsync(aVoid -> ok(views.html.formularioDeNovaTarefa.render(formTarefa,
                        formProjeto,
                        csMembros.join(),
                        csResponsaveis.join(),
                        csTipos.join(),
                        csProjetos.join(),
                        csClientes.join())), httpExecutionContext.current());
    }

    public CompletionStage<Result> salvaNovaTarefa() {

        Form<Tarefa> formTarefa = formularios.form(Tarefa.class).bindFromRequest();

        Form<Projeto> formProjeto = this.formularios.form(Projeto.class);

        Tarefa tarefa = formTarefa.get();

        tarefa.setCriacao(LocalDate.now());

        if (validadorDeTarefa.temErros(formTarefa)) {

            flash("danger", "Há erros no formulário de cadastro de tarefa!");

            CompletableFuture<Map<String, String>> csProjetos = projetoDAO.options().toCompletableFuture();
            CompletableFuture<Map<String, String>> csClientes = clienteDAO.options().toCompletableFuture();
            CompletableFuture<Map<String, String>> csTipos = tipoTarefaDAO.options().toCompletableFuture();
            CompletableFuture<Map<String, String>> csResponsaveis = usuarioDAO.options().toCompletableFuture();
            CompletableFuture<Map<String, String>> csMembros = usuarioDAO.options().toCompletableFuture();

            return CompletableFuture.allOf(csProjetos, csClientes, csTipos, csResponsaveis, csMembros)
                    .thenApplyAsync(aVoid -> badRequest(formularioDeNovaTarefa.render(formTarefa,
                            formProjeto,
                            csMembros.join(),
                            csResponsaveis.join(),
                            csTipos.join(),
                            csProjetos.join(),
                            csClientes.join())), httpExecutionContext.current());
        }

        String tipoTarefa_id = formTarefa.field("tipoTarefa_id").valueOr("");

        if (tipoTarefa_id.isEmpty()) {
            formTarefa.withGlobalError("Cadastre um tipo da tarefa!");
        } else {

            Optional<TipoTarefa> cliente = tipoTarefaDAO.comId(Long.parseLong(tipoTarefa_id));

            if (cliente.isPresent()) {
                TipoTarefa tipo = cliente.get();
                tarefa.setTipo(tipo);
            }
        }

        String projeto_id = formTarefa.field("projeto_id").valueOr("");

        if (projeto_id.isEmpty()) {
            formTarefa.withGlobalError("O projeto não foi encontrado!");
        } else {
            Optional<Projeto> projetoSelecionado = projetoDAO.comId(Long.parseLong(projeto_id));

            if (projetoSelecionado.isPresent()) {
                tarefa.setProjeto(projetoSelecionado.get());
            }
        }

        return tarefaDAO.save(tarefa).thenApplyAsync(data -> {
            flash("success", "Tarefa cadastrada com sucesso!");
            new Evento(tarefa, TipoTransicao.CRIADO, "Criação da tarefa", tarefa.getResponsavel()).save();
            return redirect(routes.TarefaController.formularioDeNovaTarefa());
        }, httpExecutionContext.current());
    }
}