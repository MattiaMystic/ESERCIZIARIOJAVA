import java.util.Scanner; // Importa la classe Scanner per leggere input da tastiera

import static Tools.Utility.*; // Importa staticamente il metodo menu() dalla classe Utility

public class Main { // Definizione della classe Main
    public static void main(String[] args) { // Metodo principale main()
        final int nContratti = 3; // Definisce il numero massimo di contratti
        Scanner tastiera = new Scanner(System.in); // Crea un oggetto Scanner per leggere l'input da tastiera
        Persona[] gestore = new Persona[nContratti]; // Crea un array di oggetti Persona
        String[] opzioni = {"Gestore Telefonico", "1 - Inserimento", "2 - Visualizza", "3 - Verifica presenza contatto", "4 - Ricerca numero telefono","5 - Modifica Contatto", "6 - Elimina Contato per nome cognome", "7 - Fine"}; // Array di stringhe contenente le opzioni del menu

        boolean fine = false; // Variabile booleana per verificare se il programma deve terminare
        boolean visualizzaSingolo = false;
        int posizione=0;
        int trovato=0;
        String[] tipoC = {"Telefono", "1]abitazione", "2]cellulare", "3]aziendale"};

        int contaContatti = 0; // Contatore per il numero di contatti presenti nell'array

        do { // Ciclo do-while per continuare il menu finché l'utente non decide di terminare
            switch (menu(opzioni, tastiera)) { // Switch statement per gestire le varie opzioni del menu
                case 1 -> { // Se l'utente sceglie 1
                    if (nContratti > contaContatti) { // Verifica se ci sono ancora slot disponibili per i contratti
                        boolean presente = false; // Variabile booleana per verificare se un contatto è già presente
                        Persona dettagli = LeggiContatto(tastiera); // Legge i dettagli del contatto dall'input
                        for (int i = 0; i < contaContatti; i++) { // Scansione degli attuali contatti per verificare duplicati
                            if (dettagli.nome.equals(gestore[i].nome) && dettagli.cognome.equals(gestore[i].cognome)) {
                                System.out.println("La persona con questo nome e cognome è già presente!"); // Stampa un messaggio se il contatto è già presente
                                presente = true; // Imposta presente a true
                                break; // Esci dal ciclo for
                            }
                        }
                        if(!presente) { // Se il contatto non è presente, lo aggiunge all'array
                            gestore[contaContatti] = dettagli; // Aggiunge il contatto all'array
                            contaContatti++; // Incrementa il numero di contatti
                        }
                    } else {
                        System.out.println("Finiti contratti"); // Stampa un messaggio se non ci sono più slot disponibili per i contratti
                    }
                }
                case 2 -> { // Se l'utente sceglie 2
                    visualizzaSingolo = false;
                    if (contaContatti > 0) { // Verifica se ci sono contatti da visualizzare
                        Visualizza(gestore, contaContatti, visualizzaSingolo, tastiera, posizione); // Chiama il metodo per visualizzare i contatti
                    } else {
                        System.out.println("Non ci sono contatti da visualizzare"); // Stampa un messaggio se non ci sono contatti
                    }
                }
                case 3 -> { // Se l'utente sceglie 3
                    if (contaContatti > 0) { // Verifica se ci sono contatti
                        if (verificaPresenzaContatto(tastiera, gestore, contaContatti)!=-1) { // Verifica la presenza di un contatto specifico
                            System.out.println("Contatto presente"); // Stampa un messaggio se il contatto è presente
                        } else {
                            System.out.println("Contatto non presente"); // Stampa un messaggio se il contatto non è presente
                            System.out.println("Aggiunta del nuovo contatto..."); // Avviso di aggiunta di un nuovo contatto
                            gestore[contaContatti] = LeggiContatto(tastiera); // Legge e aggiunge il nuovo contatto all'array
                            contaContatti++; // Incrementa il numero di contatti
                            System.out.println("Contatto aggiunto con successo."); // Stampa un messaggio di conferma
                        }

                    } else {
                        System.out.println("Non ci sono contatti"); // Stampa un messaggio se non ci sono contatti
                    }
                }

                case 4 -> { // Se l'utente sceglie 4
                    visualizzaSingolo = true;

                    if (contaContatti > 0) { // Verifica se ci sono contatti
                        posizione = verificaPresenzaContatto(tastiera, gestore, contaContatti);
                        if (posizione!=-1) { // Verifica la presenza di un contatto specifico
                            System.out.println("Contatto presente"); // Stampa un messaggio se il contatto è presente
                            Visualizza(gestore, contaContatti, visualizzaSingolo, tastiera, posizione);
                        } else {
                            System.out.println("Contatto non presente"); // Stampa un messaggio se il contatto non è presente
                            System.out.println("Aggiunta del nuovo contatto..."); // Avviso di aggiunta di un nuovo contatto
                            gestore[contaContatti] = LeggiContatto(tastiera); // Legge e aggiunge il nuovo contatto all'array
                            contaContatti++; // Incrementa il numero di contatti
                            System.out.println("Contatto aggiunto con successo."); // Stampa un messaggio di conferma
                        }

                    } else {
                        System.out.println("Non ci sono contatti"); // Stampa un messaggio se non ci sono contatti
                    }
                }

                case 5 -> {
                    posizione = verificaPresenzaContatto(tastiera, gestore, contaContatti);
                    if (posizione != -1) {
                        switch (menu(tipoC, tastiera)) {
                            case 1 -> gestore[posizione].tipo = Tipologia.abitazione;
                            case 2 -> gestore[posizione].tipo = Tipologia.cellulare;
                            default -> gestore[posizione].tipo = Tipologia.azienda;
                        }
                    } else {
                        System.out.println("Il contatto non esiste");
                    }
                }

                case 6 -> {
                    System.out.println("Quale contatto vuoi elimiare?");
                    trovato=verificaPresenzaContatto(tastiera, gestore, contaContatti);
                    gestore = eliminaContatto(gestore, contaContatti, trovato);
                    gestore[contaContatti - 1] = null;
                    contaContatti--;
                }
                case 7 -> fine = true; // Se l'utente sceglie 4, imposta fine a true per terminare il programma
            }
        } while (!fine); // Continua il ciclo finché l'utente non decide di terminare
        System.out.println("Fine programma"); // Stampa un messaggio per indicare la fine del programma
    }


