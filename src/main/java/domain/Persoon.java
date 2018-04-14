package domain;


import java.util.Date;

public class Persoon {
    private int  persoon_ID;
    private Date geboorteDatum;
    private String voornaam;
    private String achternaam;

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public Persoon(int persoon_ID, Date geboorteDatum, String voornaam, String achternaam) {
        this.persoon_ID = persoon_ID;
        this.geboorteDatum = geboorteDatum;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
    }
}