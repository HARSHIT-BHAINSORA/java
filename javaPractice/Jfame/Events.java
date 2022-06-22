// Events , componentns in swing 

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


class Events extends JFrame implements ActionListener {

    JLabel l1 , l2 , l3 , l4;
    JTextField tf1 , tf2 , tf3 , tf4;
    JButton b1 , b2 , b3 , b4;

    Events(String s)
    {
        super(s);
    }

    public void Components(){
        l1 = new JLabel("Enter first number - ");
        tf1 = new JTextField(20);

        l2 = new JLabel("Enter second number - ");
        tf2 = new JTextField(20);

        b1 = new JButton("ADD");
        b1.addActionListener(this);

        b2 = new JButton("SUB");
        b2.addActionListener(this);

        b3 = new JButton("MUL");
        b3.addActionListener(this);

        b4 = new JButton("DIV");
        b4.addActionListener(this); 


        l3 = new JLabel("Result");
        tf3 = new JTextField(20);


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
        addWindowListener(new Handling());
    }

    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand(); // return the string LABEL
        int result = 0;

        if(s.equals("ADD"))
        {
            result = Integer.parseInt(tf1.getText()) + Integer.parseInt(tf2.getText());
        }
        else if(s.equals("SUB"))
        {
            result = Integer.parseInt(tf1.getText()) - Integer.parseInt(tf2.getText());
        }   
        else if(s.equals("MUL"))
        {
            result = Integer.parseInt(tf1.getText()) * Integer.parseInt(tf2.getText());
        }
        else if(s.equals("DIV"))
        {
            result = Integer.parseInt(tf1.getText()) / Integer.parseInt(tf2.getText());
        }

        tf3.setText(Integer.toString(result));
    }

    class Handling extends WindowAdapter{

        public void windowClosing(WindowEvent e)
        {
            System.exit(0);
        }
    }

    public static void main(String args[])
    {
        Events jf = new Events("Events Handling");
        jf.setSize(600 , 400);
        jf.setVisible(true);
        jf.setLayout(new FlowLayout());
        jf.Components();
    }

   
}