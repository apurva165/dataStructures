package queue.array;

public class CircularQueue {
    private int topOfQueue ;
    private int beginningOfQueue ;
    private int[] queue;

    public void createQueue(int size) {
        queue = new int[size];
        topOfQueue = -1;
        beginningOfQueue = -1;
        System.out.println("queue created with size " + size);
    }

    public void enQueue(int val){
        if(topOfQueue == queue.length){
            System.out.println("Queue is already full");
        }
        queue[topOfQueue + 1] = val;
        topOfQueue++;
        System.out.println("Successfully inserted "+val+" in the queue");
    }
    public void dequeue(){
        beginningOfQueue++;
        System.out.println("Queue is at : " + queue[beginningOfQueue] );
    }
}
