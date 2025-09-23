public class Main {
    public static void main(String[] args) {
        Sfera s1= new Sfera(13.0,2.0);
        Cubo c1= new Cubo(13.0,2.0);
        GalleriaDeiSolidi g1= new GalleriaDeiSolidi();
        try{
            g1.inserisciSolido(s1);
            g1.inserisciSolido(c1);
        }catch (Exception e){
            System.out.println(e);
        }


    }
}