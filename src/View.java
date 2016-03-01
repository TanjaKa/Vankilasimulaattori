/*
Täältä kutsutaan kontrolleria ja annetaan käyttöliittymä (JOptionPane)
 */
import javax.swing.JOptionPane;


public class View {
    
    private Kontrolleri vanki = new Kontrolleri();
    
     public static void haeVanki() {
        Kontrolleri.yksiVanki();
        
        
    }

    public static void lisaaVanki() {
        
    }

    public static void poistaVanki() {
       
    }

    public static void naytaVangit() {
        
    }

    public static void lisaaKaytos() {
       
    }

    public static void vangitNakyma() {
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
                + "Anna valintasi: (9 lopettaa ohjelman)";
        
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
     

    public static void paikkaNakyma() {
        
        /* tämän valinnan alla halutaan näyttää käyttäjälle kuinka monta
        vankia kussakin paikassa on. "Naisvankila = 10", listataan
        vankien nimet
        
        */
    }

    public static void kaytosNakyma() {
    }

    public static void vankienhoitajatNakyma() {
        
        /* listataan vankienhoitajat ja kerrotaan kuinka monta vankia kullakin
        on ja listataan vankien nimet
        
        */
    }

    public static void tuomiotNakyma() {
        
        /* tämän valinnan alla halutaan kertoa, kuinka monta kunkin rikoksen-
        tehnyttä vankia löytyy. Esim. "tappo = 3", "törkeä huumausainerikos = 2"
        Kerrotaan myös kunkin rikosnimikkeen alla rikoksien suorittajat?
        */
        
    }

    public static void main(String[] args) {
        String menu = "1: Vangit\n"
                + "2: Paikka\n"
                + "3: Käytös\n"
                + "4: Vankienhoitajat\n"
                + "5: Tuomiot\n"
                + "Anna valintasi: (9 lopettaa ohjelman)";

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
                default:
                    JOptionPane.showMessageDialog(null, "Virheellinen valinta");
            }
        } while (valinta != 9);
    }

   
}

// ArrayList<Paikka> vankilat = new ArrayList();
        // vankilat.add(new Paikka(avovankila));
