import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Gson tgson = new Gson();
        Persona p = new Persona("Giovanni", 30);
        String json = tgson.toJson(p); //Serializzazione
        System.out.println(json);
        //è uno standard di scrittura per tutti i dispositivi javascript object oriention
        Persona personaFromJson = tgson.fromJson(json, Persona.class);//prede da stringa in gson e la deserializza in un oggetto di tipo persona
        System.out.println(personaFromJson);
        ArrayList<Persona> persone = new ArrayList<>();
        persone.add(p);
        persone.add(new Persona("Giacomo", 25));
        persone.add(new Persona("Stefania", 99));
        persone.add(new Persona("Yassir", 200));
        // SERIALIZZAZIONE DELLA COLLEZIONE PERSONE SU FILE IN FORMATO JSON
        Gson newjson = new GsonBuilder().setPrettyPrinting().create();
        String jsonContent = newjson.toJson(persone);//arraylist serializzato
        // System.out.println(jsonContent);
        try {
            Files.write(Paths.get("persone.json"), jsonContent.getBytes());//metodo delle Stringhe
        } catch (Exception e) {
            e.getMessage();
        }
        // DESERIALIZZAZIONE DELLA COLLEZIONE PERSONE SU FILE IN FORMATO JSON
        try {
            byte[] jsonData = Files.readAllBytes(Path.of("persone.json"));//metodo classe file
            Persona[] collezione = tgson.fromJson(new String(jsonData), Persona[].class);//array da byte in Stringa
            ArrayList<Persona> archivio = new ArrayList<>(Arrays.asList(collezione));//converte la collezzione da un vettore ad una lista
            System.out.println("ARCHIVIO DESERIALIZZATO");
            System.out.println(archivio);
        } catch (Exception e) {
            e.getMessage();
        }
    }
}