import java.util.Scanner;

class Display {
    public synchronized void print(String msg, int N, int begin) {
        System.out.println("The " + msg + " numbers from " + begin + " to " + N + " are ");
        for (int i = begin; i <= N; i += 2) {
            System.out.println(i);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Threads extends Thread {
    private Display d;
    private String msg;
    private int N, begin;

    public Threads(Display d, String msg, int N, int begin) {
        this.d = d;
        this.msg = msg;
        this.N = N;
        this.begin = begin;
    }

    public void run() {
        d.print(msg, N, begin);
    }
}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Display d = new Display();
        System.out.print("Enter the limit : ");
        int N = sc.nextInt();
        Threads t1 = new Threads(d, "even", N, 2);
        Threads t2 = new Threads(d, "odd", N, 1);
        t1.start();
        t2.start();
        sc.close();
    }
}
