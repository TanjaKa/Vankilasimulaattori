/*
tänne vankienhoitajatiedot
 */
import java.util.ArrayList;

public class Vankienhoitajat {

    private ArrayList<Vankienhoitaja> vankienhoitajaLista;
    private Vankienhoitaja vankienhoitaja;

    public Vankienhoitajat() {

        vankienhoitajaLista = new ArrayList<Vankienhoitaja>();

        vankienhoitajaLista.add(new Vankienhoitaja(1, "Teemu Kontiolahti"));
        vankienhoitajaLista.add(new Vankienhoitaja(2, "Lauri Ronkainen"));
        vankienhoitajaLista.add(new Vankienhoitaja(3, "Maiju Mäkelä"));

    }
    public String VankienhoitajatToString() {
        String vankienhoitajatStr = "";

        for (Vankienhoitaja v : vankienhoitajaLista) {
            vankienhoitajatStr = vankienhoitajatStr + v.toString() +"\n";

        }
        return vankienhoitajatStr;
    }
}
