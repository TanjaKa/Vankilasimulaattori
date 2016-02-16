
import java.util.ArrayList;

public class Vangit {

    private ArrayList<Vanki> vangitLista;

    private Vanki vanki;

    public Vangit() {
        vangitLista = new ArrayList<Vanki>();

        vangitLista.add(new Vanki("Matti Mallikas", "Mies", "12.12.1956", "tappo", 10, "Pelle"));
        vangitLista.add(new Vanki("Matti Mallikas", "Mies", "12.12.1956", "tappo", 10, "Pelle"));
        vangitLista.add(new Vanki("Matti Mallikas", "Mies", "12.12.1956", "tappo", 10, "Pelle"));
        vangitLista.add(new Vanki("Matti Mallikas", "Mies", "12.12.1956", "tappo", 10, "Pelle"));
        vangitLista.add(new Vanki("Matti Mallikas", "Mies", "12.12.1956", "tappo", 10, "Pelle"));
        vangitLista.add(new Vanki("Matti Mallikas", "Mies", "12.12.1956", "tappo", 10, "Pelle"));
        vangitLista.add(new Vanki("Matti Mallikas", "Mies", "12.12.1956", "tappo", 10, "Pelle"));
        vangitLista.add(new Vanki("Matti Mallikas", "Mies", "12.12.1956", "tappo", 10, "Pelle"));

    }

    public void lisaaVanki(String vankinimi, String sukupuoli, String syntymapv, String rikos, int tuomioaika, String vanginhoitaja) {
        vangitLista.add(new Vanki(vankinimi, sukupuoli, syntymapv, rikos, tuomioaika, vanginhoitaja));

    }

    public boolean poistaVanki(int vankinro) {

        for (Vanki v : vangitLista) {
            if (vankinro == v.getVankinro()) {
                vangitLista.remove(v);
                return true;
            } else {
                return false;

            }

        }

        return false;

    }
    
    public String VankilanVangittoString(){
        String vangitStr = "";
        
        for (Vanki v : vangitLista) {
            vangitStr = vangitStr + v.toString();
            
        }
        return vangitStr;
    }
    

}
