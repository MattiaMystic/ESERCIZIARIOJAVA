import static Tools.Utility.*;
/*
Generare un valore contenente numeri casuali
*/

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        Scanner tastiera2 = new Scanner(System.in);
        String[] opzioni = {"Menu", "1 Genera Random", "2 Visualizzazione", "3 ricerca numero","4 fine"};
        boolean esci = true;
        final int MAXNUMERI = 100;
        int[] nEstratti2 = new int[MAXNUMERI];
        int n;
        //int[] nEstratti; senza new perchè fatta nel metodo su nGenerati
        do {
            switch (menu(opzioni, tastiera)) {
                case 1:
                    System.out.println("Generazione");
                /*for (int i=0; i<MAXNUMERI; i++)
                    nGenerati[i] = numeroRandom.nextInt(0,MAXNUMERI)+1;
                 */ //nEstratti=generaNumeri(MAXNUMERI)
                    generaNumeri2(nEstratti2);
                    break;
                case 2:
                    System.out.println("Visualizzazione");
                    /*for (int i = 0; i < nEstratti2.length; i++) {
                        System.out.println(nEstratti2[i]);
                    }*/
                    Visualizza(nEstratti2);
                    break;

                case 3:
                    System.out.println("Ricerca numero e posizione in cui si trova");
                    System.out.println("Quale numero vuoi cercare?");
                     n=Integer.parseInt(tastiera2.nextLine());
                    Ricerca(nEstratti2,n);
                    break;
                case 4:
                    System.out.println("Fine");
                    esci = false;
                    break;
            }
        } while (esci);
    }
    //metodo 1

    /* public static int[] generaNumeri(int nNumeri) {
         Random numeroRandom = new Random();
         int[] nGenerati = new int[nNumeri];// la new
         for (int i = 0; i < nNumeri; i++)
             nGenerati[i] = numeroRandom.nextInt(0, nNumeri) + 1;
         return nGenerati; //usi return se fai la new
     }*/
    //int [] vettore=new int [MAXNUMERI]
    public static void generaNumeri2(int[] vettore) {
        Random numeroRandom = new Random();
        int numero;
        int cont=0;
        boolean presente;

        do{
            numero = numeroRandom.nextInt(0, vettore.length) + 1;
           presente=false; // true se numero presente, false se no

            for (int i = 0; i < cont; i++) { // Controlla se il numero è già presente
                if (vettore[i] == numero) {
                    presente = true;
                }
            }

            if (!presente) { // se non è presente lo aggiungo all'array
                vettore[cont] = numero;
                cont++;
            }
        } while (cont < vettore.length);
    }
    public static void Visualizza(int[] vettore){
        int cont=0;
        for(int i=0; i<vettore.length;i++){
            System.out.printf(vettore[i]+" ");
            cont++;
            if(cont==10){
                cont=0;
                System.out.println();
            }

        }
    }
    public static void Ricerca(int[] vettore,int ricerca){
        boolean trovato=false;
        for(int i=0; i<vettore.length;i++){
            if(ricerca==vettore[i]){

                System.out.println("Il numero è presente ed è in posizione "+i);
               trovato=true;
            }
            }
        if(!trovato){
            System.out.println("Numero non presente");
        }

        }
    }


