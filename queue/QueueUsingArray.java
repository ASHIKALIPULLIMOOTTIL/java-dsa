class QueueArray {
    private int queue[];
    private int front;
    private int rear;
    private int size;

    QueueArray(int size) {
        this.size = size;
        queue = new int[size]; // Correct array initialization
        front = -1;
        rear = -1;
    }

    // Enqueue operation
    void enqueue(int val) {
        if (rear == size - 1) { // size instead of MAX
            System.out.println("Queue Overflow");
        } 
        else if (front == -1 && rear == -1) { // Empty queue
            front = rear = 0;
            queue[rear] = val;
            System.out.println("Value inserted successfully");
        } 
        else {
            rear++;
            queue[rear] = val;
            System.out.println("Value inserted successfully");
        }
    }

    // Dequeue operation
    void dequeue() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue Underflow");
        } 
        else if (front == rear) { // Only one element
            System.out.println("Deleted element: " + queue[front]);
            front = rear = -1;
        } 
        else {
            System.out.println("Deleted element: " + queue[front]);
            front++;
        }
    }

    // Display operation
    void display() {
        if (front == -1 && rear == -1) {
            System.out.println("Queue is empty");
        } 
        else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }
}

// Main class to test Queue
class QueueUsingArray {
    public static void main(String[] args) {
        QueueArray q = new QueueArray(5);
        
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        
        q.dequeue();
        q.display();
        
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60); // This should trigger overflow
        q.display();
    }
}

