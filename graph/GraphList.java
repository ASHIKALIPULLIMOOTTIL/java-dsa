import java.util.*;

class GraphList {
    private int vertices;
    private LinkedList<Integer>[] adjList;//adjList is an array where each element is a LinkedList storing neighbors of that vertex.

    public GraphList(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Add edge (for undirected graph)
    public void addEdge(int src, int dest) {
        adjList[src].add(dest);
        adjList[dest].add(src);
    }
       //adjList[0] = [1,4]
       //adjList[1] = [0,2,3]

    // Display adjacency list
    public void display() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < vertices; i++) {
        System.out.print(i + " -> ");
        for (int j = 0; j < adjList[i].size(); j++) {
           int neighbor = adjList[i].get(j);
        System.out.print(neighbor + " ");
        }
         System.out.println();
      }

    }

    public static void main(String[] args) {
        GraphList graph = new GraphList(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.display();
    }
}

