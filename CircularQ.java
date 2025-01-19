public class CircularQ {
    private int[] queue;
    private int front, rear, size;

    public CircularQ(int maxSize) {
        queue = new int[maxSize];
        front = -1;
        rear = -1;
        size = maxSize;
    }

    // Enqueue operation
    public void enqueue(int value) {
        if ((rear + 1) % size == front) {
            System.out.println("Queue Overflow");
            return;
        }

        if (front == -1 && rear == -1) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % size;
        }

        queue[rear] = value;
        System.out.println("Inserted: " + value);
    }

    // Dequeue operation
    public void dequeue() {
        if (front == -1) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Deleted: " + queue[front]);

        if (front == rear) {
            front = rear = -1; // Queue becomes empty
        } else {
            front = (front + 1) % size;
        }
    }

    // Display operation
    public void display() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.print("Queue elements: ");
        int i = front;
        while (i != rear) {
            System.out.print(queue[i] + " ");
            i = (i + 1) % size;
        }
        System.out.println(queue[i]); // Print the last element
    }

    // Main method for demonstration
    public static void main(String[] args) {
        CircularQ cq = new CircularQ(3); // Size of the queue is 3

        // Demonstration
        cq.enqueue(10); // Insert 10
        cq.enqueue(20); // Insert 20
        cq.enqueue(30); // Insert 30
        cq.enqueue(40); // Attempt to insert 40 (should overflow)

        cq.display(); // Display queue

        cq.dequeue(); // Remove 10
        cq.dequeue(); // Remove 20

        cq.display(); // Display queue

        cq.enqueue(40); // Insert 40
        cq.enqueue(50); // Insert 50 (should overflow if queue was not circular)

        cq.display(); // Final display
    }
}
