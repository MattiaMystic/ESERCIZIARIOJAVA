import java.util.Random;
import java.util.Scanner;

public class DADO {
    public static void main(String[] args) {
        int scelta = 1;
        int vittoriePrimo = 0, vittorieSecondo = 0;
        while (scelta == 1) {
            Scanner sc = new Scanner(System.in);
            Random rn = new Random();
            int numero = rn.nextInt(2, 13);
            int numero1 = rn.nextInt(2, 13);
            int primoNumero = numero;
            System.out.println("Inserire il nome del giocatore della prima squadra");
            String nome = sc.nextLine();
            String primoNome = nome;
            System.out.println("Inserire il nome del giocatore della seconda squadra");
            String nome1 = sc.nextLine();
            for (int i = 0; i < 2; i++) {
                System.out.println(nome + " lancia i dadi...");
                System.out.println("""
                          ____
                         /\\' .\\     ____
                        /: \\___\\  / .  /\\
                        \\' / . / /____/..\\
                         \\/___/  \\'  '\\  /
                                  \\'__'\\/""");
                attesa(3);
                System.out.println("E' uscito il numero: " + numero);
                nome = nome1;
                numero = numero1;
                attesa(1);
            }
            if (primoNumero > numero) {
                System.out.println("Ha vinto: " + primoNome + "!");
                vittoriePrimo++;
            } else if (numero > primoNumero) {
                System.out.println("Ha vinto: " + nome + "!");
                vittorieSecondo++;
            } else {
                System.out.println("E' un pareggio!");
            }
            System.out.println("Vuoi rigiocare? Inserire 1 per sì o qualsiasi altro numero per no");
            scelta = sc.nextInt();
        }
        System.out.println("Vittorie prima squadra: " + vittoriePrimo);
        System.out.println("Vittorie seconda squadra: " + vittorieSecondo);
        if (vittoriePrimo > vittorieSecondo) {
            System.out.println("Ha vinto la prima squadra!");
        } else if (vittorieSecondo > vittoriePrimo) {
            System.out.println("Ha vinto la seconda squadra!");
        } else {
            System.out.println("E' un pareggio!");
        }
    }

    public static void attesa(int x) {
        try {
            Thread.sleep(1000L * x);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
