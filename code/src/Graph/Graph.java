package Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private class Node {
        private String label;

        public Node(String label) {
            this.label = label;
        }

        public String toString(){
            return label;
        }
    }
        private Map<String, Node> nodes = new HashMap<>();
        private Map<Node, List<Node>> adjacencyList = new HashMap<>();
        public void addNode(String value){
            var node  = new Node(value);
            nodes.putIfAbsent(value, node);
            adjacencyList.putIfAbsent(node, new ArrayList<>());
        }

        public void addEdge(String form, String to) {
            var formNode = nodes.get(form);
            if(formNode == null)throw new IllegalArgumentException();
            var toNode = nodes.get(form);
            if(toNode == null) throw new IllegalArgumentException();
            adjacencyList.get(formNode).add(toNode);
        }

        public void print() {
            for(var source : adjacencyList.keySet()){
                var target = adjacencyList.get(source);
                if(!target.isEmpty())
                    System.out.println(source+ " is connected to "+target);
            }
        }

}
