import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import static frontend.Tools.Menu;

public class Desktop extends PC_Fissi{
    private String tipo_SchedaVideo;

    public Desktop(String processore, int ram, int memoria, String marca, String modello, String sistemaOperativo, Tipo_Contenitore tipologia_Contenitore, String tipo_SchedaVideo) {
        super(processore, ram, memoria, marca, modello, sistemaOperativo, tipologia_Contenitore);
        this.tipo_SchedaVideo = tipo_SchedaVideo;
    }
    public static void addDesktop(ArrayList<PC_Fissi> fissi, Scanner sc) {
        System.out.println("Inserisci che tipo di processore ha il desktop:");
        String processore = sc.nextLine();

        System.out.println("Inserisci RAM: ");
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

        System.out.println("Inserisci tipo di scheda video: ");
        String tipo_SchedaVideo = sc.nextLine();

        Desktop d = new Desktop(processore, ram, memoria, marca, modello, sistemaOperativo, tipologia_Contenitore, tipo_SchedaVideo);

        fissi.add(d);
        System.out.println("Desktop aggiunto con successo!");
    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Desktop desktop)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(tipo_SchedaVideo, desktop.tipo_SchedaVideo);
    }

    @Override
    public String toString() {
        return super.toString()+
                "tipo_SchedaVideo='" + tipo_SchedaVideo + '\'' +
                '}';
    }

    public String getTipo_SchedaVideo() {
        return tipo_SchedaVideo;
    }

    public void setTipo_SchedaVideo(String tipo_SchedaVideo) {
        this.tipo_SchedaVideo = tipo_SchedaVideo;
    }
}
