import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cubo c= new Cubo(3,4);
        System.out.println(c.peso());
        Sfera s = new Sfera(3,4);
        System.out.println(s.peso());
        Quadro q = new Quadro(3,4);
        System.out.println(q.peso());
        System.out.println(c.toString());
        System.out.println(s.toString());
        System.out.println(q.toString());
        //sfera,cubo,quadrato

        ArrayList<CorpoSolido> solidi =  new ArrayList<>();
        solidi.add(c);
        solidi.add(s);
        solidi.add(q);
        System.out.println(solidi.toString());

        Quadro q2 = new Quadro(3,4){
            @Override
            public String toString() {
                return "Quadro";
            }


        };



    }
}