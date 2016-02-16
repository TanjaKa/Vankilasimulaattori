/*Arraylistina*/

import javax.swing.*;

public class Vangit {

    int vankinro = 0;    //juokseva numerointi
    String vankinimi;
    boolean sukupuoli;
    String syntymapv;
    String rikos;
    int tuomioaika;
    String vanginhoitaja;
    String kaytos;

    public Vangit(String vankinimi, boolean sukupuoli, String syntymapv,
            String rikos, int tuomioaika, String vanginhoitaja, String kaytos) {
        this.vankinimi = vankinimi;
        this.sukupuoli = sukupuoli;
        this.syntymapv = syntymapv;
        this.rikos = rikos;
        this.tuomioaika = tuomioaika;
        this.vanginhoitaja = vanginhoitaja;
        this.kaytos = kaytos;
    }

}
