import java.util.Objects;

public class Automobile implements Comparable<Automobile> {


    //marca modello e cilindrata
    //decidi getter e setter
    //un costruttore che accetta attributi e un costruttore che accetta un tipo di automobile
    //tostring
    //metodo x verificare se due auto sono uguali
    //provare metodo punto precedente nel main
    private String marca;
    private String modello;
    private Integer cilindrata;


    public Automobile(String marca, String modello, Integer cilindrata) {
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
    }

    public Automobile(Automobile automobile) {
        this.marca = automobile.marca;
        this.modello = automobile.modello;
        this.cilindrata = automobile.cilindrata;

    }


    public String getMarca() {
        return marca;
    }

    public String getModello() {
        return modello;
    }

    public Integer getCilindrata() {
        return cilindrata;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "marca='" + marca + '\'' +
                ", modello='" + modello + '\'' +
                ", cilindrata=" + cilindrata +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Automobile automobile)) return false;
        return Objects.equals(marca, automobile.marca) && Objects.equals(modello, automobile.modello) && Objects.equals(cilindrata, automobile.cilindrata);
    }
    @Override
    public int compareTo(Automobile o) {
        return this.cilindrata.compareTo(o.cilindrata);

    }


}
