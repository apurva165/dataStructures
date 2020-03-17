package linkedlist.doublell;

public class DoubleLl {
    SingleNodeDoubleLl head;
    SingleNodeDoubleLl tail;
    int size = 0;
    private boolean llExist = false;

    public void setHead(SingleNodeDoubleLl head) {
        this.head = head;
    }

    public void setTail(SingleNodeDoubleLl tail) {
        this.tail = tail;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public SingleNodeDoubleLl createDoubleLinkedList(int val) {
        head = new SingleNodeDoubleLl();
        SingleNodeDoubleLl node = new SingleNodeDoubleLl();
        node.setVal(val);
        node.setNext(node);
        node.setPrev(node);
        head = node;
        tail = node;
        size = 1;
        llExist = true;
        return head;
    }

    public void insertIntoDoubleLinkedList(int val, int loc) {
        SingleNodeDoubleLl newNode = new SingleNodeDoubleLl();
        newNode.setVal(val);
        if (!llExist) {
            System.out.println("LL does not exist");
            return;
        } else if (loc == 0) {
            newNode.setNext(head);
            newNode.setPrev(tail);
            head.setPrev(newNode);
            tail.setNext(newNode);
            head = newNode;
        } else if (loc >= this.size) {
            newNode.setNext(head);
            newNode.setPrev(tail);
            head.setPrev(newNode);
            tail.setNext(newNode);
            tail = newNode; // to keep track of last node
        } else {
            SingleNodeDoubleLl tempNode = head;
            int index = 0;
            while (index < loc - 1) {// loop till we reach specified node
                tempNode = tempNode.getNext();
                index++;
            }
            newNode.setPrev(tempNode);
            newNode.setNext(tempNode.getNext());
            tempNode.setNext(newNode);
            newNode.getNext().setPrev(newNode);
        }
        size++;
    }

    public void traverseDoubleLinkedList() {
        if (this.head == null) {
            System.out.println("No LL available ");
        }
        SingleNodeDoubleLl currentNode = this.head;
        for (int i = 0; i <= this.size; size++) {
            System.out.println("val : " + currentNode.getVal());
            currentNode = currentNode.getNext();
        }
    }

    public void searchNodeDoubleLinkedList(int val) {
        if (this.head == null) {
            System.out.println("No LL available ");
        }
        SingleNodeDoubleLl currentNode = this.head;
        for (int i = 0; i <= this.size; size++) {
            if (currentNode.getVal() == val) {
                System.out.println("Node Found");
            }
            System.out.println("val : Not Fund");
            currentNode = currentNode.getNext();
        }
    }
}
