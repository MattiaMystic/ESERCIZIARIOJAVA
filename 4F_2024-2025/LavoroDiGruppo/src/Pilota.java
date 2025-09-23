public class Pilota {

    private String nome;
    private String cognome;
    private String nazionalita;

    public Pilota(String nome, String cognome, String nazionalita) {
        this.nome = nome;
        this.cognome = cognome;
        this.nazionalita = nazionalita;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    public void setNazionalita(String nazionalita) {
        this.nazionalita = nazionalita;
    }

    // Override del metodo toString per una rappresentazione leggibile del pilota
    @Override
    public String toString() {
        return String.format("Nome: %s, Cognome: %s, Nazionalità: %s", nome, cognome, nazionalita);
    }

    // Override del metodo equals per confrontare due piloti
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pilota)) { //Se l'oggetto obj passato al metodo non è del tipo Pilota, ritorna falso
            return false;
        } else {
            Pilota p = (Pilota) obj;
            return this.nome.equals(p.nome) && this.cognome.equals(p.cognome) && this.nazionalita.equals(p.nazionalita);
        }

    }
}