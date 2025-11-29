import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import static utility.Tools.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner tastiera = new Scanner(System.in);
        boolean uscita = false;
        Gara gara = new Gara("Gran Premio", "Italia");

        String[] opzioni = {"---GARA AUTOMOBILISTICA---",
                "1. Inserimento Piloti e Scuderie",
                "2. Simula Gara",
                "3. Risultato",
                "4. Fine"};

        while (!uscita) {
            try {
                switch (Menu(opzioni, tastiera)) {
                    case 1 -> inserisciPilotiEScuderie(tastiera, gara);
                    case 2 -> simulaGara(gara);
                    case 3 -> mostraRisultati(gara);
                    case 4 -> uscita = true;
                }
            } catch (Exception e) {
                System.out.println("Scelta non valida, riprova.");
            }
        }
        System.out.println("Fine");
    }

    // Metodo per inserire piloti e scuderie
    private static void inserisciPilotiEScuderie(Scanner tastiera, Gara gara) throws Exception {
        System.out.println("Inserimento piloti e scuderie");
        System.out.print("Da quante scuderie è composta la gara: ");
        int numScuderie = Integer.parseInt(tastiera.nextLine());
        gara.getGriglia().clear(); // Resetta la griglia delle scuderie

        // Ciclo per inserire tutte le scuderie
        for (int i = 0; i < numScuderie; i++) {
            System.out.println("Inserimento scuderia " + (i + 1));
            System.out.print("Inserisci il nome della Scuderia: ");
            String nomeScuderia = tastiera.nextLine();

            // Crea un pilota utilizzando il metodo metodoCreazionePilota
            Pilota pilota = metodoCreazionePilota(tastiera);
            // Crea una scuderia e aggiungila alla gara
            Scuderia scuderia = new Scuderia(nomeScuderia, pilota, 0);
            gara.addScuderia(scuderia);
        }
    }

    // Metodo per simulare la gara
    private static void simulaGara(Gara gara) {
        System.out.println("Simulazione della gara in corso...");
        Random random = new Random();
        Cronometro cronometro = new Cronometro(); // Oggetto per cronometrare i tempi di gara

        // Ciclo per simulare il tempo di gara per ogni scuderia
        for (Scuderia scud : gara.getGriglia()) {
            cronometro.setStartTime();  // Avvia il cronometro
            // Simula un tempo di gara tra 1 e 5 secondi
            Wait(random.nextInt(4000) + 1000);
            cronometro.setEndTime();  // Ferma il cronometro
            try {
                cronometro.calcolaIntTimer();  // Calcola il tempo del giro
                scud.setTempoGiro(cronometro.getTempoGiro());  // Imposta il tempo di giro per la scuderia
            } catch (Exception e) {
                System.out.println("Errore nel calcolo del tempo: " + e.getMessage());
            }
        }
        System.out.println("Gara completata!");
    }

    // Metodo per mostrare i risultati della gara
    private static void mostraRisultati(Gara gara) {
        System.out.println("Risultato della gara: ");
        ArrayList<Scuderia> classifica = gara.getClassifica();

        if (classifica.isEmpty()) {
            System.out.println("Non ci sono dati sufficienti per determinare un vincitore.");
            return;
        }

        // Verifica se c'è un pareggio tra i primi
        int primoTempo = classifica.get(0).getTempoGiro();
        boolean pareggio = false;
        for (int i = 1; i < classifica.size(); i++) {
            if (classifica.get(i).getTempoGiro() == primoTempo) {
                pareggio = true;
                break;
            }
        }

        if (pareggio) {
            System.out.println("C'è un pareggio tra i piloti!");
        } else {
            // Stampa il vincitore se non c'è pareggio
            Scuderia vincitrice = classifica.get(0);
            System.out.println("La scuderia " + vincitrice.getNome() +
                    " con il pilota " + vincitrice.getPilota().getNome() +
                    " ha vinto la gara con un tempo di " + vincitrice.getTempoGiro() + " secondi");
        }

        // Stampa la classifica completa
        for (int i = 0; i < classifica.size(); i++) {
            Scuderia scuderia = classifica.get(i);
            System.out.println((i + 1) + ". " + scuderia.getNome() + " - Tempo: " + scuderia.getTempoGiro() + " secondi");
        }
    }

    // Metodo per creare un pilota
    public static Pilota metodoCreazionePilota(Scanner tastiera) throws Exception {
        System.out.println("Inserisci il nome del pilota: ");
        String nome = tastiera.nextLine();
        System.out.println("Inserisci il cognome del pilota: ");
        String cognome = tastiera.nextLine();
        System.out.println("Inserisci la nazionalità del pilota: ");
        String nazionalita = tastiera.nextLine();

        // Restituisce un nuovo oggetto Pilota con i dati inseriti
        return new Pilota(nome, cognome, nazionalita);
    }
}