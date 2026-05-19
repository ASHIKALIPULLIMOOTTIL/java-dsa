package Graph;

import java.util.*;

public class BFSGraph {

    // Function for BFS
    public static void bfs(int start, List<List<Integer>> graph, int vertices) {

        boolean[] visited = new boolean[vertices];

        Queue<Integer> queue = new LinkedList<>();

        // Mark start node visited
        visited[start] = true;

        // Add start node to queue
        queue.offer(start);

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {

            // Remove front element
            int node = queue.poll();

            System.out.print(node + " ");

            // Visit all neighbors and add to queue
            for (int neighbor : graph.get(node)) {

                if (!visited[neighbor]) {

                    visited[neighbor] = true;

                    queue.offer(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {

        int vertices = 4;

        // Create adjacency list
        List<List<Integer>> graph = new ArrayList<>();  //here a big outer list is created

        /*
        1. Inner List
           List<Integer>  ->This stores neighbors of one vertex.([1, 2])
        2. Outer List
           List<List<Integer>>  ->This stores neighbor lists for ALL vertices.

                 Example:

                     [
                       [1,2],   // neighbors of 0
                       [0,3],   // neighbors of 1
                       [0,3],   // neighbors of 2
                       [1,2]    // neighbors of 3
                     ]
                So: graph.get(0) gives neighbours:[1,2]
        */

        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());   //here 4 inner list is created
        }
        /*
        Suppose:
          vertices = 4
        We need 4 empty lists:
                   0 -> []
                   1 -> []
                   2 -> []
                   3 -> []
              So the loop creates them.
        */

        // Add edges
        graph.get(0).add(1);
        graph.get(0).add(2);
              //0 -> [1,2]
        graph.get(1).add(0);
        graph.get(1).add(3);

        graph.get(2).add(0);
        graph.get(2).add(3);

        graph.get(3).add(1);
        graph.get(3).add(2);
      
        for(int i=0;i<vertices;i++){
            System.out.print(i + "-> ");

            for(Integer x: graph.get(i)){
             System.out.print(x + " ");
            }
            System.out.println();
            
        }
        // Perform BFS
        bfs(0, graph, vertices);
    }
}