//Il metodo visualizzaContattiNascosti non è più stato implementato in quanto per sapere
// quale contatto sia nascosto o meno usiamo l'attributo "nascosto" della classe CONTATTO

import java.util.Scanner;

import static Tools.Utility.*;

public class Main {
    public static final String passwordd = "password";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int contatti = 10;
        int contrattiVenduti = 0;
        int chiamateFatte = 0;
        int saldo = 0;
        int valoreRicarica;
        CONTATTO[] gestore = new CONTATTO[contatti];
        CONTATTO[] cronologia = new CONTATTO[999];
        String[] opzioni = {"RUBRICA", "1 - Aggiungi contatto", "2 - Visualizza contatti", "3 - Visualiza contatti nascosti", "4 - Rendi contatto nascosto", "5 - Rendi contatto visibile", "6 - Chiama contatto", "7 - Visualizza ultime chiamate", "8 - Ricarica", "9 - Esci"};
        int scelta;
        String contattoDaChiamare;
        String passwordInserita;
        do {
            scelta = menu(opzioni, scanner);
            switch (scelta) {
                case 1 -> {

                    if (contrattiVenduti < contatti) {
                        //firma contratto
                        gestore[contrattiVenduti] = LeggiPersona( scanner);
                        while (ControlloNumero(gestore, gestore[contrattiVenduti], contrattiVenduti)) {
                            System.out.println("Reinseisci il numero perchè già presente");
                            gestore[contrattiVenduti].NumeroDiTelefono = scanner.nextLine();

                        }
                        contrattiVenduti++;

                    } else {
                        System.out.println("Non ci sono più contratti da vendere");
                    }
                }
                case 2 -> {
                    Visualizza(gestore, contrattiVenduti);
                }
                case 3 -> {
                    System.out.println("Inserisci la password");
                    passwordInserita = scanner.nextLine();
                    if (controllaPassword(passwordInserita)) {
                        if (!visualizzaContattiNascosti(gestore, contrattiVenduti)) {
                            System.out.println("Non vi è alcun contatto nascosto da visualizzare");
                        }
                    } else {
                        System.out.println("Password errata inserita!");
                    }
                }
                case 4 -> {
                    System.out.println("Inserisci la password");
                    passwordInserita = scanner.nextLine();
                    if (controllaPassword(passwordInserita)) {
                        if (rendiCONTATTONascosto(gestore, contrattiVenduti, scanner)) {
                            System.out.println("CONTATTO nascosto con successo");
                        } else {
                            System.out.println("Il contatto inserito non è presente");
                        }
                    } else {
                        System.out.println("Password inserita errata!");
                    }
                }
                case 5 -> {
                    System.out.println("Inserisci la password");
                    passwordInserita = scanner.nextLine();
                    if (controllaPassword(passwordInserita)) {
                        if (rendiCONTATTOVisibile(gestore, contrattiVenduti, scanner)) {
                            System.out.println("Il contatto è stato reso visibile");
                        } else {
                            System.out.println("Il contatto non è presente nel gestore o è già visibile");
                        }
                    } else {
                        System.out.println("Password inserita errata!");
                    }
                }
                case 6 -> {
                    if (saldo >= 5) {
                        System.out.println("Inserisci il NumeroDiTelefono del contatto che vuoi chiamare");
                        contattoDaChiamare = scanner.nextLine();
                        if (chiamaCONTATTO(gestore, cronologia, contrattiVenduti, chiamateFatte, contattoDaChiamare)) {
                            System.out.println("Chiamata fatta");
                            saldo = saldo - 5;
                            chiamateFatte++;
                        } else {
                            System.out.println("Il contatto che cerchi non è presente");
                        }
                    } else {
                        System.out.println("Il tuo saldo è insufficiente per chiamare");
                    }
                }
                case 7 ->
                        visualizzaUltimeChiamate(cronologia, chiamateFatte);
                case 8 -> {
                    System.out.println("Quanto vuoi ricaricare? 1) 5 euro 2) 10 euro 3) 20 euro");
                    String input = scanner.nextLine();


                    while (true) {
                        try {
                            valoreRicarica = Integer.parseInt(input);
                            if (valoreRicarica == 1 || valoreRicarica == 2 || valoreRicarica == 3) {
                                break;
                            } else {
                                System.out.println("Il valore inserito non è valido. Reinserire.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Il valore inserito non è valido. Reinserire.");
                        }
                        input = scanner.nextLine();
                    }

                    saldo = ricaricaSaldo(saldo, valoreRicarica);
                    System.out.println("Ricarica effettuata");
                }
                case 9 -> System.out.println("Fine");
            }
        } while (scelta != 9);
    }

