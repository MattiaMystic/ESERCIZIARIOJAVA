import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci nome giocatore 1:");
        String gioc1 = sc.nextLine();

        System.out.println("Inserisci nome giocatore 2:");
        String gioc2 = sc.nextLine();

        System.out.println("Quanti round vuoi giocare?");
        int round = sc.nextInt();

        Giocatore g1 = new Giocatore(gioc1, 6);
        Giocatore g2 = new Giocatore(gioc2, 6);

        Partita p = new Partita(g1, g2, round);

        do {
            System.out.println(p.statoPartita());
            System.out.println(p.round());
        } while (p.statoPartita().equals("Partita in corso"));

        System.out.println(p.statoPartita());
        System.out.println("Vincitore: " + p.vincitore());
    }
}
