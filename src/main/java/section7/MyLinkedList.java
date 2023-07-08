package section7;

import java.util.Objects;

public class MyLinkedList<T> {

    public MyLinkedList(T value) {
        Node<T> newNode = new Node<>(value);
        this.head=newNode;
        this.tail=newNode;
        this.length = 1;
    }

    private Node<T> head;
    private Node<T> tail;
    private int length;


    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void append(T value){
        Node<T> newNode = new Node<>(value);
        this.tail.setNext(newNode);
        this.tail=newNode;
        length++;
    }

    public void insert(int index, T value){
        if(index>length-1 || index<0){
            return;
        }
        Node<T> newNode = new Node<>(value);

        Node<T> currentNode=this.head;
        for (int i = 0; i <= index-1; i++) {
            currentNode=currentNode.getNext();
            i++;
        }
        newNode.setNext(currentNode.getNext());
        currentNode.setNext(newNode);
        length++;
    }

    public void remove(int index){
        if(index>length-1 || index<0){
            return;
        }

        Node<T> currentNode=this.head;
        if(index==0){
            this.head=head.getNext();
        }else  {
            for (int i = 0; i <= index-1; i++) {
                currentNode=currentNode.getNext();
                i++;
            }

            if(index==length-1){
                this.tail=currentNode;
            }else {
                currentNode.setNext(currentNode.getNext().getNext());
            }
        }
        length--;
    }

    public void prepend(T value){
        Node<T> newNode = new Node<>(value);
        newNode.setNext(head);
        this.head=newNode;
        length++;
    }

    public void reverse(){

        if(this.length==1){
            return;
        }

        Node<T> first = this.head;
        this.tail=this.head;
        Node<T> second = first.getNext();
        Node<T> temp;
        while(Objects.nonNull(second)){
            temp = second.getNext();
            second.setNext(first);
            first = second;
            second = temp;
        }
        this.head.setNext(null);
        this.head = first;

    }


    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", lentgth=" + length +
                '}';
    }
}
