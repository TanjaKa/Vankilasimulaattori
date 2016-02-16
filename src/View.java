/*
Täältä kutsutaan kontrolleria ja annetaan käyttöliittymä (JOptionPane)
 */
import javax.swing.JOptionPane;

public class View {

    public static void vangitNakyma() {
    }

    public static void paikkaNakyma() {
    }

    public static void kaytosNakyma() {
    }

    public static void vankienhoitajatNakyma() {
    }

    public static void tuomiotNakyma() {
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
