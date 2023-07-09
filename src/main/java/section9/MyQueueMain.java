package section9;

public class MyQueueMain {

    public static void main(String[] args) {

        MyQueue<String> myQueue = new MyQueue<>("Marek");
        myQueue.enqueue("Michal");
        System.out.println("myQueue = " + myQueue);
        myQueue.enqueue("Mateusz");
        myQueue.enqueue("Adam");
        myQueue.enqueue("Marcin");
        System.out.println("myQueue = " + myQueue);
        myQueue.dequeue();
        System.out.println("myQueue = " + myQueue);

    }

}
