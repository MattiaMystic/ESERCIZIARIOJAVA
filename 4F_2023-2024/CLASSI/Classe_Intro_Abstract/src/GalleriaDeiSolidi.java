import java.util.ArrayList;

public class GalleriaDeiSolidi {
    private ArrayList<Solido> solidi;
    public GalleriaDeiSolidi() {
        solidi = new ArrayList<>();
    }
    public void inserisciSolido(Solido solido)throws Exception{
        solidi.add(solido.clone());
    }
    public ArrayList<Solido> getLista()throws CloneNotSupportedException {
        ArrayList<Solido> lista = new ArrayList<>();
        for (Solido solido : solidi) {
            lista.add(solido.clone());
        }
        return lista;


    }

}
