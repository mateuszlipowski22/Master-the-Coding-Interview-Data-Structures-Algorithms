package section14;

import section10.MyBinarySearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BFSMain {

    public static void main(String[] args) {

        MyBinarySearchTree<Integer> myBinarySearchTree = new MyBinarySearchTree<>();
        myBinarySearchTree.insert(9);
        myBinarySearchTree.insert(4);
        myBinarySearchTree.insert(6);
        myBinarySearchTree.insert(20);
        myBinarySearchTree.insert(170);
        myBinarySearchTree.insert(15);
        myBinarySearchTree.insert(1);
        System.out.println(myBinarySearchTree.breadthFirstSearch());
        System.out.println(myBinarySearchTree.breadthFirstSearchRecursive(new LinkedList<>(List.of(myBinarySearchTree.getRoot())), new ArrayList<>()));
    }

}
