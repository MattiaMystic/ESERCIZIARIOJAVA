import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import static Tools.Utility.*;

public class Main {
    public static void main(String[] args) {
        boolean esci = false;
        int nBiglietto = 0;
        int nPersone;
        Scanner sc = new Scanner(System.in);
        final int MAXPERSONE = 10;
        ArrayList<Persona> lista = new ArrayList<>();
        String[] opzioni = {"GESTORE LUNAPARK", "Registra entrata", "Nuova giostra","Lista giostre per biglietto","Registra uscita","Esci"};
        do{
                switch (Menu(opzioni, sc)) {
                    case 1 -> {  //ingresso
                        try {
                            if(nPersone>MAXPERSONE)
                                throw new Exception();
                            nPersone++;
                            Persona p = metodoCreazioneBiglietto(++nBiglietto);
                            lista.add(p);
                            System.out.println("numero assegnato al cliente: "+nBiglietto);

                        } catch( Exception e) {
                            System.out.println("luna park pieno");
                        }
                    }
                    case 2 -> {  //nuova giostra
                        System.out.println("numero biglietto cliente: ");
                        int numeroB = Integer.parseInt(sc.nextLine());
                        if(metodoTrovaBiglietto(lista, numeroB))
                        {
                            Persona p = metodoNuovaGiostra(numeroB,sc);
                            lista.add(p);
                        } else
                        System.out.println("numero non trovato");
                    }
                    case 3 -> {

                    }
                    case 4 -> esci = true;
                }
            }
        } while (!esci);
    }
    public static Persona metodoCreazioneBiglietto(int nBiglietto){
        Persona cliente = new Persona();
        cliente.numeroBiglietto = nBiglietto;
        cliente.momentoEvento= LocalDateTime.now(); //momento dell'ingresso
        return cliente;
    }

    public static Persona metodoNuovaGiostra(int nBiglietto, Scanner sc){
        Persona cliente = new Persona();
        boolean esci;
        do {
            try {
                System.out.println("quale giostra vuoi provare?[tagada,ottovolante,ruotapanoramica, autoscontro]");
                cliente.giostreProvate=ListaGiostre.valueOf(sc.nextLine().toUpperCase());
                esci=true;
            } catch(Exception e) {
                System.out.println("giostra non valida");
                esci=false;
            }

        }while(!esci);
        cliente.numeroBiglietto = nBiglietto;
        cliente.momentoEvento= LocalDateTime.now(); //momento della nuova giostra
        return cliente;
    }


    public static boolean metodoTrovaBiglietto(ArrayList<Persona> gestore, int nBiglietto){
        for (Persona persona : gestore) {
            if (persona.numeroBiglietto == nBiglietto) {
                return true;
            }
        }
        return false;
    }
}