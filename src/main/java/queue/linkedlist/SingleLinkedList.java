package queue.linkedlist;

public class SingleLinkedList {
    private SingleNode head;
    private SingleNode tail;
    private int size = 0;

    public SingleNode getHead() {
        return head;
    }

    public void setHead(SingleNode head) {
        this.head = head;
    }

    public SingleNode getTail() {
        return tail;
    }

    public void setTail(SingleNode tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void createLinkedList(int val){
        head  = new SingleNode();
        SingleNode node = new SingleNode();
        node.setValue(val);
        node.setNext(null);
        head = tail = node;
        size = 1;
        System.out.println("Linked List Created with head : " + val);
    }

    public void insertIntoLinkedList(int val, int location){
        SingleNode node1 = new SingleNode();
        node1.setValue(val);
        if(location == 0){
            node1.setNext(head);
            head = node1;
        }
        if(location >= size){
            node1.setNext(null);
            tail.setNext(node1);
            tail = node1;
        }
        else {
           SingleNode tempNode = head;
            int index = 0;
            while (index < location - 1){
                tempNode = tempNode.getNext();
                System.out.println(tempNode.getValue() + " --> ");
                index++;
            }
            tempNode.setNext(node1);
            node1.setNext(tempNode.getNext());
        }
        setSize(getSize() + 1);
    }

    public void traverseLinkedList(){
        SingleNode tempNode = head;
        int index = 0;
        for(index = 0; index < getSize(); index++){
            System.out.println(" -> " + tempNode.getValue() + " -> ");
            tempNode = tempNode.getNext();
        }

    }
    public void deletionOfNode(int location) {
        if (head == null) {
            System.out.println("The linked list does not exist!!");// Linked List does not exists
            return;
        } else if (location == 0) { // we want to delete first element
            head = head.getNext();
            setSize(getSize() - 1);
            if (getSize() == 0) { // if there are no more nodes in this list
                tail = null;
            }
        } else if (location >= getSize()) { //If location is not in range or equal, then delete last node
            SingleNode tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.getNext(); //temp node points to 2nd last node
            }
            if (tempNode == head) { //if this is the only element in the list
                tail = head = null;
                setSize(getSize() - 1);
                return;
            }
            tempNode.setNext(null);
            tail = tempNode;
            setSize(getSize() - 1);

        } else { //if any inside node is to be deleted
            SingleNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.getNext(); // we need to traverse till we find the location
            }
            tempNode.setNext(tempNode.getNext().getNext()); // delete the required node
            setSize(getSize() - 1);
        }//end of else
    }
}

