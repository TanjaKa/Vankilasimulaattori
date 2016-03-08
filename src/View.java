/*
Täältä kutsutaan kontrolleria ja annetaan käyttöliittymä (JOptionPane)
 */
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class View {

    public static Kontrolleri kontrolleri = new Kontrolleri();

    public Vankienhoitajat vh = new Vankienhoitajat();

    private String vankiString;

    private int tuomioaika, vankinro;
    private String sukupuoli, nimi, syntymapv, rikos, vanginhoitaja, lukuStr;

    public View() {

    }

    public void alkuValikko() {
        String menu = "1: Vangit\n"
                + "2: Paikka\n"
                + "3: Vankien käytös\n"
                + "4: Vankienhoitajat\n"
                + "999: LOPETA\n"
                + "Anna valintasi: ";

        int valinta = 0;
        String lukuStr;

        do {
            lukuStr = JOptionPane.showInputDialog(menu);
            valinta = Integer.parseInt(lukuStr);
            switch (valinta) {
                case 1:
                    vangitNakyma();
                    break;
                case 2:
                    paikkaNakyma();
                    break;
                case 3:
                    kaytosNakyma();
                    break;
                case 4:
                    vankienhoitajatNakyma();
                    break;
                case 999:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Virheellinen valinta");
            }
        } while (valinta != 999);
    }

    public String getVankiString() {
        return vankiString;
    }

    public void setVankiString(String vankiString) {
        this.vankiString = vankiString;
    }

    public void haeVanki() {

        String nimi;
        String loytynytVanki = "";
        boolean onListalla = false;

        do {

            nimi = JOptionPane.showInputDialog("Anna vangin nimi: [999 lopettaa]");

            if (!nimi.equals("999")) {

                kontrolleri.haeVanki(nimi);

                if (!vankiString.equals("D")) {
                    JOptionPane.showMessageDialog(null, vankiString);

                } else {
                    JOptionPane.showMessageDialog(null, "Vankia ei löytynyt.");
                }
            }
        } while (!nimi.equals("999"));

    }

    public void lisaaVanki() {
        nimi = JOptionPane.showInputDialog(null, "Syötä vangin etu- ja sukunimi: ");
        sukupuoli = JOptionPane.showInputDialog(null, "Syötä vangin sukupuoli: ");
        syntymapv = JOptionPane.showInputDialog(null, "Syötä vangin syntymäaika: ");
        rikos = JOptionPane.showInputDialog(null, "Syötä rikosnimike: ");
        lukuStr = JOptionPane.showInputDialog(null, "Syötä tuomioaika: ");
        tuomioaika = Integer.parseInt(lukuStr);
        vanginhoitaja = JOptionPane.showInputDialog(null, "Syötä vanginhoitaja: ");
        //vangitLista.add(new Vanki("Tuomas Valtimo", "mies", "05.02.1981", "törkeä raiskaus", 2, "Teemu Kontiolahti"));

        if (kontrolleri.lisaaVanki(nimi, sukupuoli, syntymapv, rikos, tuomioaika, vanginhoitaja) == true) {
            JOptionPane.showMessageDialog(null, "Vanki on jo järjestelmässä. ");
        } else {
            JOptionPane.showMessageDialog(null, "Vanki lisätty järjestelmään. ");
        }
    }

    public void poistaVanki() {
        lukuStr = JOptionPane.showInputDialog(null, "Syötä poistettavan vangin vankinumero: ");
        vankinro = Integer.parseInt(lukuStr);

        if (kontrolleri.poistaVanki(vankinro) == true) {
            JOptionPane.showMessageDialog(null, "Vanki on poistettu järjestelmästä. ");
        } else {
            JOptionPane.showMessageDialog(null, "Vankia ei löydy. ");
        }
    }

    public void naytaVangit() {
        JOptionPane.showMessageDialog(null, kontrolleri.kaikkiVangit());
    }

    public void lisaaKaytos() {
        String lukuStr;
        int vankinumero = 0;
        do {
            lukuStr = JOptionPane.showInputDialog(null, kontrolleri.kaikkiVangit());

            vankinumero = Integer.parseInt(lukuStr);
            if (vankinumero > kontrolleri.vangitLista().size()) {
                JOptionPane.showMessageDialog(null, "Vankia ei löytynyt. ");
            }
        } while (vankinumero > kontrolleri.vangitLista().size());

        String menu = "1: Hyvä käytös\n"
                + "2. Hengen pelastaminen\n"
                + "3. Kunnianloukkaus\n"
                + "4. Varkaus\n"
                + "5. Karkaaminen\n"
                + "6. Törkeä väkivaltarikos\n"
                + "7. Tappo\n"
                + "999. Poistu: ";

        int valinta = 0;
        int tuomio = 0;

        do {
            lukuStr = JOptionPane.showInputDialog(menu);
            valinta = Integer.parseInt(lukuStr);
            switch (valinta) {
                case 1:
                    tuomio = -2;
                    kontrolleri.lisaaKaytos(vankinro, tuomio);
                    break;
                case 2:
                    kontrolleri.lisaaKaytos(vankinro, tuomio);
                    break;
                case 3:
                    tuomio = 1;
                    kontrolleri.lisaaKaytos(vankinro, tuomio);
                    break;
                case 4:
                    tuomio = 2;
                    kontrolleri.lisaaKaytos(vankinro, tuomio);
                    break;
                case 5:
                    tuomio = 5;
                    kontrolleri.lisaaKaytos(vankinro, tuomio);
                case 6:
                    tuomio = 5;
                    kontrolleri.lisaaKaytos(vankinro, tuomio);
                    break;
                case 7:
                    tuomio = 10;
                    kontrolleri.lisaaKaytos(vankinro, tuomio);
            }
        } while (valinta != 999);
    }

    public void vangitNakyma() {
        //tähän lista, jossa on kaikki vankioliot 
        //kontrollerin avulla haetaan vankilista
        //for eachilla läpi kaikki alkiot
        //toString-metodit

        //Vanki vangit = new Vanki();
        // tee tänne uusi valikko
        String menu = "1: Hae vanki\n"
                + "2: Lisää vanki\n"
                + "3: Poista vanki\n"
                + "4: Näytä kaikki vangit\n"
                + "5: Käytöksen lisäys\n"
                + "999: TAKAISIN PÄÄVALIKKOON: ";

        /* vai tehdäänkö viimeiseksi valinta, jolla päästään takaisin edelliseen
        valikkoon?
         */
        int valinta = 0;
        String lukuStr;

        do {
            lukuStr = JOptionPane.showInputDialog(menu);
            valinta = Integer.parseInt(lukuStr);
            switch (valinta) {
                case 1:
                    haeVanki();
                    break;
                case 2:
                    lisaaVanki();
                    break;
                case 3:
                    poistaVanki();
                    break;
                case 4:
                    naytaVangit();
                    break;
                case 5:
                    lisaaKaytos();
            }
        } while (valinta != 999);
    }

    public void paikkaNakyma() {

        /* tämän valinnan alla halutaan näyttää käyttäjälle kuinka monta
        vankia kussakin paikassa on. "Naisvankila = 10", listataan
        vankien nimet
         */
        String menu = "1: Tarkastele päävankilan vankeja\n"
                + "2: ...avovankilan vankeja\n"
                + "3: ...nuorisovankilan vankeja\n"
                + "4: ...naisvankilan vankeja\n"
                + "5: ...vapautettuja vankeja\n"
                + "999: TAKAISIN PÄÄVALIKKOON: ";

        int valinta = 0;
        String lukuStr;

        do {
            lukuStr = JOptionPane.showInputDialog(menu);
            valinta = Integer.parseInt(lukuStr);
            switch (valinta) {
                case 1:
                    tarkastelePaavankila();
                    break;
                case 2:
                    tarkasteleAvovankila();
                    break;
                case 3:
                    tarkasteleNuorisovankila();
                    break;
                case 4:
                    tarkasteleNaisvankila();
                    break;
                case 5:
                    tarkasteleVapaana();
                    break;

            }
        } while (valinta != 999);
    }

    public void tarkastelePaavankila() {
    }

    public void tarkasteleAvovankila() {
    }

    public void tarkasteleNuorisovankila() {
    }

    public void tarkasteleNaisvankila() {
    }

    public void tarkasteleVapaana() {
    }

    public void kaytosNakyma() {
        int valinta = 0;
        String lukuStr;

        String menu = "1: Tarkastele vangin käytöstä\n"
                + "2: Lisää tapahtuma\n"
                + "3: Poista tapahtuma\n"
                + "999: TAKAISIN PÄÄVALIKKOON: ";

        do {
            lukuStr = JOptionPane.showInputDialog(menu);
            valinta = Integer.parseInt(lukuStr);
            switch (valinta) {
                case 1:
                    tarkasteleKaytosta();
                    break;
                case 2:
                    lisaaTapahtuma();
                    break;
                case 3:
                    poistaTapahtuma();
                    break;

            }
        } while (valinta != 999);
    }

    public void tarkasteleKaytosta() {
    }

    public void lisaaTapahtuma() {
    }

    public void poistaTapahtuma() {
    }

    public void vankienhoitajatNakyma() {

        /* listataan vankienhoitajat ja kerrotaan kuinka monta vankia kullakin
        on ja listataan vankien nimet
         */
        int valinta = 0;
        String lukuStr;

        String menu = "1: Listaa vanginhoitajat \n"
                + "999: TAKAISIN PÄÄVALIKKOON: ";

        do {
            lukuStr = JOptionPane.showInputDialog(menu);
            valinta = Integer.parseInt(lukuStr);
            switch (valinta) {
                case 1:
                    listaaVanginhoitajat();
                    break;
            }
        } while (valinta != 999);
    }

    public void listaaVanginhoitajat() {
        JOptionPane.showMessageDialog(null, vh.VankienhoitajatToString());
    }

}
