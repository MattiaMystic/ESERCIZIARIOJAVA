import java.util.Scanner;

import static FRONTEND.Tools.Utility.menu;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean uscita=false;
        String [] opzioni={"--MENSOLA--","1-Inserimento","2-Visualizzazione","3-Fine"};
        do{

            switch(menu(opzioni,sc)){

                case 1->{

                }
                case 2->{

                }
                case 3->{
                    uscita=true;
                }
            }

        }while(uscita);
    }


}