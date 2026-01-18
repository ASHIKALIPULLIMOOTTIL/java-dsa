import java.util.Scanner;

class MaxHeap {
    int[] A;
    int n;
    int capacity;

    MaxHeap(int capacity) {
        this.capacity = capacity;
        A = new int[capacity + 1]; // 1-indexed heap
        n = 0;
    }

    // INSERT INTO MAX HEAP
    void insert(int value) {
        if (n == capacity) {
            System.out.println("Heap is full!");
            return;
        }

        n = n + 1;
        A[n] = value;
        int i = n;

        while (i > 1) {
            int parent = i / 2;
            if (A[parent] < A[i]) {
                swap(parent, i);
                i = parent;
            } else {
                return;
            }
        }
    }

    // MAX HEAPIFY (as in image)
    void maxHeapify(int i) {
        int largest = i;
        int l = 2 * i;
        int r = 2 * i + 1;

        if (l <= n && A[l] > A[largest])
            largest = l;

        if (r <= n && A[r] > A[largest])
            largest = r;

        if (largest != i) {
            swap(i, largest);
            maxHeapify(largest);
        }
    }

    // DELETE ROOT (MAX ELEMENT)
    void deleteMax() {
        if (n == 0) {
            System.out.println("Heap is empty!");
            return;
        }

        System.out.println("Deleted element: " + A[1]);
        A[1] = A[n];
        n = n - 1;
        maxHeapify(1);
    }

    // HEAP SORT
    void heapSort() {
        int size = n;

        for (int i = n / 2; i >= 1; i--) {
            maxHeapify(i);
        }

        System.out.print("Sorted elements: ");
        for (int i = n; i >= 1; i--) {
            swap(1, i);
            System.out.print(A[i] + " ");
            n--;
            maxHeapify(1);
        }
        System.out.println();
        n = size;
    }

    // DISPLAY HEAP
    void display() {
        if (n == 0) {
            System.out.println("Heap is empty!");
            return;
        }
        System.out.print("Heap elements: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    void swap(int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}

public class MaxHeapDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaxHeap heap = new MaxHeap(50);

        while (true) {
            System.out.println("\n--- MAX HEAP MENU ---");
            System.out.println("1. Insert");
            System.out.println("2. Delete Max");
            System.out.println("3. Heap Sort");
            System.out.println("4. Display Heap");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    heap.insert(sc.nextInt());
                    break;

                case 2:
                    heap.deleteMax();
                    break;

                case 3:
                    heap.heapSort();
                    break;

                case 4:
                    heap.display();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

