package models;

import models.enumeradores.TipoTransicao;
import play.data.validation.Constraints.Required;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Tarefa extends BaseModel {

    @Required(message = "Você precisa fornecer o título da tarefa!")
    private String titulo;

    @Required(message = "Você precisa fornecer a descrição da tarefa!")
    private String descricao;

    @ManyToOne
    private TipoTarefa tipo;

    @ManyToOne
    private Usuario responsavel;

    @ManyToOne
    private Usuario membro;

    private LocalDate criacao = LocalDate.now();

    @ManyToOne
    private Projeto projeto;

    @OneToMany(mappedBy = "tarefa")
    private List<Tag> tags;

    @OneToMany(mappedBy = "tarefa")
    private List<Evento> eventos = new ArrayList<Evento>();

    public Tarefa(String descricao, Usuario responsavel, Usuario membro) {
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.membro = membro;
        this.eventos.add(new Evento(this, TipoTransicao.CRIADO, "Criação da tarefa", responsavel));
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoTarefa getTipo() {
        return tipo;
    }

    public void setTipo(TipoTarefa tipo) {
        this.tipo = tipo;
    }

    public Usuario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
    }

    public LocalDate getCriacao() {
        return criacao;
    }

    public void setCriacao(LocalDate criacao) {
        this.criacao = criacao;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public Usuario getMembro() {
        return membro;
    }

    public void setMembro(Usuario membro) {
        this.membro = membro;
    }

    public Duration getTempoTotal() {
        return Duration.between(this.eventos.get(0).getInstante(), this.eventos.get(this.eventos.size() - 1).getInstante());
    }

    public void registrar(TipoTransicao transicao, String descricao, Usuario usuarioParecer) {
        eventos.add(new Evento(this, transicao, descricao, usuarioParecer));
    }

}
