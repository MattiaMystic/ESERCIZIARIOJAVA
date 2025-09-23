import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserire nome Giocatore 1: ");
        String nome1 = sc.nextLine();
        System.out.println("Inserire nome Giocatore 2: ");
        String nome2 = sc.nextLine();

        int numeroRound;
        int numeroFacce;
        do {
            System.out.println("Inserire numero di round: ");
            numeroRound = Integer.parseInt(sc.nextLine());
        } while (numeroRound < 1);
        do {
            System.out.println("Inserire numero di facce dei dadi: ");
            numeroFacce = Integer.parseInt(sc.nextLine());
        } while (numeroFacce <= 1);

        Gara gara = new Gara(nome1, nome2, numeroRound, new Dado(numeroFacce));
        while (!gara.isFineGara()) {
            System.out.println(gara.round());

        }
        System.out.println(gara.getVincitore());
    }

}