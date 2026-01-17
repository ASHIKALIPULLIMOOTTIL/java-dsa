import java.util.Scanner;

public class BinaryTreeArray {

    static final int MAX = 100;
    static int[] tree = new int[MAX];
    static int size = 0;

    // Insert a node
    static void insert(int value) {
        if (size >= MAX) {
            System.out.println("Tree is full! Cannot insert.");
            return;
        }
        tree[size] = value;
        size++;
        System.out.println("Node inserted successfully!");
    }

    // Level order traversal
    static void levelOrder() {
        if (size == 0) {
            System.out.println("Tree is empty!");
            return;
        }

        System.out.print("Level Order Traversal: ");
        for (int i = 0; i < size; i++) {
            System.out.print(tree[i] + " ");
        }
        System.out.println();
    }

    // Calculate height of the tree
    static int height() {
        if (size == 0)
            return 0;

        return (int) Math.ceil(Math.log(size + 1) / Math.log(2));
    }

    // Main method (Menu Driven)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, value;

        while (true) {
            System.out.println("\n--- Binary Tree Using Array Menu ---");
            System.out.println("1. Insert a node");
            System.out.println("2. Level order traversal");
            System.out.println("3. Calculate height of the tree");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    value = sc.nextInt();
                    insert(value);
                    break;

                case 2:
                    levelOrder();
                    break;

                case 3:
                    System.out.println("Height of the tree: " + height());
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}

