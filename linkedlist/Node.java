public class Node {

    private String value;
    private Node neighbour;

    Node(String value) {
        this.setValue(value);
    }

    Node(String value, Node neighbour) {
        this.setValue(value);
        this.setNeighbour(neighbour);
    }

    public void setNeighbour(Node neighbour) {
        this.neighbour = neighbour;
    }

    public Node getNeighbour() {
        return this.neighbour;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
    

    public String toString() {
        return this.value;
    }

}
