import java.util.*;

// Node class
class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

// Pair class
class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
        this.node = node;
        this.state = state;
    }
}

// Binary Tree class
class BinaryTree {

    // Preorder, Inorder, Postorder in one traversal
    void allTraversal(Node root) {

        if (root == null) {
            return;
        }

        List<Integer> preorder = new ArrayList<>();
        List<Integer> inorder = new ArrayList<>();
        List<Integer> postorder = new ArrayList<>();

        Deque<Pair> stack = new ArrayDeque<>();

        stack.push(new Pair(root, 1));

        while (!stack.isEmpty()) {

            Pair current = stack.pop();

            // PREORDER
            if (current.state == 1) {

                preorder.add(current.node.data);

                current.state++;

                stack.push(current);

                if (current.node.left != null) {
                    stack.push(new Pair(current.node.left, 1));
                }
            }

            // INORDER
            else if (current.state == 2) {

                inorder.add(current.node.data);

                current.state++;

                stack.push(current);

                if (current.node.right != null) {
                    stack.push(new Pair(current.node.right, 1));
                }
            }

            // POSTORDER
            else {

                postorder.add(current.node.data);
            }
        }

        // Print traversals
        System.out.println("Preorder Traversal:");
        System.out.println(preorder);

        System.out.println("\nInorder Traversal:");
        System.out.println(inorder);

        System.out.println("\nPostorder Traversal:");
        System.out.println(postorder);
    }
}

// Main class
public class b_all_In1_Traversal {

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

        BinaryTree bt = new BinaryTree();

        bt.allTraversal(root);
    }
}