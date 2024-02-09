import java.util.Random;

class OddThread extends Thread {
    public void run(int num) {
        System.out.println("The Odd Numbers are : ");
        for (int i = 1; i < num; i += 2)
            System.out.println(i);
    }
}

class EvenThread extends Thread {
    public void run(int m) {
        System.out.println("The Even Numbers are : ");
        for (int i = 2; i < m; i += 2)
            System.out.println(i);
    }
}

public class NumbersPrinting {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(1000 - 100 + 1) + 100; // (max-min+1)+min
        System.out.println("The generated number is : " + num);
        if (num % 2 == 0) {
            EvenThread et = new EvenThread();
            et.run(num);
        } else {
            OddThread ot = new OddThread();
            ot.run(num);
        }
    }
}
