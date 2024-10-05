import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] vet1= new int[10];
        int[] vet2= new int[10];
        int ricerca;

        //passa vettore e ritorna 1 altro che contiene la posizione del n cercato
        for (int i=0; i<vet1.length;i++){
            System.out.println("Inserisci n");
            vet1[i]=sc.nextInt();
        }
        System.out.println("Quale numero vuoi cercare?");
        ricerca=sc.nextInt();
        vet2= FaiGol(vet1,vet2,ricerca);
        if(vet2==null){
            System.out.println("Non trovato");
        }else {
            for (int i = 0; i < vet2.length; i++) {
                System.out.println(vet2[i]);

            }
        }

        }
        public static int[] FaiGol (int vetIniziale[],int[] nuovoVet,int ricerca){
        int nonTrovato=0;
        for(int i=0;i<vetIniziale.length;i++){
            if(vetIniziale[i]==ricerca){
                int trovato=i+1;
                nuovoVet[i]=trovato;
                nonTrovato++;
            }
        }
            if(nonTrovato>0) {
                return nuovoVet;
            }else{
                return null;
            }
    }
    }
