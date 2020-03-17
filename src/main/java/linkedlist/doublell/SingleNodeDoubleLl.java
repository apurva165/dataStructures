package linkedlist.doublell;

public class SingleNodeDoubleLl {
    private int val;
    private SingleNodeDoubleLl next;
    private SingleNodeDoubleLl prev;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public SingleNodeDoubleLl getNext() {
        return next;
    }

    public void setNext(SingleNodeDoubleLl next) {
        this.next = next;
    }

    public SingleNodeDoubleLl getPrev() {
        return prev;
    }

    public void setPrev(SingleNodeDoubleLl prev) {
        this.prev = prev;
    }
}
