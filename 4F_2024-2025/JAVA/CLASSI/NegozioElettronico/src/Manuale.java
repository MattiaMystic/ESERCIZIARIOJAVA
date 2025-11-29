public class Manuale extends Libro {
    private String argomento;

    public Manuale(String nome, String descrizione, String autore, int codice, int prezzo, int quantita, String argomento) {
        super(nome, descrizione, autore, codice, prezzo, quantita);
        this.argomento = argomento;
    }

    @Override
    public String toString() {
        return super.toString() + " , Argomento: " + argomento;
    }

    @Override
    public int getCodice(Prodotto prodotto) {
        return 0;
    }
}