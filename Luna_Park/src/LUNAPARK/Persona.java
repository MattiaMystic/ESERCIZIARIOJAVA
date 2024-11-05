package LUNAPARK;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Persona {
    public int biglietto;
    public LocalDateTime entrata= LocalDateTime.now();
    public Tipologia giostreUsate;

    @Override
    public String toString(){
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy-hh-mm-ss");
        return String.format("Numero Biglietto : %d ,giostra: %s, orario entrata: %s",biglietto,giostreUsate,entrata.format(formatter));
    }
}
