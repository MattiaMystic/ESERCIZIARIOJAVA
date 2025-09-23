public class Quadro implements CorpoSolido {
    private double lato;
    private double pesoSpecifico;

    protected Quadro(double pesoSpecifico, double lato) {
        this.pesoSpecifico = pesoSpecifico;
        this.lato = lato;
    }

    @Override
    public double volume() {

        return 0;
    }

    @Override
    public double superficie() {
        return Math.pow(lato,2);
    }

    @Override
    public String toString() {
        return  "Quadrato: La mia superficie è " + superficie();
    }

    @Override
    public double peso() {
        return pesoSpecifico * volume();
    }
}
