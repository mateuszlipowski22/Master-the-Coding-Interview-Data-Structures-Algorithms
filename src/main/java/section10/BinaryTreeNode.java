package section10;

import java.util.Objects;

public class BinaryTreeNode<T extends Comparable<T>> implements Comparable<T> {

    private T value;
    private BinaryTreeNode<T> left;
    private BinaryTreeNode<T> right;

    public T getValue() {
        return value;
    }


    public BinaryTreeNode(T value) {
        this.value = value;
    }

    public BinaryTreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(BinaryTreeNode<T> left) {
        this.left = left;
    }

    public BinaryTreeNode<T> getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode<T> right) {
        this.right = right;
    }

    @Override
    public int compareTo(T t) {
        return value.compareTo(t);
    }

    @Override
    public String toString() {
        return "value=" + value +
                ", left=" + (Objects.nonNull(left) ? left : "")  +
                ", right=" + (Objects.nonNull(right) ? right : "");
    }
}
