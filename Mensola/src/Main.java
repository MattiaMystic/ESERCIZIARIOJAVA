import java.util.ArrayList;
import Mensola.Libro;

import java.util.Scanner;
import static Tools.Utility.*;
import static FrontScreen.FrontEnd.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int MAXLIBRI =3;
        int cont=0;
        ArrayList<Libro> mensola=new ArrayList<>();
        boolean uscita=false;
        String[] opzioni={"--Mensola--","1-Inserimento","2-Visualizzazione","3-Esci"};//inserimento con controllo che non sia presente
        do{
            switch (menu(opzioni,sc)){
                case 1-> {
                        System.out.println("Inserimento");
                    if (cont < MAXLIBRI) {
                        Libro nuovoLibro = LeggiLibro(sc);

                        if (libroDoppio(mensola, cont, nuovoLibro) == -1) {
                            mensola.add(nuovoLibro);
                            cont++;
                        } else {
                            System.out.println("Il libro è già presente.");
                        }
                    } else {
                        System.out.println("Non è possibile inserire altri libri");
                    }
                }

                case 2 ->{
                    System.out.println("Visualizzazione");
                    if(cont>0) {
                        System.out.println("Quale dei"+cont+" libri vuoi visualizzare");
                        int sceltaLibro = Integer.parseInt(sc.nextLine());
                        System.out.println( mensola.get(sceltaLibro-1).FormattaDati());
                       //mensola.forEach(System.out::println);

                    }else{
                        System.out.println("Nessun libro da visualizzare ");
                    }

                }
                case 3 ->{
                    System.out.println("Uscita");
                    uscita=true;
                }
            }

        }while(!uscita);
    }


    public static int libroDoppio(ArrayList<Libro> Mensola, int cont, Libro nuovoLibro) {
        for (int i = 0; i < cont; i++) {
            if (Mensola.get(i).Autore.equalsIgnoreCase(nuovoLibro.Autore) &&
                    Mensola.get(i).Titolo.equalsIgnoreCase(nuovoLibro.Titolo)) {
                return i;
            }
        }
        return -1;
    }

}