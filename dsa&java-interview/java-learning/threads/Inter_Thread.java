class Shared {
    int data;
    boolean hasData = false;

    synchronized void produce(int value) throws InterruptedException {
        while (hasData) {
            wait(); // wait if data not consumed
        }

        data = value;
        System.out.println("Produced: " + data);
        hasData = true;

        notify(); // notify consumer
    }

    synchronized void consume() throws InterruptedException {
        while (!hasData) {
            wait(); // wait if no data
        }

        System.out.println("Consumed: " + data);
        hasData = false;

        notify(); // notify producer
    }
}

class Producer extends Thread {
    Shared s;

    Producer(Shared s) {
        this.s = s;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                s.produce(i);
            }
        } catch (Exception e) {}
    }
}

class Consumer extends Thread {
    Shared s;

    Consumer(Shared s) {
        this.s = s;
    }

    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                s.consume();
            }
        } catch (Exception e) {}
    }
}

public class Inter_Thread{
    public static void main(String[] args) {
        Shared s = new Shared();

        new Producer(s).start();
        new Consumer(s).start();
    }
}