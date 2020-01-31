package stack;


import linkedlist.SingleLinkedList;

public class stackByLinkedListMain {
    public static void main(String[] args) {
        stackByLinkedList stackByLinkedList = new stackByLinkedList();

        stackByLinkedList.push(2);
        stackByLinkedList.push(3);
        stackByLinkedList.push(4);
        stackByLinkedList.push(5);
        stackByLinkedList.pop();
        stackByLinkedList.pop();
        stackByLinkedList.peek();
        stackByLinkedList.pop();
        stackByLinkedList.peek();


    }

}
