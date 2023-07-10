package section11;

public class NodeGraph<T> {

    private T value;


    public NodeGraph(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "NodeGraph{" +
                "value=" + value +
                '}';
    }
}
