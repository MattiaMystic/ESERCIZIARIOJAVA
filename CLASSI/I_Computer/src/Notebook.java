public class Notebook extends PC_Portatili{
    public Notebook(String processore, int ram, int memoria, String marca, String modello, String sistemaOperativo, int peso, int dimensioni_Video, Dimensioni_Fisiche dimensione) {
        super(processore, ram, memoria, marca, modello, sistemaOperativo, peso, dimensioni_Video, dimensione);
    }

    @Override
    public String toString() {
        return super.toString() + "Notebook";
    }
}
