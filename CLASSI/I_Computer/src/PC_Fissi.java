
public class PC_Fissi extends PC {
    private Tipo_Contenitore tipologia_Contenitore;

    public PC_Fissi(String processore, int ram, int memoria, String marca, String modello, String sistemaOperativo, Tipo_Contenitore tipologia_Contenitore) {
        super(processore, ram, memoria, marca, modello, sistemaOperativo);
        this.tipologia_Contenitore = tipologia_Contenitore;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof PC_Fissi pcFissi)) return false;
        return tipologia_Contenitore == pcFissi.tipologia_Contenitore;
    }

    @Override
    public String toString() {
        return super.toString() +
                "tipologia_Contenitore=" + tipologia_Contenitore +
                '}';
    }

    public Tipo_Contenitore getTipologia_Contenitore() {
        return tipologia_Contenitore;
    }

    public void setTipologia_Contenitore(Tipo_Contenitore tipologia_Contenitore) {
        this.tipologia_Contenitore = tipologia_Contenitore;
    }
}
