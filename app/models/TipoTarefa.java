package models;

import play.data.validation.Constraints.Required;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "tipoTarefa")
public class TipoTarefa extends BaseModel {

    @Required(message = "Você precisa fornecer um nome do tipo da tarefa!")
    private String nome;

    @Required(message = "Você precisa fornecer o tempo estimado de duração para esse tipo de tarefa!")
    private String tempoEstimado;

    @OneToMany(mappedBy = "tipo")
    private List<Tarefa> tarefas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTempoEstimado() {
        return tempoEstimado;
    }

    public void setTempoEstimado(String tempoEstimado) {
        this.tempoEstimado = tempoEstimado;
    }

    public List<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
}
