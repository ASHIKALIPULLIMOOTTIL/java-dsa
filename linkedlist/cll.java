class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {
    private Node head = null;

    // Function to create a circular linked list
    public void create(int[] values) {
        for (int i = 0; i < values.length; i++) { // Using a traditional for loop
            int value = values[i];
            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                newNode.next = head;
            } else {
                Node temp = head;
                while (temp.next != head) {
                    temp = temp.next;
                }
                temp.next = newNode;
                newNode.next = head;
            }
        }
    }

    // Insert at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
    }

    // Insert at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            newNode.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Insert at a specific position
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        if (position == 1) {
            insertAtBeginning(data);
        } else {
            Node temp = head;
            int i = 1;
            while (i < position - 1 && temp.next != head) {
                temp = temp.next;
                i++;
            }
            if (temp.next == head && i != position - 1) {
                System.out.println("Invalid position!");
            } else {
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }
    }

    // Delete at the beginning
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("The list is empty!");
        } else if (head.next == head) {
            System.out.println("Deleted node data: " + head.data);
            head = null;
        } else {
            Node temp = head;
            Node last = head;

            while (last.next != head) {
                last = last.next;
            }
            head = head.next;
            last.next = head;
            System.out.println("Deleted node data: " + temp.data);
        }
    }

    // Delete at the end
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("The list is empty!");
        } else if (head.next == head) {
            System.out.println("Deleted node data: " + head.data);
            head = null;
        } else {
            Node temp = head;
            Node prev = null;

            while (temp.next != head) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = head;
            System.out.println("Deleted node data: " + temp.data);
        }
    }

    // Delete at a specific position
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("The list is empty!");
        } else if (position == 1) {
            deleteAtBeginning();
        } else {
            Node temp = head;
            Node nextNode;
            int i = 1;

            while (i < position - 1 && temp.next != head) {
                temp = temp.next;
                i++;
            }
            if (temp.next == head) {
                System.out.println("Invalid position!");
            } else {
                nextNode = temp.next;
                temp.next = nextNode.next;
                System.out.println("Deleted node data: " + nextNode.data);
            }
        }
    }

    // Display the circular linked list
    public void display() {
        if (head == null) {
            System.out.println("The list is empty!");
        } else {
            Node temp = head;
            System.out.print("Circular Linked List: ");
            do {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            } while (temp != head);
            System.out.println("(head)");
        }
    }
}

public class cll {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        // Step 1: Create a circular linked list
        list.create(new int[]{10, 20, 30, 40});
        System.out.println("After creating the list:");
        list.display();

        // Step 2: Insert at the beginning
        list.insertAtBeginning(5);
        System.out.println("After inserting 5 at the beginning:");
        list.display();

        // Step 3: Insert at the end
        list.insertAtEnd(50);
        System.out.println("After inserting 50 at the end:");
        list.display();

        // Step 4: Insert at position
        list.insertAtPosition(25, 3);
        System.out.println("After inserting 25 at position 3:");
        list.display();

        // Step 5: Delete at the beginning
        list.deleteAtBeginning();
        System.out.println("After deleting the first node:");
        list.display();

        // Step 6: Delete at the end
        list.deleteAtEnd();
        System.out.println("After deleting the last node:");
        list.display();

        // Step 7: Delete at position
        list.deleteAtPosition(2);
        System.out.println("After deleting the node at position 2:");
        list.display();
    }
}

