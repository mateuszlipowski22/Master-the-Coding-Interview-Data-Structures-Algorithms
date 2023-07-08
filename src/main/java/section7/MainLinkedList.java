package section7;

public class MainLinkedList {

    public static void main(String[] args) {

        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>(5);
        System.out.println(myLinkedList);
        myLinkedList.append(10);
        System.out.println(myLinkedList);
        myLinkedList.append(15);
        System.out.println(myLinkedList);
        myLinkedList.prepend(10);
        System.out.println(myLinkedList);
        myLinkedList.prepend(15);
        System.out.println(myLinkedList);
        myLinkedList.insert(2, 33);
        System.out.println(myLinkedList);
        myLinkedList.remove(2);
        System.out.println(myLinkedList);
        myLinkedList.remove(0);
        System.out.println(myLinkedList);
        myLinkedList.remove(3);
        System.out.println(myLinkedList);
    }

}
