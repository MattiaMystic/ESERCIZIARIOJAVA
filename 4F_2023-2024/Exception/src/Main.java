public class Main {
    public static void main(String[] args) {
        Exception e = new Exception();
        System.out.println(e.getClass());//classe Exception
        System.out.println(Exception.class.getSuperclass());//classe throwable
        System.out.println(Exception.class.getSuperclass().getSuperclass());//Object è la classe più alta
        System.out.println(Exception.class.getPackage());
        System.out.println(Exception.class.getModule());
        Orario orario = new Orario(-2,333,64);

    }
}
