import java.util.ArrayList;
import java.util.Scanner;

import static utility.Tools.*;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        Negozio negozio = new Negozio();
        String[] opzioni = {
                "NEGOZIO ELETTRONICA",
                "1. Inserisci un nuovo smartphone",
                "2. Rimuovi un prodotto esistente",
                "3. Ricerca prodotto per codice",
                "4. Modifica il prezzo di un prodotto",
                "5. Visualizza l'elenco dei prodotti",
                "6. Fine"
        };

        boolean uscita = false;
        while (!uscita) {
            int scelta = Menu(opzioni, tastiera);
            switch (scelta) {
                case 1 -> aggiungiSmartphone(tastiera, negozio);
                case 2 -> rimuoviProdotto(tastiera, negozio);
                case 3 -> ricercaProdotto(tastiera, negozio);
                case 4 -> modificaPrezzo(tastiera, negozio);
                case 5 -> visualizzaElenco(tastiera, negozio);
                case 6 -> {
                    System.out.println("Fine");
                    uscita = true;
                }
            }
        }
    }

    private static void aggiungiSmartphone(Scanner tastiera, Negozio negozio) {
        try {
            System.out.println("Inserisci un nuovo smartphone");
            int codice = leggiCodiceProdotto(tastiera);
            String marca = leggiMarca(tastiera);
            int prezzo = leggiPrezzo(tastiera);
            String modello = leggiModello(tastiera);
            int memoria = leggiMemoria(tastiera);

            if (prezzo > 0 && memoria > 0) {
                Smartphone smartphone = new Smartphone(codice, marca, prezzo, modello, memoria);
                negozio.addProdotto(smartphone);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void rimuoviProdotto(Scanner tastiera, Negozio negozio) {
        System.out.println("Rimuovi un prodotto esistente");
        int codiceRimozione = leggiCodiceProdotto(tastiera);
        negozio.removeProdotto(codiceRimozione);
    }

    private static void ricercaProdotto(Scanner tastiera, Negozio negozio) {
        System.out.println("Ricerca prodotto per codice");
        int codiceRicerca = leggiCodiceProdotto(tastiera);
        try {
            System.out.println(negozio.ricercaPerCodice(codiceRicerca));
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void modificaPrezzo(Scanner tastiera, Negozio negozio) {
        System.out.println("Modifica il prezzo di un prodotto");
        int codiceRicerca = leggiCodiceProdotto(tastiera);
        System.out.println("Inserisci il nuovo prezzo");
        int nuovoPrezzo = Integer.parseInt(tastiera.nextLine());
        try {
            negozio.modificaPrezzo(codiceRicerca, nuovoPrezzo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void visualizzaElenco(Scanner tastiera, Negozio negozio) {
        System.out.println("Visualizza l'elenco dei prodotti");
        try {
            ArrayList<ProdottoElettronico> listaRitornata = negozio.ritornaLista();
            if (!listaRitornata.isEmpty()) {
                listaRitornata.forEach(p -> System.out.println(p.toString()));
            } else {
                System.out.println("Lista vuota");
            }
        } catch (CloneNotSupportedException e) {
            System.out.println("ERRORE! " + e.getMessage());
        }
    }

    private static int leggiCodiceProdotto(Scanner tastiera) {
        System.out.println("Inserisci il codice del prodotto");
        return Integer.parseInt(tastiera.nextLine());
    }

    private static String leggiMarca(Scanner tastiera) {
        System.out.println("Inserisci la marca");
        return tastiera.nextLine();
    }

    private static int leggiPrezzo(Scanner tastiera) {
        System.out.println("Inserisci il prezzo");
        return Integer.parseInt(tastiera.nextLine());
    }

    private static String leggiModello(Scanner tastiera) {
        System.out.println("Inserisci il modello");
        return tastiera.nextLine();
    }

    private static int leggiMemoria(Scanner tastiera) {
        System.out.println("Inserisci la memoria in GB");
        return Integer.parseInt(tastiera.nextLine());
    }
}
