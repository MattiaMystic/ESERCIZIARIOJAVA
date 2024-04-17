import java.util.Scanner;
public class EstrazioneLotto {
    private static void Main(String[] Args){
        Scanner tastiera = new Scanner(System.in);
        int scelta=0;
        String [] opzioni = {"=== Gioco Dadi === ",
                "[1]-Estrazioni ruota di venezia",
                "[2] Giocata utente",
                "[3] verifica vincita ",
                "[4] Visualizza giocate"};


        /*Giocata utente: il giocatore punta 5 numeri sulla ruota di venezia
        Lista spesa: array di 5 elementi
        controllo se i valori inseriti sono compresi da 1 a 90
        controllare che non ci siano ripetizioni e che inserisca solo 5 valori
        visualizza giocate: Lista della spesa
        menu di scelta, opzioni2 (venezia, giocatore)
         */

        System.out.println(Menu(opzioni, tastiera));
        Wait(5000);


    }

    private static int Menu (String opzioni[], Scanner tastiera)
    {
        int scelta;

        do {
            ClrScr();
            System.out.println("------------------");
            System.out.println(opzioni[0]);
            System.out.println("------------------");
            for (int i=1; i < opzioni.length; i++)
            {
                System.out.println(opzioni[i]);
            }
            scelta = tastiera.nextInt();

            if ((scelta < 1 ) || (scelta > opzioni.length -1 ))
            {
                System.out.println("Opzione Sbagliata");
                Wait(2000);
            }
        }
        while ((scelta < 1 ) || (scelta > opzioni.length -1 ));

        return scelta;
    }

    private static void ClrScr(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void Wait(int attesa) {
        try{
            Thread.sleep(attesa);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

