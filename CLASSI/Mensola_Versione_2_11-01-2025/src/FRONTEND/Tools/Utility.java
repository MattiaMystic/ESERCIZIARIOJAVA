package FRONTEND.Tools;


import BACKEND.Genere;
import BACKEND.Libro;

import java.util.ArrayList;
import java.util.Scanner;

public class Utility {
    public static void ClrScr() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void Wait(int x) {
        try {
            Thread.sleep(1000 * x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int menu(String[] opzioni, Scanner keyboard) {
        int scelta;

        do {
            ClrScr();
            System.out.println("=== " + opzioni[0] + " ===");
            for (int i = 1; i < opzioni.length; i++) {
                System.out.println(opzioni[i]);
            }
            scelta = Integer.parseInt(keyboard.nextLine());
            if (scelta < 1 || scelta > opzioni.length - 1) {
                System.out.println("Valore errato. Riprova");
                Wait(3);
            }
        } while (scelta < 1 || scelta > opzioni.length - 1);

        return scelta;
    }
    public static Libro LeggiLibro(Scanner keyboard, boolean soluzioni) {
Genere lGenere;
  Genere[] tipo = Genere.values();

        System.out.println("Inserisci il titolo");
        String titolo = keyboard.nextLine();
        System.out.println("Inserisci il autore");
        String autore = keyboard.nextLine();
        System.out.println("Inserisci il numero pagine");
        int nPagine = keyboard.nextInt();
        System.out.println("Inserisci il tipo:");
        String[] opzioni={"Tipo libro","1 Romanzo","2 Manuale","3 Triller"};

       lGenere=tipo[menu(opzioni,keyboard)];

        Libro libro= new Libro(titolo,autore,nPagine,lGenere);
        return libro;
    }
}
