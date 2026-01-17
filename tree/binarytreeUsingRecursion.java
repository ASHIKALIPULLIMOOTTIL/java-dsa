import java.util.Scanner;

// Node class
class Node {
    int data;
    Node left, right;

    Node(int data) {                               //this. is only required when:
                                                     
        this.data = data;                           //Parameter name == instance variable name
        left = right = null;                       //Writing this.left is optional here
    }
}

// Binary Tree class
class BinaryTree {
    Scanner sc = new Scanner(System.in);

    // Create tree using recursion
    Node create() {
        System.out.print("Enter data (-1 for no node): ");
        int x = sc.nextInt();

        // Base condition
        if (x == -1) {
            return null;
        }

        Node newNode = new Node(x);

        System.out.println("Enter left child of " + x);
        newNode.left = create();

        System.out.println("Enter right child of " + x);
        newNode.right = create();

        return newNode;
    }

    // Inorder Traversal (Left → Root → Right)
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Preorder Traversal (Root → Left → Right)
    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Postorder Traversal (Left → Right → Root)
    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }
}

// Main class
public class binarytreeUsingRecursion {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        Node root;

        System.out.println("Create Binary Tree:");
        root = bt.create();

        System.out.println("\nInorder Traversal:");
        bt.inorder(root);

        System.out.println("\nPreorder Traversal:");
        bt.preorder(root);

        System.out.println("\nPostorder Traversal:");
        bt.postorder(root);
        System.out.println("\n");
    }
}

