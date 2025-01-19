/*import java.util.LinkedList;
import java.util.Queue;

public class Squeue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.remove();
        queue.add(4);
        queue.remove();
        System.out.println(queue); 
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());
    }
}*/

public class Squeue {
    private static final int MAX = 5; // Maximum size of the queue
    private int[] queue = new int[MAX];
    private int front = -1;
    private int rear = -1;

    // Enqueue operation
    public void enqueue(int value) {
        if (rear == MAX - 1) {
            System.out.println("Queue Overflow");
        } else if (front == -1 && rear == -1) { // First element
            front = rear = 0;
            queue[rear] = value;
            System.out.println("Value inserted successfully: " + value);
        } else {
            rear++;
            queue[rear] = value;
            System.out.println("Value inserted successfully: " + value);
        }
    }

    // Dequeue operation
    public void dequeue() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue Underflow");
        } else if (front == rear) { // Single element case
            System.out.println("Deleted element: " + queue[front]);
            front = rear = -1;
        } else {
            System.out.println("Deleted element: " + queue[front]);
            front++;
        }
    }

    // Display operation
    public void display() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Queue elements are:");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    // Main method to demonstrate sequential operations
    public static void main(String[] args) {
        Squeue queue = new Squeue();

        // Sequential operations
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();

        queue.dequeue();
        queue.display();

        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60); // This will trigger overflow
        queue.display();

        queue.dequeue();
        //queue.dequeue();
        queue.display();
        queue.enqueue(80);
    }
}


