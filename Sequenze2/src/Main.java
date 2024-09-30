import static Tools.Utility.*;
/*
Generare un valore contenente numeri casuali
*/
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        String[] opzioni = {"Menu", "1 Genera Random", "2 Visualizzazione", "3 Ricerca","4 Cancella numero","5 ordina con un nuovo vettore in modo crescente", "6 Raddoppia vettore","7 Fine"};
        boolean esci = true;
        int[] nEstratti3 = null;
         int MAXNUMERI = 50;
        int[] nEstratti4 = new int[MAXNUMERI];
        int[] nEstratti5 = new int[MAXNUMERI];
        int numero;
        do {
            switch (menu(opzioni, tastiera)) {
                case 1 ->{
                    System.out.println("Generazione");
                    generaNumeri4(nEstratti4);
                }
                case 2 -> {
                    System.out.println("Visualizzazione");
/*for (int i = 0; i < nEstratti4.length; i++) {
System.out.println(nEstratti4[i]);
}*/
                    visualizza(nEstratti4);
                }
                case 3 -> {
                    System.out.println("Inserire il numero da trovare");
                    numero = trovaNumero(Integer.parseInt(tastiera.nextLine()), nEstratti4);
                    if(numero == -1) {
                        System.out.println("Numero non trovato");
                    } else {
                        System.out.println(numero);
                    }
                }
                case 4 -> {
                    System.out.println("Inserire il numero da cancellare");
                    int posizione = cancellaNumero(Integer.parseInt(tastiera.nextLine()), nEstratti4);
                    if(posizione != -1){
                        System.out.println("L'elemento cancellato era in posizione " + posizione);
                    } else {
                        System.out.println("Elemento non presente");
                    }
                }
                case 5 -> {
                    System.out.println("Vettore ordinato:");
                     OrdinaVettore(nEstratti4,nEstratti5);

                }
                case 6 -> {
                    System.out.println("Raddoppia vettore:");
                    MAXNUMERI=50*2;
                   RaddoppiaVettore(nEstratti4,nEstratti5);

                }
                case 7 -> {
                    System.out.println("Fine");
                    esci = false;
                }
            }
        } while (esci);
    }

    // int[] vettore;
    public static int[] generaNumeri(int nNumeri) {
        Random numeroRandom = new Random();
        int[] nGenerati = new int[nNumeri];
        for (int i = 0; i < nNumeri; i++)
            nGenerati[i] = numeroRandom.nextInt(0, nNumeri) + 1;
        return nGenerati;
    }

    // int[] vettore = new int[MAXNUMERI];
    public static void generaNumeri4(int[] vettore) {
        Random numeroRandom = new Random();
        int numero; // numero da generare e inserire nel vettore
        int cont = 0; // verifica quanti numeri sono presenti senza ripetizioni
        boolean presente;

        do {
            numero = numeroRandom.nextInt(0, vettore.length) + 1;
            presente = false; // true se numero presente, false se no

            for (int i = 0; i < cont; i++) { // Controlla se il numero è già presente
                if (vettore[i] == numero) {
                    presente = true;
                }
            }

            if (!presente) { // se presente = true, lo aggiungo al vettore
                vettore[cont] = numero;
                cont++;
            }
        } while (cont < vettore.length);
    }
//int[] vettore=null;
/* public static int[] generaNumeri3(int[] vettore, int nNumeri) {
vettore = new int[nNumeri];
Random numeroRandom = new Random();
for (int i = 0; i < vettore.length; i++)
vettore[i] = numeroRandom.nextInt(0, vettore.length) + 1;
return vettore;
}
*/

    public static void visualizza(int[] vettore) {
        int cont = 0;
        for (int i : vettore) {
// System.out.println(vettore[i]);
            System.out.printf("%4d", i);
            cont++;
            if (cont == 10) {
                cont = 0;
                System.out.println();
            }
        }
    }

    public static int trovaNumero(int num, int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == num) {
                return i;
            }
        }
        return -1;
    }
    public static int cancellaNumero(int numeroDaTrovare, int[] vet){
        int numero = trovaNumero(numeroDaTrovare, vet);
        if(numero != -1){
            for(int i = numero; i < vet.length - 1; i++){
                vet[i] = vet [i+1];
            }
            vet[vet.length-1] = 0;
        }
        return numero;
    }
    public static void OrdinaVettore(int[] vettore1, int[] vettore2){

        int dimensione = vettore1.length;
        for (int i = 0; i < dimensione - 1; i++) {
            int min = i;
            for (int j = i + 1; j < dimensione; j++) {
                if (vettore1[j] < vettore1[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int temp = vettore1[i];
                vettore1[i] = vettore1[min];
                vettore1[min] = temp;
            }
        }
        for(int i=0;i<dimensione;i++){
            vettore2[i]=vettore1[i];
        }
    }
    public static void RaddoppiaVettore (int[] vettore,int[] array2){
        Random rd = new Random ();
        int n;
        for(int i=0; i<vettore.length;i++){
            n = rd.nextInt(0, vettore.length) + 1;
            array2[i]=n;
        }
        for(int i=vettore.length;i< vettore.length*2;i++){
            vettore[i]=array2[i];
        }

    }

}