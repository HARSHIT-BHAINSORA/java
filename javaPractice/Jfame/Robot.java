// we want to use the Canvas Class that why we using object method
// canvas -> pre define method Paint -> use karna tho make an obj -> add into the frame 

import javax.swing.*;
import java.awt.*;

class Robot extends Canvas{

   public void paint(Graphics g){

    g.fillOval(95, 19, 15, 15);
    g.fillOval(220, 20, 15, 15);

   g.drawLine(100 , 20 , 130 , 90 );
   g.drawLine(230 , 20 , 200 , 90 );

    g.setColor(Color.blue);
    g.fillRect(80 , 70 , 170 , 170);

    g.setColor(Color.black);
    g.fillOval(120 , 120 , 15 , 15);
    g.fillOval( 170 , 120 , 15 , 15);

    g.drawLine(150 , 150 , 150 , 180);

    g.fillRect(120 , 190 , 70 , 15);

   }

    public static void main(String args[])
    {
        Robot obj = new Robot();
        JFrame jf = new JFrame("Robot");
        jf.setSize(300 , 400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(obj);
    }
}


