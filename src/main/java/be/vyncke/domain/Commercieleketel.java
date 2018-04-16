package be.vyncke.domain;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "commercieleketels")
public class Commercieleketel extends Ketel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column
    private int specificaties;

    @ManyToOne
    @JoinColumn(name = "bestelling_id")
    private Bestelling bestelling;

    public Commercieleketel(int id, String type, int specificaties, Bestelling bestelling){
        super(id,type);
        this.specificaties = specificaties;
        this.bestelling = bestelling;
    }

    public int getSpecificaties() {
        return specificaties;
    }
    public void setSpecificaties(String specificaties) {
        specificaties = specificaties;
    }

    public Bestelling getBestelling() {
        return bestelling;
    }

    public void setBestelling( Bestelling bestelling ) {
        this.bestelling = bestelling;
    }
}
