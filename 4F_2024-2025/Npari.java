import java.util.Scanner;
import java.util.Random;
public class AppNumeri {
    public static void main(String[]args){
        Scanner Tastiera = new Scanner(System.in);
        int opzione, QuantiNumeri=0, posizione=0;
        boolean fine=true;
        int[]vetNumeri=null;
        int[]vetPari=null;
    do{
        ClrScr();
    menu();
    System.out.println("Seleziona un'opzione");
    opzione = Tastiera.nextInt();
    switch(opzione){

        case 1:       System.out.println("Quanti numeri vuoi generare?");
            QuantiNumeri = Tastiera.nextInt();
            vetNumeri = numeriCasuali(QuantiNumeri); break;

        case 2:       System.out.println("visualizza numeri");
        if(vetNumeri!=null){
            visualizza(vetNumeri);
        }else {System.out.println("Non e' stato creato il vettore!");}
        break;
        case 3:       System.out.println("visualizza numeri pari");

            vetPari= new int[QuantiNumeri];
            for(int i=0;i<QuantiNumeri;i++){
            if(vetNumeri[i]%2==0){
                vetPari[posizione]= vetNumeri[i];
                posizione=posizione+1;
            }
            }
      
            break;

        case 4:
            if(vetPari!=null) {
                visualizza(vetPari);
            }else {System.out.println("Non e' stato creato il vettore!");}
            break;
        case 5:       System.out.println("Exit");
        fine=false; break;
        default:
            System.out.println("Azione errata!!");
    } Wait(2000);

    }while(fine);
    }
    private static void menu(){
        System.out.println("==AppNumeri casuale");
        System.out.println("[1]genera numeri");
        System.out.println("[2] visualizza numeri");
        System.out.println("[3] gemera pari");
        System.out.println("[4] visualizza pari");
        System.out.println("[5] exit");
    }
    private static void ClrScr(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void Wait(int tempo) {
        try{
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private static int[] numeriCasuali(int n) {
        int casuale;
        int[] vettore = new int[n];
        Random rn = new Random();
        for (int i = 0; i < n; i++) {
            casuale = rn.nextInt(1, 101);
            vettore[i] = casuale;
        }
        return vettore;
    }
    private static void visualizza(int[] v){
        for(int i=0; i<v.length;i++) {
            System.out.println(i+"="+v[i]);
        }
    }


}
