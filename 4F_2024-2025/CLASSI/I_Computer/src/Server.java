import static frontend.Tools.*;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Server extends PC_Fissi {
    private int nProcessori;
    private boolean dischi_Raid;

    public Server(String processore, int ram, int memoria, String marca, String modello, String sistemaOperativo, Tipo_Contenitore tipologia_Contenitore, int nProcessori, boolean dischi_Raid) {
        super(processore, ram, memoria, marca, modello, sistemaOperativo, tipologia_Contenitore);
        this.nProcessori = nProcessori;
        this.dischi_Raid = dischi_Raid;
    }
    public static void addServer(ArrayList<PC_Fissi> fissi, Scanner sc) {
        System.out.println("Inserisci che tipo di processore ha il server:");
        String processore = sc.nextLine();

        System.out.println("Inserisci ram: ");
        int ram = Integer.parseInt(sc.nextLine());

        System.out.println("Inserisci memoria: ");
        int memoria = Integer.parseInt(sc.nextLine());

        System.out.println("Inserisci marca: ");
        String marca = sc.nextLine();

        System.out.println("Inserisci modello: ");
        String modello = sc.nextLine();

        System.out.println("Inserisci sistema operativo: ");
        String sistemaOperativo = sc.nextLine();

        String[] contenitore = {"--CONTENITORE--", "1-Piccolo", "2-Medio", "3-Grande"};
        Tipo_Contenitore tipologia_Contenitore = null;

        switch (Menu(contenitore, sc)) {
            case 1 -> tipologia_Contenitore = Tipo_Contenitore.piccolo;
            case 2 -> tipologia_Contenitore = Tipo_Contenitore.medio;
            case 3 -> tipologia_Contenitore = Tipo_Contenitore.grande;
            default -> {
                System.out.println("Scelta non valida, impostato a Medio di default.");
                tipologia_Contenitore = Tipo_Contenitore.medio;
            }
        }

        System.out.println("Inserisci numero di processori: ");
        int nProcessori = Integer.parseInt(sc.nextLine());

        System.out.println("Il server utilizza dischi RAID? (true/false): ");
        boolean dischi_Raid = Boolean.parseBoolean(sc.nextLine());

        Server s = new Server(processore, ram, memoria, marca, modello, sistemaOperativo, tipologia_Contenitore, nProcessori, dischi_Raid);

        fissi.add(s);
        System.out.println("Server aggiunto con successo!");
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Server server)) return false;
        if (!super.equals(o)) return false;
        return nProcessori == server.nProcessori && dischi_Raid == server.dischi_Raid;
    }



    @Override
    public String toString() {
        return super.toString() +
                "nProcessori=" + nProcessori +
                ", dischi_Raid=" + dischi_Raid +
                '}';
    }

    public int getnProcessori() {
        return nProcessori;
    }

    public void setnProcessori(int nProcessori) {
        this.nProcessori = nProcessori;
    }

    public boolean isDischi_Raid() {
        return dischi_Raid;
    }

    public void setDischi_Raid(boolean dischi_Raid) {
        this.dischi_Raid = dischi_Raid;
    }
}
