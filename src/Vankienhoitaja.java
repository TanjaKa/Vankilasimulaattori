
public class Vankienhoitaja {

    private int nrotunniste;
    private String nimi;

    public Vankienhoitaja(int nrotunniste, String nimi) {   //tämä luo aina uuden hoitaja-olion
        this.nrotunniste = nrotunniste;
        this.nimi = nimi;
    }

    public Vankienhoitaja() {
        //tyhjä konstruktori, jolla luokkaa voidaan kutsua myös ilman hoitajan luomista
    }

    public int getNrotunniste() {
        return nrotunniste;
    }

    public void setNrotunniste(int nrotunniste) {
        this.nrotunniste = nrotunniste;
    }

    public String getNimi() {
        return nimi;
    }

    //vastuuvangit arraylistina
    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public String toString() {
        return ("Nimi: " + nimi + " Numerotunniste: " + nrotunniste);
    }
}
