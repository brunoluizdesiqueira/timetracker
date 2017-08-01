package models;

import play.data.validation.Constraints.Required;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Tag extends BaseModel {
    @Required(message = "Você precisa fornecer a tag!")
    private String tag;
    @ManyToOne
    private Tarefa tarefa;

    public Tarefa getTarefa() {
        return tarefa;
    }

    public void setTarefa(Tarefa tarefa) {
        this.tarefa = tarefa;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
