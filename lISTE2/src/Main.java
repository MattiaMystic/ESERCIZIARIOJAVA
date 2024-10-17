import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);
       /* System.out.println("-------------------------------------------\nLista non modificata");
        lista.forEach(System.out::println);

        Collections.reverse(lista);
        System.out.println("-------------------------------------------\nLista Collections.reverse(lista)");
        lista.forEach(System.out::println);

        Collections.reverse(lista);*/
        System.out.println("-------------------------------------------\nLista lista.reversed dentro un sout");
        System.out.println(lista.reversed());
        System.out.println(lista.lastIndexOf(50));//ultimo indice a cui si trova il numero 50
        boolean trovato = lista.contains(50);//dice se è trovato 50 nel array
        if(trovato){
            System.out.println("Il numero è presente");
        }else{
            System.out.println("Numero non presente");
        }
        lista.set(4,99); //sostituisce valori negli indici della lista
        lista.forEach(System.out::println);
        ArrayList<Monitor> monitor = new ArrayList<Monitor>();
        Monitor m1= new Monitor();
        m1.modello= "modello1";
        m1.marca= "marca1";
        m1.size= 21;
        monitor.add(m1);
        m1.modello= "modello2";
        m1.marca= "marca2";
        m1.size= 31;
    }
}