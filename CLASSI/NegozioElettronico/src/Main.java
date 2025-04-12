import java.util.ArrayList;
import java.util.Scanner;

import static utility.Tools.*;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        boolean uscita = false;
        Negozio negozio = new Negozio();
        String[] opzioni = {
                "NEGOZIO ELETTRONICA",
                "1. Inserisci un nuovo smartphone",
                "2. Inserisci un nuovo manuale",
                "3. Rimuovi un prodotto esistente",
                "4. Visualizza l'elenco dei prodotti",
                "5. Fine"
        };

        do {
            int scelta = Menu(opzioni, tastiera);
            switch (scelta) {
                case 1-> {
                    try {
                        System.out.println("Inserisci un nuovo smartphone");
                        System.out.print("Inserisci il codice del prodotto: ");
                        int codice = Integer.parseInt(tastiera.nextLine());
                        System.out.print("Inserisci la marca: ");
                        String marca = tastiera.nextLine();
                        System.out.print("Inserisci il prezzo: ");
                        int prezzo = Integer.parseInt(tastiera.nextLine());
                        if (prezzo <= 0) throw new Exception("IL PREZZO NON PUO' ESSERE < 0");

                        System.out.print("Inserisci il modello: ");
                        String modello = tastiera.nextLine();
                        System.out.print("Inserisci la memoria in GB: ");
                        int memoria = Integer.parseInt(tastiera.nextLine());
                        if (memoria <= 0) throw new Exception("LA MEMORIA NON PUO' ESSERE < 0");

                        Smartphone smartphone = new Smartphone(codice, marca, prezzo, modello, memoria);
                        try {
                            negozio.addProdotto(smartphone);
                        } catch (Exception e) {
                            System.out.println("ERRORE! " + e.getMessage());
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }

                }

                case 2-> {
                    System.out.println("Inserisci un nuovo manuale");
                    try {
                        System.out.print("Inserisci il nome: ");
                        String nome = tastiera.nextLine();
                        System.out.print("Inserisci la descrizione: ");
                        String descrizione = tastiera.nextLine();
                        System.out.print("Inserisci l'autore: ");
                        String autore = tastiera.nextLine();
                        System.out.print("Inserisci codice: ");
                        int codice = Integer.parseInt(tastiera.nextLine());
                        System.out.print("Inserisci il prezzo: ");
                        int prezzo = Integer.parseInt(tastiera.nextLine());
                        System.out.print("Inserisci la quantita': ");
                        int quantita = Integer.parseInt(tastiera.nextLine());
                        System.out.print("Inserisci l'argomento: ");
                        String argomento = tastiera.nextLine();

                        Manuale manuale = new Manuale(nome, descrizione, autore, codice, prezzo, quantita, argomento);
                        try {
                            negozio.addProdotto(manuale);
                        } catch (Exception e) {
                            System.out.println("ERRORE! " + e.getMessage());
                        }
                    } catch (Exception e) {
                        System.out.println("ERRORE! " + e.getMessage());
                    }

                }

                case 3-> {
                    System.out.println("Rimuovi un prodotto esistente");
                    try {
                        System.out.print("Inserisci il codice (o codice) per rimuovere un prodotto: ");
                        int codice = Integer.parseInt(tastiera.nextLine());
                        negozio.removeProdotto(codice);
                    } catch (Exception e) {
                        System.out.println("ERRORE! " + e.getMessage());
                    }

                }

                case 4-> {
                    System.out.println("Visualizza l'elenco dei prodotti");
                    try {
                        ArrayList<Prodotto> listaProdotti = negozio.ritornaLista();
                        if (!listaProdotti.isEmpty()) {
                            listaProdotti.forEach(p -> System.out.println(p.toString()));
                        } else {
                            System.out.println("Lista vuota");
                        }
                    } catch (CloneNotSupportedException e) {
                        System.out.println("ERRORE! " + e.getMessage());
                    }

                }

                case 5-> {
                    System.out.println("Fine");
                    uscita = true;

                }

            }
        } while (!uscita);
    }
}
