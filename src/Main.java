
import javax.swing.JOptionPane;

public class Main {

    public static View view = new View();

    public static void main(String[] args) {

//        view.alkuValikko();
        String menu = "1: Vangit\n"
                + "2: Paikka\n"
                + "3: Vankien käytös\n"
                + "4: Vankienhoitajat\n"
                + "9: LOPETA\n"
                + "Anna valintasi: ";

        int valinta = 0;
        String lukuStr;

        do {
            lukuStr = JOptionPane.showInputDialog(menu);
            valinta = Integer.parseInt(lukuStr);
            switch (valinta) {
                case 1:
                    view.vangitNakyma();
                    break;
                case 2:
                    view.paikkaNakyma();
                    break;
                case 3:
                    view.kaytosNakyma();
                    break;
                case 4:
                    view.vankienhoitajatNakyma();
                    break;
                case 9:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Virheellinen valinta");
            }
        } while (valinta != 9);
    }

}
