import java.lang.Runnable;

public class CreateThread2 implements Runnable {
    public void run() {
        System.out.println("Thread is jumpinggggg......");
    }

    public static void main(String[] args) {
        CreateThread2 t2 = new CreateThread2();
        Thread t = new Thread(t2);
        t.start();
    }
}
