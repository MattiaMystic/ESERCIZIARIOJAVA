import java.util.ArrayList;

public class QueueSolidi {
    //LA QUEUE (coda) è una struttura dati che adotta una politica FIFO(first in first out)
    private ArrayList<Solido> queue;

    public QueueSolidi() {
        queue = new ArrayList<>();
    }

    public void enqueue(Solido s) throws CloneNotSupportedException {
        queue.add(s.clone());
    }

    public Solido dequeue() {
        if (queue.isEmpty()) {
            return null;
        } else {
            return queue.removeFirst();//primo inserito
        }
    }
}
