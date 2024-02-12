import javax.swing.*;
import java.awt.event.*;
class KeyBoardListener extends JFrame implements KeyListener{
    private JTextField t1;
    private JLabel l1;
    public KeyBoardListener(){
        setSize(1000,1000);
        setLayout(null);
        t1 = new JTextField();
        l1 = new JLabel("hii");
        
        t1.setBounds(100,100,100,30);
        l1.setBounds(100,200,100,30);
        
        add(t1);
        add(l1);
        
        t1.addKeyListener(this);
    }
    public void keyReleased(KeyEvent e){
    
    }
    public void keyPressed(KeyEvent e){
        if(e.getKeyCode()== KeyEvent.VK_ENTER){
            l1.setText(t1.getText());
        }
        //If we want to set this when we write x 
        else if(e.getKeyChar()=='x'){
            l1.setText(t1.getText());
        }
    }
    public void keyTyped(KeyEvent e){
    
    }
    public static void main(String args[]){
        KeyBoardListener k = new KeyBoardListener();
        k.setVisible(true);
    }
}
