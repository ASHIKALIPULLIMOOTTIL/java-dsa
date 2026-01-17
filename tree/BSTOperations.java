import java.util.Scanner;

// Node class
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

// BST class
class BinarySearchTree {

    // Insert a node
    Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    // Find minimum value node (used in delete)
    Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Delete a node
    Node delete(Node root, int data) {
        if (root == null) {
            return root;
        }
            //Search for the Node
        if (data < root.data) {
            root.left = delete(root.left, data);
        } else if (data > root.data) {
            root.right = delete(root.right, data);
        } else {
            // Case 1 & 2: node with one or no child "Return the child that exists"
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // Case 3: node with two children
            Node temp = findMin(root.right);
            root.data = temp.data;
            root.right = delete(root.right, temp.data);
        }
        return root;
    }

    // Inorder traversal (Sorted order)
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Count leaf nodes
    int countLeafNodes(Node root) {
        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return 1;

        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }
}

// Main class
public class BSTOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();
        Node root = null;

        while (true) {
            System.out.println("\n--- Binary Search Tree Menu ---");
            System.out.println("1. Insert a node");
            System.out.println("2. Delete a node");
            System.out.println("3. Sort (In-order traversal)");
            System.out.println("4. Print number of leaf nodes");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int insertVal = sc.nextInt();
                    root = bst.insert(root, insertVal);
                    System.out.println("Node inserted successfully!");
                    break;

                case 2:
                    System.out.print("Enter value to delete: ");
                    int deleteVal = sc.nextInt();
                    root = bst.delete(root, deleteVal);
                    System.out.println("Node deleted successfully (if it existed).");
                    break;

                case 3:
                    System.out.print("Sorted order (In-order traversal): ");
                    bst.inorder(root);
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Number of leaf nodes: " +
                            bst.countLeafNodes(root));
                    break;

                case 5:
                    System.out.println("Exiting the program.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}

