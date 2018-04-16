package be.vyncke.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="klanten")
public class Klant extends Persoon implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column
    private String bedrijf;
    @Column
    private String emailBedrijf;

    public String getBedrijf() {
        return bedrijf;
    }

    public void setBedrijf(String bedrijf) {
        this.bedrijf = bedrijf;
    }

    public String getEmailBedrijf() {
        return emailBedrijf;
    }

    public void setEmailBedrijf(String email) {
        this.emailBedrijf = email;
    }

    public Klant(int persoon_ID, Date geboorteDatum, String voornaam, String achternaam, String bedrijf, String email) {
        super(persoon_ID, geboorteDatum, voornaam, achternaam);
        this.bedrijf = bedrijf;
        this.emailBedrijf = email;
    }
}
