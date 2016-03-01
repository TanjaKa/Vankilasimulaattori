/*
Tänne kysely tuomioista:
tuomion kokonaispituus
tuomiota takana
tuomiota jäljellä
Rikosnimikkeet ja lukumäärä
*/
public class Tuomiot {
  public void lisää (double luku) {
      
      
  }
  public void vahenna (double luku) {
      
  }
    

    public Tuomiot(String rikosnimikkeet, double tuomionKokonaispituus, double tuomiotaJaljella, double tuomiotaKulunut) {
        this.rikosnimikkeet = rikosnimikkeet;
        this.tuomionKokonaispituus = tuomionKokonaispituus;
        this.tuomiotaJaljella = tuomiotaJaljella;
        this.tuomiotaKulunut = tuomiotaKulunut;
    }
    
    String rikosnimikkeet;
    double tuomionKokonaispituus;
    double tuomiotaJaljella;
    double tuomiotaKulunut;

  
     
        
    }

