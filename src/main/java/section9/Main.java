package section9;

public class Main {

    public static void main(String[] args) {

        MyStack<Integer> myStack = new MyStack<>(5);

        System.out.println(myStack.peek());
        myStack.push(10);
        System.out.println(myStack.peek());
        myStack.push(15);
        myStack.push(15);
        myStack.push(15);
        myStack.push(15);
        myStack.push(15);
        System.out.println(myStack.peek());
        System.out.println(myStack);
        myStack.pop();
        System.out.println(myStack.peek());
        System.out.println(myStack);
        myStack.pop();
        myStack.pop();
        System.out.println(myStack);
        System.out.println("myStack.isEmpty() = " + myStack.isEmpty());

    }

}
