/**
 * @author Mattia Pavarin
 * @version 2.0
 * @since 31/03/2025
 *
 *
 */
public class Smartphone extends ProdottoElettronico {

    private String modello;
    private int memoria;

    public Smartphone(int codice, String marca, int prezzo, String modello, int memoria) {
        super(codice, marca, prezzo);
        this.modello = modello;
        this.memoria = memoria;
    }

    public String getModello() {
        return modello;
    }

    public int getMemoria() {
        return memoria;
    }

    @Override
    public String toString() {
        return super.toString() + ", Memoria: " + memoria;
    }

    @Override
    public int getCodice(Prodotto prodotto) {
        return 0;
    }
}