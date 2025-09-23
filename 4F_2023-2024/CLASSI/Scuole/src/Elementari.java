public class Elementari extends Scuola{
    private  int contributoAnnualeStudente= 125;
    private  int costoSede= 9000;

    public int getContributoAnnualeStudente() {
        return contributoAnnualeStudente;
    }

    public void setContributoAnnualeStudente(int contributoAnnualeStudente) {
        this.contributoAnnualeStudente = contributoAnnualeStudente;
    }

    public int getCostoSede() {
        return costoSede;
    }

    public void setCostoSede(int costoSede) {
        this.costoSede = costoSede;
    }

    public Elementari(int numeroDiSediAggiuntive, int codiceAlfaNumerico, String denominazione, String indirizzo, String città, int numeroClassi, int laboratori) {
        super(numeroDiSediAggiuntive, codiceAlfaNumerico, denominazione, indirizzo, città, numeroClassi, laboratori);

    }

    @Override
    public String toString() {
        return super.toString()+ "Elementari{" +
                "contributoAnnualeStudente=" + contributoAnnualeStudente +
                ", costoSede=" + costoSede +
                '}';
    }
}
