class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left=right=null;
    }
}

public class BST {

  static  Node root=null;

    static Node insert(Node root, int value) {

        if (root == null)
            return new Node(value);

        if (value < root.data)
            root.left = insert(root.left, value);

        else if (value > root.data)
            root.right = insert(root.right, value);

        return root;
    }

   static void inorder(Node root) {

        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

  static int ceil(Node root, int key) {

    int ans = -1;

    while (root != null) {

        // Exact match
        if (root.data == key)
            return root.data;

        // Possible ceil
        if (key < root.data) {
            ans = root.data;
            root = root.left;
        }

        // Move right
        else {
            root = root.right;
        }
    }

    return ans;
}

static int floor(Node root, int key) {

        int ans = -1;

        while (root != null) {

            // Exact match
            if (root.data == key)
                return root.data;

            // Move left
            if (key < root.data) {
                root = root.left;
            }

            // Possible floor
            else {
                ans = root.data;
                root = root.right;
            }
        }

        return ans;
    }

  static  boolean search(Node root, int key) {

    if (root == null)
        return false;

    if (root.data == key)
        return true;

    if (key < root.data)
        return search(root.left, key);

    return search(root.right, key);
}

    public static void main(String[] args) {

        //BST tree = new BST();

        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 70);
        root = insert(root, 20);
        root = insert(root, 40);
        
        inorder(root);
        System.out.println(search(root, 10));
        System.out.println(ceil(root,21));
        System.out.println(floor(root,21));
    
    

    }
}