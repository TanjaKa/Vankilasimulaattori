/*
Täältä kutsutaan kontrolleria ja annetaan käyttöliittymä (JOptionPane)
 */
import javax.swing.JOptionPane;

public class View {
       public static Kontrolleri kontrolleri = new Kontrolleri();


    private String vankiString;
   

    public View() {
        

    }
    
    public void alkuValikko(){
         String menu = "1: Vangit\n"
                + "2: Paikka\n"
                + "3: Käytös\n"
                + "4: Vankienhoitajat\n"
                + "5: Tuomiot\n"
                + "9: LOPETA\n"
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
                case 5:
                    tuomiotNakyma();
                case 9:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Virheellinen valinta");
            }
        } while (valinta != 9);
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

            nimi = JOptionPane.showInputDialog("Anna vangin nimi: [9 lopettaa]");

            if (!nimi.equals("9")) {

                kontrolleri.haeVanki(nimi);

                if (!vankiString.equals("D")) {
                    JOptionPane.showMessageDialog(null, vankiString);

                } else {
                    JOptionPane.showMessageDialog(null, "Vankia ei löytynyt.");
                }
            }
        } while (!nimi.equals("9"));

    }

    public void lisaaVanki() {

    }

    public void poistaVanki() {

    }

    public void naytaVangit() {

    }

    public void lisaaKaytos() {

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
                + "9. TAKAISIN PÄÄVALIKKOON: ";

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
        } while (valinta != 9);
    }

    public void paikkaNakyma() {

        /* tämän valinnan alla halutaan näyttää käyttäjälle kuinka monta
        vankia kussakin paikassa on. "Naisvankila = 10", listataan
        vankien nimet
        
         */
    }

    public void kaytosNakyma() {
    }

    public void vankienhoitajatNakyma() {

        /* listataan vankienhoitajat ja kerrotaan kuinka monta vankia kullakin
        on ja listataan vankien nimet
        
         */
    }

    public void tuomiotNakyma() {

        /* tämän valinnan alla halutaan kertoa, kuinka monta kunkin rikoksen-
        tehnyttä vankia löytyy. Esim. "tappo = 3", "törkeä huumausainerikos = 2"
        Kerrotaan myös kunkin rikosnimikkeen alla rikoksien suorittajat?
         */
    }

   

// ArrayList<Paikka> vankilat = new ArrayList();
    // vankilat.add(new Paikka(avovankila));
}
