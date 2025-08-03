class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackLinkedList {
    private Node top;

    public StackLinkedList() {
        this.top = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack Underflow!");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    // Display function
    public void display() {
        if (top == null) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.print("Stack elements: ");
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class StackUsingLinkedList {
    public static void main(String[] args) {
        StackLinkedList stack = new StackLinkedList();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();  // ✅ Show elements

        System.out.println("Popped: " + stack.pop());
        stack.display();
        System.out.println("Top element: " + stack.peek());
        
        System.out.println("Is Empty? " + stack.isEmpty());
    }
}

