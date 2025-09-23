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


    public String FormattaDati(){
        return String.format("Autore : %s , Titolo: %s, PREZZOPAGINA %.2f, Pagine:%d ",Autore,Titolo,PREZZOPAGINA*(double)pagine,pagine);
    }


}
