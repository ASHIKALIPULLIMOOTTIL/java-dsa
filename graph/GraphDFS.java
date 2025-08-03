import java.util.*;

class GraphDFS {
    private int vertices;
    private LinkedList<Integer>[] adjList;

    // Constructor to initialize graph
    public GraphDFS(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    // Method to add an edge (undirected graph)
    public void addEdge(int src, int dest) {
        adjList[src].add(dest);
        adjList[dest].add(src);
    }

    // DFS utility function (recursive)
    private void dfsUtil(int v, boolean[] visited) {
        visited[v] = true;                  // mark current node as visited
        System.out.print(v + " ");          // print the node

        // Recur for all adjacent vertices
        for (int neighbor : adjList[v]) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited);
            }
        }
    }

    // DFS function
    public void DFS(int startVertex) {
        boolean[] visited = new boolean[vertices];  // track visited nodes
        System.out.print("DFS Traversal starting from vertex " + startVertex + ": ");
        dfsUtil(startVertex, visited);
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        GraphDFS graph = new GraphDFS(5);

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Perform DFS starting from vertex 0
        graph.DFS(0);
    }
}

