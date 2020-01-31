package queue.linkedlist.linearqueuell;

import queue.linkedlist.SingleLinkedList;
import queue.linkedlist.SingleNode;

public class LinearQueueLl {
    SingleLinkedList list;

    public LinearQueueLl() {
        list = new SingleLinkedList();
    }

    public void enQueue(int val){
        if(list.getHead() == null){
            list.createLinkedList(val);
        }
        list.insertIntoLinkedList(val, list.getSize());
    }

    public void deQueue(){
        list.deletionOfNode(0);
    }
}
