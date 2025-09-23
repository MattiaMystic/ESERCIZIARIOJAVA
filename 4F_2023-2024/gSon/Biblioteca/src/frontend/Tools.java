package frontend;

import backend.Genere;
import backend.Libro;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Tools {
    /*public static void main(String[] args) {

    }*/
    private Tools() {
    }

    ; //impedisce di istanziare la classe

    public static void clrScr() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Wait(int attesa) {
        try {
            Thread.sleep(attesa);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int Menu(String opzioni[], Scanner tastiera) {// parametri formali
        int scelta;

        do {
            clrScr();
            System.out.println("------------------");
            System.out.println(opzioni[0]);
            System.out.println("------------------");
            for (int i = 1; i < opzioni.length; i++) {
                System.out.println("[" + i + "]" + " " + opzioni[i]);
            }
            scelta = (Integer.parseInt(tastiera.nextLine()));
            //tastiera.nextLine();
            if ((scelta < 1) || (scelta > opzioni.length - 1)) {
                System.out.println("Opzione Sbagliata");
                Wait(2000);
            }
        }
        while ((scelta < 1) || (scelta > opzioni.length - 1));
        //tastiera.nextLine();
        return scelta;
    }

    public static Libro leggiLibro(Scanner tastiera, boolean soluzioni) {
        Genere[] tipoGenere = Genere.values();
        String[] sceltaGenere = {"GENERE", "ROMANZO", "MANUALE", "THRILLER", "GENERICO"};


        System.out.print("Inserisci l'autore del libro: ");
        String autore = tastiera.nextLine();
        System.out.print("Inserisci il titolo del libro: ");
        String titolo = tastiera.nextLine();
        System.out.print("Inserisci il numero di pagine del libro: ");
        int nPagine = Integer.parseInt(tastiera.nextLine());

        System.out.println("Inserisci il tipo del libro: ");
//         Menu(sceltaGenere, tastiera);
        Genere tipo = tipoGenere[Menu(sceltaGenere, tastiera) - 1]; // visto che Menu parte da indice 1


//        Libro l = new Libro(autore, titolo, nPagine, tipo);
//        return l;
        return new Libro(autore, titolo, nPagine, tipo);

    }

    public static void visualizzaMensola(ArrayList<Libro> volumi) {
        for (Libro l : volumi) {
            clrScr();
            System.out.println(l.toString());
        }
    }
    public String[] findFile(String[] directory, String fileExtension) {
        String[] files = new String[directory.length];

        if(files.length==0)
     return files;
        for(int i=0; i<directory.length; i++){
           for(int j=0; j<; j++){


           }
        }

        return files;


    }
    public int filesSelection(String[] findFile){

    }
}