import javax.swing.*;
import java.awt.event.*;

public class Student extends JFrame  {
    

    JLabel head , name , fname , gen , p , a , per , ph ;
    JTextField tf1 , tf2 , tf3 , tf4 , tf5;
    JButton b;
    
    Student(String s)
    {
        super(s);
    }

    public void Components(){

        head = new JLabel("STUDENT INFORMATION");

        
        name = new JLabel("NAME -");
        tf1 = new JTextField();
        
        fname = new JLabel("FATHER'S NAME -");
        tf2 = new JTextField();


        gen = new JLabel("GENDER -");
        JRadioButton m = new JRadioButton("MALE", true);
        JRadioButton fm = new JRadioButton("FEMALE");

        ButtonGroup bg = new ButtonGroup();
        bg.add(m);
        bg.add(fm);

        a = new JLabel("AGE-");
        tf3 = new JTextField();
        
        p = new JLabel("NATIVE PLACE -");
        String s[] = {"-Select-","Dehradun" , "Haldwani" , "Almora" , "Bageshwar", "Champawat" , "Nanital"};
        JComboBox cb= new JComboBox(s);    

        
        ph = new JLabel("PHONE NO.-");
        tf4 = new JTextField();
        per = new JLabel("PERCENTAGE IN 12th -");
        tf5 = new JTextField();

        b = new JButton("SUBMIT");
        
        head.setBounds(250, 10, 200, 60);
        
        name.setBounds(50 , 100 , 100, 20);
        tf1.setBounds(120, 100, 150, 20);

        fname.setBounds(350, 100, 150, 20);
        tf2.setBounds(470, 100, 150, 20);
        
        m.setBounds(50, 170, 100, 20);
        fm.setBounds(150, 170, 100, 20);

        a.setBounds(290, 170, 50, 20);
        tf3.setBounds(325, 170, 50, 20);

        p.setBounds(390, 170, 100, 20);
        cb.setBounds(500, 170,150,20);    

        ph.setBounds(50, 250, 100, 20);
        tf4.setBounds(150, 250, 150, 20);

        per.setBounds(350, 250,150,20);   
        tf5.setBounds(500, 250, 150, 20); 

        b.setBounds(250, 340, 150, 20);

        add(head);
        
        add(name);
        add(tf1);
        add(fname);
        add(tf2);

        add(m);
        add(fm);
        add(a);
        add(tf3);
        add(p);
        add(cb);

        add(ph);
        add(tf4);
        add(per);
        add(tf5);

        add(b);
        addWindowListener(new Handler());
    }

    class Handler extends WindowAdapter
    {
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
    }
    
    public static void main(String args[])
    {
        Student jf = new Student("Student Information System");
        jf.setSize(700 , 500);
        jf.setVisible(true);
        jf.setLayout(null);
        jf.Components();
    }
}
