import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Sting extends JFrame implements ActionListener {

    JTextField tf1 , tf2 , tf3;
    JLabel l1 , l2 , l3; 
    JButton b1 , b2 , b3 , b4;

    Sting(String s)
    {
        super(s);
    }

    public void component(){
 
        l1 = new JLabel("Enter First String -");
        tf1 = new JTextField(20);

        l2 = new JLabel("Enter Second String -");
        tf2 = new JTextField(20);
        
        l3 = new JLabel("Result -");
        tf3 = new JTextField(20);

        b1 = new JButton("Concat");
        b1.addActionListener(this);
        b2 = new JButton("Reverse");
        b2.addActionListener(this);
        b3 = new JButton("length");
        b3.addActionListener(this);
        b4 = new JButton("swap");
        b4.addActionListener(this);


        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(l3);
        add(tf3);
        addWindowListener(new Handler());
    }

    static String reverse(String str)
    {
        String s = "";
        for(int i = str.length() ; i > 0; i--)
        {
            s = s + (str.charAt(i-1));
        }
        return s;
    }

    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        
        if(s.equals("Concat"))
        {
            tf3.setText(tf1.getText().concat(tf2.getText()));
        }
        else if(s.equals("Reverse"))
        {
            tf3.setText(reverse(tf1.getText()) +"&"+ reverse(tf2.getText()));
        }
        else if(s.equals("length")){

            String str = tf1.getText();
            System.out.print(str);

            tf3.setText(Integer.toString(str.length())+"&"+Integer.toString(tf2.getText().length()));
        }
        else if(s.equals("swap")){
            String st = tf1.getText();
            tf1.setText(tf2.getText());
            tf2.setText(st);
        }

    }

    class Handler extends WindowAdapter{
        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    }

    public static void main(String args[])
    {
        Sting jf = new Sting("String operation");
        jf.setSize(300 , 400);
        jf.setVisible(true);
        jf.setLayout(new FlowLayout());
        jf.component();
    }
}
