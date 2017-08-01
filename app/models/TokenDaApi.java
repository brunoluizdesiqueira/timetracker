package models;

import org.mindrot.jbcrypt.BCrypt;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
public class TokenDaApi extends BaseModel {

    @OneToOne
    private Usuario usuario;
    private String codigo;
    private Date expiracao;

    public TokenDaApi(Usuario usuario) {
        this.usuario = usuario;
        this.expiracao = new Date();
        this.codigo = BCrypt.hashpw(this.expiracao.toString() + this.usuario.toString(), BCrypt.gensalt(8));
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getExpiracao() {
        return expiracao;
    }

    public void setExpiracao(Date expiracao) {
        this.expiracao = expiracao;
    }
}
