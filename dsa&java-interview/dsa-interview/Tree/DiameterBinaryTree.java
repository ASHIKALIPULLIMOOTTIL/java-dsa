class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class DiameterBinaryTree {

    // Variable to store maximum diameter(global)
    static int max = 0;

    // Function to calculate height
    static int height(Node root) {

        if (root == null)
            return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        // Update diameter
        max = Math.max(max, lh + rh );

        // Return height
        return Math.max(lh, rh) + 1;
    }
      //tip:we can update height to calculate diameter
    static int diameter(Node root) {
        height(root);
        return max;
    }

    public static void main(String[] args) {

        /*
                    1
                   / \
                  2   3
                     / \
                    4   6
                   /     \
                  5       7
                 /         \
                9           8
        */

        Node root = new Node(1);

        root.left = new Node(2);

        root.right = new Node(3);

        root.right.left = new Node(4);
        root.right.right = new Node(6);

        root.right.left.left = new Node(5);
        root.right.left.left.left = new Node(9);

        root.right.right.right = new Node(7);
        root.right.right.right.right = new Node(8);

        int result = diameter(root);

        System.out.println("Diameter of Tree = " + result);
    }
}