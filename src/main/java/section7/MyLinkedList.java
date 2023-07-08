package section7;

public class MyLinkedList<T> {

    public MyLinkedList(T value) {
        Node<T> newNode = new Node<>(value);
        this.head=newNode;
        this.tail=newNode;
        this.length = 1;
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

    private Node<T> head;
    private Node<T> tail;
    private int length;

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", lentgth=" + length +
                '}';
    }
}
