package be.odisee.brainstorm.domain;

/**
 * Created by Gert on 12-4-2018.
 * Id en type toegevoegd door Noë op 14-4-2018
 */
public class Ketel {
    private int id;
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
