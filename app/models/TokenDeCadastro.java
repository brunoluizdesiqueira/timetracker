package models;

import org.mindrot.jbcrypt.BCrypt;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class TokenDeCadastro extends BaseModel {

    private String codigo;

    @OneToOne
    private Usuario usuario;

    public TokenDeCadastro(Usuario usuario) {
        this.usuario = usuario;
        String hash = BCrypt.hashpw(usuario.getNome() + usuario.getEmail(), BCrypt.gensalt(8));
        this.codigo = hash.replaceAll("/", "|");
    }

    public String getCodigo() {
        return codigo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

}
