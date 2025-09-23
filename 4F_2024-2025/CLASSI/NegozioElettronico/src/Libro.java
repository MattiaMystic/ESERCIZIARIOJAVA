abstract public class Libro implements Prodotto, Cloneable {
    private String nome;
    private String descrizione;
    private String autore;
    private int codice;
    private int prezzo;
    private int quantita;

    public Libro(String nome, String descrizione, String autore, int codice, int prezzo, int quantita) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.autore = autore;
        this.codice = codice;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    public int getIsbn() {
        return codice;
    }

    @Override
    public String toString() {
        return String.format("Nome: %s, Descrizione: %s, Autore: %s, codice: %d, Prezzo: %d, Quantita: %d", nome, descrizione, autore, codice, prezzo, quantita);
    }

    @Override
    protected Libro clone() throws CloneNotSupportedException {
        return (Libro) super.clone();
    }
}