    // Metodo per leggere i dettagli di un contatto
    public static Persona LeggiContatto(Scanner tastiera) {
        Persona contatto = new Persona(); // Crea un nuovo oggetto Persona per il nuovo contatto

        System.out.println("Inserisci il nome");
        contatto.nome = tastiera.nextLine();
        System.out.println("Inserisci il cognome");
        contatto.cognome = tastiera.nextLine();
        System.out.println("Inserisci il numero di telefono");
        contatto.numDiTelefono = tastiera.nextLine();
        String[] opzioni = {"Tipo di abbonamento", "1 - cellulare", "2 - Abitazione", "3 - Azienda"};

        int scelta;
        do {
            scelta = menu(opzioni, tastiera); // Mostra le opzioni per il tipo di abbonamento e legge l'input dell'utente
            switch (scelta) {
                case 1 -> contatto.tipo = Tipologia.cellulare; // Imposta il tipo di abbonamento come cellulare se l'utente sceglie 1
                case 2 -> contatto.tipo = Tipologia.abitazione; // Imposta il tipo di abbonamento come abitazione se l'utente sceglie 2
                case 3 -> contatto.tipo = Tipologia.azienda; // Imposta il tipo di abbonamento come azienda se l'utente sceglie 3
            }
        } while (scelta > 3 || scelta < 1); // Continua finché l'utente non sceglie un'opzione valida

        return contatto; // Restituisce il contatto appena creato
    }

    // Metodo per visualizzare i contatti presenti
    public static void Visualizza(Persona[] gestore, int contaContatti, boolean visualizzaSingolo, Scanner tastiera, int posizione) {
        if (!visualizzaSingolo){
            for (int i = 0; i < contaContatti; i++) {
                System.out.println(gestore[i].anagrafica()); // Stampa i dettagli di ogni contatto presente
            }
        }else{
            System.out.println(gestore[posizione].ricercaSingola()); // Stampa i dettagli di ogni contatto presente
        }
    }

    // Metodo per verificare la presenza di un contatto
    public static int verificaPresenzaContatto(Scanner tastiera, Persona[] gestore, int contaContatti) {
        System.out.println("Inserisci il nome");
        String nome = tastiera.nextLine();
        System.out.println("Inserisci il cognome");
        String cognome = tastiera.nextLine();

        for (int i = 0; i < contaContatti; i++) {
            if (gestore[i].nome.equals(nome) && gestore[i].cognome.equals(cognome)) {
                return i; // Contatto presente
            }
        }

        return -1; // Contatto non presente
    }
    public static Persona[] eliminaContatto(Persona[] gestore, int contaContatti, int trovato){
        if (trovato!=-1){
            for (int i = trovato; i < contaContatti; i++) {
                gestore[trovato] = gestore[trovato + 1];
            }

        }else{
            System.out.println("Contatto non trovato!");
        }
        return gestore;
    }
}