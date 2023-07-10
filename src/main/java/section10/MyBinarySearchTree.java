package section10;

import java.util.Objects;

public class MyBinarySearchTree<T extends Comparable<T>> {

    public MyBinarySearchTree() {
        this.root = null;
    }

    public MyBinarySearchTree(BinaryTreeNode<T> root) {
        this.root = root;
    }

    private BinaryTreeNode<T> root;

    public void insert(T value) {
        BinaryTreeNode<T> newNode = new BinaryTreeNode<>(value);
        if (this.root == null) {
            this.root = newNode;
        } else {
            BinaryTreeNode<T> currentNode = root;
            boolean flag = true;
            while (flag) {
                if (currentNode.compareTo(newNode.getValue()) > 0 && Objects.nonNull(currentNode.getLeft())) {
                    currentNode = currentNode.getLeft();
                } else if (currentNode.compareTo(newNode.getValue()) < 0 && Objects.nonNull(currentNode.getRight())) {
                    currentNode = currentNode.getRight();
                } else if (currentNode.compareTo(newNode.getValue()) > 0 && Objects.isNull(currentNode.getLeft())) {
                    currentNode.setLeft(newNode);
                    flag = false;
                } else if (currentNode.compareTo(newNode.getValue()) < 0 && Objects.isNull(currentNode.getRight())) {
                    currentNode.setRight(newNode);
                    flag = false;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "MyBinarySearchTree{" +
                "root=" + root +
                '}';
    }

}
