package be.vyncke.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="projecten")
public class Project implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int Id;
    private List<Personeel> personeel;

    @Column
    private Personeel projectleider;

    @Column
    private String status;

    @OneToOne
    @JoinColumn(name = "bestelling_id")
    private Bestelling bestelling;

    public Project(Bestelling bestelling, int id, List<Personeel> personeel, Personeel projectleider, String status) {
        this.bestelling = bestelling;
        Id = id;
        this.personeel = personeel;
        this.projectleider = projectleider;
        this.status = status;
    }

    public void projectAfwerken(){

    }
    public void projectOnHold(){

    }
    public void projectToewijzen(){

    }

    public Bestelling getBestelling() {
        return bestelling;
    }

    public void setBestelling(Bestelling bestelling) {
        this.bestelling = bestelling;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public List<Personeel> getPersoneel() {
        return personeel;
    }

    public void setPersoneel(List<Personeel> personeel) {
        this.personeel = personeel;
    }

    public Personeel getProjectleider() {
        return projectleider;
    }

    public void setProjectleider(Personeel projectleider) {
        this.projectleider = projectleider;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
