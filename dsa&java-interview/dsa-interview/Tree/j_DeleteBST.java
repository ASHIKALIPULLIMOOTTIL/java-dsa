class Node {

    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
    }
}

public class j_DeleteBST {

    // Insert
    static Node insert(Node root, int value) {

        if (root == null)
            return new Node(value);

        if (value < root.data)
            root.left = insert(root.left, value);

        else if (value > root.data)
            root.right = insert(root.right, value);

        return root;
    }

    // Find minimum node
    static Node minValue(Node root) {

        while (root.left != null)
            root = root.left;

        return root;
    }

    // Delete node
    static Node delete(Node root, int key) {

        if (root == null)
            return null;

        // These are used to search for the node that must be deleted.
        if (key < root.data) {
            root.left = delete(root.left, key);
        }

        else if (key > root.data) {
            root.right = delete(root.right, key);
        }

        else if(key==root.data){

            // Case 1 & 2

            // No left child
            if (root.left == null)
                return root.right;

            // No right child
            else if (root.right == null)
                return root.left;

            // Case 3: Two children

            Node successor = minValue(root.right);

            root.data = successor.data;

            root.right = delete(root.right, successor.data);
        }

        return root;
    }

    // Inorder Traversal
    static void inorder(Node root) {

        if (root == null)
            return;

        inorder(root.left);

        System.out.print(root.data + " ");

        inorder(root.right);
    }

    public static void main(String[] args) {

        Node root = null;

        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 70);
        root = insert(root, 20);
        root = insert(root, 40);
        root = insert(root, 60);
        root = insert(root, 80);

        System.out.println("Before Deletion:");
        inorder(root);

        root = delete(root, 30);

        System.out.println("\nAfter Deletion:");
        inorder(root);
    }
}