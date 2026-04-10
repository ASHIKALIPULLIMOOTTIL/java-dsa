/*
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}

public class MyThread1 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();   // start thread
    }
}

*/

class MyRunnable implements Runnable {
    public void run() {
       
        System.out.println("Runnable thread1 running");
   
    }
}

public class MyThread2 {
    public static void main(String[] args) {
        MyRunnable m=new MyRunnable();
        Thread t = new Thread(m);
        Thread mt = Thread.currentThread();
        try {
          t.start();
         // t.join();     //wait for child
         System.out.println("Runnable thread2 running");
             mt.join(); //wait for main(current thread)
       } catch (InterruptedException e) {
           e.printStackTrace();
               }

           
      }
    }


