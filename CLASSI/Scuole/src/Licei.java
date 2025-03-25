public class Licei extends Superiori {
    private  int contributoAnnualeStudente= 150;
    private  int laboratorioCosto=1100;

    public int getContributoAnnualeStudente() {
        return contributoAnnualeStudente;
    }

    public void setContributoAnnualeStudente(int contributoAnnualeStudente) {
        this.contributoAnnualeStudente = contributoAnnualeStudente;
    }

    public int getLaboratorioCosto() {
        return laboratorioCosto;
    }

    public void setLaboratorioCosto(int laboratorioCosto) {
        this.laboratorioCosto = laboratorioCosto;
    }

    public Licei(int numeroDiSediAggiuntive, int codiceAlfaNumerico, String denominazione, String indirizzo, String città, int numeroClassi, int laboratori) {
        super(numeroDiSediAggiuntive, codiceAlfaNumerico, denominazione, indirizzo, città, numeroClassi, laboratori);

    }

    @Override
    public String toString() {
        return super.toString()+"Licei{" +
                "contributoAnnualeStudente=" + contributoAnnualeStudente +
                ", laboratorioCosto=" + laboratorioCosto +
                '}';
    }
}
