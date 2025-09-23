public class Scuola {
    private int codiceAlfaNumerico;
    private String denominazione;
    private String indirizzo;
    private String città;
    private int numeroClassi;
    private int numeroDiSediAggiuntive;
    private int laboratori;

    public Scuola(int numeroDiSediAggiuntive, int codiceAlfaNumerico, String denominazione, String indirizzo, String città, int numeroClassi, int laboratori) {
        this.numeroDiSediAggiuntive = numeroDiSediAggiuntive;
        this.codiceAlfaNumerico = codiceAlfaNumerico;
        this.denominazione = denominazione;
        this.indirizzo = indirizzo;
        this.città = città;
        this.numeroClassi = numeroClassi;
        this.laboratori = laboratori;
    }

    @Override
    public String toString() {
        return "Scuola{" +
                "codiceAlfaNumerico=" + codiceAlfaNumerico +
                ", denominazione='" + denominazione + '\'' +
                ", indirizzo='" + indirizzo + '\'' +
                ", città='" + città + '\'' +
                ", numeroClassi=" + numeroClassi +
                ", numeroDiSediAggiuntive=" + numeroDiSediAggiuntive +
                ", laboratori=" + laboratori;

    }
}
