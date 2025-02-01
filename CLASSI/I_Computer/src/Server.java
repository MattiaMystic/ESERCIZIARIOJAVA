import java.util.Objects;

public class Server extends PC_Fissi {
    private int nProcessori;
    private boolean dischi_Raid;

    public Server(String processore, int ram, int memoria, String marca, String modello, String sistemaOperativo, Tipo_Contenitore tipologia_Contenitore, int nProcessori, boolean dischi_Raid) {
        super(processore, ram, memoria, marca, modello, sistemaOperativo, tipologia_Contenitore);
        this.nProcessori = nProcessori;
        this.dischi_Raid = dischi_Raid;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Server server)) return false;
        if (!super.equals(o)) return false;
        return nProcessori == server.nProcessori && dischi_Raid == server.dischi_Raid;
    }



    @Override
    public String toString() {
        return super.toString() +
                "nProcessori=" + nProcessori +
                ", dischi_Raid=" + dischi_Raid +
                '}';
    }

    public int getnProcessori() {
        return nProcessori;
    }

    public void setnProcessori(int nProcessori) {
        this.nProcessori = nProcessori;
    }

    public boolean isDischi_Raid() {
        return dischi_Raid;
    }

    public void setDischi_Raid(boolean dischi_Raid) {
        this.dischi_Raid = dischi_Raid;
    }
}
