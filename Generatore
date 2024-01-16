import java.util.Scanner;
import java.util.Random;
public class Generatore{
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        Random random = new Random();

        int num, casuale;

        System.out.println("Quanti numeri vuoi generare?");
        num = tastiera.nextInt();

        int[] vettore = new int[num];
        int[] vettore1;

        for(int i = 0; i < num; i++){
            casuale = random.nextInt(1,101);
            vettore[i] = casuale;
        }

        vettore1 = vettore;
        for(int i = 0; i < vettore.length; i++){
            System.out.println(vettore[i]);
        }
        System.out.println("------------------------------");
        for(int i = 0; i < vettore1.length; i++){
            System.out.println(vettore1[i]);
        }

    }
}
