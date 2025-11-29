public class Giocatore {
    private String nome;
    private Dado dado;
    private int vittorie;

    public Giocatore(String nome,int nFacce) {
        this.nome = nome;
        dado = new Dado(nFacce);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Dado getDado() {
        return dado;
    }

    public void setDado(Dado dado) {
        this.dado = dado;
    }

    public int getVittorie() {
        return vittorie;
    }

    public void setVittorie(int vittorie) {
        this.vittorie = vittorie;
    }

    public void vittoria() {
        vittorie++;
    }
    public void azzeraVittoria() {
        vittorie=0;
    }

    @Override
    public String toString() {
        return "Giocatore{" +
                "nome='" + nome + '\'' +
                ", vittorie=" + vittorie +
                '}';
    }
}
