
import java.util.ArrayList;

public class Vangit {

    private ArrayList<Vanki> vangitLista;

    private Vanki vanki;
    private Paavankila paavankila;
    private Naisvankila naisvankila;
    private Vapaana vapaana;

    public Vangit(Paavankila paavankila, Naisvankila naisvankila, Vapaana vapaana) {
        vangitLista = new ArrayList<Vanki>();

        this.paavankila = paavankila;
        this.naisvankila = naisvankila;
        this.vapaana = vapaana;

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

        for (Vanki sijoitetaan : vangitLista) {
            if (sijoitetaan.getSukupuoli().equals("nainen")) {
                naisvankila.lisaaVanki(sijoitetaan);
            } else {
                paavankila.lisaaVanki(sijoitetaan);
            }
        }
    }

    public ArrayList<Vanki> vangitLista() {
        return vangitLista;
    }

    public boolean lisaaVanki(String vankinimi, String sukupuoli, String syntymapv, String rikos, int tuomioaika, String vanginhoitaja) {

        if (tarkista(vankinimi) == true) {
            return true;
        } else {
            Vanki uusivanki = new Vanki(vankinimi, sukupuoli, syntymapv, rikos, tuomioaika, vanginhoitaja);
            vangitLista.add(uusivanki);
            if (uusivanki.getSukupuoli().equals("nainen")) {
                naisvankila.lisaaVanki(uusivanki);
            } else {
                paavankila.lisaaVanki(uusivanki);
            }
        }

        return false;
    }

    public boolean tarkista(String vankinimi) {
        for (Vanki v : vangitLista) {
            if (vankinimi.equals(v.getVankinimi())) {
                return true;
            }
        }
        return false;
    }

    public boolean poistaVanki(int vankinro) {

        for (Vanki v : vangitLista) {
            if (vankinro == v.getVankinro()) {
                if (tarkista(v.getVankinimi()) == true) {
                    vangitLista.remove(v);
                    return true;
                }
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

        String ilmoitus = "";

        for (Vanki v : vangitLista) {
            if (nimi.equals(v.getVankinimi())) {
                if (tarkista(v.getVankinimi()) == true) {
                    return v.toString();

                } else {
                    return "D";
                }
            }
        }
        return "D";
    }
}
