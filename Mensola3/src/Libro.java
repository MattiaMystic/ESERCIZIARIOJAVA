import java.time.LocalDate;

enum Tipologia{
    Romanzo,
    Manuale,
    Triller;
}
public class Libro {

    public String Autore;
    public String Titolo;
    final double PREZZOPAGINA=0.05;
    public int pagine;
    public LocalDate pubblicazione;


    public String FormattaDati(){
        return String.format("Autore : %s , Titolo: %s, PREZZOPAGINA %.2f, Pagine:%d ,Data:%s",Autore,Titolo,PREZZOPAGINA*(double)pagine,pagine,pubblicazione);
    }


}