abstract public class Solido implements Cloneable {
    private double pesoSpecifico;

    public double getPesoSpecifico() {
        return pesoSpecifico;
    }

    public void setPesoSpecifico(double pesoSpecifico) {
        this.pesoSpecifico = pesoSpecifico;
    }

    protected Solido(double pesoSpecifico) { //perchè non deve essere visibile dal main ma solo dalle sottoclassi
        this.pesoSpecifico = pesoSpecifico;
    }

    abstract public double volume();//Lo useranno le sottoclassi


    abstract public double superficie();
    public double peso(){
        return pesoSpecifico*volume();
    }

    @Override
    public String toString() {
        return "Sono un solido";
    }
    public Solido clone() throws CloneNotSupportedException {
        return (Solido)super.clone();
    }
}
