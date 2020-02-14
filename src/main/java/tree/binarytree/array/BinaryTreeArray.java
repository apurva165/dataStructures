package tree.binarytree.array;

public class BinaryTreeArray {

    private int[] data = new int[100];
    private int lastIndexUsed = 0;


    public void insertIntoTree(int val){
        data[lastIndexUsed + 1] = val;
        lastIndexUsed++;
    }

    public void preOrder(int index){
        if(index > lastIndexUsed){
            return;
        } else {
            System.out.print(" -> " +data[index] + " -> ");
            preOrder(index * 2);
            preOrder(index * 2 + 1);
        }
    }

    public void postOrder(int index){
        if(index > lastIndexUsed){
            return;
        } else {
            postOrder(index * 2 + 1);
            postOrder(index * 2);
            System.out.println(" -> " +data[index] + " -> ");
        }
    }

    public void inOrder(int index){
        if(index > lastIndexUsed){
            return;
        } else {
            inOrder(index * 2);
            System.out.println(" -> " +data[index] + " -> ");
            inOrder(index * 2 + 1);

        }
    }

}
