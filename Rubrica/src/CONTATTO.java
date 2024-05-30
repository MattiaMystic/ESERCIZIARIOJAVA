public class CONTATTO {
    String nome;
    String cognome;
    String NumeroDiTelefono;
    boolean nascosto = false;

    public String toString() {
        return "Nome: " + nome + ", Cognome: " + cognome + ", Numero: " + NumeroDiTelefono +  ", Nascosto: " + (nascosto ? "sì" : "no");
    }
}
