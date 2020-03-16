package linkedlist;

public class CircularSingleLinkedList {
    private SingleNode head;
    private SingleNode tail;
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

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

    public void createSingleCircularLL(int value) {
        SingleNode node = new SingleNode();
        node.setValue(value);
        node.setNext(node);
        head = tail = node;
        size = 1;

    }

    public void insetIntoCircularLL(int value, int location) {
        SingleNode node = new SingleNode();
        node.setValue(value);
        if (head == null) {
            System.out.println("Linked List doesnot exist");
        }
        if (location == 0) {
            node.setNext(head);
            head = node;
            tail.setNext(head);
        }
        if (location >= size) {
            tail.setNext(tail);
            tail = node;
            tail.setNext(head);
        } else {
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
        setSize((getSize() + 1));
    }

    public void traverseCircularLL() {
        SingleNode tempNode = head;
        for (int i = 0; i <= size; i++) {
            System.out.println(tempNode.getNext());
            System.out.println("->");
            tempNode = tempNode.getNext();
        }
        System.out.println("\n");
    }

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
}
