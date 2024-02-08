class myThread extends Thread {
    Thread t = new Thread();

    public void onnulla() {
        System.out.println("Thread jumping....");
    }

    public void run() {
        System.out.println("Thread 1 running");
    }
}

public class Threads {
    public static void main(String[] args) throws InterruptedException {
        myThread t1 = new myThread();
        t1.run();
        t1.onnulla();
    }
}
