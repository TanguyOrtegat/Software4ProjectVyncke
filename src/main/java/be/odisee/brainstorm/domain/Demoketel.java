package be.odisee.brainstorm.domain;

public class Demoketel extends Ketel {
     private String status;

     public Demoketel(int id, String type){
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
