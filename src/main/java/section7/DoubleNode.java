package section7;

public class DoubleNode<T>{

    public DoubleNode(T value) {
        this.value = value;
    }
    private T value;
    private DoubleNode next;
    private DoubleNode previous;

    public DoubleNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleNode previous) {
        this.previous = previous;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public T getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "DoubleNode{" +
                "value=" + value +
                ", next=" + next +
                '}';
    }
}
