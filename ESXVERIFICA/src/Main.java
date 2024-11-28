public class Main {
    public static void main(String[]args){

        try {
            Studente st= new Studente("Bazaj","Francesco",55, 14);
            st.setEta(10);

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
