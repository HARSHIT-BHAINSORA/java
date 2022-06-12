import javax.swing.*;
import java.awt.*;


public class Simely extends Canvas{

    public void paint(Graphics g){

        g.setColor(Color.yellow);
        g.fillOval(80, 70, 150, 150);

        g.setColor(Color.black);
        g.fillOval(120, 120, 15, 15);
        g.fillOval(170, 120, 15, 15);

        g.drawLine(155, 150, 155, 170);

        g.drawArc(130, 180, 50, 20, 180, 180);
    }
    
    public static void main(String args[])
    {
        Simely obj = new Simely();
        JFrame jf = new JFrame("Simely");
        jf.setSize(300 , 400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.add(obj);
    }
    
}
