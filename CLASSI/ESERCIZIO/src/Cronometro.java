import java.time.LocalTime;

public class Cronometro {
    private LocalTime startTime;
    private LocalTime endTime;
    private int tempoGiro;

    public Cronometro(LocalTime startTime, LocalTime endTime) {
        SetStartTime();
        SetEndTime();    }
     void SetStartTime(){
startTime=LocalTime.now();
    }
     void SetEndTime(){
        endTime=LocalTime.now();
    }

    public int getTempoGiro() {
        return tempoGiro;
    }

    int calcolaIntTimer()throws Exception{
        int tempoGiro;
        tempoGiro=this.endTime.toSecondOfDay()-this.startTime.toSecondOfDay();
        if(tempoGiro==0){
            throw new Exception("Cronometro stop");
            this.tempoGiro=tempoGiro;
        }
    }

    @Override
    public String toString() {
        return "Cronometro{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", tempoGiro=" + tempoGiro +
                '}';
    }
}
