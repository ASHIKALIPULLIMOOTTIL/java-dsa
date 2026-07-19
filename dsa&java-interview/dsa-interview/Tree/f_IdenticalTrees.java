class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class f_IdenticalTrees {

    static boolean isIdentical(Node root1, Node root2) {

        // Both are null
        if (root1 == null && root2 == null)
            return true;

        // One is null, other is not
        if (root1 == null || root2 == null)
            return false;

        // Check:
        // 1. data same
        // 2. left subtree same
        // 3. right subtree same

        return (root1.data == root2.data)
                && isIdentical(root1.left, root2.left)
                && isIdentical(root1.right, root2.right);
    }

    public static void main(String[] args) {

        // Tree 1
        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(9);

        // Tree 2
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);

        if (isIdentical(root1, root2))
            System.out.println("Trees are Identical");
        else
            System.out.println("Trees are Not Identical");
    }
}