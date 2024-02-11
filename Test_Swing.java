import javax.swing.*;
import java.awt.event.*;
class Test extends JFrame implements ActionListener{
    private JButton b1;
    private JLabel l1;
    public Test(){
        setSize(640,480);
        setLayout(null);
        b1 = new JButton("Click Me");
        b1.setBounds(100,100,100,30);
        add(b1);
        l1 = new JLabel("Test");
        l1.setBounds(300,100,150,30);
        add(l1);
        b1.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        l1.setText("I am touched!!");
    }
    public static void main(String args[]){
        Test t = new Test();
        t.setVisible(true);
    }
}
