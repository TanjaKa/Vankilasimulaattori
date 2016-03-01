/*
Täällä on pääohjelma. 
Kutsutaan muita luokkia.
 */
import java.util.ArrayList;
import javax.swing.*;

public class Kontrolleri {

    public Kontrolleri() {

        View vankinakyma = new View();

    }

    public static void yksiVanki() {
        
        Vanki vanki = new Vanki();
        Vangit vangit = new Vangit();
        
        
        
        
        
        String nimi;
                
        
        do{
        
        nimi = JOptionPane.showInputDialog("Anna vangin nimi: [9 lopettaa]");
        
        
        
        
            for (Vanki vanki1 :  vangit.vangitLista()) {
                if (nimi.equals(vanki1.getVankinimi())){
                    JOptionPane.showMessageDialog(null, vanki1.toString());
                }
            }
        
       
        
        } while (nimi.equals("9"));
        
        
        
       
                /* tehdään if, eli jos syötetty nimi löytyy
                listasta, niin tulostetaan sen vangit tiedot
                
                for-loopissa käy läpi listaa
                
                Jos samannimisiä löytyy useempia, niin annetaan tieto
                tms.
                
                */
                

        JOptionPane.showMessageDialog(null, vangit.vangitLista());

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
