// WAP to create a thread that prints a message and then sleeps for 6 seconds before starting another thread.
class MyThread extends Thread {
    String message;

    MyThread(String msg) {
        message = msg;
    }

    public void run() {
        System.out.println(message + " is running...");
    }
}

public class ThreadExample2 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1");
        MyThread t2 = new MyThread("Thread 2");
        t1.start();
        try {
            Thread.sleep(6000);
        } catch (Exception e) {
            System.out.println("Main thread interrupted");
        }

        t2.start();
    }
}
