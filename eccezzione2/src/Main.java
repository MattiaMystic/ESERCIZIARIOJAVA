import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n, n1;
        do {
            n = sc.nextInt();
            n1 = sc.nextInt();
            double divisione;
            try {
                divisione = Divisione(n, n1);
                System.out.println("Il risultato è : "+divisione);
            } catch (Exception e) {
                System.out.println("Errore riscontrato: " + e.getMessage());
            }
        }while(n1==0);
        /*do {
            n = sc.nextInt();
            n1 = sc.nextInt();
            try {
                System.out.println("La divisione è : " + n / n1);
            } catch (ArithmeticException e) {
                //System.out.println(e.getMessage());
                System.out.println(e.toString());
            }
        }while(n1==0);*/

    }
    public static int Divisione(int n1, int n2) throws Exception{
        if(n2==0){
            throw new Exception("divisore = a 0");

        }else {
            return n1/n2;

        }

    }
}