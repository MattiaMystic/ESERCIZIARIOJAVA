/*MATTIA PAVARIN ANALISI FUNZIONALE 21/12/2023
1. Lavoro 1: Cuocere uova di Natale
2. Lavoro 2: scelta tra hamburger vegetariano o di renna
3. lavoro 3: Scontrino******se utente sceglie subito scontrino non sarà una opzione valida


Scegli una delle operazioni inserendo il numero corrente:

Se l'utente sceglie "1", il programma entra nel swich case che cucina uova di Natale per 3 minuti.
Se l’utente sceglie "2", il programma richiede di inserire  il costo dei vari prodotti (hamburger vegetariani,hamburger di renna, bevanda alcolica e non alcolica con i loro vari prezzi);
In questo caso se l’utente sceglie ad esempio un hamburger alla fine uscirà in output un messaggio che dirà all’utente se vuole scegliere qualcos’altro e se scrive “S” allora sceglierà un altro prodotto..fino a che non digiterà qualcosa di diverso da “S” e stamperà lo scontrino totale;
Se l’utente sceglie “3” Avrà in uscita uno scontrino pari a 0 perche l’utente non avrà ancora visto le altre 2 scelte .*/

                     

import java.util.Scanner;
public class QuasiNatalizio {
    public static void main(String[] args) {

        Scanner tastiera = new Scanner(System.in);

        //Dichiarazione delle variabili
        int nScelta;
        int numero;
        float totale = 0;
        String risposta;
        String risposta3;
        String risposta2;
        do {
            System.out.println("Scegli tra le seguenti opzioni:");
            System.out.println("Scelta 1");
            System.out.println("Scelta 2");
            System.out.println("Scelta 3");

            System.out.print("Inserisci un numero corrispondente alla tua scelta: ");
            nScelta = tastiera.nextInt();


            switch (nScelta) {
                case 1:
                    System.out.println("Scelta 1");
                    do {
                        //int numero;


                        System.out.println("Inserisci un numero");
                        numero = tastiera.nextInt();

                        //Uovo nella pentola d'acqua
                        //cancella l'output per garantire maggiore pulizia
                        System.out.println("                          \n" +
                                "                ████      \n" +
                                "              ██░░░░██    \n" +
                                "            ██░░░░░░░░██  \n" +
                                "            ██░░░░░░░░██  \n" +
                                "          ██░░░░░░░░░░░░██\n" +
                                "          ██░░░░░░░░░░░░██\n" +
                                "          ██░░░░░░░░░░░░██\n" +
                                "            ██░░░░░░░░██  \n" +
                                "              ████████    \n" +
                                "                                        \n");

                        if (numero % 2 == 0) {
                            System.out.println("Mettiamo l'uovo nella pentola d'acqua \n");
                            System.out.println("Ottimo hai messo l'uovo nella pentola \n" +
                                    "Ora aspetta 3 minuti che si cuocia \n");

                            //Passano i 3 minuti di cottura dell'uovo
                            // l'Uovo si sta cucinando, ora è pronto

                            System.out.println("E' passato un minuto \n" +
                                    "L'uovo è ancora crudo \n");
                            //l'uovo si sta cucinando

                            System.out.println("Sono passati due minuti \n" +
                                    "Manca un minuto \n");
                            //l'uovo si sta ancora cucinando

                            System.out.println("Sono passati 3 minuti!\n" +
                                    "L'uovo è finalmente pronto");

                            //Lo chef mangia l'uovo preparato
                            System.out.println("Finalmente è l'ora dell'assaggio\n");

                            System.out.println("\n" +
                                    "                                ████████████████████████████████                              \n" +
                                    "                            ████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░████                          \n" +
                                    "                            ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██                          \n" +
                                    "                            ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██                          \n" +
                                    "                            ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██                          \n" +
                                    "                            ████░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██                            \n" +
                                    "            ██████              ██▓▓░░░░░░░░░░░░░░░░░░░░░░░░████                              \n" +
                                    "        ▓▓██▒▒▒▒▓▓████            ██░░░░░░░░░░░░░░░░░░░░░░░░██                                \n" +
                                    "      ▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒██        ██████████████████▓▓██████████▓▓                              \n" +
                                    "    ██▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██      ██░░░░░░░░░░░░░░▒▒▒▒░░░░░░░░░░██          ██████████████      \n" +
                                    "    ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██      ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░██          ██▒▒▒▒▒▒▒▒▒▒██      \n" +
                                    "  ██▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓██    ████████████░░████████░░████████          ██▒▒  ░░░░▒▒██      \n" +
                                    "  ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██      ██░░░░████░░░░░░░░████░░░░██            ██          ██      \n" +
                                    "  ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██      ██░░░░  ██░░░░░░░░  ██░░░░██            ██          ██      \n" +
                                    "  ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██      ██░░░░████░░░░░░░░████░░░░██            ██          ██      \n" +
                                    "    ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██        ██░░░░░░░░░░░░░░░░░░░░░░░░██              ████  ████        \n" +
                                    "    ██▒▒▒▒░░▒▒▒▒▒▒▒▒▒▒▒▒██      ██░░░░░░░░  ████████  ░░░░░░░░██              ██  ██          \n" +
                                    "      ██▒▒▒▒▒▒▒▒▒▒▒▒▒▒██        ██░░░░░░    ██░░░░██    ░░░░░░██              ██████          \n" +
                                    "        ▓▓▒▒▒▒▒▒▒▒████          ██░░░░      ░░████░░      ░░░░██              ██▒▒██          \n" +
                                    "            ██▒▒██              ██░░          ████          ░░██              ██▒▒██          \n" +
                                    "            ██████              ██      ▒▒    ████    ▒▒      ██              ██▒▒██          \n" +
                                    "            ██▒▒██            ██          ▒▒▒▒▒▒▒▒▒▒▒▒          ██            ██▒▒██          \n" +
                                    "            ██▒▒██████        ██████████    ░░░░░░░░░░  ██████████        ██████▒▒██          \n" +
                                    "            ████      ██████            ████████████████            ██████      ████          \n" +
                                    "            ████████  ░░░░░░████████████                ████████████░░░░░░  ████████          \n" +
                                    "            ██▒▒████  ░░░░░░░░░░░░██░░██                ██░░██░░░░░░░░░░░░  ████▒▒██          \n" +
                                    "            ██▒▒██  ██░░░░░░░░░░░░██░░██                ██░░██░░░░░░░░░░░░██  ██▒▒██          \n" +
                                    "            ██▒▒██    ██▓▓██░░░░░░██░░██                ▓▓░░██░░░░░░██████    ██▒▒██          \n" +
                                    "              ██            ██▒▒░░██░░██                ██░░████████          ▓▓▒▒██          \n" +
                                    "                                  ▓▓██████▓▓██████████▓▓██████                  ██            \n" +
                                    "                                  ██▒▒░░▒▒░░░░░░░░░░░░░░░░░░██      ██                        \n" +
                                    "                                  ██░░░░░░░░░░░░░░░░░░░░░░░░██    ██  ██                      \n" +
                                    "                                  ██░░░░░░░░░░░░░░░░░░░░░░░░██    ██  ██                      \n" +
                                    "                                  ██░░░░████▓▓██████████░░░░██    ██░░██                      \n" +
                                    "                                  ████░░██▓▓░░░░░░░░░░██░░████  ██░░░░██                      \n" +
                                    "                                  ████░░░░██░░░░░░░░▓▓░░░░██████░░░░██                        \n" +
                                    "                                  ██░░██░░▓▓████████▓▓░░██▒▒██░░░░░░██                        \n" +
                                    "                                ██░░░░░░████░░░░░░░░██▓▓░░░░░░▓▓░░▓▓                          \n" +
                                    "                                ██░░░░░░░░░░████████░░░░░░░░░░████                            \n" +
                                    "                                ██░░░░░░░░░░        ░░░░░░░░░░██                              \n" +
                                    "                                ██░░░░░░░░░░████████░░░░░░░░░░██                              \n" +
                                    "                                ██░░░░░░░░██        ██░░░░░░░░██                              \n" +
                                    "                                ██░░░░░░░░██        ██░░░░░░░░██                              \n" +
                                    "                                ██░░░░░░▒▒░░        ░░▓▓░░░░░░██                              \n" +
                                    "                              ████░░░░░░██            ██░░░░░░████                            \n" +
                                    "                            ██░░    ░░░░██            ██░░░░    ░░██                          \n" +
                                    "                            ██          ██            ██          ██                          \n" +
                                    "                            ██████████████            ██████████████                          \n");

                            System.out.println("Ottimo lavoro! L'uovo è delizioso. Alla prossima!");
                        } else {
                            System.out.println("L'uovo si è rotto!");
                            //rottura dell'uovo
                        }
                        System.out.println("Vuoi un'altro uovo?");
                        risposta = tastiera.next();
                    } while (risposta.equals("S"));
                    break;
                case 2:
                    System.out.println("Scelta 2");

                    float hamburgerVegano = 3;
                    float hamburgerRenna = hamburgerVegano * 2;
                    float bevandaAnalcolica = 2;
                    float prezzoBevandaAlcolica = bevandaAnalcolica * 2;
                    float sconto = 0;

                    int quantitaHamburgerVegano = 0;
                    int quantitaHamburgerRenna = 0;
                    int quantitaBevandaAnalcolica = 0;
                    int quantitaBevandaAlcolica = 0;
                    int scelta;


                    do {
                        System.out.println("Scegli tra le opzioni:");
                        System.out.println("1. Hamburger vegano - " + hamburgerVegano + " Euro");
                        System.out.println("2. Hamburger di renna - " + hamburgerRenna + " Euro");
                        System.out.println("3. Bevanda analcolica - " + bevandaAnalcolica + " Euro");
                        System.out.println("4. Bevanda alcolica - " + prezzoBevandaAlcolica + " Euro");
                        scelta = tastiera.nextInt();
                        System.out.println("\nInserisci una quantita' per ogni opzione:");

                        if (scelta == 1) {
                            System.out.print("Quanti ne vuoi ordinare: ");
                            quantitaHamburgerVegano = tastiera.nextInt();
                        } else if (scelta == 2) {
                            System.out.print("Quanti ne vuoi ordinare: ");
                            quantitaHamburgerRenna = tastiera.nextInt();
                        } else if (scelta == 3) {
                            System.out.print("Quanti ne vuoi ordinare: ");
                            quantitaBevandaAnalcolica = tastiera.nextInt();
                        } else if (scelta == 4) {
                            System.out.print("Quanti ne vuoi ordinare: ");
                            quantitaBevandaAlcolica = tastiera.nextInt();
                        } else {
                            System.out.println("Il numero che hai inserito non è valido!");
                        }
                        System.out.println("Vuoi ordinare qualcos'altro?");
                        risposta2 = tastiera.next();
                    } while (risposta2.equals("S"));

                    totale = (hamburgerVegano * quantitaHamburgerVegano) + (hamburgerRenna * quantitaHamburgerRenna) +
                            (bevandaAnalcolica * quantitaBevandaAnalcolica) + (prezzoBevandaAlcolica * quantitaBevandaAlcolica);

                    if (totale > 10) {
                        sconto = (totale - 10) * 0.15f;
                        totale -= sconto;
                    }

                    System.out.println("Totale da pagare: " + totale + " Euro");
                    break;
                case 3:
                    System.out.println("Scelta 3.");
                    System.out.println("Il scontrino e' uguale a 0 e quindi non c'e nessun costo da pagare!!");
                    float TOT=0;
                    TOT=TOT+totale;
                    System.out.println("Lo scontrino in base a tutti i valori ripetuti e'"+TOT);
                    break;


                default:
                    System.out.println("Scelta non valida!");

                    break;

            }
            System.out.println("Vuoi tornare all'inizio? digita S e questo accadrà");
            risposta3 = tastiera.next();
        }while(risposta3.equals("S"));

    }




}//fine programma
