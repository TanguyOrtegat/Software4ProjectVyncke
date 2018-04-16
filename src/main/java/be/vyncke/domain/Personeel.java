package be.vyncke.domain;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Personeel")
public class Personeel extends Persoon implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column
    private String departement;
    @Column
    private String functie;

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public void beschikbaarStellen(){

    }

    public void ontslaan() {

    }

    public void verlofNemen() {

    }

    public Personeel(int persoon_ID, Date geboorteDatum, String voornaam, String achternaam, String functie, String departement) {
        super(persoon_ID, geboorteDatum, voornaam, achternaam);
        this.functie = functie;
        this.departement = departement;
    }
}