package daos;

import io.ebean.Ebean;
import io.ebean.EbeanServer;
import models.Usuario;
import play.db.ebean.EbeanConfig;
import repository.DatabaseExecutionContext;

import javax.inject.Inject;
import java.util.*;
import java.util.concurrent.CompletionStage;

import static java.util.concurrent.CompletableFuture.supplyAsync;

public class UsuarioDAO {

    private final EbeanServer ebeanServer;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public UsuarioDAO(EbeanConfig ebeanConfig, DatabaseExecutionContext executionContext) {
        this.ebeanServer = Ebean.getServer(ebeanConfig.defaultServer());
        this.executionContext = executionContext;
    }

    public Optional<Usuario> comEmail(String email) {
        Usuario usuario = ebeanServer.find(Usuario.class)
                .where()
                .eq("email", email)
                .findUnique();

        return Optional.ofNullable(usuario);
    }

    public Optional<Usuario> comEmailESenha(String email, String senha) {
        Usuario usuario = ebeanServer.find(Usuario.class)
                .where()
                .eq("email", email)
                .eq("senha", senha).findUnique();
        return Optional.ofNullable(usuario);
    }

    public Optional<Usuario> comToken(String codigo) {
        Usuario usuario = ebeanServer.find(Usuario.class)
                .where()
                .eq("token.codigo", codigo)
                .findUnique();
        return Optional.ofNullable(usuario);
    }

    public List<Usuario> todos() {
        return ebeanServer.find(Usuario.class).findList();
    }

    public CompletionStage<Map<String, String>> options() {
        return supplyAsync(() -> ebeanServer.find(Usuario.class).orderBy("nome").findList(), executionContext)
                .thenApply(list -> {
                    HashMap<String, String> options = new LinkedHashMap<String, String>();
                    for (Usuario p : list) {
                        options.put(Long.toString(p.getId()), p.getNome());
                    }
                    return options;
                });
    }

}
