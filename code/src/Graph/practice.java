package Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class practice {
    public static class Graph{
        private int N;
        private List<Integer> adj[];

        Graph(int n){
            N = n;
            adj = new LinkedList[n];
            for(int i = 0; i < n; i++){
                adj[i] = new LinkedList<>();
            }
        }

        public void addEdge(int form, int to){
            adj[form].add(to);
        }
    }
    static Graph graph = new Graph(5);

    public static void DFS(int i, boolean visited[]){
        visited[i] = true;
        System.out.println(i+ " ");

        Iterator<Integer> v = graph.adj[i].listIterator();
        while(v.hasNext()){
            var n = v.next();
            if(!visited[n]){
                DFS(n, visited);
            }
        }
    }
    public static void DFS(){
        boolean visited[] = new boolean[graph.N];

        for(int i = 0; i < graph.N;i++){
            if(!visited[i]){
                DFS(i, visited);
            }
        }
    }
    public static void main(String[] args) {
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);
        DFS();
    }

}
