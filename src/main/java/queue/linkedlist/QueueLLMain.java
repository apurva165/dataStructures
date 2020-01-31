package queue.linkedlist;

public class QueueLLMain {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

        list.createLinkedList(2);
        list.insertIntoLinkedList(10, 1);
        list.insertIntoLinkedList(20, 2);
        list.insertIntoLinkedList(30, 3);
        list.insertIntoLinkedList(40, 4);
        list.traverseLinkedList();;
        list.insertIntoLinkedList(40, 3);
        list.traverseLinkedList();;

    }
}
