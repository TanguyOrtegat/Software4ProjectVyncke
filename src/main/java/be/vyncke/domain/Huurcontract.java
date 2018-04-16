package be.vyncke.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "huurcontracten")
public class Huurcontract implements Serializable {

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column
    private Date einddag;

    @Column
    private Date startdag;

    @OneToOne
    @JoinColumn(name = "demoketel_id")
    private Demoketel ketel;

    @OneToOne
    @JoinColumn(name = "klant_id")
    private Klant klant;

    public Date getEinddag() {
        return einddag;
    }

    public void setEinddag(Date einddag) {
        this.einddag = einddag;
    }

    public Date getStartdag() {
        return startdag;
    }

    public void setStartdag(Date startdag) {
        this.startdag = startdag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Ketel getKetel() {
        return ketel;
    }

    public void setKetel(Demoketel ketel) {
        this.ketel = ketel;
    }

    public Klant getKlant() {
        return klant;
    }

    public void setKlant(Klant klant) {
        this.klant = klant;
    }

    public Huurcontract(Date einddag, Date startdag, int id, Demoketel ketel, Klant klant) {
        this.einddag = einddag;
        this.startdag = startdag;
        this.id = id;
        this.ketel = ketel;
        this.klant = klant;
    }

    //public void huurContractGenerenen() ==> niet nodig?? constructor??
}
