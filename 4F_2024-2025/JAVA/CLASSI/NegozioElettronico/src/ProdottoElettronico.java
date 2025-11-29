/**
 * classe astratta per gestire il prodotto elettronico
 * @author Mattia Pavarin
 * @version 2.0
 * @since 31/03/2025
 *
 *
 */
abstract public class ProdottoElettronico implements Cloneable, Prodotto {

    private int codice;
    private String marca;
    private int prezzo;

    /**
     * metodo per aggiungere un prdotto
     * @param codice
     * @param marca
     * @param prezzo
     */

    protected ProdottoElettronico(int codice, String marca, int prezzo) {
        this.codice = codice;
        this.marca = marca;
        this.prezzo = prezzo;
    }

    public int getCodice() {
        return codice;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }

    @Override
    public String toString() {
        return String.format("Codice Prodotto: %d, Marca: %s, Prezzo: %d", codice, marca, prezzo);
    }

    @Override
    protected ProdottoElettronico clone() throws CloneNotSupportedException {
        return (ProdottoElettronico) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProdottoElettronico p = (ProdottoElettronico) o;
        return codice == p.codice;
    }
}