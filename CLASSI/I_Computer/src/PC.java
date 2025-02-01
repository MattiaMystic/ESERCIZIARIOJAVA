import java.util.Objects;

public class PC {
    private String processore;
    private int ram;
    private int memoria;
    private String marca;
    private String modello;
    private String sistemaOperativo;

    public PC(String processore, int ram, int memoria, String marca, String modello, String sistemaOperativo) {
        this.processore = processore;
        this.ram = ram;
        this.memoria = memoria;
        this.marca = marca;
        this.modello = modello;
        this.sistemaOperativo = sistemaOperativo;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PC pc)) return false;
        return ram == pc.ram && memoria == pc.memoria && Objects.equals(processore, pc.processore) && Objects.equals(marca, pc.marca) && Objects.equals(modello, pc.modello) && Objects.equals(sistemaOperativo, pc.sistemaOperativo);
    }


    @Override
    public String toString() {
        return "PC{" +
                "processore='" + processore + '\'' +
                ", ram=" + ram +
                ", memoria=" + memoria +
                ", marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                '}';
    }

    public String getProcessore() {
        return processore;
    }

    public void setProcessore(String processore) {
        this.processore = processore;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
}
