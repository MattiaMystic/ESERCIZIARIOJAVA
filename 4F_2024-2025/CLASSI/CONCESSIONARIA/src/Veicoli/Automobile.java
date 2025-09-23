package Veicoli;

public class Automobile extends Veicolo {
    private int nPorte;

    public Automobile(String marca, String modello, int prezzo, int nPorte) {
        super(marca, modello, prezzo);
        this.nPorte = nPorte;
    }
    public int getnPorte(){
        return nPorte;
    }
    @Override
    public String toString(){
        return String.format(super.toString()+"- Numero Porte: %d\n",nPorte);
    }
}