package linkedlist.circularll;

public class CircularllMain extends CircularSingleLinkedList{
    public static void main(String[] args) {
        CircularSingleLinkedList list = new CircularSingleLinkedList();

        list.createSingleCircularLL(1);
        list.insetIntoCircularLL(2, 1);
        list.insetIntoCircularLL(3, 2);
        list.insetIntoCircularLL(4, 3);
        System.out.println(list.getSize());
        System.out.println("Tail : " + list.getTail().getValue());
        System.out.println("Head : " + list.getHead().getValue());
        list.traverseCircularLL();
        System.out.println("Searching for Node");
        list.searchNode(2);
        System.out.println("Deleting node");
        list.deleteSomeNode(3);
        System.out.println("searching for Deleted Node");
        list.searchNode(3);

        list.traverseCircularLL();


    }
}
