package tree.binarytree.linkedlist;

import queue.linkedlist.SingleNode;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLinkedList {
    BinaryNode root;

    public BinaryTreeLinkedList(BinaryNode root) {
        this.root = null;
    }

    public BinaryTreeLinkedList() {

    }


    public void insert(int value){
        BinaryNode node = new BinaryNode();
        node.setVal(value);
        if(root == null){
            root = node;
            System.out.println("Successfully inserted newNode at root");
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(node);
        while (!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.getLeft() == null){
                presentNode.setLeft(node);
                System.out.println("Successfully added a new node");
                break;
            }
            else if(presentNode.getRight() == null){
                presentNode.setLeft(node);
                System.out.println("Successfully added a new node");
                break;
            } else {
                queue.add(presentNode.getLeft());
                queue.add(presentNode.getRight());
            }
        }
    }
    void deleteNodeOfBinaryTree(int value) {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            // if node is found then copy deepest node here and delete deepest node.
            if (presentNode.getVal() == value) {
                presentNode.setVal(geDeepestNode().getVal());
                //DeleteDeepestNode(); TODO
                System.out.println("Deleted the node !!");
                return;
            }else {
                if (presentNode.getLeft() != null)
                    queue.add(presentNode.getLeft());
                if (presentNode.getRight() != null)
                    queue.add(presentNode.getRight());
            }
        }//end of while loop
        System.out.println("Did not find the node!!");
    }

    void levelOrder() {
        // make a queue for level order. Queue is Interface and LinkedList is class
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.getVal() + " ");
            if (presentNode.getLeft() != null) {
                queue.add(presentNode.getLeft());
            }
            if (presentNode.getRight() != null)
                queue.add(presentNode.getRight());
        }
    }// end of method
    void preOrder(BinaryNode node) {
        if (node == null)
            return;
        System.out.print(node.getVal() + " ");
        preOrder(node.getLeft());
        preOrder(node.getRight());
    }//end of method



    // post-order traversal of binary tree
    void postOrder(BinaryNode node) {
        if (node == null)
            return;
        postOrder(node.getLeft());
        postOrder(node.getRight());
        System.out.print(node.getVal() + " ");
    }//end of method



    // in-order traversal of binary tree
    void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.getLeft());
        System.out.print(node.getVal() + " ");
        inOrder(node.getRight());
    }//end of method

    public BinaryNode geDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        BinaryNode presentNode = null;
        while (!queue.isEmpty()) {
            presentNode = queue.remove();
            if (presentNode.getLeft() != null) {
                queue.add(presentNode.getLeft());
            }
            if (presentNode.getRight() != null) {
                queue.add(presentNode.getRight());
            }
        }
        return presentNode;
    }
}
