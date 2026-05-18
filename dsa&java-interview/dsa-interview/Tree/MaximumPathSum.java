class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

/*
(first move to leaf node and then backtrack)
At every node we do TWO things:
1. Calculate complete path through current node
left + root + right
This may become answer.

2. Return only one side to parent
max(left, right) + root
Because parent cannot take both branches.
*/

public class MaximumPathSum {

    static int maxSum = Integer.MIN_VALUE;
     //tip: we can update root to leaf sum to calculate node to node max sum
    static int findMaxPath(Node root) {

        if (root == null)
            return 0;

        // Get left and right max path
        int left = Math.max(0, findMaxPath(root.left));  //max to ignore negative node.
        int right = Math.max(0, findMaxPath(root.right));

        // Current path sum through root
        int currentsum= left + right + root.data;

        // Update global maximum
        maxSum = Math.max(maxSum, currentsum);

        // Return single path to parent
        return Math.max(left, right) + root.data;
    }

    public static void main(String[] args) {

        /*
                10
               /  \
              2    10
                  /  \
                 20   1
        */

        Node root = new Node(10);

        root.left = new Node(2);

        root.right = new Node(10);
        root.right.left = new Node(20);
        root.right.right = new Node(1);

        findMaxPath(root);

        System.out.println("Maximum Path Sum = " + maxSum);
    }
}