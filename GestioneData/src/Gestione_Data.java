import java.util.Scanner;

public class Gestione_Data {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data, scelta;
        do {
            System.out.println("Inserire la data in formato GGMMAAAA oppure GMMAAAA");
            data = sc.nextInt();
            while (!CtrlData(data, sc)) {
                System.out.println("La data è invalida! Deve essere in formato GGMMAAAA oppure GMMAAAA. Reinserire");
                data = sc.nextInt();
            }
            int[] elementiData = patternData(data);
            if (dataOK(elementiData, sc)) {
                System.out.println("Data valida\nData:");
            }
            for (int i = elementiData.length - 1; i >= 0; i--) {
                System.out.print(elementiData[i] + " ");
            }
            int dataggiunta = data_up(sc, elementiData);
            if (dataggiunta <= 31 && elementiData[1] == 1) {
                System.out.println("La data finale con i giorni aggiunti e': " + dataggiunta);
            }
            if (elementiData[1] == 2) {
                if (elementiData[0] % 4 == 0) {
                    if (dataggiunta >= 1 && dataggiunta <= 29) {
                        System.out.println("La data finale in un anno bisestile  con i giorni aggiunti e': " + dataggiunta);
                    }
                }
                    }
            else if  (dataggiunta <= 28 && elementiData[1] == 2) {
                System.out.println("La data finale con i giorni aggiunti e': " + dataggiunta);
            }
            if (dataggiunta <= 31 && elementiData[1] == 3) {
                System.out.println("La data finale con i giorni aggiunti e': " + dataggiunta);
            }
            if (dataggiunta <= 30 && elementiData[1] == 4) {
                System.out.println("La data finale con i giorni aggiunti e': " + dataggiunta);
            }
            if (dataggiunta <= 31 && elementiData[1] == 5) {
                System.out.println("La data finale con i giorni aggiunti e': " + dataggiunta);
            }
            if (dataggiunta <= 30 && elementiData[1] == 6) {
                System.out.println("La data finale con i giorni aggiunti e': " + dataggiunta);
            }
            if (dataggiunta <= 31 && elementiData[1] == 7) {
                System.out.println("La data finale con i giorni aggiunti e': " + dataggiunta);
            }
            if (dataggiunta <= 31 && elementiData[1] == 8) {
                System.out.println("La data finale con i giorni aggiunti e': " + dataggiunta);
            }
            if (dataggiunta <= 30 && elementiData[1] == 9) {
                System.out.println("La data finale con i giorni aggiunti e': " + dataggiunta);
            }
            if (dataggiunta <= 31 && elementiData[1] == 10) {
                System.out.println("La data finale con i giorni aggiunti e': " + dataggiunta);
            }
            if (dataggiunta <= 30 && elementiData[1] == 11) {
                System.out.println("La data finale con i giorni aggiunti e': " + dataggiunta);
            }
            if (dataggiunta <= 31 && elementiData[1] == 12) {
                System.out.println("La data finale con i giorni aggiunti e': " + dataggiunta);
            }


            int datatolta = data_down(sc, elementiData);
            if (datatolta >=1 && elementiData[1] == 1&& datatolta<=31) {
                System.out.println("La data finale con i giorni tolti e': " + datatolta);
            }
            if (elementiData[1] == 2) {
                if (elementiData[0] % 4 == 0) {
                    if (datatolta >= 1 && datatolta <= 29) {
                        System.out.println("La data finale in un anno bisestile  con i giorni tolti e': " + dataggiunta);
                    }
                }
            }
            else if  (datatolta <= 28 && elementiData[1] == 2) {
                System.out.println("La data finale con i giorni tolti e': " + datatolta);
            }
            if (datatolta <= 31 && elementiData[1] == 3) {
                System.out.println("La data finale con i giorni tolti e': " + datatolta);
            }
            if (datatolta <= 30 && elementiData[1] == 4) {
                System.out.println("La data finale con i giorni tolti e': " + datatolta);
            }
            if (datatolta <= 31 && elementiData[1] == 5) {
                System.out.println("La data finale con i giorni tolti e': " + datatolta);
            }
            if (datatolta <= 30 && elementiData[1] == 6) {
                System.out.println("La data finale con i giorni tolti e': " + datatolta);
            }
            if (datatolta <= 31 && elementiData[1] == 7) {
                System.out.println("La data finale con i giorni tolti e': " + datatolta);
            }
            if (datatolta <= 31 && elementiData[1] == 8) {
                System.out.println("La data finale con i giorni tolti e': " + datatolta);
            }
            if (datatolta <= 30 && elementiData[1] == 9) {
                System.out.println("La data finale con i giorni tolti e': " + datatolta);
            }
            if (datatolta <= 31 && elementiData[1] == 10) {
                System.out.println("La data finale con i giorni tolti e': " + datatolta);
            }
            if (datatolta <= 30 && elementiData[1] == 11) {
                System.out.println("La data finale con i giorni tolti e': " + datatolta);
            }
            if (datatolta <= 31 && elementiData[1] == 12) {
                System.out.println("La data finale con i giorni tolti e': " + datatolta);
            }


            System.out.println("\nVuoi controllare un'altra data? Inserire 1 per sì o qualsiasi altro valore per no");
            scelta = sc.nextInt();
        } while (scelta == 1);
    }

    public static boolean CtrlData(int data, Scanner sc) {
        int lunghezza = 0;
        while (data <= 0) {
            System.out.println("La data deve essere un numero positivo! Reinserire");
            data = sc.nextInt();
        }
        do {
            data = data / 10;
            lunghezza++;
        } while (data > 0);
        return lunghezza == 7 || lunghezza == 8;
    }

    public static int[] patternData(int data) {
        int[] elementiData = new int[3];
        elementiData[0] = data % 10000;
        data = data / 10000;
        elementiData[1] = data % 100;
        data = data / 100;
        elementiData[2] = data;
        return elementiData;
    }

    public static boolean dataOK(int[] elementiData, Scanner sc) {
        while (elementiData[0] <= 0 || elementiData[0] > 9999) {
            System.out.println("L'anno inserito non è valido! Reinserire l'anno");
            elementiData[0] = sc.nextInt();
        }
        while (elementiData[1] < 1 || elementiData[1] > 12) {
            System.out.println("Il mese inserito non è valido! Reinserire il mese");
            elementiData[1] = sc.nextInt();
        }
        while (elementiData[1] == 1 && (elementiData[2] < 1 || elementiData[2] > 31)) {
            System.out.println("I giorni del mese di gennaio vanno dall'1 al 31! Reinserire il giorno");
            elementiData[2] = sc.nextInt();
        }
        while (elementiData[1] == 2) {
            if (elementiData[0] % 4 == 0) {
                while (elementiData[2] < 1 || elementiData[2] > 29) {
                    System.out.println("I giorni del mese di febbraio in un anno bisestile vanno dall'1 al 29! Reinserire il giorno");
                    elementiData[2] = sc.nextInt();
                }
            } else {
                while (elementiData[2] < 1 || elementiData[2] > 28) {
                    System.out.println("I giorni del mese di febbraio vanno dall'1 al 28! Reinserire il giorno");
                    elementiData[2] = sc.nextInt();
                }
            }
            break;
        }
        while (elementiData[1] == 3 && (elementiData[2] < 1 || elementiData[2] > 31)) {
            System.out.println("I giorni del mese di marzo vanno dall'1 al 31! Reinserire il giorno");
            elementiData[2] = sc.nextInt();
        }
        while (elementiData[1] == 4 && (elementiData[2] < 1 || elementiData[2] > 30)) {
            System.out.println("I giorni del mese di aprile vanno dall'1 al 30! Reinserire il giorno");
            elementiData[2] = sc.nextInt();
        }
        while (elementiData[1] == 5 && (elementiData[2] < 1 || elementiData[2] > 31)) {
            System.out.println("I giorni del mese di maggio vanno dall'1 al 31! Reinserire il giorno");
            elementiData[2] = sc.nextInt();
        }
        while (elementiData[1] == 6 && (elementiData[2] < 1 || elementiData[2] > 30)) {
            System.out.println("I giorni del mese di giugno vanno dall'1 al 30! Reinserire il giorno");
            elementiData[2] = sc.nextInt();
        }
        while (elementiData[1] == 7 && (elementiData[2] < 1 || elementiData[2] > 31)) {
            System.out.println("I giorni del mese di luglio vanno dall'1 al 31! Reinserire il giorno");
            elementiData[2] = sc.nextInt();
        }
        while (elementiData[1] == 8 && (elementiData[2] < 1 || elementiData[2] > 31)) {
            System.out.println("I giorni del mese di agosto vanno dall'1 al 31! Reinserire il giorno");
            elementiData[2] = sc.nextInt();
        }
        while (elementiData[1] == 9 && (elementiData[2] < 1 || elementiData[2] > 30)) {
            System.out.println("I giorni del mese di settembre vanno dall'1 al 30! Reinserire il giorno");
            elementiData[2] = sc.nextInt();
        }
        while (elementiData[1] == 10 && (elementiData[2] < 1 || elementiData[2] > 31)) {
            System.out.println("I giorni del mese di ottobre vanno dall'1 al 31! Reinserire il giorno");
            elementiData[2] = sc.nextInt();
        }
        while (elementiData[1] == 11 && (elementiData[2] < 1 || elementiData[2] > 30)) {
            System.out.println("I giorni del mese di novembre vanno dall'1 al 30! Reinserire il giorno");
            elementiData[2] = sc.nextInt();
        }
        while (elementiData[1] == 12 && (elementiData[2] < 1 || elementiData[2] > 31)) {
            System.out.println("I giorni del mese di dicembre vanno dall'1 al 31! Reinserire il giorno");
            elementiData[2] = sc.nextInt();
        }
        return true;

    }

    /*
    Modificare l’esercizio precedente in modo
tale che l’utente tramite un menù possa aggiungere o togliere giorni alla data
precedentemente inserita.


Per la risoluzione dell’esercizio creare
due metodi:


 "data_up "e "data_down" che ricevuti in input il n° di giorni da
aggiungere o togliere ritornino
la nuova data.
     */
    public static int data_up(Scanner sc, int[] elementiData) {

        int giorni = 0;
        int somma = elementiData[2];
        //el1 mesi el2 gg
        if (elementiData[1] == 1 && (elementiData[2] >= 1 && elementiData[2] <= 31)) {

            System.out.println("Quanti giorni vuoi aggiungere?");
            giorni = sc.nextInt();

            somma = somma + giorni;
            if (somma <= 31) {
                // Se è minore o uguale a 30, aggiungi i giorni alla data iniziale

                System.out.println("La nuova data è: " + somma);

            } else {
                // Se è maggiore di 31, mantieni la data iniziale
                System.out.println("Il numero di giorni da aggiungere supera il limite massimo consentito (31 giorni)");


            }

        }
        if (elementiData[1] == 2) {
            if (elementiData[0] % 4 == 0) {
                if (elementiData[2] >= 1 && elementiData[2] <= 29) {
                    System.out.println("I giorni del mese di febbraio in un anno bisestile vanno dall'1 al 29! ");

                    System.out.println("Quanti giorni vuoi aggiungere?");
                    giorni = sc.nextInt();

                    somma = somma + giorni;
                    if (somma <= 29) {
                        // Se è minore o uguale a 30, aggiungi i giorni alla data iniziale

                        System.out.println("La nuova data è: " + somma);

                    } else {
                        // Se è maggiore di 31, mantieni la data iniziale
                        System.out.println("Il numero di giorni da aggiungere supera il limite massimo consentito (29 giorni)");

                    }
                }
            }else {
                    if (elementiData[2] >= 1 && elementiData[2] <= 28) {
                        System.out.println("I giorni del mese di febbraio vanno dall'1 al 28!");

                        System.out.println("Quanti giorni vuoi aggiungere?");
                        giorni = sc.nextInt();

                        somma = somma + giorni;
                        if (somma <= 28) {
                            // Se è minore o uguale a 28, aggiungi i giorni alla data iniziale

                            System.out.println("La nuova data è: " + somma);

                        } else {
                            // Se è maggiore di 31, mantieni la data iniziale
                            System.out.println("Il numero di giorni da aggiungere supera il limite massimo consentito (28 giorni)");

                        }
                    }
                }

            }
        if (elementiData[1] == 3 && (elementiData[2] >= 1 && elementiData[2] <= 31)) {

            System.out.println("Quanti giorni vuoi aggiungere?");
            giorni = sc.nextInt();

            somma = somma + giorni;
            if (somma <= 31) {
                // Se è minore o uguale a 31, aggiungi i giorni alla data iniziale

                System.out.println("La nuova data è: " + somma);

            } else {
                // Se è maggiore di 31, mantieni la data iniziale
                System.out.println("Il numero di giorni da aggiungere supera il limite massimo consentito (31 giorni)");


            }

        }

        if (elementiData[1] == 4 && (elementiData[2] >= 1 && elementiData[2] <= 30)) {

            System.out.println("Quanti giorni vuoi aggiungere?");
            giorni = sc.nextInt();

            somma = somma + giorni;
            if (somma <= 30) {
                // Se è minore o uguale a 30, aggiungi i giorni alla data iniziale

                System.out.println("La nuova data è: " + somma);

            } else {
                // Se è maggiore di 30, mantieni la data iniziale
                System.out.println("Il numero di giorni da aggiungere supera il limite massimo consentito (30 giorni)");


            }

        }
        if (elementiData[1] == 5 && (elementiData[2] >= 1 && elementiData[2] <= 31)) {

            System.out.println("Quanti giorni vuoi aggiungere?");
            giorni = sc.nextInt();

            somma = somma + giorni;
            if (somma <= 31) {
                // Se è minore o uguale a 31, aggiungi i giorni alla data iniziale

                System.out.println("La nuova data è: " + somma);

            } else {
                // Se è maggiore di 31, mantieni la data iniziale
                System.out.println("Il numero di giorni da aggiungere supera il limite massimo consentito (31 giorni)");


            }

        }
        if (elementiData[1] == 6 && (elementiData[2] >= 1 && elementiData[2] <= 30)) {

            System.out.println("Quanti giorni vuoi aggiungere?");
            giorni = sc.nextInt();

            somma = somma + giorni;
            if (somma <= 30) {
                // Se è minore o uguale a 30, aggiungi i giorni alla data iniziale

                System.out.println("La nuova data è: " + somma);

            } else {
                // Se è maggiore di 31, mantieni la data iniziale
                System.out.println("Il numero di giorni da aggiungere supera il limite massimo consentito (30 giorni)");


            }

        }
        if (elementiData[1] == 7 && (elementiData[2] >= 1 && elementiData[2] <= 31)) {

            System.out.println("Quanti giorni vuoi aggiungere?");
            giorni = sc.nextInt();

            somma = somma + giorni;
            if (somma <= 31) {
                // Se è minore o uguale a 31, aggiungi i giorni alla data iniziale

                System.out.println("La nuova data è: " + somma);

            } else {
                // Se è maggiore di 31, mantieni la data iniziale
                System.out.println("Il numero di giorni da aggiungere supera il limite massimo consentito (31 giorni)");


            }

        }
        if (elementiData[1] == 8 && (elementiData[2] >= 1 && elementiData[2] <= 31)) {

            System.out.println("Quanti giorni vuoi aggiungere?");
            giorni = sc.nextInt();

            somma = somma + giorni;
            if (somma <= 31) {
                // Se è minore o uguale a 31, aggiungi i giorni alla data iniziale

                System.out.println("La nuova data è: " + somma);

            } else {
                // Se è maggiore di 31, mantieni la data iniziale
                System.out.println("Il numero di giorni da aggiungere supera il limite massimo consentito (31 giorni)");


            }

        }
        if (elementiData[1] == 9 && (elementiData[2] >= 1 && elementiData[2] <= 30)) {

            System.out.println("Quanti giorni vuoi aggiungere?");
            giorni = sc.nextInt();

            somma = somma + giorni;
            if (somma <= 30) {
                // Se è minore o uguale a 30, aggiungi i giorni alla data iniziale

                System.out.println("La nuova data è: " + somma);

            } else {
                // Se è maggiore di 31, mantieni la data iniziale
                System.out.println("Il numero di giorni da aggiungere supera il limite massimo consentito (30 giorni)");


            }

        }
        if (elementiData[1] == 10 && (elementiData[2] >= 1 && elementiData[2] <= 31)) {

            System.out.println("Quanti giorni vuoi aggiungere?");
            giorni = sc.nextInt();

            somma = somma + giorni;
            if (somma <= 31) {
                // Se è minore o uguale a 31, aggiungi i giorni alla data iniziale

                System.out.println("La nuova data è: " + somma);

            } else {
                // Se è maggiore di 31, mantieni la data iniziale
                System.out.println("Il numero di giorni da aggiungere supera il limite massimo consentito (31 giorni)");


            }

        }
        if (elementiData[1] == 11 && (elementiData[2] >= 1 && elementiData[2] <= 30)) {

            System.out.println("Quanti giorni vuoi aggiungere?");
            giorni = sc.nextInt();

            somma = somma + giorni;
            if (somma <= 30) {
                // Se è minore o uguale a 30, aggiungi i giorni alla data iniziale

                System.out.println("La nuova data è: " + somma);

            } else {
                // Se è maggiore di 31, mantieni la data iniziale
                System.out.println("Il numero di giorni da aggiungere supera il limite massimo consentito (30 giorni)");


            }

        }
        if (elementiData[1] == 9 && (elementiData[2] >= 1 && elementiData[2] <= 31)) {

            System.out.println("Quanti giorni vuoi aggiungere?");
            giorni = sc.nextInt();

            somma = somma + giorni;
            if (somma <= 31) {
                // Se è minore o uguale a 31, aggiungi i giorni alla data iniziale

                System.out.println("La nuova data è: " + somma);

            } else {
                // Se è maggiore di 31, mantieni la data iniziale
                System.out.println("Il numero di giorni da aggiungere supera il limite massimo consentito (31 giorni)");


            }

        }


            return somma;
        }




    public static int data_down(Scanner sc, int[] elementiData) {

        int giorni = 0;
        int differenza = elementiData[2];
        //el1 mesi el2 gg
        if (elementiData[1] == 1 && (elementiData[2] >= 1 && elementiData[2] <= 31)) {

            System.out.println("Quanti giorni vuoi togliere?");
            giorni = sc.nextInt();

            differenza = differenza - giorni;
            if (differenza <= 31 && differenza>=1) {
                // Se è minore o uguale a 30, aggiungi i giorni alla data iniziale

                System.out.println("La nuova data è: " + differenza);

            } else {
                // Se è maggiore di 31, mantieni la data iniziale
                System.out.println("Il numero di giorni da togliere porta la data del mese corrente ad un valore negativo");


            }

        }
        if (elementiData[1] == 2) {
            if (elementiData[0] % 4 == 0) {
                if (elementiData[2] >= 1 && elementiData[2] <= 29) {
                    System.out.println("I giorni del mese di febbraio in un anno bisestile vanno dall'1 al 29! ");

                    System.out.println("Quanti giorni vuoi togliere?");
                    giorni = sc.nextInt();

                    differenza = differenza - giorni;
                    if (differenza <= 29&& differenza>=1) {
                        // Se è minore o uguale a 30, aggiungi i giorni alla data iniziale

                        System.out.println("La nuova data è: " + differenza);

                    } else {
                        // Se è maggiore di 31, mantieni la data iniziale
                        System.out.println("Il numero di giorni da togliere porta la data del mese corrente ad un valore negativo");

                    }
                }
            }else {
                if (elementiData[2] >= 1 && elementiData[2] <= 28) {
                    System.out.println("I giorni del mese di febbraio vanno dall'1 al 28!");

                    System.out.println("Quanti giorni vuoi togliere?");
                    giorni = sc.nextInt();

                    differenza = differenza - giorni;
                    if (differenza <= 28&& differenza>=1) {
                        // Se è minore o uguale a 30, aggiungi i giorni alla data iniziale

                        System.out.println("La nuova data è: " + differenza);

                    } else {
                        // Se è maggiore di 31, mantieni la data iniziale
                        System.out.println("Il numero di giorni da togliere porta la data del mese corrente ad un valore negativo");

                    }
                }
            }

        }
        if (elementiData[1] == 3 && (elementiData[2] >= 1 && elementiData[2] <= 31)) {

            System.out.println("Quanti giorni vuoi togliere?");
            giorni = sc.nextInt();

            differenza = differenza - giorni;
            if (differenza <= 31 && differenza>=1) {
                // Se è minore o uguale a 30, aggiungi i giorni alla data iniziale

                System.out.println("La nuova data è: " + differenza);

            } else {
                // Se è maggiore di 31, mantieni la data iniziale
                System.out.println("Il numero di giorni da togliere porta la data del mese corrente ad un valore negativo");


            }

        }
        if (elementiData[1] == 4 && (elementiData[2] >= 1 && elementiData[2] <= 30)) {

            System.out.println("Quanti giorni vuoi togliere?");
            giorni = sc.nextInt();

            differenza = differenza - giorni;
            if (differenza <= 30 && differenza>=1) {
                // Se è minore o uguale a 30, aggiungi i giorni alla data iniziale

                System.out.println("La nuova data è: " + differenza);

            } else {
                // Se è maggiore di 31, mantieni la data iniziale
                System.out.println("Il numero di giorni da togliere porta la data del mese corrente ad un valore negativo");


            }

        }
        if (elementiData[1] == 5 && (elementiData[2] >= 1 && elementiData[2] <= 31)) {

            System.out.println("Quanti giorni vuoi togliere?");
            giorni = sc.nextInt();

            differenza = differenza - giorni;
            if (differenza <= 31 && differenza>=1) {
                // Se è minore o uguale a 30, aggiungi i giorni alla data iniziale

                System.out.println("La nuova data è: " + differenza);

            } else {
                // Se è maggiore di 31, mantieni la data iniziale
                System.out.println("Il numero di giorni da togliere porta la data del mese corrente ad un valore negativo");


            }

        }
        if (elementiData[1] == 6 && (elementiData[2] >= 1 && elementiData[2] <= 30)) {

            System.out.println("Quanti giorni vuoi togliere?");
            giorni = sc.nextInt();

            differenza = differenza - giorni;
            if (differenza <= 30 && differenza>=1) {
                // Se è minore o uguale a 30, aggiungi i giorni alla data iniziale

                System.out.println("La nuova data è: " + differenza);

            } else {
                // Se è maggiore di 31, mantieni la data iniziale
                System.out.println("Il numero di giorni da togliere porta la data del mese corrente ad un valore negativo");


            }

        }
        if (elementiData[1] == 7 && (elementiData[2] >= 1 && elementiData[2] <= 31)) {

            System.out.println("Quanti giorni vuoi togliere?");
            giorni = sc.nextInt();

            differenza = differenza - giorni;
            if (differenza <= 31 && differenza>=1) {
                // Se è minore o uguale a 30, aggiungi i giorni alla data iniziale

                System.out.println("La nuova data è: " + differenza);

            } else {
                // Se è maggiore di 31, mantieni la data iniziale
                System.out.println("Il numero di giorni da togliere porta la data del mese corrente ad un valore negativo");


            }

        }
        if (elementiData[1] == 8 && (elementiData[2] >= 1 && elementiData[2] <= 31)) {

            System.out.println("Quanti giorni vuoi togliere?");
            giorni = sc.nextInt();

            differenza = differenza - giorni;
            if (differenza <= 31 && differenza>=1) {
                // Se è minore o uguale a 30, aggiungi i giorni alla data iniziale

                System.out.println("La nuova data è: " + differenza);

            } else {
                // Se è maggiore di 31, mantieni la data iniziale
                System.out.println("Il numero di giorni da togliere porta la data del mese corrente ad un valore negativo");


            }

        }
        if (elementiData[1] == 9 && (elementiData[2] >= 1 && elementiData[2] <= 30)) {

            System.out.println("Quanti giorni vuoi togliere?");
            giorni = sc.nextInt();

            differenza = differenza - giorni;
            if (differenza <= 30 && differenza>=1) {
                // Se è minore o uguale a 30, aggiungi i giorni alla data iniziale

                System.out.println("La nuova data è: " + differenza);

            } else {
                // Se è maggiore di 31, mantieni la data iniziale
                System.out.println("Il numero di giorni da togliere porta la data del mese corrente ad un valore negativo");


            }

        }
        if (elementiData[1] == 10 && (elementiData[2] >= 1 && elementiData[2] <= 31)) {

            System.out.println("Quanti giorni vuoi togliere?");
            giorni = sc.nextInt();

            differenza = differenza - giorni;
            if (differenza <= 31 && differenza>=1) {
                // Se è minore o uguale a 30, aggiungi i giorni alla data iniziale

                System.out.println("La nuova data è: " + differenza);

            } else {
                // Se è maggiore di 31, mantieni la data iniziale
                System.out.println("Il numero di giorni da togliere porta la data del mese corrente ad un valore negativo");


            }

        }
        if (elementiData[1] == 11 && (elementiData[2] >= 1 && elementiData[2] <= 30)) {

            System.out.println("Quanti giorni vuoi togliere?");
            giorni = sc.nextInt();

            differenza = differenza - giorni;
            if (differenza <= 30 && differenza>=1) {
                // Se è minore o uguale a 30, aggiungi i giorni alla data iniziale

                System.out.println("La nuova data è: " + differenza);

            } else {
                // Se è maggiore di 31, mantieni la data iniziale
                System.out.println("Il numero di giorni da togliere porta la data del mese corrente ad un valore negativo");


            }

        }
        if (elementiData[1] == 10 && (elementiData[2] >= 1 && elementiData[2] <= 31)) {

            System.out.println("Quanti giorni vuoi togliere?");
            giorni = sc.nextInt();

            differenza = differenza - giorni;
            if (differenza <= 31 && differenza>=1) {
                // Se è minore o uguale a 30, aggiungi i giorni alla data iniziale

                System.out.println("La nuova data è: " + differenza);

            } else {
                // Se è maggiore di 31, mantieni la data iniziale
                System.out.println("Il numero di giorni da togliere porta la data del mese corrente ad un valore negativo");


            }

        }


        return differenza;
    }
    }
