//Pavarin Mattia
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimensione;
        do {
            System.out.print("Inserisci la dimensione dell'array (tra 8 e 10): ");
            dimensione = scanner.nextInt();
        } while (dimensione < 8 || dimensione > 10);

        int[] array = new int[dimensione];

        System.out.println("Inserisci " + dimensione + " numeri interi tra 1 e 30");
        // popolamento dell'array
        for (int i = 0; i < dimensione; i++) {
            int num;
            boolean test;
            do {
                test = true;
                num = scanner.nextInt();
                if (num < 1 || num > 30) {
                    //controllo se il numero è tra 1 e 30
                    test = false;
                    System.out.println("Inserisci un numero valido");
                } else {
                    for (int j = 0; j < i; j++) {
                        if (array[j] == num) {
                            //controllo se è presente
                            test = false;
                            System.out.println("Numero già presente");
                            break;
                        }
                    }
                }
            } while (!test);
            //se il num che abbiamo inserito rispetta la consegna verrà inserito nel array in posizione i
            array[i] = num;
        }

        // scorro l'array e conto i numeri pari
        int contPari = 0; // contatore numeri pari
        for (int num : array) {
            if (num % 2 == 0) {
                contPari++;
            }
        }

        int[] vettorePari = new int[contPari]; // creo un vettore dove inseriro i numeri pari
        int l = 0;
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            if (num % 2 == 0) {
                vettorePari[l++] = num;
            }
        }

        selectionSort(vettorePari);

        int[] Arrayfinale = new int[dimensione]; // array finale ordinato
        l = 0;
        for (int i = 0; i < dimensione; i++) {
            if (array[i] % 2 == 0) {
                Arrayfinale[i] = vettorePari[l++];
            } else {
                Arrayfinale[i] = array[i];
            }
        }

        // stampa
        System.out.print("Array originale:");
        for (int i = 0; i < dimensione; i++) {
            System.out.print(array[i]+"-");
        }
        System.out.println();

        System.out.print("Array finale:");
        for (int i = 0; i < dimensione; i++) {
            System.out.print(Arrayfinale[i]+"-");
        }

    }

    // ordinamento tramite selection sort
    public static void selectionSort(int[] array) {
        int dimensione = array.length;
        for (int i = 0; i < dimensione - 1; i++) {
            int min = i;
            for (int j = i + 1; j < dimensione; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }
}
