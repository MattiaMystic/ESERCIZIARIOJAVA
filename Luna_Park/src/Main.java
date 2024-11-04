import LUNAPARK.Persona;
import static FrontScreen.FrontEnd.*;
import java.util.ArrayList;
import java.util.Scanner;

import static Tools.Utility.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        boolean uscita =false;
        int cont=0;

        /*
        Creare un programma per gestire gli accessi a un luna park.
Funzionalità richieste:
 1- gestione dell' entrata /uscita di un persona considerando che il luna park può contenere un numero massimo di persone (da scegliere a piacere);
 2- visualizzazione quante e quali giostre ha provato una determinata persona (identificata dal biglietto) quando si trova all'interno del luna park;
3- visualizzare il giorno e l'ora di accesso alle diverse giostre di una data persona;
4-visualizzazione del tempo di permanenza nel luna park di una determinata persona (OPZIONALE);
Requisiti:
a) Alle persone che entrano viene rilasciato un biglietto con un numero unico generato automaticamente dal programma;
b)Le tipologie di giostre sono: ruota panoramica, autoscontro, ottovolante, tagadà;
c)L'applicativo deve cancellare (in automatico) i dati relativi ai giri in giostra fatti da una determinata persona quando questa lascia il luna park.
d)Il programma deve gestire eventuali situazioni di errore.
         */

        final int MAXPERSONE = 5;
        ArrayList<Persona> persone = new ArrayList<Persona>();

    String [] opzioni={"--LUNA PARK","1-Entrata o uscita persona","2-Visualizzazione","3-Visualizza giorno e ora delle persone nelle giostre","4-Visualizzazione tempo dentro luna park di una persona","5-esci"};
      String[] entratauscita={"--ENTRATA O USCITA","1-Entrata","2-Uscita"};
   do{
       switch (menu(opzioni,sc)){
           case 1->{
               System.out.println("Inserimento");
               try {
                   if (cont < MAXPERSONE) {
                       switch (menu(entratauscita, sc)) {
                           case 1 -> {
                               System.out.println("Entrata");
                               persone.addLast(InserisciPersona(sc));
                               cont++;
                           }
                           case 2 -> {
                               if(cont>0) {
                                   System.out.println("Uscita");
                                   Persona personaDaTogliere = new Persona();
                                   System.out.println("Inserisci nome della persona da togliere:");
                                   personaDaTogliere.nome=sc.nextLine();
                                   System.out.println("Inserisci cognome della persona da togliere:");
                                   personaDaTogliere.cognome=sc.nextLine();
                                   Rimuovi(persone,personaDaTogliere);
                                   cont--;
                               }else{
                                   throw new Exception("Non c'è nessuna persona rimasta");
                               }
                           }
                           default -> {
                               System.out.println("Scelta non valida");
                           }
                       }
                   } else {
                       throw new Exception("Luna park pieno");
                   }
               }
               catch(Exception e){
                       System.out.println(e.getMessage());
                   }

           }
           case 2->{

           }
           case 3->{

           }
           case 4->{

           }
           case 5->{
               System.out.println("Esci");
            uscita=true;
           }
       }
   }while(!uscita);





    }
    public static int ricerca(ArrayList<Persona> persone, Persona nuovo) {
        for(int i=0; i< persone.size(); i++){
            if(persone.get(i).nome.equals(nuovo.nome) && persone.get(i).cognome.equals(nuovo.cognome)){
                return i;
            }
        }
        return -1;
    }
    public static void Rimuovi(ArrayList<Persona> persone, Persona nuovo)throws Exception {
        int posizione = ricerca(persone, nuovo);
        if(posizione != -1 ){
            persone.remove(posizione);
        } else
            throw new Exception("Persona non trovata");
    }
    }

