import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Persona> persone=new ArrayList<>();
        persone.add(new Persona("Nome1","Cognome1",20,true));
        persone.add(new Persona("Nome2","Cognome2",30,false));
        persone.add(new Persona("Nome3","Cognome3",40,true));
        persone.add(new Persona("Nome4","Cognome4",50,false));
        persone.add(new Persona("Nome5","Cognome5",60,true));
        salvaJson("Persone.json",persone);
        leggiJson("Persone.json");
    }

    public static void salvaJson(String fileName, ArrayList<Persona> persone) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonContent = gson.toJson(persone);
        System.out.println(jsonContent);
    }
    public static void leggiJson(String fileName) {

    }
}