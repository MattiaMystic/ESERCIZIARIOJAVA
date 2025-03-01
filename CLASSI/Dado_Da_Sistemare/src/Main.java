import java.util.Scanner;
import static Tools.Utility.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String []opzioni= {"--SCELTA PARTITA--","1-BASE","2-AVANZATA"};
        switch(menu(opzioni,sc)){
            case 1->{

                System.out.println("Inserisci nome giocatore 1:");
                String gioc1 = sc.nextLine();

                System.out.println("Inserisci nome giocatore 2:");
                String gioc2 = sc.nextLine();

                System.out.println("Quanti round vuoi giocare?");
                int round = sc.nextInt();

                Giocatore g1 = new Giocatore(gioc1, 6);
                Giocatore g2 = new Giocatore(gioc2, 6);

                Partita p = new Partita(g1, g2, round,1);

                do {
                    System.out.println(p.statoPartita());
                    System.out.println(p.round());
                } while (p.statoPartita().equals("Partita in corso"));

                System.out.println(p.statoPartita());
                System.out.println("Vincitore: " + p.vincitore());

            }case 2->{
                System.out.println("Inserisci nome giocatore 1:");
                String gioc1 = sc.nextLine();

                System.out.println("Inserisci nome giocatore 2:");
                String gioc2 = sc.nextLine();

                System.out.println("Quanti round vuoi giocare?");
                int round = sc.nextInt();

                Giocatore g1 = new Giocatore(gioc1, 6);
                Giocatore g2 = new Giocatore(gioc2, 6);

                Partita p = new Partita(g1, g2, round,2);

                do {
                    System.out.println(p.statoPartita());
                    System.out.println(p.round());
                    System.out.println("Vincitore: " + p.vincitore());
                } while (p.statoPartita().equals("Partita in corso"));

                System.out.println(p.statoPartita());
                System.out.println("Vincitore: " + p.vincitore());

            }
        }

        /*
        Modificare la classe partita in modo che:


-sia possibile giocare sia la  partite base che avanzata;


-la partita base funziona come nella versione precedente.


La partita avanzata aggiunge un sistema di bonus:


tiene traccia delle vittorie consecutive e dopo 3 vittorie consecutive, assegna un punto (una
vincita) bonus al giocatore.


Il bonus viene azzerato in caso di pareggio.


Si consideri di implementare il polimorfismo implementando
nel main un metodo che permette di giocare


una partita standard o una partita avanzata:


giocaPartita(partitaBase);


giocaPartita(partitaAvanzata);
         */


    }







}
