package models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.Date;

@Entity
public class RegistroDeAcesso extends BaseModel {

    @ManyToOne
    private Usuario usuario;
    private String uri;
    private Date data;

    public RegistroDeAcesso(Usuario usuario, String uri) {
        this.usuario = usuario;
        this.uri = uri;
        this.data = new Date();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getUri() {
        return uri;
    }

    public Date getData() {
        return data;
    }
}
