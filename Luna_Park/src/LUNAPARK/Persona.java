package LUNAPARK;

public class Persona {
    public String nome;
    public String cognome;
    public int età;
   public Tipologia tipo;
    public String FormattaDati(){
        return String.format("Nome : %s , Cognome: %s, età %d,giostra: %s",nome,cognome,età,tipo);
    }
}

