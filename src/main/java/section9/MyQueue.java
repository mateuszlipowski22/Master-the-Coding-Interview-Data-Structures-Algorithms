package section9;

import section7.Node;

public class MyQueue<T> {

    public MyQueue() {
        this.first = null;
        this.last = null;
        this.length=0;
    }

    public MyQueue(T value) {
        Node<T> newNode = new Node<T>(value);
        this.first = newNode;
        this.last = newNode;
        this.length=1;
    }

    Node<T> first;
    Node<T> last;
    private int length;

    public T peek(){
        return this.first.getValue();
    }

    public void enqueue(T value){
        Node<T> newNode = new Node<T>(value);
        if(length==0){
            this.first = newNode;
            this.last = newNode;
        }else{
            this.last.setNext(newNode);
            this.last=newNode;
        }
        this.length++;
    }

    public T dequeue(){
        if(length<=0){
            return null;
        }

        Node<T> firstNode = this.first;
        if(length==1){
            this.first=null;
            this.last=null;
        }else{
            this.first=firstNode.getNext();
        }

        length--;
        return firstNode.getValue();
    }

    public boolean isEmpty(){
        return this.length>0;
    }

    @Override
    public String toString() {
        String output =
                """
                MyQueue: %s%s
                """;
        return String.format(output, this.first.getValue(), this.first.getNext());
    }
}
