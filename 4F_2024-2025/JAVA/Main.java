/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main {
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n-1; i++) {
            // Trova l'elemento più piccolo nell'array non ordinato
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Scambia l'elemento più piccolo con l'elemento attuale
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Inserisci la dimensione del array");
        int dimensione=scanner.nextInt();
        int[] array = new int[dimensione];
        int[] arrayFin = new int[dimensione];
        int l=0;
        for(int i=0; i<array.length;i++){
            int n;
            System.out.println("Inserisci un valore nel vettore");
            n=scanner.nextInt();
            array[i]=n;
        }
        
        selectionSort(array);
        System.out.println("Array ordinato:");
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2==0 ){
              
            arrayFin[l]=array[i];
             l=l+1;
               
            }
        }
         for (int i = 0; i < array.length; i++) {
            if(array[i]%2==1 ){
            
            arrayFin[l]=array[i];
              l=l+1;
            
            }
            
    }
    for (int i=0; i<array.length;i++){
        System.out.println(arrayFin[i]);
    }
     
     
}
}


