package stack;

public class StackByArrayMain {
    public static void main(String [] arges){
        StackByArray stack = new StackByArray();

        stack.createStack(3);
        stack.push(14);
        stack.push(25);
        stack.push(37);
        stack.push(48);
        stack.push(59);
        stack.pop();
        stack.pop();

        stack.peekOperation();
    }
}
