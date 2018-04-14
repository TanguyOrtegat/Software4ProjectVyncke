package domain;

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

    public void BeschikbaarZetten(){
         this.status ="Beschikbaar";
     }
     public void LatenRepareren(){
         this.status ="Onder Reparatie...";
     }
     public void TerugHalen(){
         this.status = "Beschikbaar";
     }
     public  void Uitlenen(){
         this.status = "Uitgeleend";
     }
}
