import static Tools.Utility.*;
/*
Generare un valore contenente numeri casuali
*/
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        String[] opzioni = {"Menu", "1 Genera Random", "2 Visualizzazione", "3 Controllo","4 Fine"};
        boolean esci = true;
        int[] nEstratti = null;
        final int MAXNUMERI = 100;
        int[] nEstratti2 = new int[MAXNUMERI];
        //int[] nEstratti2;
        do {
            switch (menu(opzioni, tastiera)) {
                case 1:
                    System.out.println("Generazione");
                /*for (int i=0; i<MAXNUMERI; i++)
                    nGenerati[i] = numeroRandom.nextInt(0,MAXNUMERI)+1;
                 */
                    generaNumeri2(nEstratti2);
                    break;
                case 2:
                    System.out.println("Visualizzazione");
                    for (int i = 0; i < nEstratti2.length; i++) {
                        System.out.println(nEstratti2[i]);
                    }
                    break;
                case 3:
                  generaNumeriSenzaDuplicati(nEstratti2);
                    for (int i = 0; i < nEstratti2.length; i++) {
                        System.out.println(nEstratti2[i]);
                    }
                    break;

                case 4:
                    System.out.println("Fine");
                    esci = false;
                    break;
            }
        } while (esci);
    }

   /* public static int[] generaNumeri(int nNumeri) {
        Random numeroRandom = new Random();
        int[] nGenerati = new int[nNumeri];
        for (int i = 0; i < nNumeri; i++)
            nGenerati[i] = numeroRandom.nextInt(0, nNumeri) + 1;
        return nGenerati;
    }*/
    public static void generaNumeri2(int[] vettore) {
        Random numeroRandom = new Random();
        for (int i = 0; i < vettore.length; i++)
            vettore[i] = numeroRandom.nextInt(0, vettore.length) + 1;
    }

    public static void generaNumeriSenzaDuplicati(int[] vettore) {


        for (int i = 0; i < vettore.length; i++) {
            boolean duplicato;

            do {
                duplicato = false;
                for (int j = 0; j < i; j++) {
                    if (vettore[j] == vettore[i]) {
                        duplicato = true;
                        break;
                    }
                }

            } while (duplicato);
            vettore[i]=

        }
    }
}