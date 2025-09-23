import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    ArrayList<Persona> list = new ArrayList<>();
    Persona p1= new Persona("Jose", 23);
    Persona p2= new Persona("Josse", 223);
    Persona p3= new Persona("Jossse", 2223);
        list.add(p1);
        list.add(p2);
        list.add(p3);

        scriviPersona(list,"Persona.csv");
        ArrayList<Persona> list2= LeggiPersona("Persona.csv");
       for(int i=0; i<LeggiPersona("Persona.csv").size(); i++){
           System.out.println(list2.get(i));
       }
    }
    public static void scriviPersona(ArrayList<Persona> persone, String fileName) {
        ArrayList<String> list = new ArrayList<>();
        try {
            for (Persona p : persone) {
                list.add(p.CSV());

            }
            Files.write(Paths.get(fileName), list);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
    public static ArrayList<Persona> LeggiPersona( String fileName) {
        ArrayList<Persona> persone = new ArrayList<>();
        try{
            ArrayList<String> lines= (ArrayList<String>) Files.readAllLines(Paths.get(fileName));
            String[] attributi;//-per usare la split
            for (String s : lines) {
                attributi = s.split(";");
                persone.add(new Persona(attributi[0], Integer.parseInt(attributi[1])));
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return persone;
    }
}