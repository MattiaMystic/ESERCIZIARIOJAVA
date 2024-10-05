package FrontScreen;
import java.security.Key;
import java.util.Scanner;
import Mensola.*;
import Tools.Utility.*;
public class FrontEnd {
    public static Libro LeggiLibro(Scanner Keyboard){
        Libro l = new Libro();
        System.out.println("Inserisci autore:");
        l.Autore=Keyboard.nextLine();
        System.out.println("Inserisci titolo:");
        l.Titolo=Keyboard.nextLine();
        System.out.println("Inserisci il tipo:");
       String[] opzioni={"Tipo libro","1 Romanzo","2 Manuale","3 Triller"};
        switch (menu(opzioni,Keyboard)){
            case 1 -> l.tipo =Tipologia.Romanzo

        }
        return l;
    }
}
