


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);

        try {
            // Input per il punto in alto a sinistra
            System.out.println("Inserisci la coordinata X del punto in alto a sinistra del rettangolo:");
            double xAltoSinistra = tastiera.nextDouble();
            System.out.println("Inserisci la coordinata Y del punto in alto a sinistra del rettangolo:");
            double yAltoSinistra = tastiera.nextDouble();

            // Creazione del punto
            Punto puntoAltoSinistra = new Punto(xAltoSinistra, yAltoSinistra);

            // Input per base e altezza
            System.out.println("Inserisci la base del rettangolo:");
            double base = tastiera.nextDouble();
            System.out.println("Inserisci l'altezza del rettangolo:");
            double altezza = tastiera.nextDouble();

            // Creazione del rettangolo
            Rettangolo rettangolo = new Rettangolo(base, altezza, puntoAltoSinistra);

            // Stampa delle informazioni sul rettangolo
            System.out.println(rettangolo.toString());
            System.out.println("Segmenti del rettangolo:");
            for (Segmento segmento : rettangolo.getSegmenti()) {
                if (rettangolo.getSegmenti().indexOf(segmento) == 0) {
                    System.out.println("AB: " + segmento.toString());
                } else if (rettangolo.getSegmenti().indexOf(segmento) == 1) {
                    System.out.println("BC: " + segmento.toString());
                } else if (rettangolo.getSegmenti().indexOf(segmento) == 2) {
                    System.out.println("CD: " + segmento.toString());
                } else if (rettangolo.getSegmenti().indexOf(segmento) == 3) {
                    System.out.println("DA: " + segmento.toString());
                }
            }

            //rettangolo.visualizzaPianoCartesiano(); chiamata al metodo di test visualizzazione grafica
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
    }
}