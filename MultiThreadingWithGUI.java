import javax.swing.*;
import java.awt.event.*;
class Thread1 extends Thread{
    public void run(){
        System.out.println("Thrikkakkakkara");
    }
    public void print(int N){
        for(int i =1;i<N;i++)
            System.out.println("Thrikkakkakkara");
    }
}
class Thread2 extends Thread{
    public void run(){
        System.out.println("Kochi");
    }
    public void print(int N){
        for(int i =1;i<N;i++)
            System.out.println("Kochi");
    }
}
class MultiThreadingWithGUI extends JFrame implements ActionListener{
    private JTextField t1;
    private JLabel l1;
    private JButton b1;
    public MultiThreadingWithGUI(){
    setSize(500,300);
        setLayout(null);
        l1 = new JLabel("Enter the number : ");
        l1.setBounds(50,50,250,40);
        add(l1);
        t1 = new JTextField();
        t1.setBounds(250,50,200,40);
        add(t1);
        b1 = new JButton("PRINT");
        b1.setBounds(200,150,100,30);
        add(b1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        Integer num = Integer.parseInt(t1.getText());
        System.out.println(num);
        Thread1 t1 = new Thread1();
        t1.start();
        t1.print(num);
        Thread2 t2 = new Thread2();
        t2.start();
        t2.print(num);
    }
    public static void main(String args[]){
        MultiThreadingWithGUI s1 = new MultiThreadingWithGUI();
        s1.setVisible(true);
    }
}
