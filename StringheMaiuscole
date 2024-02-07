import java.util.Scanner;

public class StringheMaiuscole {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quante stringhe vuoi inserire?");
        n = sc.nextInt();
        String[] frasi = new String[n];
        String[] daStampare = new String[n];
        for (int i = 0; i < frasi.length; i++) {
            System.out.println("Inserisci la stringa numero " + (i+1) + ":");
            frasi[i] = sc.next();
            if (Character.isUpperCase(frasi[i].charAt(0))) {
                daStampare[i] = frasi[i];
            }
        }
        for (String j : daStampare) {
            if (j != null) {
                System.out.println("La stringa con 1 lettera maiuscola è\n"+j);
            }
        }
    }
}
