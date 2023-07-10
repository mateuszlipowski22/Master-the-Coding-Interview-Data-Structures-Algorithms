package section11;

public class MainGraph {

    public static void main(String[] args) {

        MyGraph<Character> myGraph = new MyGraph<>();
        myGraph.addVertex('1');
        myGraph.addVertex('2');
        myGraph.addVertex('3');
        myGraph.addVertex('4');
        myGraph.addVertex('5');
        myGraph.addVertex('6');
        myGraph.addConnection('3', '1');
        myGraph.addConnection('3', '4');
        myGraph.addConnection('4', '2');
        myGraph.addConnection('4', '5');
        myGraph.addConnection('1', '2');
        myGraph.addConnection('1', '0');
        myGraph.addConnection('0', '2');

        System.out.println("myGraph = " + myGraph);
    }

}
