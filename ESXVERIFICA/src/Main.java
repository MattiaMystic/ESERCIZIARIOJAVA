public class Main {
    public static void main(String[]args){

        try {
            Studente st= new Studente("Bazaj","Francesco",55, 14);
            Studente st1= new Studente("Bazaj","Marchetto",85, 16);
            st.setEta(10);
          if(  st.equals(st1)){ //si fa così il confronto dove st è il this e st1 è s su studente
              System.out.println("Sono uguali");
            }else{
              System.out.println("Non soo uguali");
          }

        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }
        System.out.println("Qui il programma continua");
            try {
                int numeroMagico=88;
                if(numeroMagico<100) {
                    throw new Exception("Numero minore di 100");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());

        }



    }
}
