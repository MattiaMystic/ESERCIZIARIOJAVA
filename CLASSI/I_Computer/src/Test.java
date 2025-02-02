import static frontend.Tools.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
               /*CONSEGNA:
        Si intende realizzare una gerarchia di classi per rappresentare e gestire i seguenti tipi di oggetti: PC fissi, suddivisi in desktop e server,
        e PC portatili di tipo notebook. Le caratteristiche generali di interesse sono: il tipo di processore, la dimensione della memoria RAM, la dimensione della memoria di massa,
        la marca, il modello e il sistema operativo. I PC fissi sono caratterizzati dal dal tipo di contenitore (grande, medio, piccolo), per quelli desktop è necessario registrare il
        tipo di scheda video, mentre per i PC fissi di tipo server è necessario sapere il numero dei processori e se hanno o meno dischi di tipo RAID.
        I PC portatili sono caratterizzati dal peso, dalle dimensioni fisiche (altezza, larghezza e profondità) e dalle dimensioni del video.
1-Definire mediante un diagramma UML le classi che realizzano la gerarchia descritta.
2-Implementare in linguaggio Java le classi progettate specificando costruttori e metodi di accesso agli attributi e sovrascrivendo opportunamente i metodi toString ed equals.
        Codificare una classe Test il cui metodo main istanzi oggetti corrispondenti alle varie tipologie di PC e invochi ciascuno dei metodi definiti almeno una volta. Sempre nella stessa classe
        Test verificare i meccanismi di up-casting e down-casting.
         */
        ArrayList<PC_Portatili> portatili = new ArrayList<>();
        ArrayList<PC_Fissi> fissi = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String[] Opzione = {"--COMPUTER--", "1-Inserisci PC", "2-Visualizza", "3-Fine"};
        boolean uscita = false;
        do {
            switch (Menu(Opzione, sc)) {
                case 1 -> {
                    System.out.println("Inserisci PC");
                    String[] OpzionePC = {"--PC--", "1-PORTATILI", "2-FISSI", "3-Fine"};
                    boolean uscita2 = false;
                    do {
                        switch (Menu(OpzionePC, sc)) {
                            case 1 -> {
                                System.out.println("Inserisci PC");
                                boolean uscita3 = false;
                                String[] Opzioni3 = {"--PC_PORTATILI--", "1-Inserisci", "2-Visualizza", "3-Fine"};
                                do {
                                    switch (Menu(Opzioni3, sc)) {

                                        case 1 -> {
                                            try {
                                                PC_Portatili.addPortatile(portatili, sc);

                                            } catch (Exception e) {
                                                System.out.println(e.getMessage());
                                            }

                                        }
                                        case 2 -> {
                                            System.out.println(portatili.toString());
                                        }
                                        case 3 -> {
                                            uscita3 = true;
                                        }
                                    }


                                } while (!uscita3);
                            }
                            case 2 -> {
                                System.out.println("Inserisci PC Fisso");
                                boolean uscita4 = false;
                                String[] Opzioni3 = {"--PC_FISSI--", "1-Inserisci", "2-Visualizza", "3-Fine"};
                                do {
                                    switch (Menu(Opzioni3, sc)) {

                                        case 1 -> {
                                            String[] opzioniPCFISSI = {"--INSERIMENTO PC FISSI--", "1-Server", "2-Desktop", "3-Fine"};
                                            boolean uscita5 = false;
                                            do {
                                                switch (Menu(opzioniPCFISSI, sc)) {
                                                    case 1 -> {
                                                        try {
                                                            Server.addServer(fissi, sc);
                                                        } catch (Exception e) {
                                                            System.out.println(e.getMessage());
                                                        }
                                                    }
                                                    case 2 -> {
                                                        try {
                                                            Desktop.addDesktop(fissi,sc);
                                                        } catch (Exception e) {
                                                            System.out.println(e.getMessage());
                                                        }
                                                    }
                                                    case 3 -> {
                                                        uscita5 = true;
                                                    }
                                                }


                                            } while (!uscita5);
                                        }
                                        case 2 -> {
                                            System.out.println(fissi.toString());
                                        }
                                        case 3 -> {
                                            uscita4 = true;
                                        }
                                    }


                                } while (!uscita4);

                            }
                            case 3 -> {
                                System.out.println("Fine");
                                uscita2 = true;
                            }
                        }
                    } while (uscita);


                }
                case 2 -> {
                    System.out.println("Visualizza");
                }
                case 3 -> {
                    System.out.println("Fine");
                    uscita = true;
                }


            }
        } while (uscita);

    }

}
