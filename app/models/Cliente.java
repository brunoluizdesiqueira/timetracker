package models;

import models.enumeradores.Status;
import play.data.validation.Constraints.Required;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Cliente extends BaseModel {

    @Required(message = "Você precisa fornecer um nome!")
    private String nome;

    @Required(message = "Você precisa fornecer a data de cadastro!")
    private LocalDate dataCadastro = LocalDate.now();

    @Enumerated(EnumType.STRING)
    private Status status = Status.ATIVO;

    @OneToMany(mappedBy = "cliente")
    private List<Projeto> projetos;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Projeto> getProjetos() {
        return projetos;
    }

    public void setProjetos(List<Projeto> projetos) {
        this.projetos = projetos;
    }

    public Projeto getProjeto(Projeto p) {
        if (this.projetos.contains(p)) {
            return this.projetos.get(this.projetos.indexOf(p));
        } else {
            return null;
        }
    }

    public void setProjeto(Projeto projeto) {
        this.projetos.add(projeto);
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