    public static void Visualizza(CONTATTO[] gestore, int contrattiVenduti) {

            for (int i = 0; i < contrattiVenduti; i++) {
                if (!gestore[i].nascosto) {
                    System.out.println(gestore[i].toString());
                }
            }

        }

    public static boolean visualizzaContattiNascosti(CONTATTO[] gestore, int contrattiVenduti) {
        boolean presente = false;
        for (int i = 0; i < contrattiVenduti; i++) {
            if (gestore[i].nascosto) {
                presente = true;
                System.out.println(gestore[i]);
            }
        }
        return presente;
    }

    private static CONTATTO LeggiPersona( Scanner scanner) {
        CONTATTO contatto = new CONTATTO();
        System.out.println("Inserisci il nome del contatto");
        contatto.nome = scanner.nextLine();
        System.out.println("Inserisci il cognome del contatto");
        contatto.cognome = scanner.nextLine();
        System.out.println("Inserisci il NumeroDiTelefono del contatto");
        contatto.NumeroDiTelefono = scanner.nextLine();


        return contatto;
    }
    private static boolean ControlloNumero(CONTATTO[] gestore, CONTATTO contatto, int contrattiVenduti) {
        for (int i = 0; i < contrattiVenduti; i++) {
            if (gestore[i].NumeroDiTelefono.equals(contatto.NumeroDiTelefono)) {
                return true;
            }
        }
        return false;
    }


    public static boolean rendiCONTATTONascosto(CONTATTO[] gestore, int contrattiVenduti, Scanner scanner) {
        System.out.println("Inserisci il nome del contatto che vuoi rendere nascosto");
        boolean presente = false;
        String nome = scanner.nextLine();
        for (int i = 0; i < contrattiVenduti; i++) {
            if (gestore[i].nome.equals(nome)) {
                presente = true;
                if (!gestore[i].nascosto) {
                    gestore[i].nascosto = true;
                } else {
                    System.out.println("Questo contatto è già nascosto");
                    break;
                }
            }
        }
        return presente;
    }

    public static boolean rendiCONTATTOVisibile(CONTATTO[] gestore, int contrattiVenduti, Scanner scanner) {
        System.out.println("Inserisci il nome del contatto che vuoi rendere visibile");
        boolean presente = false;
        String nome = scanner.nextLine();
        for (int i = 0; i < contrattiVenduti; i++) {
            if (gestore[i].nome.equals(nome)) {
                presente = true;
                if (gestore[i].nascosto) {
                    gestore[i].nascosto = false;
                } else {
                    return false;
                }
            }
        }
        return presente;
    }

    public static boolean chiamaCONTATTO(CONTATTO[] gestore, CONTATTO[] cronologia, int contrattiVenduti, int chiamateFatte, String contattoDaChiamare) {
        for (int i = 0; i < contrattiVenduti; i++) {
            if (gestore[i].NumeroDiTelefono.equals(contattoDaChiamare)) {
                cronologia[chiamateFatte] = gestore[i];
                return true;
            }
        }
        return false;
    }

    public static void visualizzaUltimeChiamate(CONTATTO[] cronologia, int chiamateFatte) {
        for (int i = chiamateFatte - 1; i >= 0; i--) {
            System.out.println(cronologia[i]);
        }
        if (chiamateFatte == 0) {
            System.out.println("Non si ha ancora chiamato alcun contatto");
        }
    }

    private static int ricaricaSaldo(int saldo, int valoreRicarica) {
        switch (valoreRicarica) {
            case 1 -> saldo = saldo + 5;
            case 2 -> saldo = saldo +10;
            case 3 -> saldo = saldo + 20;
        }
        return saldo;
    }

    public static boolean controllaPassword(String password) {
        return password.equals(password);
    }
}