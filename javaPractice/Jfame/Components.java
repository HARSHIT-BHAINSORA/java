import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Components extends JFrame {

    JTextField tf2;
    JCheckBox c1 , c2;
    JButton b1;

    Components(String s){
        super(s);
    }

    public void compo(){
        JLabel l1 = new JLabel("Enter your name");
        JTextField tf1 = new JTextField(20);

        JRadioButton rb1 = new JRadioButton("M" , true);
        JRadioButton rb2 = new JRadioButton("F");

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        String s[] = {"HI" , "HELOO"};
        JComboBox cb = new JComboBox<>(s);

        c1 = new JCheckBox("Cse");
        c2 = new JCheckBox("ECe");

        String data[][] = {{"1" , "Harshit" , "99"},
        {"2" , "Sumit" , "87"},
        {"3" , "Ashish" , "90"},
        {"4" , "Ankit" , "89"}};

        String column[] = {"rollNo" , "Name" , "Marks"};

        JTable jt = new JTable(data , column);

        JScrollPane sp = new JScrollPane(jt);

        b1 = new JButton("Submit");
        b1.addActionListener(this);

        tf2 = new JTextField(20);

        add(l1);
        add(tf1);
        add(rb1);
        add(rb2);
        add(cb);
        add(c1);
        add(c2);
        add(sp);
        add(b1);
        add(tf2);
    }



    public static void main(String args[])
    {
        Components jf = new Components("Components");
        jf.setSize(300 , 400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());
        jf.compo();
    }
}
