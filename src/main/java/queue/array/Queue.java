package queue.array;

public class Queue {
    private int topOfQueue = -1;
    private int beginningOfQueue = -1 ;
    private int[] queue;

    public void createQueue(int size){
       queue = new int[size];
       beginningOfQueue = -1;
       topOfQueue = -1;
        System.out.println("Successfully created an empty queue of size: "+size);

    }

    public void enQueue(int val){
        if(topOfQueue >= queue.length){
            System.out.println("queue is full");
        }
        queue[topOfQueue + 1] = val;
        topOfQueue++;
        System.out.println("Successfully inserted "+val+" in the queue");
    }

    public void deQueue(){
        beginningOfQueue++;
        if(beginningOfQueue > topOfQueue){
            beginningOfQueue = topOfQueue = -1;
            System.out.println("Queue is reset");
        }
    }

    public void deleteQueue(){
        queue = null;
    }

    public void peek(){
        System.out.println("First value of Queue :" + queue[beginningOfQueue]);
    }

    public void isEmpty(){
        if(topOfQueue == beginningOfQueue && beginningOfQueue == -1){
            System.out.println("Queue is empty");
        }
    }



}
