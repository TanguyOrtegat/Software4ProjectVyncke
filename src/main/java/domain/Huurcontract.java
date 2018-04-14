package domain;

public class Huurcontract {
    private String einddag;
    private String startdag;
    private  int Id;
    private Ketel ketel;
    private Klant klant;

    public String getEinddag() {
        return einddag;
    }

    public void setEinddag(String einddag) {
        this.einddag = einddag;
    }

    public String getStartdag() {
        return startdag;
    }

    public void setStartdag(String startdag) {
        this.startdag = startdag;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Ketel getKetel() {
        return ketel;
    }

    public void setKetel(Ketel ketel) {
        this.ketel = ketel;
    }

    public Klant getKlant() {
        return klant;
    }

    public void setKlant(Klant klant) {
        this.klant = klant;
    }

    public Huurcontract(String einddag, String startdag, int id, Ketel ketel, Klant klant) {
        this.einddag = einddag;
        this.startdag = startdag;
        Id = id;
        this.ketel = ketel;
        this.klant = klant;
    }

    //public void huurContractGenerenen() ==> niet nodig?? constructor??
}
