package be.vyncke.domain;

import java.io.Serializable;
import java.util.Date;


public class Klant extends Persoon implements Serializable {
    private int persoon_ID;
    private String bedrijf;
    private String email;
    private String lijstHuurContracten;
    private enum type {};

    public String getBedrijf() {
        return bedrijf;
    }

    public void setBedrijf(String bedrijf) {
        this.bedrijf = bedrijf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLijstHuurContracten() {
        return lijstHuurContracten;
    }

    public void setLijstHuurContracten(String lijstHuurContracten) {
        this.lijstHuurContracten = lijstHuurContracten;
    }

    public Klant(int persoon_ID, Date geboorteDatum, String voornaam, String achternaam, int persoon_ID1, String bedrijf, String email, String lijstHuurContracten) {
        super(persoon_ID, geboorteDatum, voornaam, achternaam);
        this.persoon_ID = persoon_ID1;
        this.bedrijf = bedrijf;
        this.email = email;
        this.lijstHuurContracten = lijstHuurContracten;
    }
}
