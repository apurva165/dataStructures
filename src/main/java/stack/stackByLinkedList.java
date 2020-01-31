package stack;

import linkedlist.SingleLinkedList;

public class stackByLinkedList {
    private int stack = -1;
    SingleLinkedList list;

    public stackByLinkedList(){
        list = new SingleLinkedList();
        list.createSingleLinkedList(-1);
    }

    public void push(int val){
        list.insertIntoLinkedList(val, this.stack++);
        System.out.println( val + " pushed to stack");
    }

    public void pop(){
        list.deletionOfNode(this.stack);
        this.stack--;
    }

    public void peek(){
        list.getHead().getValue();
        System.out.println("peek opration  " + list.getHead().getValue());
    }


}

