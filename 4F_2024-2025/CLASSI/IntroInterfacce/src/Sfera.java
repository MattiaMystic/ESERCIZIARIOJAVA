public class Sfera implements CorpoSolido {
    private double raggio;
    private double pesoSpecifico;

    protected Sfera(double pesoSpecifico, double raggio) {
        this.pesoSpecifico = pesoSpecifico;
        this.raggio = raggio;
    }

    @Override
    public double volume() {

        return (double)4/3*Math.PI*Math.pow(raggio,3);
    }

    @Override
    public double superficie() {
        return (double)4*Math.PI*Math.pow(raggio,2);
    }

    @Override
    public String toString() {
        return  "Sfera: La mia superficie è " + superficie()+" e il mio volume è " + volume();
    }

    @Override
    public double peso() {
        return pesoSpecifico * volume();
    }
}
