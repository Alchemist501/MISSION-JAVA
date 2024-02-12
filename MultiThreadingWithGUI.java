import javax.swing.*;
import java.awt.event.*;

class display {
    public void print(String msg, int N) {
        for (int i = 0; i < N; i++)
            System.out.println(msg);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }
}

class Threads extends Thread {
    private display d;
    private String msg;
    private int N;

    public Threads(display d, String msg, int N) {
        this.d = d;
        this.msg = msg;
        this.N = N;
    }

    public void run() {
        d.print(msg, N);
    }
}

class MultiThreadingWithGUI extends JFrame implements ActionListener {
    private JTextField t1;
    private JLabel l1;
    private JButton b1;

    public MultiThreadingWithGUI() {
        setSize(500, 300);
        setLayout(null);
        l1 = new JLabel("Enter the number : ");
        l1.setBounds(50, 50, 250, 40);
        add(l1);
        t1 = new JTextField();
        t1.setBounds(250, 50, 200, 40);
        add(t1);
        b1 = new JButton("PRINT");
        b1.setBounds(200, 150, 100, 30);
        add(b1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        Integer num = Integer.parseInt(t1.getText());
        System.out.println(num);
        Threads t1 = new Threads(new display(), "Thrikkakkara", num);
        t1.start();
        Threads t2 = new Threads(new display(), "Kochi", num);
        t2.start();
    }

    public static void main(String args[]) {
        MultiThreadingWithGUI s1 = new MultiThreadingWithGUI();
        s1.setVisible(true);
    }
}
