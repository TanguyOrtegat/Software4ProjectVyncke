package domain;


import java.util.Date;

public class Personeel extends Persoon {
    private int personeel_ID;
    private enum departement {};
    private String functie;

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public void beschikbaarStellen(){

    }

    public void ontslaan() {

    }

    public void verlofNemen() {

    }

    public Personeel(int persoon_ID, Date geboorteDatum, String voornaam, String achternaam, int personeel_ID, String functie) {
        super(persoon_ID, geboorteDatum, voornaam, achternaam);
        this.personeel_ID = personeel_ID;
        this.functie = functie;
    }
}