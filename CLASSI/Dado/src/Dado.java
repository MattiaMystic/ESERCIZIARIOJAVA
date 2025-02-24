import java.util.Random;

public class Dado {
    private int nFacce;
    private int valFacce;
    private Random rand ;

    public Dado(int nFacce) {
        this.nFacce = nFacce;
        this.valFacce = valFacce;
        this.rand = new Random();
    }

    public int getnFacce() {
        return nFacce;
    }

    public void setnFacce(int nFacce) {
        this.nFacce = nFacce;
    }

    public int getValFacce() {
        return valFacce;
    }

    public void setValFacce() {
        this.valFacce = rand.nextInt(0,nFacce)+1;
    }

    @Override
    public String toString() {
        return "Dado{" +
                "nFacce=" + nFacce +
                ", valFacce=" + valFacce +
                '}';
    }
}
