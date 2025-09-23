import java.lang.Math;

public class Segmento {
    private double lunghezza;
    private Punto primo;
    private Punto secondo;

    public Segmento(Punto primo, Punto secondo) {
        this.primo = primo;
        this.secondo = secondo;
    }


    public Punto getPrimo() {
        return primo;
    }

    public void setPrimo(Punto primo) {
        this.primo = primo;
    }

    public Punto getSecondo() {
        return secondo;
    }

    public void setSecondo(Punto secondo) {
        this.secondo = secondo;
    }

    public double calcolaLunghezza() {
        return Math.sqrt(Math.pow(primo.getX() - secondo.getX(), 2) + Math.pow(primo.getY() - secondo.getY(), 2));
    }

    @Override
    public String toString() {
        return "Lunghezza=" + calcolaLunghezza() + " - Primo punto: " + getPrimo() + " - Secondo punto: " + getSecondo();
    }
}