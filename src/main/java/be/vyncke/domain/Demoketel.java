package be.vyncke.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "demoketels")
public class Demoketel extends Ketel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column
     private String status;

     public Demoketel(int id, String type, Bestelling bestelling){
         super(id,type);
         this.status = "Beschikbaar";
     }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public void beschikbaarZetten(){
         this.status ="Beschikbaar";
     }
     public void latenRepareren(){
         this.status ="Onder Reparatie...";
     }
     public void terugHalen(){
         this.status = "Beschikbaar";
     }
     public  void uitlenen(){
         this.status = "Uitgeleend";
     }
}
