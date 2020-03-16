package tree.binarytree.linkedlist;

public class BinaryNode {
    private int val;
    private int height;
    private BinaryNode left;
    private BinaryNode right;


    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "BinaryNode{" +
                "val=" + val +
                ", height=" + height +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
