package section9.queues_using_stacks;

public class Main {

    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(3);
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();
    }

}
