package section11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyGraph<T> {

    private int numberOfNodes;
    List<NodeGraph<T>> nodes;
    private Map<T, List<T>> connections;

    public MyGraph() {
        this.nodes=new ArrayList<>();
        this.connections=new HashMap<T, List<T>>();
    }

    public void addVertex(T value){
        NodeGraph<T> newNode = new NodeGraph<T>(value);
        nodes.add(newNode);
        numberOfNodes++;
    }

    public void addConnection(T value1, T value2) {
        addConnectionInstance(value1, value2);
        addConnectionInstance(value2, value1);
    }

    private void addConnectionInstance(T index1, T index2) {
        List<T> connection;
        if (!connections.containsKey(index1)) {
            connection = new ArrayList<>();
        }else {
            connection = connections.get(index1);
        }
        connection.add(index2);
        connections.put(index1, connection);
    }

    @Override
    public String toString() {
        return "MyGraph{" +
                "numberOfNodes=" + numberOfNodes +
                ", nodes=" + nodes +
                ", connections=" + connections +
                '}';
    }
}
