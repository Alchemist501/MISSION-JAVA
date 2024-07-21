import javax.swing.*;
import java.awt.event.*;

class Division extends JFrame implements ActionListener {
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JLabel l4;
    private JLabel l5;
    private JLabel l6;
    private JTextField t1;
    private JTextField t2;
    private JButton b1;

    Division() {
        setSize(1000, 800);
        setLayout(null);
        l1 = new JLabel("Enter number 1 : ");
        l2 = new JLabel("Enter number 2 : ");
        l3 = new JLabel("RESULT  ");
        l4 = new JLabel("");
        l5 = new JLabel("REMARKS : ");
        l6 = new JLabel("");
        t1 = new JTextField();
        t2 = new JTextField();
        b1 = new JButton("DIVIDE");
        l1.setBounds(100, 100, 200, 30);
        l2.setBounds(100, 250, 200, 30);
        l3.setBounds(100, 400, 200, 30);
        l4.setBounds(250, 400, 200, 30);
        l5.setBounds(100, 550, 200, 30);
        l6.setBounds(250, 550, 200, 30);
        t1.setBounds(250, 100, 100, 30);
        t2.setBounds(250, 250, 100, 30);
        b1.setBounds(400, 170, 100, 40);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(t1);
        add(t2);
        add(b1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            Integer num1 = Integer.parseInt(t1.getText());
            Integer num2 = Integer.parseInt(t2.getText());
            Integer Result = num1 / num2;
            if (num2 == 0 || num1 == 0) {
                l6.setText("Arithmetic Exception");
                throw new ArithmeticException();
            }
            l4.setText(Result.toString());
        } catch (NumberFormatException nfe) {
            l6.setText("NumberFormatException");
        } catch (ArithmeticException ae) {
            l6.setText("ArithmeticException");
        }
    }

    public static void main(String args[]) {
        Division d = new Division();
        d.setVisible(true);
    }
}
