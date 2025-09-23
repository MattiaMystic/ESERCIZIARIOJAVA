public class Docente extends Persona{
    private String disciplina;

    public Docente(String nome, String cognome, int eta, String luogoDiNascita, String colorePreferito, String squadraDelCuore) {
        super(nome, cognome, eta, luogoDiNascita, colorePreferito, squadraDelCuore);

    }
    public String presentazione() {
        return super.presentazione() + " e sono anche un docente";
    }
}
