import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class TrafficLight extends JPanel implements ActionListener{
    private static JRadioButton rb1 ;
    private static JRadioButton rb2 ;
    private static JRadioButton rb3 ;
    private Color red_c;
    private Color yellow_c;
    private Color green_c;
    public TrafficLight(){
        setVisible(true);
        setLayout(null);
        setSize(800,800);
        
        rb1 = new JRadioButton("Red");
        rb2 = new JRadioButton("Yellow");
        rb3 = new JRadioButton("Green");
        rb1.setBounds(200,50,100,100);
        rb2.setBounds(350,50,100,100);
        rb3.setBounds(500,50,100,100);
        ButtonGroup g = new ButtonGroup();
        g.add(rb1);
        g.add(rb2);
        g.add(rb3);
        add(rb1);
        add(rb2);
        add(rb3);
        rb1.setSelected(true);
        red_c = Color.red;
        yellow_c = getBackground();
        green_c = getBackground();
        rb1.addActionListener(this);
        rb2.addActionListener(this);
        rb3.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
            if(rb1.isSelected() == true){
                red_c = Color.red;
                yellow_c = getBackground();
                green_c = getBackground();
            }
            else if(rb2.isSelected() == true){
                red_c = getBackground();
                yellow_c = Color.yellow;
                green_c = getBackground();
            }
            else if(rb3.isSelected() == true){
                red_c = getBackground();
                yellow_c =getBackground();
                green_c = Color.green;
            }
            repaint();
        }
    public void paintComponent(Graphics g){
       g.drawOval(350,150,100,100);
       g.drawOval(350,300,100,100);
       g.drawOval(350,450,100,100);
       g.setColor(red_c);
       g.fillOval(350,150,100,100);
       g.setColor(yellow_c);
       g.fillOval(350,300,100,100);
       g.setColor(green_c);
       g.fillOval(350,450,100,100);
    }
    public static void main(String args[]){
        JFrame f1 = new JFrame();
        TrafficLight TL = new TrafficLight();
        f1.setSize(1000,800);
        f1.setLayout(null);
        f1.setVisible(true);
        f1.add(TL);
    }
}
