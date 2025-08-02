
class MyThread extends Thread {
    static int count = 0;  
    public static synchronized void increment() {
        count++;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            increment();
        }
    }
}

public class ThreadSyncExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Final count: " + MyThread.count);
    }
}
