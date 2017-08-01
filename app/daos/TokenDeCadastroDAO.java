package daos;


import io.ebean.Ebean;
import io.ebean.EbeanServer;
import models.TokenDeCadastro;
import play.db.ebean.EbeanConfig;
import repository.DatabaseExecutionContext;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

public class TokenDeCadastroDAO {

    private final EbeanServer ebeanServer;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public TokenDeCadastroDAO(EbeanConfig ebeanConfig, DatabaseExecutionContext executionContext) {
        this.ebeanServer = Ebean.getServer(ebeanConfig.defaultServer());
        this.executionContext = executionContext;
    }

    public Optional<TokenDeCadastro> comCodigo(String codigo) {
        TokenDeCadastro tokenDeCadastro = ebeanServer.find(TokenDeCadastro.class)
                .where()
                .eq("codigo", codigo)
                .findUnique();
        return Optional.ofNullable(tokenDeCadastro);
    }

    public List<TokenDeCadastro> todos() {
        return ebeanServer.find(TokenDeCadastro.class).findList();
    }
}
