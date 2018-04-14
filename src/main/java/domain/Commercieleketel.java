package domain;

public class Commercieleketel extends Ketel {


    private String Specificaties;//Moet dit een list zijn??

    public Commercieleketel(int id, String type, String Specificaties){
        super(id,type);
        this.Specificaties = Specificaties;
    }

    public String getSpecificaties() {
        return Specificaties;
    }
    public void setSpecificaties(String specificaties) {
        Specificaties = specificaties;
    }
}
