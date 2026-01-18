import java.util.Scanner;

class PriorityQueueHeap {
    int[] heap;
    int size;
    int capacity;

    PriorityQueueHeap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity + 1]; // 1-indexed
        size = 0;
    }

    // INSERT (ENQUEUE)
    void insert(int value) {
        if (size == capacity) {
            System.out.println("Priority Queue is full!");
            return;
        }

        size++;
        heap[size] = value;
        int i = size;

        // Heapify Up
        while (i > 1) {
            int parent = i / 2;
            if (heap[parent] < heap[i]) {
                swap(parent, i);
                i = parent;
            } else {
                break;
            }
        }
        System.out.println("Inserted successfully!");
    }

    // DELETE HIGHEST PRIORITY (DEQUEUE)
    void delete() {
        if (size == 0) {
            System.out.println("Priority Queue is empty!");
            return;
        }

        System.out.println("Deleted element: " + heap[1]);
        heap[1] = heap[size];
        size--;

        maxHeapify(1);
    }

    // MAX HEAPIFY
    void maxHeapify(int i) {
        int largest = i;
        int left = 2 * i;
        int right = 2 * i + 1;

        if (left <= size && heap[left] > heap[largest])
            largest = left;

        if (right <= size && heap[right] > heap[largest])
            largest = right;

        if (largest != i) {
            swap(i, largest);
            maxHeapify(largest);
        }
    }

    // PEEK (HIGHEST PRIORITY)
    void peek() {
        if (size == 0) {
            System.out.println("Priority Queue is empty!");
        } else {
            System.out.println("Highest priority element: " + heap[1]);
        }
    }

    // DISPLAY
    void display() {
        if (size == 0) {
            System.out.println("Priority Queue is empty!");
            return;
        }
        System.out.print("Priority Queue elements: ");
        for (int i = 1; i <= size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }

    void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}

public class PriorityQueueUsingHeap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueueHeap pq = new PriorityQueueHeap(50);

        while (true) {
            System.out.println("\n--- PRIORITY QUEUE MENU ---");
            System.out.println("1. Insert");
            System.out.println("2. Delete (Highest Priority)");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value (priority): ");
                    pq.insert(sc.nextInt());
                    break;

                case 2:
                    pq.delete();
                    break;

                case 3:
                    pq.peek();
                    break;

                case 4:
                    pq.display();
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

