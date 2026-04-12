class Counter {
    int count = 0;

    // synchronized method
    synchronized void increment() {  
        count++;
    }
}

public class Synchronized {
    public static void main(String[] args) throws Exception {

        Counter c = new Counter();

        // Thread 1
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        // Thread 2
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        });

        // start threads
        t1.start();
        t2.start();

        // wait for threads to finish
        t1.join();
        t2.join();

        // final result
        System.out.println("Final Count: " + c.count);
        
        boolean a=Character.isAlphabetic('5');
        System.out.println(a);
    }
}
/*

Problem Without Synchronization (Race Condition)

👉 When multiple threads access and modify the same data at the same time, the result becomes unpredictable.

With Synchronization =>
    Thread 1 → lock → update → unlock  
    Thread 2 → wait → lock → update

        ✔ No overlap → correct result

*/
