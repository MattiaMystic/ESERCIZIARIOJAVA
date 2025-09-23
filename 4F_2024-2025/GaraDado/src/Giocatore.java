public class Giocatore {
    private String nome;
    private int vittorie;

    public Giocatore(String nome) {
        this.nome = nome;
        this.vittorie = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getVittorie() {
        return vittorie;
    }

    public void incrementaVittorie() {
        vittorie++;
    }
}