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

    public Kontrolleri() {
        
    }

    public void haeVanki(String nimi) {

        view.setVankiString(vangit.yksiVanki(nimi));

    }

    public void kaikkiVangit() {
        vangit.VankilanVangittoString();

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
