public class Punto {
    private double x;
    private double y;
    public Punto(double x, double y)throws Exception{
    setX(x);
    setY(y);
    }

    public void setX(double x)throws Exception {
        try {
            this.x = x;
        }catch(Exception e){
            throw e;
        }
    }

    public void setY(double y)throws Exception {
        try {
            this.y = y;
        }catch(Exception e){
            throw e;
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
