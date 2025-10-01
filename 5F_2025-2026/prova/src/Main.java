import static tools.Utility.*;


public static void main(String[] args) {
    /*
    Esercizio: Gestore di Testi
Scopo: Creare un programma che permetta all'utente di inserire e manipolare una frase,
dimostrando la conoscenza delle principali funzioni della classe String di Java.

Struttura del progetto:
- Main.java: Gestisce il menu e il flusso principale del programma.
- Package Tools:
- GestoreTesti.java: Contiene tutti i metodi per le operazioni sulle stringhe.
- Utility.java: Contiene i metodi di servizio (menu, pulizia schermo, etc.).

Obiettivi:
- Organizzare il codice in classi e pacchetti separati per responsabilità.
- Metodi String: Utilizzare metodi come .length(), .contains(), .replaceAll(), .substring(), .split(), etc.
- Gestione Input: Usare lo Scanner e gestire input validi e non validi.
- Controllo del Flusso: Utilizzare cicli (do-while) e strutture condizionali (switch).

GestoreTesti deve fare le seguenti cose:
-verificare la lunghezza della frase;
-verificare se è presente una parola (es. "Ciao mondo", cerca mondo);
-sostituire di una parola (es. "Ciao mondo", sostituisci mondo con Luca);
-conteggio vocali e consonanti;
-invertire una frase (es. "ciao", "oaic");
-estrarre una porzione di frase (.subString());
-tornare al menu principale;
-uscire dal programma.
     */
    Scanner sc = new Scanner(System.in);
    String[] opzioni = {"GESTORE TESTI",
            " Verifica lunghezza frase ",
            " Cerca parola ",
            " Sostituisci parola",
            " Conteggio vocali e consonanti",
            " Estrai una porzione di frase",
            " esci"};
    boolean uscita = false;
    System.out.println("Inserisci una stringa: ");
    String stringa1 = sc.nextLine();
    GestoreTesti gestore = new GestoreTesti();

    do {
        switch (Menu(opzioni, sc)) {
            case 1 -> {
                System.out.println("La lunghezza è: "+gestore.lunghezzaFrase(stringa1));
            }

            case 2 -> {

            }
            case 3 -> {

            }
            case 4 -> {

            }
            case 5 -> {

            }
            case 6 -> {
                uscita = true;
            }
        }

    } while (!uscita);


}
