public class Gara {
    private Giocatore giocatore1;
    private Giocatore giocatore2;
    private Dado dado;
    private int roundTotali;
    private int roundCorrente;
    private boolean fineGara;

    public Gara(String nome1, String nome2, int roundTotali, Dado dado) {
        this.giocatore1 = new Giocatore(nome1);
        this.giocatore2 = new Giocatore(nome2);
        this.dado = dado;
        this.roundTotali = roundTotali;
        this.roundCorrente = 0;
        this.fineGara = false;
    }

    public boolean isFineGara() {
        return fineGara;
    }

    public String getVincitore() {
        if (!fineGara) {
            return "Partita in corso";
        }
        if (giocatore1.getVittorie() > giocatore2.getVittorie()) {
            return "Vincitore: " + giocatore1.getNome() + " con " + giocatore1.getVittorie() + " round vinti su " + roundTotali;
        } else if (giocatore2.getVittorie() > giocatore1.getVittorie()) {
            return "Vincitore: " + giocatore2.getNome() + " con " + giocatore2.getVittorie() + " round vinti su " + roundTotali;
        } else if (giocatore1.getVittorie() == giocatore2.getVittorie()) {
           return"Pareggio";
        } else {
            return "La partita è finita in parità";
        }
    }

    public String round() {
        if (fineGara) {
            return "La gara è già finita.";
        }
        int lancio1 = dado.lancia();
        int lancio2 = dado.lancia();

        String risultato = "-----------------------\n" +
                giocatore1.getNome() + " ha lanciato: " + lancio1 + "\n" + dado.stampa(lancio1) + "\n" +
                giocatore2.getNome() + " ha lanciato: " + lancio2 + "\n" + dado.stampa(lancio2);

        if (lancio1 > lancio2) {
            giocatore1.incrementaVittorie();
        } else if (lancio2 > lancio1) {
            giocatore2.incrementaVittorie();
        } else {
            giocatore1.incrementaVittorie();
            giocatore2.incrementaVittorie();
        }

        roundCorrente++;
        if (roundCorrente >= roundTotali) {
            fineGara = true;
        }
        return risultato;
    }
}