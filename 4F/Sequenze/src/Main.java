import static Tools.Utility.*;
/*
Generare un valore contenente numeri casuali
*/
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        Scanner tastiera2 = new Scanner(System.in);
        String[] opzioni = {"Menu", "1 Genera Random", "2 Visualizzazione", "3 ricerca numero","4 Cancellazione","5 Cancella un numero e genera un nuovo vettore con dimensione fissa","6 Fine"};
        boolean esci = true;
        final int MAXNUMERI = 20;
        int[] nEstratti2 = new int[MAXNUMERI];
        int[] nCancellazione= new int [MAXNUMERI-1];
        int n;
        int n2;
        int nCancellare;
        //int[] nEstratti; senza new perchè fatta nel metodo su nGenerati
        do {
            switch (menu(opzioni, tastiera)) {
                case 1 -> {
                    System.out.println("Generazione");
                /*for (int i=0; i<MAXNUMERI; i++)
                    nGenerati[i] = numeroRandom.nextInt(0,MAXNUMERI)+1;
                 */ //nEstratti=generaNumeri(MAXNUMERI)
                    generaNumeri2(nEstratti2);
                }
                case 2 -> {
                    System.out.println("Visualizzazione");
                    /*for (int i = 0; i < nEstratti2.length; i++) {
                        System.out.println(nEstratti2[i]);
                    }*/
                    Visualizza(nEstratti2);
                }

                case 3 -> {
                    System.out.println("Ricerca numero e posizione in cui si trova");
                    System.out.println("Quale numero vuoi cercare?");
                    n = Integer.parseInt(tastiera2.nextLine());
                    int TrovaNumero=Ricerca(nEstratti2, n);
                    if(TrovaNumero==-1){
                        System.out.println("Non trovato");
                    }if(TrovaNumero==-0){
                        System.out.println("Nessun numero generato.");
                    }else{
                        System.out.println("Trovato in posizione " + (TrovaNumero+1));
                    }
                }
                case 4 -> {
                    System.out.println("Cancellazione");
                    System.out.println("Quale numero vuoi cancellare dal vettore?");
                    nCancellare = Integer.parseInt(tastiera2.nextLine());
                    nEstratti2 = Cancellazzione(nEstratti2, nCancellare);


                }
                case 5 -> { // Cancella un numero e genera un nuovo vettore con dimensione fissa
                    System.out.println("Cancella numero e ritorna nuovo vettore");
                    System.out.println("Inserisci il numero da cancellare");
                    n2 = Integer.parseInt(tastiera.nextLine()); // Prende il numero da cancellare
                    nEstratti2 = cancellaNumeroNuovoVettore(nEstratti2, n2, MAXNUMERI); // Cancella e rigenera un nuovo vettore di 20 elementi
                }
                case 6 -> {
                    System.out.println("Fine");
                    esci = false;
                }
            }
        } while (esci);
    }
    //metodo 1

    /* public static int[] generaNumeri(int nNumeri) {
         Random numeroRandom = new Random();
         int[] nGenerati = new int[nNumeri];// la new
         for (int i = 0; i < nNumeri; i++)
             nGenerati[i] = numeroRandom.nextInt(0, nNumeri) + 1;
         return nGenerati; //usi return se fai la new
     }*/
    //int [] vettore=new int [MAXNUMERI]
    public static void generaNumeri2(int[] vettore) {
        Random numeroRandom = new Random();
        int numero;
        int cont=0;
        boolean presente;

        do{
            numero = numeroRandom.nextInt(0, vettore.length) + 1;
            presente=false; // true se numero presente, false se no

            for (int i = 0; i < cont; i++) { // Controlla se il numero è già presente
                if (vettore[i] == numero) {
                    presente = true;
                }
            }

            if (!presente) { // se non è presente lo aggiungo all'array
                vettore[cont] = numero;
                cont++;
            }
        } while (cont < vettore.length);
    }
    public static void Visualizza(int[] vettore){
        if (vettore == null) { // Controlla se non ci sono numeri generati
            System.out.println("Nessun numero generato.");
            return;
        }
        int conta = 0;
        for (int i = 0; i < vettore.length; i++) {
            System.out.printf("%-4d ", vettore[i]); // Stampa il numero formattato
            conta++;
            if (conta == 10) { // Dopo 10 numeri va a capo
                conta = 0;
                System.out.println("");
            }
        }
        System.out.println("");
    }

    public static int Ricerca(int[] nEstratti,int ricerca){
        if (nEstratti == null) { // Controlla se non ci sono numeri generati

            return 0;
        }
        for (int i = 0; i < nEstratti.length; i++) { // Cicla attraverso l'array
            if (ricerca == nEstratti[i]) {

                return i; // Restituisce l'indice del numero trovato
            }
        }

        return -1; // Restituisce -1 se non trovato
    }

    /*
    1-Realizzare un metodo che permetta di cancellare un numero dal vettore(il numero di elementi dovrà essere decrementato)
    ricompattando il vettore;
    2-Realizzare un metodo che permetta di cancellare un numero dal vettore e  ritorni un nuovo vettore sempre completo.
    Visualizzare a video l'esito dell'operazione es: valore cancellato, valore non presente, valore outOfRange (controllo da eseguire sul valore
    fornito in input dall'utente).
     */
    public static int[] Cancellazzione(int [] nEstratti,int n){


        if (n < 1 || n > 100) {
            System.out.println("Valore out of range");
            return nEstratti;
        }


        // Usa il metodo trovaNumeri per ottenere la posizione del numero
        int posizione = Ricerca(nEstratti, n);
        if (posizione == -1) {
            return nEstratti; // Se il numero non è trovato, restituisce l'array originale
        }

        // Sposta gli elementi successivi indietro di una posizione per ricompattare l'array
        for (int i = posizione; i < nEstratti.length - 1; i++) {
            nEstratti[i] = nEstratti[i + 1]; // Ricompattamento del vettore
        }

        // Crea un nuovo array con una dimensione ridotta
        int[] nuovoVettore = new int[nEstratti.length - 1];
        System.arraycopy(nEstratti, 0, nuovoVettore, 0, nuovoVettore.length); // Copia il contenuto nel nuovo array
        System.out.println("Numero " + n + " cancellato e vettore ricompattato.");
        return nuovoVettore; // Restituisce il nuovo array ridotto
    }
    public static int[] cancellaNumeroNuovoVettore(int[] nEstratti, int n2, final int MAXNUMERI) {
        // Controllo per numero fuori dal range
        if (n2 < 1 || n2 > 100) {
            System.out.println("Valore out of range: il numero deve essere compreso tra 1 e 100.");
            return nEstratti; // Restituisce l'array originale se il numero non è valido
        }

        if (nEstratti == null) { // Controlla se non ci sono numeri generati
            System.out.println("Nessun numero generato.");
            return null; // Restituisce null se non ci sono numeri
        }

        // Usa il metodo trovaNumeri per ottenere la posizione del numero
        int posizione = Ricerca(nEstratti, n2);
        if (posizione == -1) {
            return nEstratti; // Se il numero non è trovato, restituisce l'array originale
        }

        // Crea un nuovo array di dimensione 20 senza il numero da cancellare
        int[] nuovoVettore = new int[20];
        int l = 0;
        for (int i = 0; i < nEstratti.length; i++) {
            if (i != posizione) {
                nuovoVettore[l] = nEstratti[i];
                l++;
            }
        }


        Random numeroRandom = new Random();
        while (l < nuovoVettore.length) { // Finché ci sono posti vuoti
            int nuovoNumero;
            boolean presente;
            do {
                nuovoNumero = numeroRandom.nextInt(0, MAXNUMERI) + 1; // Genera un nuovo numero casuale
                presente = false;
                // Controlla se il nuovo numero è già presente nel nuovo array
                for (int j = 0; j < l; j++) {
                    if (nuovoVettore[j] == nuovoNumero) {
                        presente = true; // Se il numero è già presente, lo segnala
                    }
                }
            } while (presente); // Continua finché il numero è già presente
            nuovoVettore[l] = nuovoNumero; // Aggiunge il nuovo numero
            l++; // Incrementa l'indice
        }

        System.out.println("Numero " + n2 + " cancellato e nuovo vettore generato.");
        return nuovoVettore; // Restituisce il nuovo array di 20 elementi
    }



}
