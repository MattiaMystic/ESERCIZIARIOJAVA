import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int età = 0;
        boolean errore=true;
        do {
            try {
                System.out.println("Inserisci età");
                età = Integer.parseInt(sc.nextLine());
                errore=true;
            } catch (NumberFormatException e) {
                System.out.println("Problema con numero inserito");
                System.out.println(e.getMessage());
                errore=false;

            }

        }while(!errore);
        System.out.println("Eta mia " + età);
    }
    public static void GetAge(Scanner sc){
        int eta;
        System.out.println("Inserisci eta");
        eta= sc.nextInt();

    }
}