import java.util.*;

public class Main{
    public static void main(String[] args) {
        Random casuale = new Random();
        //Generazione 10 numeri casuali nel range da 1 a 90
        for (int i=0;i<10;i++){
            System.out.println(casuale.nextInt(0,90) + 1);
        }
        //Generare in maniera casuale testa o croce
        int n = casuale.nextInt(0,2)+1;
        String moneta;
        if(n==1){
            moneta = "croce";
        }
        else{
            moneta = "testa";
        }
        System.out.println("E' uscita la faccia: " + moneta);
    }
}
