/* import java.util.Stack;
public class stackex {
    public static void main(String args[]){
           Stack<Integer> st= new Stack<Integer>();
           st.push(2);
           st.push(5);
           st.pop();
           System.out.println(st.peek());
           System.out.println(st.empty());
           System.out.println(st.search(2));
           System.out.println(st); 
    }
    
}
*/
public class stackex {
    private int[] items;
    private int top;
    private int capacity;

    public stackex(int size) {
        items = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int item) {
        if (isFull()) {
            throw new RuntimeException("Stack is full");
        }
        items[++top] = item;
        System.out.println("Pushed item: " + item);
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return items[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return items[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int search(int target) {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        for (int i = top; i >= 0; i--) {
            if (items[i] == target) {
                return top - i + 1; // Position from the top (1-based index)
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        stackex stack = new stackex(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("After pop, top is now: " + stack.peek());

        System.out.println("Searching for 20: Position " + stack.search(20));
        System.out.println("Searching for 50: Position " + stack.search(50));
    }
}

