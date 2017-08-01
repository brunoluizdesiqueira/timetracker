package daos;

import io.ebean.Ebean;
import io.ebean.EbeanServer;
import models.Evento;
import play.db.ebean.EbeanConfig;
import repository.DatabaseExecutionContext;

import javax.inject.Inject;
import java.util.List;
import java.util.Optional;

/**
 * Created by Bruno on 09/05/17.
 */
public class EventoDAO {

    private final EbeanServer ebeanServer;
    private final DatabaseExecutionContext executionContext;

    @Inject
    public EventoDAO(EbeanConfig ebeanConfig, DatabaseExecutionContext executionContext) {
        this.ebeanServer = Ebean.getServer(ebeanConfig.defaultServer());
        this.executionContext = executionContext;
    }

    public Optional<Evento> comId(Long id) {
        Evento timeLine = ebeanServer.find(Evento.class).setId(id).findUnique();
        return Optional.ofNullable(timeLine);
    }

    public List<Evento> todos() {
        return ebeanServer.find(Evento.class).findList();
    }
}
