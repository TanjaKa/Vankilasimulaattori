
import java.util.ArrayList;

public class Vangit {

    private ArrayList<Vanki> vangitLista;

    private Vanki vanki;

    public Vangit() {
        vangitLista = new ArrayList<Vanki>();

        // Vanginhoitajat: Teemu Kontiolahti, Lauri Ronkainen, Maiju Mäkelä
        vangitLista.add(new Vanki("Tuomas Valtimo", "mies", "05.02.1981", "törkeä raiskaus", 2, "Teemu Kontiolahti"));
        vangitLista.add(new Vanki("Ari Eronen", "mies", "11.06.1951", "törkeä raiskaus", 2, "Lauri Ronkainen"));
        vangitLista.add(new Vanki("Ville Mutanen", "mies", "09.10.1969", "tappo", 8, "Teemu Kontiolahti"));
        vangitLista.add(new Vanki("Lauri Paltamo", "mies", "12.12.1956", "törkeä huumausainerikos", 1, "Lauri Ronkainen"));
        vangitLista.add(new Vanki("Pirjo Kärkkäinen", "nainen", "25.04.1972", "tappo", 8, "Teemu Kontiolahti"));
        vangitLista.add(new Vanki("Petteri Volmanen", "mies", "06.03.1993", "törkeä pahoinpitely", 1, "Maiju Mäkelä"));
        vangitLista.add(new Vanki("Juha Matilainen", "mies", "12.12.1956", "tappo", 8, "Teemu Kontiolahti"));
        vangitLista.add(new Vanki("Anne Pasanen", "nainen", "01.12.1968", "törkeä huumausainerikos", 1, "Lauri Ronkainen"));
        vangitLista.add(new Vanki("Kata Lankinen", "nainen", "06.08.1995", "törkeä huumausainerikos", 1, "Maiju Mäkelä"));

    }

    public ArrayList<Vanki> vangitLista() {
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

    public String VangitToString() {
        String vangitStr = "";

        for (Vanki v : vangitLista) {
            vangitStr = vangitStr + v.toString() + "\n";

        }
        return vangitStr;
    }

    public String yksiVanki(String nimi) {

        String ilmotus = "";

        for (Vanki v : vangitLista) {
            if (nimi.equals(v.getVankinimi())) {
                ilmotus = v.toString();

            } else {
                ilmotus = "D";
            }
        }
        return ilmotus;
    }
}
