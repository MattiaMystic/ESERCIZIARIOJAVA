public class Main {
    public static void main(String[] args) {
        Sfera s= new Sfera(4,7);
        Cubo c= new Cubo(4,5);
        Cubo c2= new Cubo(4,6);
        //STACK
       /* StackSolidi stack = new StackSolidi();
        try{
            stack.push(s);
            stack.push(c);
            stack.push(c2);

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(stack.pop().toString());
        System.out.println(stack.pop().toString());
        System.out.println(stack.pop().toString());
        */
        //QUEUE
        QueueSolidi queue= new QueueSolidi();
        try{
            queue.enqueue(s);
            queue.enqueue(c);
            queue.enqueue(c2);


        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println(queue.dequeue().toString());
        System.out.println(queue.dequeue().toString());
        System.out.println(queue.dequeue().toString());


    }
}