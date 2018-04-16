package be.vyncke.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="bestellingen")
public class Bestelling implements Serializable {

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @OneToMany(mappedBy = "bestelling")
    private List<Ketel> items;

    @OneToOne
    @JoinColumn(name = "klant_id")
    private Klant klant;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Ketel> getItems() {
        return items;
    }

    public void setItems(List<Ketel> items) {
        this.items = items;
    }

    public Klant getKlant() {
        return klant;
    }

    public void setKlant(Klant klant) {
        this.klant = klant;
    }

    public Bestelling(int id, List<Ketel> items, Klant klant) {
        this.id = id;
        this.items = items;
        this.klant = klant;
    }

    public void BestellingAfronden(){

    }
    public void BestellingGeneren(){

    }
    public void BestellingGoedkeuren(){

    }
    public void BestellingWeigeren(){

    }
    public void BestellingWijzigen(){

    }
    public void OverzichtOproepen(){

    }

}
