package section7;

import java.util.Objects;

public class Node<T>{

    public Node(T value) {
        this.value = value;
    }

    private T value;
    private Node<T> next;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return " " + value
                 + ((Objects.nonNull(this.getNext())) ? this.getNext() : "");
    }
}
