public class Tecnici extends Superiori {
    private int contributoAnnualeClasse= 3500;
    private int contributoAnnualeLaboratorio=6000;

    public int getContributoAnnualeClasse() {
        return contributoAnnualeClasse;
    }

    public void setContributoAnnualeClasse(int contributoAnnualeClasse) {
        this.contributoAnnualeClasse = contributoAnnualeClasse;
    }

    public int getContributoAnnualeLaboratorio() {
        return contributoAnnualeLaboratorio;
    }

    public void setContributoAnnualeLaboratorio(int contributoAnnualeLaboratorio) {
        this.contributoAnnualeLaboratorio = contributoAnnualeLaboratorio;
    }

    public Tecnici(int numeroDiSediAggiuntive, int codiceAlfaNumerico, String denominazione, String indirizzo, String città, int numeroClassi, int laboratori) {
        super(numeroDiSediAggiuntive, codiceAlfaNumerico, denominazione, indirizzo, città, numeroClassi, laboratori);

    }

    @Override
    public String toString() {
        return super.toString()+ "Tecnici{" +
                "contributoAnnualeClasse=" + contributoAnnualeClasse +
                ", contributoAnnualeLaboratorio=" + contributoAnnualeLaboratorio +
                '}';
    }
}
