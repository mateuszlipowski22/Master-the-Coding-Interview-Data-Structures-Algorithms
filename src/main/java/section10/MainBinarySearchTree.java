package section10;

public class MainBinarySearchTree {

    public static void main(String[] args) {
        MyBinarySearchTree<Integer> myBinarySearchTree = new MyBinarySearchTree<>();
        myBinarySearchTree.insert(9);
        myBinarySearchTree.insert(4);
        myBinarySearchTree.insert(6);
        myBinarySearchTree.insert(20);
        myBinarySearchTree.insert(170);
        myBinarySearchTree.insert(15);
        myBinarySearchTree.insert(1);

        System.out.println("myBinarySearchTree = " + myBinarySearchTree);

        System.out.println("myBinarySearchTree.lookup(15) = " + myBinarySearchTree.lookup(15));
        System.out.println("myBinarySearchTree.lookup(16) = " + myBinarySearchTree.lookup(16));
    }

}
