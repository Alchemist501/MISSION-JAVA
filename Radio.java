import javax.swing.*;
import java.awt.event.*;

class Radio extends JFrame implements ActionListener {
    private JRadioButton b1;
    private JRadioButton b2;
    private JLabel l1;

    public Radio() {
        setLayout(null);
        setSize(1000, 1000);
        b1 = new JRadioButton("bit 1");
        b2 = new JRadioButton("bit 0");
        l1 = new JLabel("0");
        b1.setBounds(100, 100, 100, 30);
        b2.setBounds(200, 100, 100, 30);
        l1.setBounds(300, 100, 100, 30);
        add(b1);
        add(b2);
        add(l1);
        b1.setSelected(false);
        b2.setSelected(false);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (!b1.isSelected() && !b2.isSelected()) {
            l1.setText("0");
        } else if (b1.isSelected() && b2.isSelected()) {
            l1.setText("3");
        } else if (b1.isSelected()) {
            l1.setText("2");
        } else if (b2.isSelected()) {
            l1.setText("1");
        }
    }

    public static void main(String args[]) {
        Radio r = new Radio();
        r.setVisible(true);
    }
}
