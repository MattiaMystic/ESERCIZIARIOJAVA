import java.util.Random;

public class Main {
    public static void main(String[] args) {
       Random rn= new Random();
        String nome= null;
        try {
            Pilota p = new Pilota(nome, "Andreetti", "America");
            Pilota p1 = new Pilota("Maichol", "Schumacher", "Tedesco");
            System.out.println(p.toString());
            System.out.println(p1.toString());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        try{
            Cronometro cr= new Cronometro();
            cr.calcolaIntTimer();

        }catch(Exception e){
            System.out.println(e.getMessage());

    }

}