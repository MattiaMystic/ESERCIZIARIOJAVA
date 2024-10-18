import Mensola.Libro;
import java.util.Scanner;
import static Tools.Utility.*;
import static FrontScreen.FrontEnd.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAXLIBRI = 3;
        Libro[] mensola = new Libro[MAXLIBRI];

        boolean uscita = false;
        int cont = 0;
        do {
            String[] opzioni = {"---MENSOLA---", "1- inserimento", "2- visualizza", "3-cancella libro", "4- Fine"};
            int scelta = menu(opzioni, sc);
            switch (scelta) {

                case 1 -> {
                    System.out.println("Inserimento");
                    if (cont < MAXLIBRI) {
                        Libro nuovoLibro = LeggiLibro(sc);
                        boolean presente = libroDoppio(mensola, cont, nuovoLibro);
                        if (!presente) {
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
                        System.out.println("Fine");
                        uscita = true;
                    }

            }
        }while (!uscita) ;

    }

    public static boolean libroDoppio(Libro[] mensola, int cont, Libro nuovoLibro) {
        for (int i = 0; i < cont; i++) {
            if (mensola[i].Autore.equalsIgnoreCase(nuovoLibro.Autore) &&
                    mensola[i].Titolo.equalsIgnoreCase(nuovoLibro.Titolo)) {
                return true; // Doppione trovato
            }
        }
        return false; // Nessun doppione trovato
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
}
