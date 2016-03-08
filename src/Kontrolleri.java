/*
Kutsutaan muita luokkia.
 */
import java.util.ArrayList;
import javax.swing.*;

public class Kontrolleri {

    Kontrolleri kontrolleri;

    View view;

    private Vanki vanki;
    private Vangit vangit;
    private Paavankila paavankila;
    private Naisvankila naisvankila;
    private Vapaana vapaana;

    public Kontrolleri(View view) {

        this.view = view;
        
        paavankila = new Paavankila();
        naisvankila = new Naisvankila();
        vapaana = new Vapaana();

        vangit = new Vangit(paavankila, naisvankila, vapaana);
    }

    public String haePaavankila() {
        return paavankila.VankilanVangittoString();
    }

    public String haeNaisvankila() {
        return naisvankila.VankilanVangittoString();
    }

    public String haeVapaana() {
        if (vapaana.getVangitLista().isEmpty()) {
            return "Ei vapautettuja vankeja. ";
        } else {
            return vapaana.VankilanVangittoString();
        }
    }

    public void haeVanki(String nimi) {

        view.setVankiString(vangit.yksiVanki(nimi));

    }

    public String kaikkiVangit() {
        return vangit.VangitToString();

    }

    public boolean lisaaVanki(String nimi, String sukupuoli, String syntymapv, String rikos, int vankinro, String vanginhoitaja) {

        if (vangit.lisaaVanki(nimi, sukupuoli, syntymapv, rikos, vankinro, vanginhoitaja) == true) {
            return true;
        } else {
            return false;
        }
    }

    public boolean poistaVanki(int vankinro) {

        if (vangit.poistaVanki(vankinro) == true) {
            return true;
        } else {
            return false;
        }
    }

    public void lisaaKaytos(int vankinumero, int tuomio) {
        vanki = vangit.vangitLista().get(vankinumero);
        if (tuomio == 100) {
        vapaana.lisaaVanki(vangit.vangitLista().get(vankinumero));
        
        poistaVanki(vankinumero);
        }
        vanki.setTuomioaika(tuomio);
    }

    public ArrayList<Vanki> vangitLista() {
        return vangit.vangitLista();
    }
}