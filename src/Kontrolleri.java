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

    public Kontrolleri() {

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
        vanki.setTuomioaika(tuomio);
    }

    public ArrayList<Vanki> vangitLista() {
        return vangit.vangitLista();
    }

    /* tänne halutaan määrätä, että mikäli käyttäjä valitsee alkuvalikosta
        "vangit", niin aukeaa uusi switch case -valikko, jossa valinnat:
    
        - Hae vanki
        - lisää vanki
        - poista vanki 
        - näytä kaikki vangit
        - käytöksen lisäys
    
    
        * Jos valinta on "hae vanki", haetaan vankia nimen tai numeron perusteella
         -> käyttäjä saa vangin tiedot näytölle
        * Jos valinta on "lisää vanki", kutsutaan vangit -luokasta lisaaVanki -metodia
         -> lisätään vangista pyydetyt tiedot
            -> jos ikä on alle 18, vanki sijoitetaan nuorisovankilaan
            -> jos vanki on nainen, sijoitus naisvankilaan
        * Jos valinta on "poista vanki", kutsutaan vangit -luokasta poistaVanki -metodia
        -> vangin tiedot jäisivät kuitenkin järjestelmään, mutta tiedoksi "vapaana" ? 
        Vai poistetaanko kokonaan?
        * Jos valinta on "näytä kaikki vangit", kutsutaan vanki -luokan toString -metodia
        * Jos valinta on "käytöksen lisäys", lisätään vangille käytös ja kerrotaan
        uusi tuomioaika käytöslisäyksen jälkeen
        
     */
}
