public class Professionali extends Superiori{
    private int contributoAnnualeClasse= 2400;
    private int contributoAnnualeLaboratorio=3000;

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

    public Professionali(int numeroDiSediAggiuntive, int codiceAlfaNumerico, String denominazione, String indirizzo, String città, int numeroClassi, int laboratori) {
        super(numeroDiSediAggiuntive, codiceAlfaNumerico, denominazione, indirizzo, città, numeroClassi, laboratori);

    }

    @Override
    public String toString() {
        return super.toString()+"Professionali{" +
                "contributoAnnualeClasse=" + contributoAnnualeClasse +
                ", contributoAnnualeLaboratorio=" + contributoAnnualeLaboratorio +
                '}';
    }
}
