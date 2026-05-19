package Graph;

import java.util.*;

public class DFSGraph {

    // DFS function
    public static void dfs(int node,
                           List<List<Integer>> graph,
                           boolean[] visited) {

        // Mark visited
        visited[node] = true;

        System.out.print(node + " ");

        // Visit neighbors
        for (int neighbor : graph.get(node)) {

            if (!visited[neighbor]) {

                dfs(neighbor, graph, visited);
            }
        }
    }

    public static void main(String[] args) {

        int vertices = 4;

        // Create adjacency list
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges
        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(0);
        graph.get(1).add(3);

        graph.get(2).add(0);
        graph.get(2).add(3);

        graph.get(3).add(1);
        graph.get(3).add(2);

        boolean[] visited = new boolean[vertices];

        System.out.print("DFS Traversal: ");

        dfs(0, graph, visited);
    }
}

/*

import java.util.*;

public class DFSStack {

    public static void dfs(int start,
                           List<List<Integer>> graph,
                           int vertices) {

        boolean[] visited = new boolean[vertices];

        Stack<Integer> stack = new Stack<>();

        stack.push(start);

        System.out.print("DFS Traversal: ");

        while (!stack.isEmpty()) {

            int node = stack.pop();

            if (!visited[node]) {

                visited[node] = true;

                System.out.print(node + " ");

                for (int neighbor : graph.get(node)) {

                    if (!visited[neighbor]) {

                        stack.push(neighbor);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        int vertices = 4;

        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(1);
        graph.get(0).add(2);

        graph.get(1).add(0);
        graph.get(1).add(3);

        graph.get(2).add(0);
        graph.get(2).add(3);

        graph.get(3).add(1);
        graph.get(3).add(2);

        dfs(0, graph, vertices);
    }
}

*/