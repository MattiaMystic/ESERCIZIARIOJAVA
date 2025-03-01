public class Partita {
    private Giocatore giocatore;
    private Giocatore giocatore2;
    private int nRound;
    private boolean stato;
    private int tipoPartita;
    private int contaVittorieg2=0;
    int contaVittorie=0;


    public Partita(Giocatore giocatore, Giocatore giocatore2, int nRound,int tipoPartita) {
        this.giocatore = giocatore;
        this.giocatore2 = giocatore2;
        this.nRound = nRound;
        this.stato = true;
        this.tipoPartita = tipoPartita;
    }

    public String round() {
        String vincitore;
        if (tipoPartita == 1) {
            if (nRound != 0) {
                nRound--;
                giocatore.getDado().setValFacce();
                giocatore2.getDado().setValFacce();

                int lancio1 = giocatore.getDado().getValFacce();
                int lancio2 = giocatore2.getDado().getValFacce();

                if (lancio1 < lancio2) {
                    vincitore = giocatore2.getNome();
                    giocatore2.vittoria();
                } else if (lancio1 > lancio2) {
                    vincitore = giocatore.getNome();
                    giocatore.vittoria();
                } else {
                    vincitore = "Partita";
                    giocatore.vittoria();
                    giocatore2.vittoria();
                }
            } else {
                stato = false;
                return "Round finiti";
            }

            return String.format("Giocatore 1: %s, Giocatore 2: %s, Dado giocatore 1: %d, Dado giocatore 2: %d",
                    giocatore.getNome(), giocatore2.getNome(), giocatore.getDado().getValFacce(), giocatore2.getDado().getValFacce());
        } else {
            if (nRound != 0) {
                nRound--;
                giocatore.getDado().setValFacce();
                giocatore2.getDado().setValFacce();



                int lancio1 = giocatore.getDado().getValFacce();
                int lancio2 = giocatore2.getDado().getValFacce();

                if (lancio1 < lancio2) {
                    vincitore = giocatore2.getNome();
                    giocatore2.vittoria();
                    contaVittorieg2++;
                    contaVittorie=0;

                } else if (lancio1 > lancio2) {
                    vincitore = giocatore.getNome();
                    giocatore.vittoria();
                    contaVittorie++;
                    contaVittorieg2=0;
                } else {
                    vincitore = "Partita";
                    giocatore.vittoria();
                    giocatore2.vittoria();
                }
                if(contaVittorie ==3){
                    giocatore.vittoria();

                }else if(contaVittorieg2==3){
                    giocatore2.vittoria();
                }

            } else {
                stato = false;
                return "Round finiti";
            }

            return String.format("Giocatore 1: %s, Giocatore 2: %s, Dado giocatore 1: %d, Dado giocatore 2: %d",
                    giocatore.getNome(), giocatore2.getNome(), giocatore.getDado().getValFacce(), giocatore2.getDado().getValFacce());

        }
    }

    public String vincitore() {
        String vincitore;
        if (giocatore.getVittorie() > giocatore2.getVittorie()) {
            vincitore = giocatore.getNome();
        } else if (giocatore.getVittorie() == giocatore2.getVittorie()) {
            vincitore = "Parità";
        } else {
            vincitore = giocatore2.getNome();
        }
        return vincitore;
    }

    public String statoPartita() {
        if (stato) {
            return "Partita in corso";
        } else {
            return "Partita finita";
        }
    }
}
