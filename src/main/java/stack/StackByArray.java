package stack;

public class StackByArray {
    private int[] arr;
    private int topOfStack;

    public void createStack(int size) {
        arr = new int[size];
        topOfStack = -1;
        System.out.println("stack Created");
    }

    public void push(int val) {
        if (topOfStack != arr.length - 1) { // If it erros out then look here
            arr[topOfStack + 1] = val;
            topOfStack++;
            System.out.println("Successfully inserted " + val + " in the stack");

        } else {
            System.out.println("Stack is full !");
        }
    }

    public void pop(){
        System.out.println("Poping value from Stack: " + arr[topOfStack] + "...");
        this.topOfStack--;
    }

    public void peekOperation() {
      //  if (topOfStack != this.arr.length - 1) { // If it erros out then look here
            System.out.println("Top of Stack: " + arr[topOfStack]);
       // }
    }
}
