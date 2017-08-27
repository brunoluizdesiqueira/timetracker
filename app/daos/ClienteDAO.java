package daos;

import io.ebean.Ebean;
import io.ebean.EbeanServer;
import io.ebean.PagedList;
import models.Cliente;
import play.db.ebean.EbeanConfig;
import repository.DatabaseExecutionContext;

import javax.inject.Inject;
import java.util.*;
import java.util.concurrent.CompletionStage;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class ClienteDAO {

    private final EbeanServer ebeanServer;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public ClienteDAO(EbeanConfig ebeanConfig, DatabaseExecutionContext executionContext) {
        this.ebeanServer = Ebean.getServer(ebeanConfig.defaultServer());
        this.executionContext = executionContext;
    }

    public Optional<Cliente> comId(Long id) {
        Cliente cliente = ebeanServer.find(Cliente.class).setId(id).findUnique();
        return Optional.ofNullable(cliente);
    }

    public Optional<Cliente> comNome(String nome) {
        Cliente cliente = ebeanServer.find(Cliente.class).
                where().
                eq("nome", nome).
                findUnique();

        return Optional.ofNullable(cliente);
    }

    public List<Cliente> todos() {
        return ebeanServer.find(Cliente.class).findList();
    }

    public CompletionStage<Map<String, String>> options() {
        return supplyAsync(() -> ebeanServer.find(Cliente.class).orderBy("nome").findList(), this.executionContext)
                .thenApply(list -> {
                    HashMap<String, String> options = new LinkedHashMap<String, String>();
                    for (Cliente c : list) {
                        options.put(Long.toString(c.getId()), c.getNome());
                    }
                    return options;
                });
    }

    /**
     * Return a paged list of cliente
     *
     * @param page     Page to display
     * @param pageSize Number of clientes per page
     * @param sortBy   Cliente property used for sorting
     * @param order    Sort order (either or asc or desc)
     * @param filter   Filter applied on the nome column
     */
    public CompletionStage<PagedList<Cliente>> page(int page, int pageSize, String sortBy, String order, String filter) {
        return supplyAsync(() -> {
            return ebeanServer.find(Cliente.class).where()
                    .ilike("nome", "%" + filter + "%")
                    .orderBy(sortBy + " " + order)
                    .setFirstRow(page * pageSize)
                    .setMaxRows(pageSize)
                    .findPagedList();
        }, executionContext);
    }
}
