import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Persona {
    public int numeroBiglietto;
    public LocalDateTime momentoEvento; //o ingresso o salgo in giostra
    public ListaGiostre giostreProvate;

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return "Biglietto " + numeroBiglietto + ", Orario" + entrata.format(formatter);
    }
}
