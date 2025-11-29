import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        Punto p = new Punto();
        try {
            System.out.println("Inserisci le coordinate del punto X");
            p.setX(sc.nextDouble());
            System.out.println("Inserisci le coordinate del punto Y");
            p.setY(sc.nextDouble());
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }*/

            /*

            System.out.println("Inserisci le coordinate del punto X");
            double coordX = sc.nextDouble();
            System.out.println("Inserisci le coordinate del punto Y");
            double coordY = sc.nextDouble();
            Punto p = new Punto(coordX, coordY);
       /* if(p.getY()>0 && p.getX()>0){
            System.out.println("Si trova nel 1 quadrante");
        }
       else if(p.getY()<0 && p.getX()>0){
            System.out.println("Si trova nel 4 quadrante");
        }
       else if(p.getY()>0 && p.getX()<0){
            System.out.println("Si trova nel 2 quadrante");
        }
        else if(p.getY()<0 && p.getX()<0){
            System.out.println("Si trova nel 3 quadrante");
        }     else if(p.getY()==0 && p.getX()>0){
            System.out.println("Si trova nell'asse delle x positive");
        }
        else if(p.getY()==0 && p.getX()<0){
            System.out.println("Si trova nell'asse delle x negative");
        }
        else if(p.getY()>0 && p.getX()==0){
            System.out.println("Si trova nell'asse delle y positive");
        }
        else if(p.getY()<0 && p.getX()==0){
            System.out.println("Si trova nell'asse delle y negative");
        } else{
            System.out.println("Il punto si trova nell'origine degli assi");
        }

            System.out.println(p.trovaQuadrante());
            System.out.println(p.toString());*/
        try{
            Punto punto = new Punto(20,10);
            System.out.println(punto.toString());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
