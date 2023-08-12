package Graph;

public class Main {
    public static void main(String[] args) {
        var graph = new Graph();
        graph.addNode("1");
        graph.addNode("2");
        graph.addNode("3");
        graph.addNode("4");
        graph.addEdge("1","2");
        graph.addEdge("1","3");
        graph.addEdge("2","3");
        graph.addEdge("2","4");
        graph.print();
    }
}
