package be.vyncke.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

// @Index bij een veld is deprecated, 
// javax.persistence.Index is te gebruiken en 
// die moet als deel van @Table worden meegegeven
@MappedSuperclass
public class Persoon implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Column
    private String status;

    @Column
    private String voornaam;

    @Column
    private String familienaam;

    @Column
    private String emailadres;

    @Column
    private String paswoord;

    @Column
    private Date geboorteDatum;

    public Persoon() {

    }

    public Persoon(int id, Date geboorteDatum, String voornaam, String familienaam) {
        this.id = id;
        this.geboorteDatum = geboorteDatum;
        this.voornaam = voornaam;
        this.familienaam = familienaam;
    }

    public Persoon(String status, String voornaam, String familienaam, String emailadres, String paswoord) {
        this.status = status;
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.emailadres = emailadres;
        this.paswoord = paswoord;
    }

    public Persoon(int id, String status, String voornaam, String familienaam, String emailadres, String paswoord) {
        this.id = id;
        this.status = status;
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.emailadres = emailadres;
        this.paswoord = paswoord;
    }

    public int getId() {
        return id;
    }

    public String getEmailadres() {
        return emailadres;
    }

    public String getPaswoord() {
        return paswoord;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getFamilienaam() {
        return familienaam;
    }

    public void setEmailadres(String emailadres) {
        this.emailadres = emailadres;
    }

    public void setFamilienaam(String familienaam) {
        this.familienaam = familienaam;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPaswoord(String paswoord) {
        this.paswoord = paswoord;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }


}