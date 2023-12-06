import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N, Num, Resto, Contatore = 0;

        do {
            System.out.println("inserisci un numero");
            N = scanner.nextInt();
            if (N < 0) {
                System.out.println("numero non valido perchè e' negativo");
            }
            if (N == 0) {
                System.out.println("numero non valido perchè e' nullo");
            }
        } while (N <= 0);
        do {
            System.out.println("che cifra vuoi contare all'interno di questo numero ?");
            Num = scanner.nextInt();
            if (Num < 0) {
                System.out.println("numero non valido perchè e' negativo o nullo");
                System.out.println("Reinserire il numero");
                Num = scanner.nextInt();
            }
            if (Num > 9) {
                System.out.println("numero non valido perchè e' superiore a 9");

                System.out.println("Reinserire il numero");
                Num = scanner.nextInt();
            }
        } while (Num > 0 && Num <= 9);
        while (N > 0) {
            Resto = N % 10;
            N = N / 10;
            if (Resto == Num) {
                Contatore = Contatore + 1;

            }
        }
        System.out.println("il numero " + Num + " appare " + Contatore + " volte");
    }
}
