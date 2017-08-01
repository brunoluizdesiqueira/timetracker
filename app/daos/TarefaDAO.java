package daos;

import io.ebean.Ebean;
import io.ebean.EbeanServer;
import models.Tarefa;
import play.db.ebean.EbeanConfig;
import repository.DatabaseExecutionContext;

import javax.inject.Inject;
import java.util.*;
import java.util.concurrent.CompletionStage;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class TarefaDAO {

    private final EbeanServer ebeanServer;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public TarefaDAO(EbeanConfig ebeanConfig, DatabaseExecutionContext executionContext) {
        this.ebeanServer = Ebean.getServer(ebeanConfig.defaultServer());
        this.executionContext = executionContext;
    }

    public Optional<Tarefa> comId(Long id) {
        Tarefa tarefa = ebeanServer.find(Tarefa.class).setId(id).findUnique();
        return Optional.ofNullable(tarefa);
    }

    public Optional<Tarefa> comTitulo(String titulo) {
        Tarefa tarefa = ebeanServer.find(Tarefa.class).
                where().
                eq("titulo", titulo).
                findUnique();

        return Optional.ofNullable(tarefa);
    }

    public List<Tarefa> todos() {
        return ebeanServer.find(Tarefa.class).findList();
    }

    public CompletionStage<Map<String, String>> options() {
        return supplyAsync(() -> ebeanServer.find(Tarefa.class).orderBy("titulo").findList(), this.executionContext)
                .thenApply(list -> {
                    HashMap<String, String> options = new LinkedHashMap<String, String>();
                    for (Tarefa t : list) {
                        options.put(Long.toString(t.getId()), t.getTitulo());
                    }
                    return options;
                });
    }

    public CompletionStage<Long> insert(Tarefa tarefa) {
        return supplyAsync(() -> {
            ebeanServer.insert(tarefa);
            return tarefa.getId();
        }, executionContext);
    }

    public CompletionStage<Long> save(Tarefa tarefa) {
        return supplyAsync(() -> {
            ebeanServer.save(tarefa);
            return tarefa.getId();
        }, executionContext);
    }

}