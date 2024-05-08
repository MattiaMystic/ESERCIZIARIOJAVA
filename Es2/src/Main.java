import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Random rd= new Random();
       /* Realizzare un esercizio in cui un array  viene prima duplicato, poi uno viene ordinato con selection sort,  l'altro con bubble sort.

        Contare il numero di operazioni svolte, tramite un contatore che deve essere stampato alla fine di ognuna delle due esecuzioni.

                Testare con array di lunghezza:
        10 45 volte SELECTION SORT
        100 4950 VOLTE SELECTION SORT
        1000 499500 VOLTE SELECTION SORT
        10000 49995000 VOLTE SELECTION SORT
        100000 704982704 VOLTE SELECTION SORT
        1000000
        elementi*/
        System.out.println("Inserisci dimensione del vettore: ");
        int dimensione= scanner.nextInt();
        int vet1[] =new int [dimensione]; //selection sort
        int vet2[]= new int [dimensione]; //buble sort
        int contatoreSelectionSort=0;
        for(int i=0; i<vet1.length;i++){

            int n=rd.nextInt(0,10000);
            vet1[i]=n;
            vet2[i]=vet1[i];
        }

        int[] arrayFin = new int[dimensione];
        int l=0;

//SELECTION SORT
        selectionSort(vet1,contatoreSelectionSort);
        System.out.println("Array ordinato:");
        for (int i = 0; i < vet1.length; i++) {
            if(vet1[i]%2==0 ){

                arrayFin[l]=vet1[i];
                l=l+1;

            }
        }
        for (int i = 0; i < vet1.length; i++) {
            if(vet1[i]%2==1 ){

                arrayFin[l]=vet1[i];
                l=l+1;

            }

        }
        for (int i=0; i<vet1.length;i++){
            vet1[i]=arrayFin[i];
            System.out.println(vet1[i]);
        }



    }
    public static void selectionSort(int[] vet1, int contatoreSelectionSort) {
        int n = vet1.length;
        contatoreSelectionSort=0;
        for (int i = 0; i < n-1; i++) {
            // Trova l'elemento più piccolo nell'array non ordinato
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (vet1[j] < vet1[minIndex]) {
                    minIndex = j;

                }
                contatoreSelectionSort++;
            }
            // Scambia l'elemento più piccolo con l'elemento attuale
            int temp = vet1[minIndex];
            vet1[minIndex] = vet1[i];
            vet1[i] = temp;
        }
        System.out.println(contatoreSelectionSort);
    }
    }
