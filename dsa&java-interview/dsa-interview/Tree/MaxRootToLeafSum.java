class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class MaxRootToLeafSum {

    static int maxPath(Node root) {

        // Base case
        if (root == null)
            return 0;

        // Find left and right sums
        /*Go completely down to leaf nodes first
          Then return/backtrack upward */
        int leftSum = maxPath(root.left);
        int rightSum = maxPath(root.right);

        // Return current node value
        // + maximum of left/right subtree
        return root.data + Math.max(leftSum, rightSum);
    }

    public static void main(String[] args) {

        /*
                  10
                 /  \
                5    20
                    /  \
                   15   25
        */

        Node root = new Node(10);

        root.left = new Node(5);

        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(25);

        int result = maxPath(root);

        System.out.println("Maximum Root to Leaf Sum = " + result);
    }
}