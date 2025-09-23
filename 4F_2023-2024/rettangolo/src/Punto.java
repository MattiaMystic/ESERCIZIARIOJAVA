public class Punto {
    private double x;
    private double y;


    public Punto(double x, double y) {
        setX(x);
        setY(y);
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return this.x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return this.y;
    }

    public String trovaQuadrante() {
        if (getX() > 0 && getY() > 0) {
            return "Il punto si trova nel primo quadrante";
        } else if (getX() < 0 && getY() > 0) {
            return "Il punto si trova nel secondo quadrante";
        } else if (getX() > 0 && getY() < 0) {
            return "Il punto si trova nel quarto quadrante";
        } else if (getX() < 0 && getY() < 0) {
            return "Il punto si trova nel terzo quadrante";
        } else if (getX() == 0 && getY() > 0 || getY() < 0) {
            return "Il punto si trova sull'asse Y";
        } else if (getY() == 0 && getX() > 0 || getX() < 0) {
            return "Il punto si trova sull'asse X";
        } else {
            return "Il punto si trova all'origine";
        }
    }

    @Override
    public String toString() {
        return "X=" + getX() + ", Y=" + getY();
    }
}