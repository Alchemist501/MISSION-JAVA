import javax.swing.*;
import java.awt.*;
class Jpanel extends JPanel{
    private JLabel l1;
    public Jpanel(){
        Font f = new Font("TimesRoman",Font.BOLD,30);
        setBounds(300,300,400,500);
        setBackground(Color.red);
        l1 = new JLabel("Hello World");
        l1.setBounds(400,400,100,30);
        l1.setForeground(Color.green);
        l1.setFont(f);
        add(l1);
    }
    
    public static void main(String args[]){
        Jpanel p = new Jpanel();
        JFrame F = new JFrame();
        F.setSize(1000,1000);
        F.setLayout(null);
        F.setVisible(true);
        F.add(p);
    }
}
