public class Cubo implements CorpoSolido{
    private double lato;
    private double pesoSpecifico;

    protected Cubo(double pesoSpecifico, double raggio) {
        this.pesoSpecifico = pesoSpecifico;
        this.lato = raggio;
    }

    @Override
    public double volume() {

        return Math.pow(lato,3);
    }

    @Override
    public double superficie() {
        return Math.pow(lato,2)*6;
    }

    @Override
    public String toString() {
        return "Cubo: La mia superficie è " + superficie()+" e il mio volume è " + volume();
    }

    @Override
    public double peso() {
        return pesoSpecifico * volume();
    }
}
