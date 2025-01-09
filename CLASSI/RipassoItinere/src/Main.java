// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Automobile automobile= new Automobile("Fiat","sus",334);
        Automobile automobile1= new Automobile("Fiat","sus",334);
        if(automobile.equals(automobile1)){
            System.out.println("Automobiles equal");
        }else{
            System.out.println("Automobiles not equal");
        }
        if(automobile.compareTo(automobile1)==0){
            System.out.println("Cilindrata uguale");
        }



    }
}