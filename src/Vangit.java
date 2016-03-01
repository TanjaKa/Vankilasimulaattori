
import java.util.ArrayList;

public class Vangit {

    private ArrayList<Vanki> vangitLista;

    private Vanki vanki;

    public Vangit() {
       vangitLista = new ArrayList<Vanki>();
        
        // Vanginhoitajat: Teemu Kontiolahti, Lauri Ronkainen, Maiju Mäkelä

        vangitLista.add(new Vanki("Tuomas Valtimo", "Mies", "05.02.1981", "törkeä raiskaus", 2, "Teemu Kontiolahti"));
        vangitLista.add(new Vanki("Ari Eronen", "Mies", "11.06.1951", "törkeä raiskaus", 2, "Lauri Ronkainen"));
        vangitLista.add(new Vanki("Ville Mutanen", "Mies", "09.10.1969", "tappo", 8, "Teemu Kontiolahti"));
        vangitLista.add(new Vanki("Lauri Paltamo", "Mies", "12.12.1956", "törkeä huumausainerikos", 1, "Lauri Ronkainen"));
        vangitLista.add(new Vanki("Pirjo Kärkkäinen", "Nainen", "25.04.1972", "tappo", 8, "Teemu Kontiolahti"));
        vangitLista.add(new Vanki("Petteri Volmanen", "Mies", "06.03.1993", "törkeä pahoinpitely", 1, "Maiju Mäkelä"));
        vangitLista.add(new Vanki("Juha Matilainen", "Mies", "12.12.1956", "tappo", 8, "Teemu Kontiolahti"));
        vangitLista.add(new Vanki("Anne Pasanen", "Nainen", "01.12.1968", "törkeä huumausainerikos", 1, "Lauri Ronkainen"));
        vangitLista.add(new Vanki("Kata Lankinen", "Nainen", "06.08.1995", "törkeä huumausainerikos", 1, "Maiju Mäkelä"));
        

    }
    
    public ArrayList<Vanki> vangitLista(){
        return vangitLista;
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
