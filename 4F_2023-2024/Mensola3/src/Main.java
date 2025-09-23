
import Mensola.Libro;
import java.util.Scanner;
import static Tools.Utility.*;
import static FrontEnd.FrontScreen.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAXLIBRI = 3;
        Libro[] mensola = new Libro[MAXLIBRI];

        boolean uscita = false;
        int cont = 0;
        do {
            String[] opzioni = {"---MENSOLA---", "1- inserimento", "2- visualizza", "3-cancella libro", "4-ricerca", "5- Fine"};
            int scelta = menu(opzioni, sc);
            switch (scelta) {

                case 1 -> {
                    System.out.println("Inserimento");
                    if (cont < MAXLIBRI) {
                        Libro nuovoLibro = LeggiLibro(sc);

                        if (libroDoppio(mensola, cont, nuovoLibro) == -1) {
                            mensola[cont] = nuovoLibro;
                            cont++;
                        } else {
                            System.out.println("Il libro è già presente.");
                        }
                    } else {
                        System.out.println("Non è possibile inserire altri libri");
                    }
                }
                case 2 -> {
                    System.out.println("Visualizzazione");
                    System.out.println("Quale tra i " + cont + " vuoi visualizzare?");
                    int sceltaLibro = Integer.parseInt(sc.nextLine());
                    if (sceltaLibro <= cont && sceltaLibro > 0) {
                        System.out.println(mensola[sceltaLibro - 1].FormattaDati());
                    } else {
                        System.out.println("Scelta non valida");
                    }
                }

                case 3 -> {
                    if (cont < MAXLIBRI) {
                        System.out.println("Inserisci il titolo del libro da cercare:");
                        String titoloCercato = sc.nextLine();
                        eliminaLibro(mensola, cont, titoloCercato);
                        cont--;
                    }
                }
                case 4 -> {
                    System.out.println("ricerca");
                    System.out.println("Quale libro vuoi ricercare? Inserisci il titolo:");
                    try {
                        Libro Titolo = new Libro();
                        Titolo.Titolo = sc.nextLine();

                        if (findIndex(mensola, cont, Titolo) != -1) {
                            System.out.println(mensola[findIndex(mensola, cont, Titolo)].FormattaDati());
                        } else {
                            throw new Exception("Titolo libro non trovato");
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                }


                case 5 -> {
                    System.out.println("Fine");
                    uscita = true;
                }


            }

        } while (!uscita);
    }

    public static int libroDoppio(Libro[] mensola, int cont, Libro nuovoLibro) {
        for (int i = 0; i < cont; i++) {
            if (mensola[i].Autore.equalsIgnoreCase(nuovoLibro.Autore) &&
                    mensola[i].Titolo.equalsIgnoreCase(nuovoLibro.Titolo)) {
                return i; // Doppione trovato
            }
        }
        return -1; // Nessun doppione trovato
    }

    public static boolean eliminaLibro(Libro[] mensola, int contaLibri, String titoloCercato) {
        boolean trovato = false;
        for (int i = 0; i < contaLibri; i++) {
            if (mensola[i].Titolo.equalsIgnoreCase(titoloCercato)) {
                for (int j = i; j < contaLibri - 1; j++) {
                    mensola[j] = mensola[j + 1];
                }
                mensola[contaLibri - 1] = null;
                trovato = true;
                break;
            }

        }

        return trovato;
    }

    public static int findIndex(Libro[] mensola, int cont, Libro nuovoLibro) {
        for (int i = 0; i < cont; i++) {
            if (mensola[i].Titolo.equalsIgnoreCase(nuovoLibro.Titolo)) {
                return i;
            }
        }


        return -1;
    }

    public static int findall(Libro[] mensola, int cont, Libro nuovoLibro) {
        int Cont=0;
        for (int i = 0; i < cont; i++) {
            if (mensola[i].Titolo.equalsIgnoreCase(nuovoLibro.Titolo)) {
                Cont++;
            }
        }
    }
}
