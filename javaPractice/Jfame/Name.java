import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Name extends JFrame implements ActionListener{

    JTextField tf1 , tf2 , tf3 , tf4;
    JButton b1;
    JLabel l1 , l2 , l3 , l4; 
    JRadioButton rb1 , rb2;
    
    Name(String s)
    {
        super(s);
    }

    public void component(){

        l1 = new JLabel("Enter the name -");
        tf1 = new JTextField(20);

        l4= new JLabel("Enter the age -");
        tf4 = new JTextField(20);

        rb1 = new JRadioButton("MALE");
        rb2 = new JRadioButton("FEMALE");

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        b1 = new JButton("Submit");
        b1.addActionListener(this);

        l3 = new JLabel("Message - ");
        tf3 = new JTextField(60);

        add(l1);
        add(tf1);
        add(l4);
        add(tf4);
        add(rb1);
        add(rb2);
        add(b1);
        add(l3);
        add(tf3);

    }

    public void actionPerformed(ActionEvent e){

        if(rb1.isSelected())
        {
            int x  = Integer.parseInt(tf4.getText());
            if(x > 18)
            {
                tf3.setText("MR "+tf1.getText() + "Your are allow to vote...");
            }
            else{
                tf3.setText("MR "+tf1.getText() + "Your are not allow to vote...");
            }
        }
        else if(rb2.isSelected())
        {
            int x  = Integer.parseInt(tf4.getText());
            if(x > 18)
            {
                tf3.setText("MRS "+tf1.getText() + "Your are allow to vote...");
            }
            else{
                tf3.setText("MRS "+tf1.getText() + "Your are not allow to vote...");
            }
        }
    }

    public static void main(String args[])
    {
        Name jf = new Name("Voting System");
        jf.setSize(300 , 400);
        jf.setVisible(true);
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.component();
    }
}
