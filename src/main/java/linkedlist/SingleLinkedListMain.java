package linkedlist;

public class SingleLinkedListMain {
    public static void main (String [] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.createSingleLinkedList(5);
        list.traverseLinkedList();

        list.insertIntoLinkedList(10, 1);
        list.traverseLinkedList();

        list.insertIntoLinkedList(20, 2);
        list.traverseLinkedList();

        list.insertIntoLinkedList(30, 2);
        list.traverseLinkedList();

        list.insertIntoLinkedList(40, 1);
        list.traverseLinkedList();

        list.traverseLinkedList();
        System.out.println();

    }
}
