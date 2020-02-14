package tree.binarytree.array;

class Main {

    public static void main(String[] args) {
        BinaryTreeArray binaryTreeArray = new BinaryTreeArray();
        binaryTreeArray.insertIntoTree(2);
        binaryTreeArray.insertIntoTree(24);
        binaryTreeArray.insertIntoTree(26);
        binaryTreeArray.insertIntoTree(9);
        binaryTreeArray.insertIntoTree(652);
        binaryTreeArray.insertIntoTree(25);
        binaryTreeArray.insertIntoTree(26);

        binaryTreeArray.preOrder(1);

    }
}
