import javax.swing.*;
import java.awt.event.*;
class MiniCalculator extends JFrame implements ActionListener{
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JLabel l4;
    private JTextField t1;
    private JTextField t2;
    public MiniCalculator (){
        setSize(1000,800);
        setLayout(null);
        l1 = new JLabel("Number 1 : ");
        l2 = new JLabel("Number 2 : ");
        l3 = new JLabel("Result : ");
        l4 = new JLabel("");
        t1 = new JTextField();
        t2 = new JTextField();
        
        l1.setBounds(100,100,100,30);
        t1.setBounds(200,100,100,30);
        l2.setBounds(100,200,100,30);
        t2.setBounds(200,200,100,30);
        
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        
        b1 = new JButton("Add");
        b1.setBounds(100,300,100,100);
        b1.addActionListener(this);
        b2 = new JButton("Subtract");
        b2.setBounds(250,300,100,100);
        b2.addActionListener(this);
        b3 = new JButton("Multiply");
        b3.setBounds(400,300,100,100);
        b3.addActionListener(this);
        b4 = new JButton("Divide");
        b4.setBounds(550,300,100,100);
        b4.addActionListener(this);
        
        l3.setBounds(100,420,100,30);
        l4.setBounds(200,420,100,30);
        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(l3);
        add(l4);
    }
    public void actionPerformed(ActionEvent e){
        Integer num1 = Integer.parseInt(t1.getText());
        Integer num2 = Integer.parseInt(t2.getText());
        Integer add = num1+num2;
        Integer subtract = num1 - num2;
        Integer multiply = num1*num2;
        Integer divide = num1/num2;
        if(e.getSource()== b1){
            l4.setText(add.toString());
        }
        if(e.getSource()== b2){
            l4.setText(subtract.toString());
        }
        if(e.getSource()== b3){
            l4.setText(multiply.toString());
        }
        if(e.getSource()== b4){
            l4.setText(divide.toString());
        }
    }
    public static void main(String args[]){
        MiniCalculator c = new MiniCalculator();
        c.setVisible(true);
    }
}
