
/*1)Read 3 marks of a student from an input file with following format 
=================================
Roll.No Name Mark1 Mark2
=================================
111     Anu    50    50

Display the above details in a GUI when clicking on "Import data" button. Use required Textbox and labels When clicking on "Calculate" button, find total marks and display it in another text box*/
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

class Students extends JFrame implements ActionListener {
    private JButton b1;
    private JButton b2;
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JLabel l4;
    private JLabel l5;
    private JLabel l6;
    private JLabel l7;
    private JLabel l8;
    private JLabel l9;
    private JLabel l10;
    private JLabel l11;
    private JLabel l12;
    private JLabel l13;
    private JLabel l14;

    public Students() {
        setLayout(null);
        setSize(1000, 1000);
        b1 = new JButton("IMPORT DATA");
        b2 = new JButton("CALCULATE");
        l1 = new JLabel("=================================");
        l2 = new JLabel("Roll No");
        l3 = new JLabel("Name");
        l4 = new JLabel("Mark1");
        l5 = new JLabel("Mark2");
        l6 = new JLabel("Mark3");
        l7 = new JLabel("=================================");
        l8 = new JLabel();
        l9 = new JLabel();
        l10 = new JLabel();
        l11 = new JLabel();
        l12 = new JLabel();
        l13 = new JLabel();
        l14 = new JLabel();
        b1.setBounds(425, 100, 150, 40);
        b2.setBounds(425, 800, 150, 40);
        l1.setBounds(325, 200, 500, 30);
        l2.setBounds(325, 250, 100, 30);
        l3.setBounds(425, 250, 100, 30);
        l4.setBounds(525, 250, 100, 30);
        l5.setBounds(625, 250, 100, 30);
        l6.setBounds(725, 250, 100, 30);
        l7.setBounds(325, 300, 500, 30);
        l8.setBounds(325, 350, 500, 30);
        l9.setBounds(425, 350, 500, 30);
        l10.setBounds(525, 350, 500, 30);
        l11.setBounds(625, 350, 500, 30);
        l12.setBounds(725, 350, 500, 30);
        l13.setBounds(425, 450, 500, 30);
        l14.setBounds(625, 450, 500, 30);
        add(b1);
        add(b2);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(l9);
        add(l10);
        add(l11);
        add(l12);
        add(l13);
        add(l14);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                String input = "Input.txt";
                BufferedReader reader = new BufferedReader(new FileReader(input));
                l8.setText(reader.readLine().trim());
                l9.setText(reader.readLine().trim());
                l10.setText(reader.readLine().trim());
                l11.setText(reader.readLine().trim());
                l12.setText(reader.readLine().trim());
                reader.close();
            } catch (IOException io) {
                io.printStackTrace();
            }
        } else if (e.getSource() == b2) {

            Integer mark1 = Integer.parseInt(l10.getText());
            Integer mark2 = Integer.parseInt(l11.getText());
            Integer mark3 = Integer.parseInt(l12.getText());
            Integer result = mark1 + mark2 + mark3;
            l13.setText("Total Marks : ");
            l14.setText(result.toString());
        }
    }

    public static void main(String args[]) {
        Students st = new Students();
        st.setVisible(true);
    }
}
