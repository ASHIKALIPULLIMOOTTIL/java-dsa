class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    public void run() {
        int count = 1;
          
        while (true) {
            System.out.println(count++ + " " + getName());

            try {
                Thread.sleep(1000); // sleep for 0.5 sec
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrupted");
                break; // exit loop after interrupt
            }
        }
    }
}

public class ThreadTest {

    public static void main(String[] args) {

        MyThread t = new MyThread("Child Thread");

        t.setDaemon(true);   // Ends when main thread ends//setDaemon(true):
                                                            //Must be called before start()
                                                            //Called using object, not class
        t.start();
/* 
        int count = 1;

        while (count <= 10) {
            System.out.println(count++ + " Main");

            Thread.yield(); // give chance to other thread (Static Methods Called using Thread class)

            try {
                Thread.sleep(300);
            } catch (Exception e) {}
        }
*/
        // interrupt the child thread
       // t.interrupt();

        System.out.println("Main thread ends");
    }
}
