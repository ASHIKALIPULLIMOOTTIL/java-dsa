import java.util.*;

class GraphBFS {
    private int vertices;
    private LinkedList<Integer>[] adjList;

    // Constructor
    public GraphBFS(int vertices) {
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

    // BFS function
    public void BFS(int startVertex) {
        boolean[] visited = new boolean[vertices]; // Track visited nodes
        Queue<Integer> queue = new LinkedList<>(); // Use a queue for BFS

        visited[startVertex] = true;
        queue.add(startVertex);

        System.out.print("BFS Traversal starting from vertex " + startVertex + ": ");

        while (!queue.isEmpty()) {
            int current = queue.poll();   // Remove from queue
            System.out.print(current + " ");

            // Visit all unvisited neighbors
            for (int neighbor : adjList[current]) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        GraphBFS graph = new GraphBFS(5);

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Perform BFS starting from vertex 0
        graph.BFS(0);
    }
}

