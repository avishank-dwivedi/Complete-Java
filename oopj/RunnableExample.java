package oopj;

// class MyThread extends Thread {
//     public void run() {
//         System.out.println("Thread is running...");
//     }
// }

// public class ThreadExample {
//     public static void main(String[] args) {
//         MyThread t1 = new MyThread();
//         t1.start(); // Start the thread
//     }
// }

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running using Runnable...");
    }
}

public class RunnableExample {
    public static void main(String[] args) {
        MyRunnable r1 = new MyRunnable();
        Thread t1 = new Thread(r1);
        t1.start();
    }
}
