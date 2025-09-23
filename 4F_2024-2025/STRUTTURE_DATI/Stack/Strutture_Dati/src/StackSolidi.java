import java.util.ArrayList;

public class StackSolidi {
    //LO STACK(pila) è una struttura dati che adotta una politica di tipo LIFO(last in first out), l'ultimo elementoinserito è sempre il primo ad essere estratto
    private ArrayList<Solido> stack;

    public StackSolidi() {
        stack = new ArrayList<>();
    }

    public void push(Solido s) throws CloneNotSupportedException {
        stack.add(s.clone());
    }

    public Solido pop() {
        if (stack.isEmpty()) {
            return null;
        } else {
            return stack.removeLast();
        }
    }
}
