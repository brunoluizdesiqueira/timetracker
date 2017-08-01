package daos;

import io.ebean.Ebean;
import io.ebean.EbeanServer;
import models.TipoTarefa;
import play.db.ebean.EbeanConfig;
import repository.DatabaseExecutionContext;

import javax.inject.Inject;
import java.util.*;
import java.util.concurrent.CompletionStage;

import static java.util.concurrent.CompletableFuture.supplyAsync;

/**
 * Created by Bruno on 07/05/17.
 */
public class TipoTarefaDAO {

    private final EbeanServer ebeanServer;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public TipoTarefaDAO(EbeanConfig ebeanConfig, DatabaseExecutionContext executionContext) {
        this.ebeanServer = Ebean.getServer(ebeanConfig.defaultServer());
        this.executionContext = executionContext;
    }

    public Optional<TipoTarefa> comId(Long id) {
        TipoTarefa tipoTarefa = ebeanServer.find(TipoTarefa.class).setId(id).findUnique();
        return Optional.ofNullable(tipoTarefa);
    }

    public Optional<TipoTarefa> comNome(String nome) {
        TipoTarefa tipoTarefa = ebeanServer.find(TipoTarefa.class).
                where().
                eq("nome", nome).
                findUnique();

        return Optional.ofNullable(tipoTarefa);
    }

    public List<TipoTarefa> todos() {
        return ebeanServer.find(TipoTarefa.class).findList();
    }

    public CompletionStage<Map<String, String>> options() {
        return supplyAsync(() -> ebeanServer.find(TipoTarefa.class).orderBy("nome").findList(), executionContext)
                .thenApply(list -> {
                    HashMap<String, String> options = new LinkedHashMap<String, String>();
                    for (TipoTarefa t : list) {
                        options.put(Long.toString(t.getId()), t.getNome());
                    }
                    return options;
                });
    }
}
