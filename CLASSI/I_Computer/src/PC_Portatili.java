import java.util.Objects;

public class PC_Portatili extends PC {
    private int peso;
    private Dimensioni_Fisiche dimensione;
    private int dimensioni_Video;

    public PC_Portatili(String processore, int ram, int memoria, String marca, String modello, String sistemaOperativo, int peso, int dimensioni_Video, Dimensioni_Fisiche dimensione) {
        super(processore, ram, memoria, marca, modello, sistemaOperativo);
        this.peso = peso;
        this.dimensioni_Video = dimensioni_Video;
        this.dimensione = dimensione;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PC_Portatili that)) return false;
        if (!super.equals(o)) return false;
        return peso == that.peso && dimensioni_Video == that.dimensioni_Video && dimensione == that.dimensione;
    }

    @Override
    public String toString() {
        return super.toString()+"PC_Portatili{" +
                "peso=" + peso +
                ", dimensione=" + dimensione +
                ", dimensioni_Video=" + dimensioni_Video +
                '}';
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Dimensioni_Fisiche getDimensione() {
        return dimensione;
    }

    public void setDimensione(Dimensioni_Fisiche dimensione) {
        this.dimensione = dimensione;
    }

    public int getDimensioni_Video() {
        return dimensioni_Video;
    }

    public void setDimensioni_Video(int dimensioni_Video) {
        this.dimensioni_Video = dimensioni_Video;
    }
}
