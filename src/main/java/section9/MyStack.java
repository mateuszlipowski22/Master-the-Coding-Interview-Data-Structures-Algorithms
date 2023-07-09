package section9;

import section7.Node;

public class MyStack<T> {

    public MyStack() {
        this.top = null;
        this.bottom = null;
        this.length=0;
    }

    public MyStack(T value) {
        Node<T> newNode = new Node<T>(value);
        this.top = newNode;
        this.bottom = newNode;
        this.length=1;
    }

    Node<T> top;
    Node<T> bottom;
    private int length;

    public T peek(){
        return this.top.getValue();
    }

    public void push(T value){

        if(length==0){
            Node<T> newNode = new Node<T>(value);
            this.top = newNode;
            this.bottom = newNode;
            this.length++;
        }

        Node<T> newNode = new Node<T>(value);
        newNode.setNext(this.top);
        this.top=newNode;
        length++;
    }

    public T pop(){

        if(length<=0){
            return null;
        }

        if(length==1){
            Node<T> topNode = this.top;
            this.top=null;
            this.bottom=null;
            length--;
            return topNode.getValue();
        }

        Node<T> topNode = this.top;
        this.top=topNode.getNext();
        length--;
        return topNode.getValue();
    }

    public boolean isEmpty(){
        return this.length>0;
    }

    @Override
    public String toString() {
        String output =
                """
                MyStack: %s%s
                """;
        return String.format(output, this.top.getValue(), this.top.getNext());
    }
}
