package daos;

import io.ebean.Ebean;
import io.ebean.EbeanServer;
import models.Projeto;
import play.db.ebean.EbeanConfig;
import repository.DatabaseExecutionContext;

import javax.inject.Inject;
import java.util.*;
import java.util.concurrent.CompletionStage;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class ProjetoDAO {
    private final EbeanServer ebeanServer;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public ProjetoDAO(EbeanConfig ebeanConfig, DatabaseExecutionContext executionContext) {
        this.ebeanServer = Ebean.getServer(ebeanConfig.defaultServer());
        this.executionContext = executionContext;
    }

    public Optional<Projeto> comId(long id) {
        Projeto projeto = ebeanServer.find(Projeto.class).setId(id).findUnique();
        return Optional.ofNullable(projeto);
    }

    public Optional<Projeto> comNome(String nome) {
        Projeto projeto = ebeanServer.find(Projeto.class).
                where().
                eq("nome", nome).
                findUnique();

        return Optional.ofNullable(projeto);
    }

    public List<Projeto> todos() {
        return ebeanServer.find(Projeto.class).findList();
    }

    public CompletionStage<Map<String, String>> options() {
        return supplyAsync(() -> ebeanServer.find(Projeto.class).orderBy("nome").findList(), executionContext)
                .thenApply(list -> {
                    HashMap<String, String> options = new LinkedHashMap<String, String>();
                    for (Projeto p : list) {
                        options.put(Long.toString(p.getId()), p.getNome());
                    }
                    return options;
                });
    }

    public CompletionStage<Long> insert(Projeto projeto) {
        return supplyAsync(() -> {
            ebeanServer.insert(projeto);
            return projeto.getId();
        }, executionContext);
    }

    public CompletionStage<Long> save(Projeto projeto) {
        return supplyAsync(() -> {
            ebeanServer.save(projeto);
            return projeto.getId();
        }, executionContext);
    }

}