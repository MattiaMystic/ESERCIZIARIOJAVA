import java.util.Random;
public class RuotaDiVenezia {
    public static void main(String[] args) {

        int[] vettore=new int[5];

        for(int i=0; i<=4; i++){
            int casuale=valoreRandom(1,91);
            vettore[i]=casuale;

            vettore[i]++;
            System.out.println(vettore[i]);
        }

    }
    private static int valoreRandom(int minValue, int maxValue)
    {
        Random casuale = new Random(); //Metodo che non ha nessun parametro, si chiama costruttore.

        return  casuale.nextInt(minValue,maxValue)+1;

    }
}
