package section7;

public class MainDoubleLinkedList {

    public static void main(String[] args) {

        MyDoubleLinkedList<Integer> myDoubleLinkedList = new MyDoubleLinkedList<>(5);
        System.out.println(myDoubleLinkedList);
        myDoubleLinkedList.append(10);
        System.out.println(myDoubleLinkedList);
        myDoubleLinkedList.append(15);
        System.out.println(myDoubleLinkedList);
        myDoubleLinkedList.prepend(10);
        System.out.println(myDoubleLinkedList);
        myDoubleLinkedList.prepend(15);
        System.out.println(myDoubleLinkedList);
        myDoubleLinkedList.insert(2, 33);
        System.out.println(myDoubleLinkedList);
        myDoubleLinkedList.remove(2);
        System.out.println(myDoubleLinkedList);
        myDoubleLinkedList.remove(0);
        System.out.println(myDoubleLinkedList);
        myDoubleLinkedList.remove(3);
        System.out.println(myDoubleLinkedList);

        System.out.println(myDoubleLinkedList.getHead().getNext().getNext().getPrevious());
    }

}
