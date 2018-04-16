package be.vyncke.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Gert on 12-4-2018.
 * Id en type toegevoegd door Noë op 14-4-2018
 */

@MappedSuperclass
public class Ketel implements Serializable{

    private static final long serialVersionUID = 1L;

    @javax.persistence.Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column
    private String type;


    public Ketel(int id, String type) {
        this.type = type;
        this.id = id;
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
}
