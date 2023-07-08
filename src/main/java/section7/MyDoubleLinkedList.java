package section7;

public class MyDoubleLinkedList<T> {

    public MyDoubleLinkedList(T value) {
        DoubleNode<T> newNode = new DoubleNode<>(value);
        this.head=newNode;
        this.tail=newNode;
        this.length = 1;
    }

    private DoubleNode<T> head;
    private DoubleNode<T> tail;
    private int length;

    public DoubleNode<T> getHead() {
        return head;
    }

    public DoubleNode<T> getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public void append(T value){
        DoubleNode<T> newDoubleNode = new DoubleNode<>(value);
        newDoubleNode.setPrevious(this.tail);
        this.tail.setNext(newDoubleNode);
        this.tail=newDoubleNode;
        length++;
    }

    public void insert(int index, T value){
        if(index>length-1 || index<0){
            return;
        }
        DoubleNode<T> newDoubleNode = new DoubleNode<>(value);

        DoubleNode<T> currentDoubleNode=this.head;
        for (int i = 0; i <= index-1; i++) {
            currentDoubleNode=currentDoubleNode.getNext();
            i++;
        }
        newDoubleNode.setNext(currentDoubleNode.getNext());
        newDoubleNode.setPrevious(currentDoubleNode);
        currentDoubleNode.getNext().setPrevious(newDoubleNode);
        currentDoubleNode.setNext(newDoubleNode);
        length++;
    }

    public void remove(int index){
        if(index>length-1 || index<0){
            return;
        }

        DoubleNode<T> currentDoubleNode=this.head;
        if(index==0){
            this.head=head.getNext();
        }else  {
            for (int i = 0; i <= index-1; i++) {
                currentDoubleNode=currentDoubleNode.getNext();
                i++;
            }

            if(index==length-1){
                this.tail=currentDoubleNode;
            }else {
                currentDoubleNode.setNext(currentDoubleNode.getNext().getNext());
            }
        }
        length--;
    }

    public void prepend(T value){
        DoubleNode<T> newDoubleNode = new DoubleNode<>(value);
        newDoubleNode.setNext(head);
        this.head.setPrevious(newDoubleNode);
        this.head=newDoubleNode;
        length++;
    }

    @Override
    public String toString() {
        return "MyDoubleLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                ", length=" + length +
                '}';
    }
}
