public class Punto {
    private double x;
    private double y;
    final private int MAX_X=10;
    final private int MAX_Y=10;
    public Punto(double x, double y)throws Exception{
    setX(x);
    setY(y);
    }
    public Punto (double x)throws Exception{
        this(x,10);
    }

    public void setX(double x) throws Exception {
        if(x<MAX_X) {
  throw new Exception("Ordinata OUT_OF_RANGE_X");
        }else{
            this.x = x;
        }
    }

    public void setY(double y) throws Exception {
    if(y<MAX_Y){

    }else {
        this.y = y;
    }

    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public String trovaQuadrante() {
        if (getY() > 0 && getX() > 0) {
            return "Si trova nel 1 quadrante";
        } else if (getY() < 0 && getX() > 0) {
            return "Si trova nel 4 quadrante";
        } else if (getY() > 0 && getX() < 0) {
            return "Si trova nel 2 quadrante";
        } else if (getY() < 0 && getX() < 0) {
            return "Si trova nel 3 quadrante";
        } else if (getY() == 0 && getX() > 0) {
            return "Si trova nell'asse delle x positive";
        } else if (getY() == 0 && getX() < 0) {
            return "Si trova nell'asse delle x negative";
        } else if (getY() > 0 && getX() == 0) {
            return "Si trova nell'asse delle y positive";
        } else if (getY() < 0 && getX() == 0) {
            return "Si trova nell'asse delle y negative";
        } else {
            return "Il punto si trova nell'origine degli assi";
        }
    }
        @Override
                public String toString(){
        return "x= "+getX()+" y= "+getY();

        }


}
