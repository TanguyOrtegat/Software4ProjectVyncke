package be.vyncke.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Gert on 12-4-2018.
 * Id en type toegevoegd door Noë op 14-4-2018
 */

@Entity
@Table(name="ketels")
public class Ketel implements Serializable{

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column
    private String type;

    @ManyToOne
    @JoinColumn(name = "bestelling_id")
    private Bestelling bestelling;

    public Ketel(int id, String type, Bestelling bestelling) {
        this.type = type;
        this.id = id;
        this.bestelling = bestelling;
    }

    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType( String type ) {
        this.type = type;
    }

    public Bestelling getBestelling() {
        return bestelling;
    }

    public void setBestelling( Bestelling bestelling ) {
        this.bestelling = bestelling;
    }
}
