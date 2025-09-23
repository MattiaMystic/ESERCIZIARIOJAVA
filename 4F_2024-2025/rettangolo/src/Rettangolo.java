import java.util.ArrayList;

public class Rettangolo {
    private double base;
    private double altezza;
    private Punto punto;
    private ArrayList<Segmento> segmenti;

    // Costruttore
    public Rettangolo(double base, double altezza, Punto punto) throws Exception {
        this.base = base;
        this.altezza = altezza;
        this.punto = punto;

        // Controllo se il rettangolo rimane nel primo quadrante
        if (punto.getX() < 0 || punto.getY() < 0 || punto.getY() - altezza < 0) {
            throw new Exception("Il rettangolo esce dal primo quadrante!");
        }

        this.segmenti = calcolaSegmenti();
    }

    // Metodo per calcolare i quattro segmenti del rettangolo
    private ArrayList<Segmento> calcolaSegmenti() {
        ArrayList<Segmento> segmenti = new ArrayList<>();

        // Calcolo dei quattro vertici (il vertice in alto a sinistra è già presente e quindi viene usato per il calcolo degli altri tre togliendo dalle coordinate x e y del punto le lunghezze di base e altezza in base a ciò che bisogna calcolare)
        Punto bassoSinistra = new Punto(punto.getX(), punto.getY() - altezza);
        Punto bassoDestra = new Punto(punto.getX() + base, punto.getY() - altezza);
        Punto altoDestra = new Punto(punto.getX() + base, punto.getY());

        // Creazione dei segmenti
        segmenti.add(new Segmento(punto, altoDestra)); // Lato superiore
        segmenti.add(new Segmento(altoDestra, bassoDestra)); // Lato destro
        segmenti.add(new Segmento(bassoDestra, bassoSinistra)); // Lato inferiore
        segmenti.add(new Segmento(bassoSinistra, punto)); // Lato sinistro

        return segmenti;
    }

    // Metodo per calcolare l'area
    private double calcolaArea() {
        return base * altezza;
    }

    // Metodo per calcolare il perimetro
    private double calcolaPerimetro() {
        return 2 * (base + altezza);
    }


    public double getBase() {
        return base;
    }

    public double getAltezza() {
        return altezza;
    }

    public Punto getPunto() {
        return punto;
    }

    public ArrayList<Segmento> getSegmenti() {
        return segmenti;
    }


    @Override
    public String toString() {
        return "Rettangolo: Base=" + base + " , Altezza=" + altezza + " - Punto in alto a sinistra: " + punto + " - Area=" + calcolaArea() + " - Perimetro=" + calcolaPerimetro();
    }

}