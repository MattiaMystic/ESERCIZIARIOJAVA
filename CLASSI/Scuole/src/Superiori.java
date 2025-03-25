public class Superiori extends Scuola{
    public Superiori(int numeroDiSediAggiuntive, int codiceAlfaNumerico, String denominazione, String indirizzo, String città, int numeroClassi, int laboratori) {
        super(numeroDiSediAggiuntive, codiceAlfaNumerico, denominazione, indirizzo, città, numeroClassi, laboratori);
    }

    @Override
    public String toString() {
        return super.toString()+"Superiori:  ";
    }
}
