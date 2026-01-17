
    // Node class
    class Node {
        int data;
        Node prev, next;

       public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    class DoublyLinkedList {
    private Node head;

    // Function to create a doubly linked list
    public void create(int[] values) {
        for (int i=0; i<values.length ; i++) {
            insertAtEnd(values[i]);
        }
    }

    // Function to insert a node at the beginning
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
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
            newNode.prev = temp;
        }
    }

    // Function to insert a node at a specific position
    public void insertAtPosition(int data, int position) {
        if (position == 1) {
            insertAtBeginning(data);
        } else {
            Node newNode = new Node(data);
            Node temp = head;
            int count = 1;
            while (count < position - 1 && temp != null) {
                temp = temp.next;
                count++;
            }
            if (temp == null) {
                System.out.println("Invalid position!");
            } else {
                newNode.next = temp.next;
                if (temp.next != null) {
                    temp.next.prev = newNode;
                }
                temp.next = newNode;
                newNode.prev = temp;
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
            if (head != null) {
                head.prev = null;
            }
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
            while (temp.next != null) {
                temp = temp.next;
            }
            System.out.println("Deleted node data: " + temp.data);
            temp.prev.next = null;
        }
    }

    // Function to delete a node at a specific position
    public void deleteAtPosition(int position) {
        if (head == null) {
            System.out.println("The list is empty!");
        } else if (position == 1) {
            deleteAtBeginning();
        } else {
            Node temp = head;
            int count = 1;
            while (count < position && temp != null) {
                temp = temp.next;
                count++;
            }
            if (temp == null) {
                System.out.println("Invalid position!");
            } else {
                System.out.println("Deleted node data: " + temp.data);
                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                }
                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                }
            }
        }
    }

    // Function to traverse the list
    public void traverse() {
        if (head == null) {
            System.out.println("The list is empty!");
        } else {
            Node temp = head;
            System.out.print("Doubly Linked List: ");
            while (temp != null) {
                System.out.print(temp.data + " <-> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    }
    }

    public class DLL {
        public static void main(String[] args) {
            DoublyLinkedList dll = new DoublyLinkedList();
    
            // Create list
            dll.create(new int[]{10, 20, 30});
            System.out.println("After creation:");
            dll.traverse();
    
            // Insert at beginning
            dll.insertAtBeginning(5);
            System.out.println("After inserting 5 at the beginning:");
            dll.traverse();
    
            // Insert at end
            dll.insertAtEnd(40);
            System.out.println("After inserting 40 at the end:");
            dll.traverse();
    
            // Insert at position
            dll.insertAtPosition(25, 3);
            System.out.println("After inserting 25 at position 3:");
            dll.traverse();
    
            // Delete at beginning
            dll.deleteAtBeginning();
            System.out.println("After deleting at the beginning:");
            dll.traverse();
    
            // Delete at end
            dll.deleteAtEnd();
            System.out.println("After deleting at the end:");
            dll.traverse();
    
            // Delete at position
            dll.deleteAtPosition(2);
            System.out.println("After deleting at position 2:");
            dll.traverse();
        }
    }
    
