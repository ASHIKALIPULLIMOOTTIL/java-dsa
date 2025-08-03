class StackArray {
    private int maxSize;
    private int[] stack;
    private int top;

    public StackArray(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow!");
        } else {
            stack[++top] = value;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow!");
            return -1;
        } else {
            return stack[top--];
        }
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty!");
            return -1;
        } else {
            return stack[top];
        }
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    //  Display function
    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty!");
        } else {
            System.out.print("Stack elements: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        StackArray stack = new StackArray(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();  // Show elements

        stack.pop();
        stack.display();
        System.out.println("Top element: " + stack.peek());
        System.out.println("Is Empty? " + stack.isEmpty());
    }
}

