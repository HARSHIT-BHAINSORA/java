import javax.swing.*;
import java.awt.event.*;


public class Operation extends JFrame implements ActionListener{

    JLabel l1 , l2 , l3;
    JTextField tf1 , tf2 , tf3;
    JButton b1 , b2;

    Operation(String s)
    {
        super(s);
    }

    public void Component(){
        l1 = new JLabel("Enter First Number - ");
        tf1 = new JTextField();

        l2 = new JLabel("Enter Second Number - ");
        tf2 = new JTextField();

        b1 = new JButton("ADD");
        b2 = new JButton("SUB");

        l3 = new JLabel("Result is -");
        tf3 = new JTextField();


        l1.setBounds(50 , 20 , 200 , 20);
        tf1.setBounds(200 , 20 , 200 , 20);

        l2.setBounds(50 , 70 , 200 , 20);
        tf2.setBounds(200 , 70 , 200 , 20);

        b1.setBounds(100 , 125 , 100 , 20);
        b1.addActionListener(this);

        b2.setBounds(250 , 125 , 100 , 20);
        b2.addActionListener(this);

        l3.setBounds(50 , 200 , 200 , 20);
        tf3.setBounds(150 , 200 , 200 , 20);

        add(l1);
        add(tf1);
        add(l2);
        add(tf2);
        add(b1);
        add(b2);
        add(l3);
        add(tf3);

    }

    public void actionPerformed(ActionEvent e)
    {

        String s = e.getActionCommand();
        int result = 0;

        if(s.equals("ADD")){
            result = Integer.parseInt(tf1.getText()) + Integer.parseInt(tf2.getText());
        }
        else if(s.equals("SUB")){
            result = Integer.parseInt(tf1.getText()) - Integer.parseInt(tf2.getText()); 
        }

        tf3.setText(Integer.toString(result));
       
    }
    
    public static void main(String args[])
    {
        Operation jf = new Operation("Sum & Difference");
        jf.Component();;
        jf.setLayout(null);
        jf.setSize(300 , 400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
