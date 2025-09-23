import java.util.Scanner;
import java.util.Random;


public class Main{

    public static void main(String[] Args){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();

        //costruttore del menu
        Menu menu=new Menu();

        //metodo Wait
        menu.Wait(200);
        //metodo clear screen
        menu.ClrScr();

        int opzione= menu.Menu(menu.opzioni);
        menu.visualizza();


        int giocatoreUno=0, giocatoreDue=0, fiammiferi=5;

        String errore="errore!!! il numero supera 3\n";



        System.out.println("Inizia il giocatore 1\n");

        System.out.println("* * * * * * * * * * * * * * * * * * * * *\n");
        System.out.println("| | | | | | | | | | | | | | | | | | | | |\n");
        System.out.println("\n");

        switch(opzione){
            case 1:{
                while(fiammiferi>0){
                    System.out.println("Giocatore uno inserisci il numero di fiammiferi che vuoi togliere:\n");
                    giocatoreUno=scanner.nextInt();
                    try {
                        if (giocatoreUno > 3)
                            System.out.println(errore);
                    } catch (Exception x) {
                        giocatoreUno = 3;
                        continue;
                    }

                    fiammiferi = fiammiferi - giocatoreUno;

                    if(fiammiferi<=0){
                        System.out.println("Ha vinto il giocatore 1");
                        break;
                    }




                    System.out.println("Giocatore 2 inserisci il numero di fiammiferi che vuoi togliere:\n");

                    try {
                        giocatoreDue = scanner.nextInt();
                        if (giocatoreDue > 3) {
                            System.out.println(errore);
                        }
                    } catch (Exception x) {
                        giocatoreDue = 3;
                        continue;
                    }

                    fiammiferi = fiammiferi - giocatoreDue;

                    if(fiammiferi<=0) {
                        System.out.println("Ha vinto il giocatore 2");
                        break;
                    }

                }
                break;
            }
            case 2:{
                while(fiammiferi>0){
                    System.out.println("Giocatore uno inserisci il numero di fiammiferi che vuoi togliere:\n");
                    giocatoreUno=scanner.nextInt();
                    try {
                        if (giocatoreUno > 3)
                            System.out.println(errore);
                    } catch (Exception x) {
                        giocatoreUno = 3;
                        continue;
                    }

                    fiammiferi = fiammiferi - giocatoreUno;

                    if(fiammiferi<=0){
                        System.out.println("Ha vinto il giocatore 1");
                        break;
                    }




                    System.out.println("Estrae il Pc...\n");


                    int pc=random.nextInt(3+1);

                    System.out.println(pc);

                    fiammiferi = fiammiferi - pc;

                    if(fiammiferi<=0) {
                        System.out.println("Ha vinto il Pc");
                        break;
                    }

                }

                break;
            }
            case 3:{
                System.out.println("Gioco finito");
                break;
            }

        }


    }



}