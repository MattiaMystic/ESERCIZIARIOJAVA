import java.util.Objects;

public class Desktop extends PC_Fissi{
    private String tipo_SchedaVideo;

    public Desktop(String processore, int ram, int memoria, String marca, String modello, String sistemaOperativo, Tipo_Contenitore tipologia_Contenitore, String tipo_SchedaVideo) {
        super(processore, ram, memoria, marca, modello, sistemaOperativo, tipologia_Contenitore);
        this.tipo_SchedaVideo = tipo_SchedaVideo;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Desktop desktop)) return false;
        if (!super.equals(o)) return false;
        return Objects.equals(tipo_SchedaVideo, desktop.tipo_SchedaVideo);
    }

    @Override
    public String toString() {
        return super.toString()+
                "tipo_SchedaVideo='" + tipo_SchedaVideo + '\'' +
                '}';
    }

    public String getTipo_SchedaVideo() {
        return tipo_SchedaVideo;
    }

    public void setTipo_SchedaVideo(String tipo_SchedaVideo) {
        this.tipo_SchedaVideo = tipo_SchedaVideo;
    }
}
