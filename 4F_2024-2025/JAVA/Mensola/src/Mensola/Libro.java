package Mensola;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Libro {

    public String Autore;
    public String Titolo;
    final double PREZZOPAGINA=0.05;
    public int pagine;
    public LocalDate dataDiPubblicazione;
    public Tipologia tipo;
    private DateTimeFormatter dataFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");


    public String FormattaDati(){
        return String.format("Autore : %s , Titolo: %s, PREZZOPAGINA %.2f, Pagine:%d , tipo: %s, Data: %s ",Autore,Titolo,PREZZOPAGINA*pagine,pagine,tipo,dataDiPubblicazione.format(dataFormat));
    }
    public String StampaPagine(){
        return String.format("Autore : %s , Titolo: %s, PREZZOLIBRO %.2f",Autore,Titolo,PREZZOPAGINA*pagine);
    }
    @Override
    public boolean equals(Object o){
        Libro l=(Libro) o;
        return Autore.equals(l.Autore) && Titolo.equals(l.Titolo);
    }



}