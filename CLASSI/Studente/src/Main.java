import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
      /*  try {
            Studente st = new Studente("Riccardo", "Gianesella", 7, 19);
            Studente st1 = new Studente("Riccardos", "Gianesellas", 8, 19);
// System.out.println(st);
// System.out.println(st1);
            if (st.equals(st1))
                System.out.println("Sono uguali");
            else {
                System.out.println("Non sono uguali");
            }
            System.out.println(st.compareTo(st1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Qui il programma continua...");
        int numeroMagico = 88;
        try {
            if (numeroMagico < 100) {
                throw new Exception("Numero minore di 100");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }*/
        ArrayList<Integer> lista= new ArrayList<>();
            lista.add(33);
            lista.add(53);
            lista.add(2);
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        Collections.reverse(lista);
        System.out.println(lista);



        ArrayList<Studente> Scolaresca= new ArrayList<>();
        Scolaresca.add(new Studente("pippo","flauto",33));
        Scolaresca.add(new Studente("ppo","lauto",23));
        Scolaresca.add(new Studente("pio","fauto",13));
        Collections.sort(Scolaresca);
        System.out.println(Scolaresca.toString());
        Collections.reverse(Scolaresca);
        System.out.println(Scolaresca.toString());

    }
}




