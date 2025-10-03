import static tools.Utility.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] opzioni = {
                "GESTORE TESTI",
                "Verifica lunghezza frase",
                "Cerca parola",
                "Sostituisci parola",
                "Conteggio vocali e consonanti",
                "Inverti frase",
                "Estrai una porzione di frase",
                "Esci"
        };

        System.out.println("Inserisci una frase: ");
        String frase = sc.nextLine();

        GestoreTesti gestore = new GestoreTesti();

        boolean uscita = false;

        do {
            int scelta = Menu(opzioni, sc);

            switch (scelta) {
                case 1 -> System.out.println("Lunghezza frase: " + gestore.lunghezzaFrase(frase));

                case 2 -> {
                    System.out.print("Inserisci la parola da cercare: ");
                    String parola = sc.nextLine();
                    boolean trovato = gestore.cercaParola(frase, parola);
                    if(trovato) {
                        System.out.println("La parola è stata trovata");
                    }
                    else {
                        System.out.println("La parola non è stata trovata");

                    }
                }

                case 3 -> {
                    System.out.print("Inserisci la parola da sostituire: ");
                    String vecchia = sc.nextLine();
                    System.out.print("Inserisci la nuova parola: ");
                    String nuova = sc.nextLine();
                    frase = gestore.sostituisciParola(frase, vecchia, nuova);
                    System.out.println("Frase aggiornata: " + frase);
                }

                case 4 -> {
                    int[] conta = gestore.contaVocaliEConsonanti(frase);
                    System.out.println("Vocali: " + conta[0] + ", Consonanti: " + conta[1]);
                }

                case 5 -> {
                    String invertita = gestore.invertiFrase(frase);
                    System.out.println("Frase invertita: " + invertita);
                }

                case 6 -> {
                    System.out.println("Inserisci indice inizio: ");
                    int inizio = Integer.parseInt(sc.nextLine());
                    System.out.println("Inserisci indice fine: ");
                    int fine = Integer.parseInt(sc.nextLine());
                    String porzione = gestore.estraiPorzione(frase, inizio, fine);
                    System.out.println("Porzione estratta: " + porzione);
                }

                case 7 -> {
                    System.out.println("Uscita in corso...");
                    uscita = true;
                }

                default -> System.out.println("Opzione non valida, riprova.");
            }


        } while (!uscita);


    }
}
