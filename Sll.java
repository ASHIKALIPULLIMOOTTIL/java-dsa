// Define a Node class
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Define a LinkedList class
class LinkedList {
    private Node head;

    // Function to create a linked list
    public void create(int[] dataArr) {
        for (int i = 0; i < dataArr.length; i++) {
            insertAtEnd(dataArr[i]);
        }
    }

    // Function to insert a node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Function to insert a node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Function to insert a node at a specific position
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node temp = head;
            int count = 1;
            while (temp != null && count < position - 1) {
                temp = temp.next;
                count++;
            }
            if (temp == null) {
                System.out.println("Invalid position!");
            } else {
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }
    }

    // Function to delete a node at the beginning
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("The list is empty!");
        } else {
            System.out.println("Deleted node data: " + head.data);
            head = head.next;
        }
    }

    // Function to delete a node at the end
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("The list is empty!");
        } else if (head.next == null) {
            System.out.println("Deleted node data: " + head.data);
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            System.out.println("Deleted node data: " + temp.next.data);
            temp.next = null;
        }
    }

    // Function to delete a node at a specific position
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("The list is empty!");
        } else if (position == 1) {
            System.out.println("Deleted node data: " + head.data);
            head = head.next;
        } else {
            Node temp = head;
            int count = 1;
            while (temp != null && count < position - 1) {
                temp = temp.next;
                count++;
            }
            if (temp == null || temp.next == null) {
                System.out.println("Invalid position!");
            } else {
                System.out.println("Deleted node data: " + temp.next.data);
                temp.next = temp.next.next;
            }
        }
    }

    // Function to display the linked list
    public void display() {
        if (head == null) {
            System.out.println("The list is empty!");
        } else {
            Node temp = head;
            System.out.print("Linked list: ");
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    }
}

// Main class to demonstrate the functionality
public class Sll {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Creating a linked list
        System.out.println("Creating a linked list with elements 1, 2, 3:");
        int[] initialData = {1, 2, 3};
        list.create(initialData);
        list.display();

        // Insert at the beginning
        System.out.println("\nInsert 0 at the beginning:");
        list.insertAtBeginning(0);
        list.display();

        // Insert at the end
        System.out.println("\nInsert 4 at the end:");
        list.insertAtEnd(4);
        list.display();

        // Insert at position
        System.out.println("\nInsert 10 at position 3:");
        list.insertAtPosition(10, 3);
        list.display();

        // Delete at the beginning
        System.out.println("\nDelete at the beginning:");
        list.deleteAtBeginning();
        list.display();

        // Delete at the end
        System.out.println("\nDelete at the end:");
        list.deleteAtEnd();
        list.display();

        // Delete at position
        System.out.println("\nDelete at position 2:");
        list.deleteAtPosition(2);
        list.display();
    }
}
