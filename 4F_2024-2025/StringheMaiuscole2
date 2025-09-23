import java.util.Scanner;

public class StringheMaiuscole {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        int lunghezza;
        System.out.println("Quanto è lungo l'array?");
        lunghezza = tastiera.nextInt();
        tastiera.nextLine();
        Maiuscole(tastiera, lunghezza);
    }

    private static void Maiuscole(Scanner tastiera, int lunghezza) {
        String[] stringhe = new String[lunghezza];
        for (int i = 0; i < stringhe.length; i++) {
            System.out.println("Inserisci una parola");
            stringhe[i] = tastiera.nextLine();
        }
        int lunghezzaGiusta = 0;
        for (int i = 0; i < stringhe.length; i++) {
            if (stringhe[i].charAt(0) >= 'A' && stringhe[i].charAt(0) <= 'Z') {
                lunghezzaGiusta++;
            }
        }
        String[] maiuscole = new String[lunghezzaGiusta];
        lunghezzaGiusta = 0;
        for (int i = 0; i < stringhe.length; i++) {
            if (stringhe[i].charAt(0) >= 'A' && stringhe[i].charAt(0) <= 'Z') {
                maiuscole[lunghezzaGiusta] = stringhe[i];
                System.out.println("La seguente parola ha la lettera maiuscola: " + maiuscole[lunghezzaGiusta]);
                lunghezzaGiusta++;
            }
        }
    }
}
