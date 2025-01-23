public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Pippo", "Pluto", 99, "Rovigo", "Rosso", "Inter");
        Studente s = new Studente("Bazaj", "Francesco", 33, "Napoli", "Nero", "Milan");
        //  Studente s1 = new Studente();
        // System.out.println(s1.getNome());
        //  System.out.println(p.presentazione());
        // System.out.println(s.presentazione());
        //System.out.println(s.presentazione2());
        Persona p2;//Variabile di tipo persona
        p2 = p;
        p2 = s;//up-casting: oggetto di una sottoclasse e lo assegna  ad una variabile della superclasse, (cast implicito)
        // p2= (Persona) s; cast esplicito
        Persona p4 = new Studente("Test", "Test", 88, "Guezam", "Nero", "Juve");
        // System.out.println(p2.metodoGenerico());
        // System.out.println(p4.metodoGenerico());


        //Down-casting

       // Persona p5 = new Persona("jose", "jose", 55, "ee", "ru", "yg");
       // Studente s5;
       // s5 = (Studente) p5;//down-casting casting esplicito
        //s5 ha metodi persona e anche studenti
        //OPERAZIONE NON POSSIBILE
        //System.out.println(s5.metodoNuovo());


        //BINDING DINAMICO
        
        Persona p10=new Studente("jose", "jose", 55, "ee", "ru", "yg");
        Persona p20=new Docente("Massimo","Gaspari",44,"Fortissimo","Strong","giuve");
        System.out.println(p10.presentazione());
        System.out.println(p20.presentazione());


    }
}