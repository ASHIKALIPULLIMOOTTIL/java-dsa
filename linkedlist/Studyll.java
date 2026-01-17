class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Linkedlist {
    private Node head = null;
    private Node temp;

    public void Create(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = temp = newnode;
        } else {
            temp.next = newnode;
            temp = newnode;
        }
    }

    public void insertatp(int data, int pos) {
        if (pos <= 0) {
            System.out.println("Invalid position!");
            return;
        }
        Node newnode = new Node(data);
        if (pos == 1) {
            newnode.next = head;
            head = newnode;
        } else {
            temp = head;
            int count = 1;
            while (temp != null && count < pos - 1) {
                temp = temp.next;
                count++;
            }
            if (temp == null) {
                System.out.println("Invalid position!");
            } else {
                newnode.next = temp.next;
                temp.next = newnode;
            }
        }
    }

    public void deleteatp(int pos) {
        if (pos <= 0) {
            System.out.println("Invalid position!");
            return;
        }
        if (head == null) {
            System.out.println("List is empty");
        } else if (pos == 1) {
            head = head.next;
        } else {
            temp = head;
            int count = 1;
            while (temp != null && count < pos - 1) {
                temp = temp.next;
                count++;
            }
            if (temp == null || temp.next == null) {
                System.out.println("Invalid position!");
            } else {
                temp.next = temp.next.next;
            }
        }
    }

    public void Print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public boolean search(int target) {
        temp = head;
        while (temp != null) {
            if (temp.data == target) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node NEXT;
        while (current != null) {
            NEXT = current.next;
            current.next = prev;
            prev = current;
            current = NEXT;
        }
        head = prev;
    }

    public void sort() {
        if (head == null || head.next == null) {
            return;
        }
        Node current = head;
        while (current != null) {
            Node NEXT = current.next;
            while (NEXT != null) {
                if (current.data > NEXT.data) {
                    int temp = current.data;
                    current.data = NEXT.data;
                    NEXT.data = temp;
                }
                NEXT = NEXT.next;
            }
            current = current.next;
        }
    }

    public int length() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}

public class Studyll {
    public static void main(String args[]) {
        Linkedlist list = new Linkedlist();
        list.Create(10);
        list.Create(20);
        list.Create(30);
        list.Create(40);
        list.Print(); // Output: 10 20 30 40

        list.insertatp(15, 2);
        list.Print(); // Output: 10 15 20 30 40

        list.deleteatp(1);
        list.Print(); // Output: 15 20 30 40

        list.deleteatp(4);
        list.Print(); // Output: 15 20 30

        list.insertatp(35, 4);
        list.Print(); // Output: 15 20 30 35

        System.out.println("Length of list: " + list.length()); // Output: 4

        System.out.println("Search 20: " + list.search(20)); // Output: true
        System.out.println("Search 50: " + list.search(50)); // Output: false

        list.reverse();
        list.Print(); // Output: 35 30 20 15

        list.sort();
        list.Print(); // Output: 15 20 30 35
    }
}
