import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class PC_Portatili extends PC {
    private int peso;
    private int altezza;
    private int larghezza;
    private int profondità;
    private int dimensioni_Video;

    public PC_Portatili(String processore, int ram, int memoria, String marca, String modello, String sistemaOperativo, int peso, int altezza, int larghezza, int profondità, int dimensioni_Video) {
        super(processore, ram, memoria, marca, modello, sistemaOperativo);
        this.peso = peso;
        this.altezza = altezza;
        this.larghezza = larghezza;
        this.profondità = profondità;
        this.dimensioni_Video = dimensioni_Video;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PC_Portatili that)) return false;
        if (!super.equals(o)) return false;
        return peso == that.peso && altezza == that.altezza && larghezza == that.larghezza && profondità == that.profondità && dimensioni_Video == that.dimensioni_Video;
    }

    @Override
    public String toString() {
        return super.toString() +
                "peso=" + peso +
                ", altezza=" + altezza +
                ", larghezza=" + larghezza +
                ", profondità=" + profondità +
                ", dimensioni_Video=" + dimensioni_Video +
                "}\n";
    }

    public static void addPortatile(ArrayList<PC_Portatili> portatil, Scanner sc) {
        System.out.println("Inserisci che tipo di processore ha il portatile:");
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
        System.out.println("Inserisci peso: ");
        int peso = Integer.parseInt(sc.nextLine());
        System.out.println("Inserisci altezza: ");
        int altezza = Integer.parseInt(sc.nextLine());
        System.out.println("Inserisci larghezza: ");
        int larghezza = Integer.parseInt(sc.nextLine());
        System.out.println("Inserisci dimensioni_Video: ");
        int dimensioni_Video = Integer.parseInt(sc.nextLine());
        System.out.println("Inserisci profondità");
        int profondità = Integer.parseInt(sc.nextLine());

        PC_Portatili p = new PC_Portatili(processore, ram, memoria, marca, modello, sistemaOperativo, peso, altezza, larghezza, profondità, dimensioni_Video);

        portatil.add(p);

    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(int larghezza) {
        this.larghezza = larghezza;
    }

    public int getProfondità() {
        return profondità;
    }

    public void setProfondità(int profondità) {
        this.profondità = profondità;
    }

    public int getDimensioni_Video() {
        return dimensioni_Video;
    }

    public void setDimensioni_Video(int dimensioni_Video) {
        this.dimensioni_Video = dimensioni_Video;
    }
}
