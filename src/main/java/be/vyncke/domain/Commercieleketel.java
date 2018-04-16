package be.vyncke.domain;

public class Commercieleketel extends Ketel {


    private String specificaties;//Moet dit een list zijn?

    public Commercieleketel(int id, String type, String specificaties, Bestelling bestelling){
        super(id,type,bestelling);
        this.specificaties = specificaties;
    }

    public String getSpecificaties() {
        return specificaties;
    }
    public void setSpecificaties(String specificaties) {
        specificaties = specificaties;
    }
}
