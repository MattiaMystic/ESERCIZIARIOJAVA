package BACKEND;

import java.util.Objects;

public class Libro {
    private String titolo;
    private String autore;
    private int nPagine;
    private final double costoPagina= 0.05;
    private Genere tipo;

    public Libro(String titolo, String autore, int nPagine, Genere tipo) {
        this.titolo = titolo;
        this.autore = autore;
        this.nPagine = nPagine;
        this.tipo = tipo;
    }
    public Libro(Libro libro) {
        this.titolo= libro.titolo;
        this.autore= libro.autore;
        this.nPagine= libro.nPagine;
        this.tipo = libro.tipo;
    }
    public Libro(String titolo, String autore) {
        this.titolo = titolo;
        this.autore = autore;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", nPagine=" + nPagine +
                ", costoPagine=" + costoPagina*nPagine +
                ", tipo=" + tipo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Libro libro)) return false;
        return nPagine == libro.nPagine && Double.compare(costoPagina, libro.costoPagina) == 0 && Objects.equals(titolo, libro.titolo) && Objects.equals(autore, libro.autore) && Objects.equals(tipo, libro.tipo);
    }

    public String getTitolo() {
        return titolo;
    }

    public String getAutore() {
        return autore;
    }

    public double getCostoPagina() {
        return costoPagina;
    }

    public int getnPagine() {
        return nPagine;
    }
}
