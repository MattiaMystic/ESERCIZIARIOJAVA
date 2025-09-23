import java.util.ArrayList;
import java.util.Collections;

class Gara {
    private String nome;
    private String nazione;
    private ArrayList<Scuderia> griglia;
    private Cronometro cronometro;
    private String vincitore;

    public Gara(String nome, String nazione) {
        this.nome = nome;
        this.nazione = nazione;
        this.griglia = new ArrayList<>();
        this.cronometro = new Cronometro();
    }

    public ArrayList<Scuderia> getGriglia() {
        return griglia;
    }

    // Restituisce la classifica ordinata delle scuderie
    public ArrayList<Scuderia> getClassifica() {
        Collections.sort(griglia); // Ordina la lista delle scuderie per tempo di giro
        ArrayList<Scuderia> classificaFinale = new ArrayList<>();
        int i = 0;

        // Gestisce eventuali pareggi
        while (i < griglia.size()) {
            int tempoGiro = griglia.get(i).getTempoGiro();
            ArrayList<Scuderia> vincitori = new ArrayList<>();
            while (i < griglia.size() && griglia.get(i).getTempoGiro() == tempoGiro) {
                vincitori.add(griglia.get(i));
                i++;
            }

            if (vincitori.size() > 1) {
                // Aggiungi tutte le scuderie con lo stesso tempo
                for (int j = 0; j < vincitori.size(); j++) {
                    Scuderia scuderia = vincitori.get(j);
                    classificaFinale.add(scuderia);
                }
            } else {
                // Aggiungi il singolo vincitore
                classificaFinale.add(vincitori.get(0));
            }
        }

        return classificaFinale;
    }

    // Aggiungi una scuderia alla gara
    public void addScuderia(Scuderia scud) {
        griglia.add(scud);
    }
}