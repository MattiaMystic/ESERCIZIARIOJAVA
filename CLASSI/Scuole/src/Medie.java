public class Medie extends Scuola  {
    private  int contributoAnnualeStudente= 150;
    private  int laboratorioCosto=1100;
    private  int costoSede= 9000;

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

    public int getCostoSede() {
        return costoSede;
    }

    public void setCostoSede(int costoSede) {
        this.costoSede = costoSede;
    }

    public Medie(int numeroDiSediAggiuntive, int codiceAlfaNumerico, String denominazione, String indirizzo, String città, int numeroClassi, int laboratori) {
        super(numeroDiSediAggiuntive, codiceAlfaNumerico, denominazione, indirizzo, città, numeroClassi, laboratori);

    }

    @Override
    public String toString() {
        return super.toString()+ "Medie{" +
                "contributoAnnualeStudente=" + contributoAnnualeStudente +
                ", laboratorioCosto=" + laboratorioCosto +
                ", costoSede=" + costoSede +
                '}';
    }
}
