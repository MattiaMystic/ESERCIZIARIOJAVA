package FrontScreen;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import Mensola.*;
import Tools.Utility.*;

import static Tools.Utility.menu;


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
            case 1 -> l.tipo =Tipologia.Romanzo;
            case 2 -> l.tipo =Tipologia.Manuale;
            case 3 -> l.tipo =Tipologia.Thriller;
        }
        System.out.println("Inserisci numero pagine:");
        l.pagine=Integer.parseInt(Keyboard.nextLine());
        System.out.println("Inserisci la data di pubblicazione in formato dd-MM-yyyy");
        l.dataDiPubblicazione= LocalDate.parse(Keyboard.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        return l;
    }
}