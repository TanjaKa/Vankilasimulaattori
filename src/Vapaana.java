
import java.util.ArrayList;

public class Vapaana {

    private ArrayList<Vanki> vangitLista;

    private Vanki vanki;

    public Vapaana() {

    }

    public ArrayList<Vanki> getVangitLista() {
        return vangitLista;
    }

    public void lisaaVanki(Vanki vanki) {
        vangitLista.add(vanki);
    }

    public boolean poistaVanki(int vankinro) {

        for (Vanki v : vangitLista) {
            if (vankinro == v.getVankinro()) {
                vangitLista.remove(v);
                return true;
            } else {
                return false;

            }

        }

        return false;

    }

    public String VankilanVangittoString() {
        String vangitStr = "";

        for (Vanki v : vangitLista) {
            vangitStr = vangitStr + v.toString();

        }
        return vangitStr;
    }
}
