package Graph;

import java.util.*;

class GraphList {
    private int vertices;
    private LinkedList<Integer>[] adjList;  //Array of LinkedLists

    GraphList(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];//Only the ARRAY is created.LinkedLists are NOT created yet.
                                           //Cannot create a generic array of LinkedList<Integer> at runtime

        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>(); //Create LinkedList for Each Vertex
        }                                    //adjList ->array
                                             //adjList[i] ->linked list
    }

    void addEdge(int source, int destination) {
        adjList[source].add(destination);

        // For undirected graph
        adjList[destination].add(source);
    }

    void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");

            for (Integer node : adjList[i]) {
                System.out.print(node + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphList graph = new GraphList(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        graph.printGraph();
    }
}

/*

import java.util.*;

class Edge {
    int destination, weight;

    Edge(int d, int w) {
        destination = d;
        weight = w;
    }
}

class WeightedGraph {
    private List<List<Edge>> adjList;

    WeightedGraph(int vertices) {
        adjList = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    void addEdge(int source, int destination, int weight) {
        adjList.get(source).add(new Edge(destination, weight));
    }

    void printGraph() {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print(i + " -> ");

            for (Edge edge : adjList.get(i)) {
                System.out.print("(" + edge.destination + ", " + edge.weight + ") ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        WeightedGraph graph = new WeightedGraph(3);

        graph.addEdge(0, 1, 5);
        graph.addEdge(0, 2, 10);

        graph.printGraph();
    }
}

*/
