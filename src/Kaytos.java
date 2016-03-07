/*Tänne tapahtumia, jotka lyhentävät tai pidentävät tuomioaikaa*/
public class Kaytos {
    int hyvakaytos = -2;    //tulos: tuomiotaJaljella -2 vuotta
    int hengenpelastaminen; //tulos: tuomiotaJaljella = 0
    int kunnianloukkaus;    //tulos: tuomiotaJaljella +1 vuotta
    int varkaus;
    int karkaaminen;
    int torkeavakivaltarikos;
    int tappo;
    
    public Kaytos(int hyvakaytos, int hengenpelastaminen, int kunnianloukkaus, int varkaus, int karkaaminen, int torkeavakivaltarikos, int tappo) {
        this.hyvakaytos = hyvakaytos;
        this.hengenpelastaminen = hengenpelastaminen;
        this.kunnianloukkaus = kunnianloukkaus;
        this.varkaus = varkaus;
        this.karkaaminen = karkaaminen;
        this.torkeavakivaltarikos = torkeavakivaltarikos;
        this.tappo = tappo;
      //TARVITAANKO TÄTÄ??  
        
    }

    public int getHyvakaytos() {
        return hyvakaytos;
    }

    public void setHyvakaytos(int hyvakaytos) {
        this.hyvakaytos = hyvakaytos;
    }

    public int getHengenpelastaminen() {
        return hengenpelastaminen;
    }

    public void setHengenpelastaminen(int hengenpelastaminen) {
        this.hengenpelastaminen = hengenpelastaminen;
    }

    public int getKunnianloukkaus() {
        return kunnianloukkaus;
    }

    public void setKunnianloukkaus(int kunnianloukkaus) {
        this.kunnianloukkaus = kunnianloukkaus;
    }

    public int getVarkaus() {
        return varkaus;
    }

    public void setVarkaus(int varkaus) {
        this.varkaus = varkaus;
    }

    public int getKarkaaminen() {
        return karkaaminen;
    }

    public void setKarkaaminen(int karkaaminen) {
        this.karkaaminen = karkaaminen;
    }

    public int getTorkeavakivaltarikos() {
        return torkeavakivaltarikos;
    }

    public void setTorkeavakivaltarikos(int torkeavakivaltarikos) {
        this.torkeavakivaltarikos = torkeavakivaltarikos;
    }

    public int getTappo() {
        return tappo;
    }

    public void setTappo(int tappo) {
        this.tappo = tappo;
    }
}

    

