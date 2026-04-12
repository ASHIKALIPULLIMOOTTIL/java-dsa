class Box<T> {
    T data;

    void set(T data) {
        this.data = data;
    }

    T get() {
        return data;
    }
}

public class Generic {
    public static void main(String[] args) {
        Box<Integer> b = new Box<>();
        b.set(10);
       // b.set(10.2);
        System.out.println(b.get());
    }
}