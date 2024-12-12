public class Studente implements Comparable<Studente> {
    private String nome, cognome;
    private Integer media, eta;

    public Studente(String nome, String cognome, int media, int eta)  {
        if (eta < 14) {

        }
        this.nome = nome;
        this.cognome = cognome;
        this.media = media;
        this.eta = eta;
    }

    public Studente(String nome, String cognome, int eta)  {
        this(nome, cognome, 0, eta);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta)  {
        if (eta < 14) {

        }
        this.eta = eta;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Studente) {
            return this.nome.equals(((Studente) obj).nome) && this.cognome.equals(((Studente) obj).cognome);
        }
        return false;
    }

    public int compareTo(Object o) {
        if (o instanceof Studente)
            return this.media.compareTo(((Studente) o).media);
        else {
            throw new ClassCastException("L'oggetto di comparazione non è valido");
        }
    }

    @Override
    public String toString() {
        return "Studente{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", media=" + media +
                ", eta=" + eta +
                "}\n";
    }
    @Override
    public int compareTo(Studente s) {
        return this.eta.compareTo(s.eta);
    }
}