import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
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
       if(root == null) return;

       inorder(root.left);
       System.out.print(root.data + " ");
       inorder(root.right);
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

    // Level Order Traversal
void levelOrder(Node root) {

    if (root == null) {
        return;
    }

    Queue<Node> q = new LinkedList<>();

    q.add(root);

    while (!q.isEmpty()) {

        Node current = q.poll();

        System.out.print(current.data + " ");

        if (current.left != null) {
            q.add(current.left);
        }

        if (current.right != null) {
            q.add(current.right);
        }
    }
}

void I_preOrder(Node root) {

    if (root == null) {
        return;
    }

    Deque<Node> stack = new ArrayDeque<>();

    stack.push(root);

    while (!stack.isEmpty()) {

        Node current = stack.pop();

        System.out.print(current.data + " ");

        // Push right first
        if (current.right != null) {
            stack.push(current.right);
        }

        // Push left second
        if (current.left != null) {
            stack.push(current.left);
        }
    }
}

void I_inOrder(Node root) {

    Deque<Node> stack = new ArrayDeque<>();

    Node current = root;

    while (current != null || !stack.isEmpty()) {

        // Go to extreme left
        while (current != null) {
            stack.push(current);
            current = current.left;
        }

        // Process node
        current = stack.pop();
        System.out.print(current.data + " ");

        // Move to right subtree
        current = current.right;
    }
}

void I_postOrder1(Node root) {

    if (root == null) {
        return;
    }

    Deque<Node> stack1 = new ArrayDeque<>();
    Deque<Node> stack2 = new ArrayDeque<>();

    stack1.push(root);

    while (!stack1.isEmpty()) {

        Node current = stack1.pop();

        stack2.push(current);

        if (current.left != null) {
            stack1.push(current.left);
        }

        if (current.right != null) {
            stack1.push(current.right);
        }
    }

    while (!stack2.isEmpty()) {
        System.out.print(stack2.pop().data + " ");
    }
}

void I_postOrder2(Node root) {

    Deque<Node> stack = new ArrayDeque<>();

    Node current = root;
    Node lastVisited = null;

    while (current != null || !stack.isEmpty()) {

        // Go left
        while (current != null) {
            stack.push(current);
            current = current.left;
        }

        Node peekNode = stack.peek();

        // If right child exists and not processed
        if (peekNode.right != null && lastVisited != peekNode.right) {
            current = peekNode.right;
        }
        else {
            System.out.print(peekNode.data + " ");
            lastVisited = stack.pop();
        }
    }
}
}

// Main class
public class a_binarytree_All {
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

        System.out.println("\nLevel Order Traversal:");
        bt.levelOrder(root);

        System.out.println("\niterative preOrder Traversal:");
        bt.I_preOrder(root);
        System.out.println("\n");
    }
}

/*
Steps of level order:

Put root into queue
Remove front node
Print it
Add its children
Repeat until queue becomes empty
*/