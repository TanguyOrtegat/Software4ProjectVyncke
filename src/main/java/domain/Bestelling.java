package domain;

import java.util.List;

public class Bestelling {
    private int Id;
    private List<Ketel> Items;
    private Klant klant;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public List<Ketel> getItems() {
        return Items;
    }

    public void setItems(List<Ketel> items) {
        Items = items;
    }

    public Klant getKlant() {
        return klant;
    }

    public void setKlant(Klant klant) {
        this.klant = klant;
    }

    public Bestelling(int id, List<Ketel> items, Klant klant) {
        Id = id;
        Items = items;
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
