class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class c_Check_BalancedBinaryTree {

    // Returns height if balanced
    // Returns -1 if not balanced
    static int checkHeight(Node root) {

        if (root == null)
            return 0;

        int leftHeight = checkHeight(root.left);

        // Left subtree not balanced
        if (leftHeight == -1)
            return -1;

        int rightHeight = checkHeight(root.right);

        // Right subtree not balanced
        if (rightHeight == -1)
            return -1;

        // Check height difference
        if (Math.abs(leftHeight - rightHeight) > 1)
            return -1;

        // Return height
        return Math.max(leftHeight, rightHeight) + 1;
    }

    static boolean isBalanced(Node root) {
        return checkHeight(root) != -1;
    }

    public static void main(String[] args) {

        /*
                1
               / \
              2   3
             / \
            4   5
        */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        if (isBalanced(root))
            System.out.println("Balanced Tree");
        else
            System.out.println("Not Balanced");
    }
}