public class Cubo extends Solido {
    private double lato;

    protected Cubo(double pesoSpecifico, double raggio) {
        super(pesoSpecifico);
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
        return super.toString()+ "Cubo: La mia superficie è " + superficie()+" e il mio volume è " + volume();
    }
}
