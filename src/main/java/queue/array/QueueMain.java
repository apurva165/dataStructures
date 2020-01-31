package queue.array;

public class QueueMain {
    public static void main(String[] args) {
        Queue queue = new Queue();

        queue.createQueue(9);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.deQueue();
        queue.deQueue();
        queue.peek();
    }

}
