package section14;

import section10.MyBinarySearchTree;

public class DFSMain {

    public static void main(String[] args) {

        MyBinarySearchTree<Integer> myBinarySearchTree = new MyBinarySearchTree<>();
        myBinarySearchTree.insert(9);
        myBinarySearchTree.insert(4);
        myBinarySearchTree.insert(6);
        myBinarySearchTree.insert(20);
        myBinarySearchTree.insert(170);
        myBinarySearchTree.insert(15);
        myBinarySearchTree.insert(1);
        System.out.println(myBinarySearchTree.DFSInOrder());
        System.out.println(myBinarySearchTree.DFSPreOrder());
        System.out.println(myBinarySearchTree.DFSPostOrder());
    }

}
