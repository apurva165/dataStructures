package linkedlist;

public class SingleLinkedList {
    private SingleNode head;
    private SingleNode tail;
    private int size;

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

    public void createSingleLinkedList(int nodeValue) {
        head = new SingleNode();
        SingleNode node = new SingleNode();
        node.setValue(nodeValue);
        node.setNext(null);
        //head and tail are same
        head = node;
        tail = node;
        size = 1;
    }

    //inset Into LinkedList
    public void insertIntoLinkedList(int nodeValue, int location) {
        SingleNode node = new SingleNode();
        node.setValue(nodeValue);
        if (head == null) { // if no linked list
            System.out.println("linked list not exist");
        } else if (location == 0) {// if at location 0
            node.setNext(head);
            head = node;
        } else if (location >= size) {// insert at last position
            node.setNext(null);
            tail.setNext(node);
            tail = node;
        } else { // insert at location
            SingleNode tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.getNext();
                index++;
            }
            SingleNode nextNode = tempNode.getNext();
            tempNode.setNext(node);
            node.setNext(nextNode);
        }
        setSize(getSize() + 1);
    }

    public boolean existLinkedList() {
        return head != null;
    }

    //Traverses Linked List
    void traverseLinkedList() {
        if (existLinkedList()) {
            SingleNode tempNode = head;
            for (int i = 0; i < getSize(); i++) {
                System.out.print(tempNode.getValue());
                if (i != getSize() - 1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.getNext();
            }
        }else {
            System.out.println("Linked List does not exists !");
        }
        System.out.println("\n");
    }

    //Delete LL
    public void deleteLinkedList() {
        head = tail = null;
        System.out.println("Deleted Linked list");
    }

    //Search Linked list
    public void searchNode(int nodeValue) {
        SingleNode tempNode = head;
        for (int i = 0; i < getSize(); i++) {
            if (tempNode.getValue() == nodeValue) {
                System.out.println("Node found at " + i + "location");
                return;
            }
            tempNode = tempNode.getNext();
        }
        System.out.println("Node not found");
    }
    public void deletionOfNode(int location) {
        if (!existLinkedList()) {
            System.out.println("The linked list does not exist!!");// Linked List does not exists
            return;
        } else if (location == 0) { // we want to delete first element
            head = head.getNext();
            setSize(getSize()-1);
            if(getSize() == 0) { // if there are no more nodes in this list
                tail = null;
            }
        }else if (location >= getSize()){ //If location is not in range or equal, then delete last node
            SingleNode tempNode = head;
            for (int i = 0; i < size - 1; i++) {
                tempNode = tempNode.getNext(); //temp node points to 2nd last node
            }
            if (tempNode == head) { //if this is the only element in the list
                tail = head = null;
                setSize(getSize()-1);
                return;
            }
            tempNode.setNext(null);
            tail= tempNode;
            setSize(getSize()-1);

        }else { //if any inside node is to be deleted
            SingleNode tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.getNext(); // we need to traverse till we find the location
            }
            tempNode.setNext(tempNode.getNext().getNext()); // delete the required node
            setSize(getSize()-1);
        }//end of else

    }//end of method

}

