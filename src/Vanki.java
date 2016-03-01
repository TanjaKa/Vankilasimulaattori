
public class Vanki {
    
    private static int vankinro = 0; //juokseva numero
    private int omanro;
    private String vankinimi;
    private String sukupuoli;
    private String syntymapv;
    private String rikos;
    private int tuomioaika;
    private String vanginhoitaja;
    private String kaytos;

    public Vanki(String vankinimi, String sukupuoli, String syntymapv, String rikos, int tuomioaika, String vanginhoitaja) {
        omanro = vankinro++;
        this.vankinimi = vankinimi;
        this.sukupuoli = sukupuoli;
        this.syntymapv = syntymapv;
        this.rikos = rikos;
        this.tuomioaika = tuomioaika;
        this.vanginhoitaja = vanginhoitaja;

    }

    public Vanki() {
        omanro = vankinro++;
        this.vankinimi = vankinimi;
        this.sukupuoli = sukupuoli;
        this.syntymapv = syntymapv;
        this.rikos = rikos;
        this.tuomioaika = tuomioaika;
        this.vanginhoitaja = vanginhoitaja;
        this.kaytos = kaytos;
    }
    

    public int getVankinro() {
        return omanro;
    }

    public void setVankinro(int vankinro) {
        this.omanro = vankinro;
    }

    public String getVankinimi() {
        return vankinimi;
    }

    public void setVankinimi(String vankinimi) {
        this.vankinimi = vankinimi;
    }


    public String getSukupuoli() {
        return sukupuoli;
    }

    public void setSukupuoli(String sukupuoli) {
        this.sukupuoli = sukupuoli;
    }

    public String getSyntymapv() {
        return syntymapv;
    }

    public void setSyntymapv(String syntymapv) {
        this.syntymapv = syntymapv;
    }

    public String getRikos() {
        return rikos;
    }

    public void setRikos(String rikos) {
        this.rikos = rikos;
    }

    public int getTuomioaika() {
        return tuomioaika;
    }

    public void setTuomioaika(int tuomioaika) {
        this.tuomioaika = tuomioaika;
    }

    public String getVanginhoitaja() {
        return vanginhoitaja;
    }

    public void setVanginhoitaja(String vanginhoitaja) {
        this.vanginhoitaja = vanginhoitaja;
    }

    public String getKaytos() {
        return kaytos;
    }

    public void setKaytos(String kaytos) {
        this.kaytos = kaytos;
    }
    
    public String toString(){
        return  (omanro + ", "+ vankinimi + ", " + sukupuoli + ", " + syntymapv + " Tuomio: " + rikos + ", " + tuomioaika + "VH:" + vanginhoitaja);
    }
}
