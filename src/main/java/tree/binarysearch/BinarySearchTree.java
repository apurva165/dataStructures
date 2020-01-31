package tree.binarysearch;

import tree.binarytree.linkedlist.BinaryNode;

public class BinarySearchTree {
    BinaryNode root;

    public BinarySearchTree() {
        root = null;
    }

    public BinaryNode getRoot() {
        return root;
    }

    public BinaryNode insert(BinaryNode currentNode, int value) {
        if (currentNode == null) {
            BinaryNode node = new BinaryNode();
            node.setVal(value);
            System.out.println("Successfully inserted " + value + "in BST");
        } else if (value <= currentNode.getVal()) {
            currentNode.setLeft(insert(currentNode.getLeft(), value));
            return currentNode;
        } else {
            currentNode.setRight(insert(currentNode.getRight() , value));
            return currentNode;
        }
        return currentNode;
    }

    public BinaryNode deleteVal(BinaryNode root, int val){

        return null;
    }

}
