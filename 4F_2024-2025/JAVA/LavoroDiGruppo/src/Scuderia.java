class Scuderia implements Comparable<Scuderia> {
    private String nome;
    private Pilota nPilota;
    private int numAuto;
    private int tGiro;

    public Scuderia(String nome, Pilota pilota, int numAuto) {
        this.nome = nome;
        this.nPilota = pilota;
        this.numAuto = numAuto;
        this.tGiro = 0;  // Inizialmente il tempo di giro è 0
    }

    public String getNome() {
        return nome;
    }

    public Pilota getPilota() {
        return nPilota;
    }

    public void setTempoGiro(int tempGiro) {
        this.tGiro = tempGiro;
    }

    public int getTempoGiro() {
        return tGiro;
    }

    @Override
    public String toString() {
        return "Scuderia{" +
                "nome='" + nome + '\'' +
                ", pilota=" + nPilota.getNome() +
                ", numAuto=" + numAuto +
                ", tempoGiro=" + tGiro +
                '}';
    }

    // Override del metodo equals per confrontare due scuderie
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Scuderia scuderia = (Scuderia) obj;
        return nome.equals(scuderia.nome);
    }

    // Metodo compareTo per ordinare le scuderie in base al tempo di giro
    @Override
    public int compareTo(Scuderia s) {
        return Integer.compare(this.tGiro, s.tGiro);
    }
}