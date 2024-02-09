//Extending Thread Class
public class CreateThread1 extends Thread {
    public void run() {
        System.out.println("Thread is jumpinggggg......");
    }

    public static void main(String[] args) {
        CreateThread1 t1 = new CreateThread1();
        t1.start();
    }
}
