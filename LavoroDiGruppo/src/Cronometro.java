import java.time.LocalTime;

public class Cronometro {
    private LocalTime startTime;
    private LocalTime endTime;
    private int tempoGiro;

    public Cronometro() {
        setStartTime();
        setEndTime();
    }

    // Imposta l'ora di inizio
    void setStartTime() {
        startTime = LocalTime.now();
    }

    // Imposta l'ora di fine
    void setEndTime() {
        endTime = LocalTime.now();
    }

    public int getTempoGiro() {
        return tempoGiro;
    }

    // Calcola il tempo di giro
    void calcolaIntTimer() throws Exception {
        int tempoGiro = this.endTime.toSecondOfDay() - this.startTime.toSecondOfDay();
        if (tempoGiro == 0)
            throw new Exception("Cronometro stop");
        this.tempoGiro = tempoGiro;
    }

    @Override
    public String toString() {
        return String.format("Tempo: %d", tempoGiro);
    }
}