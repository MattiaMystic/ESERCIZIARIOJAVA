package FrontScreen;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import LUNAPARK.*;
import Tools.Utility.*;

import static Tools.Utility.menu;


public class FrontEnd {
    public static Persona InserisciPersona(Scanner Keyboard){
        boolean uscita=false;
        int contRuota=0,contAutoscontro=0, contOttovolante=0, contTagadà=0;
        Persona l = new Persona();

        String [] giostre={"--GIOSTRE--","1-ruota panoramica","2-autoscontro","3-ottovolante","4-tagadà","5-Esci"};
        System.out.println("Inserisci biglietto:");
        l.biglietto= Integer.parseInt(Keyboard.nextLine());
        do {
            switch (menu(giostre, Keyboard)) {
                case 1 -> {
                    l.tipo = Tipologia.RuotaPanoramica;
                    contRuota++;
                }
                case 2 ->{ l.tipo = Tipologia.Autoscontro;
                    contAutoscontro++;
                }
                case 3 -> {
                    l.tipo = Tipologia.Ottovolante;
                    contOttovolante++;
                }
                case 4 -> {
                    l.tipo = Tipologia.Tagadà;
                    contTagadà++;
                }
                case 5 -> {
                    System.out.println("Esci");
                    uscita=true;
                }
            }
        }while(!uscita);
//da finire i cont
        return l;
    }
}
