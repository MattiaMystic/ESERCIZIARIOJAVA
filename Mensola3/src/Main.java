import Mensola.Libro;
import static  Tools.Utility.*;
import java.util.Scanner;
import static  FrontScreen.FrontEnd.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAXLIBRI=3;
        Libro[] mensola = new Libro[MAXLIBRI];


        boolean uscita=false;
        int cont=0;
        do {
            String [] opzioni = {"---MENSOLA---","1- inserimento", "2- visualizza", "3-Fine"};
            int scelta=menu(opzioni, sc);
            switch (scelta) {

                case 1 -> {
                    System.out.println("Inserimento");
                    if(cont<MAXLIBRI) {

                            mensola[cont] = LeggiLibro(sc);


                        cont++;
                    }else{
                        System.out.println("Non è possibile inserire altri libri");
                    }
                }
                case 2 -> {
                    System.out.println("Visualizzazione");
                    System.out.println("Quale tra i "+cont+" vuoi visualizzare?");
                    int sceltaLibro=Integer.parseInt(sc.nextLine());
                    if(sceltaLibro<=cont) {
                        System.out.println(mensola[scelta - 1].FormattaDati());
                    }else{
                        System.out.println("Scelta non valida");
                    }
                }

                case 3 -> {
                    System.out.println("Fine");
                    uscita=true;
                }

            }
        }while(!uscita);




    }



}