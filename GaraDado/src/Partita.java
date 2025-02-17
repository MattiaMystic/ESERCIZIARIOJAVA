import java.util.ArrayList;
import java.util.Random;
public class Partita {
    private Giocatore giocatore1;
    private Giocatore giocatore2;
    private int partite;


    public Partita(Giocatore giocatore1, int partite, Giocatore giocatore2) {
        this.giocatore1 = giocatore1;
        this.partite = partite;
        this.giocatore2 = giocatore2;
    }

    public Giocatore getGiocatore1() {
        return giocatore1;
    }

    public void setGiocatore1(Giocatore giocatore1) {
        this.giocatore1 = giocatore1;
    }

    public Giocatore getGiocatore2() {
        return giocatore2;
    }

    public void setGiocatore2(Giocatore giocatore2) {
        this.giocatore2 = giocatore2;
    }

    public int getPartite() {
        return partite;
    }

    public void setPartite(int partite) {
        this.partite = partite;
    }

}
