import java.util.Scanner;
public class Menu {
    public int scelta=0;
    public String [] opzioni = {"=== Gioco Fiammiferi === ", "[1]-Sfida tra due giocatori",
            "[2] Sfida contro il computer",
            "[3] Exit "};

    public void visualizza(){
        int scelta=Menu(opzioni);
    }
    public  int Menu (String opzioni[])
    {
        int scelta=0;
        Scanner scanner=new Scanner(System.in);
        do {
            ClrScr();
            System.out.println("------------------");
            System.out.println(opzioni[0]);
            System.out.println("------------------");
            for (int i=1; i < opzioni.length; i++)
            {
                System.out.println(opzioni[i]);
            }
            try {
                System.out.print("Inserisci la tua scelta: ");
                scelta = scanner.nextInt();
                if (scelta < 1 || scelta > opzioni.length - 1) {
                    System.out.println("Opzione non valida. Riprova.");
                    Wait(2000);
                }
            } catch (Exception e) {
                System.out.println("Opzione non valida. Riprova.");
                scanner.next(); // Pulisce il buffer di input
                Wait(2000);
            }


            if ((scelta < 1 ) || (scelta > opzioni.length -1 ))
            {
                System.out.println("Opzione Sbagliata");
                Wait(2000);
            }
        }
        while ((scelta < 1 ) || (scelta > opzioni.length -1 ));

        return scelta;
    }

    public  void ClrScr(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public  void Wait(int attesa) {
        try{
            Thread.sleep(attesa);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}