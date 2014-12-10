import java.awt.*;
import javax.swing.JApplet;
// or import javax.swing.*;

public class Balloons extends JApplet 
{
   public void paint (Graphics g) 
   {
      // draw a red balloon with a string
      g.setColor(Color.red);
      g.fillOval(50, 100, 50, 60);
      g.setColor(Color.black);
      g.drawLine(75, 160, 150, 260);
      // draw a blue balloon with a string
      g.setColor(Color.blue);
      g.fillOval(100, 80, 50, 60);
      g.setColor(Color.black);
      g.drawLine(125, 140, 150, 260);
      // draw an orange balloon with a string
      g.setColor(Color.orange);
      g.fillOval(150, 100, 50, 60);
      g.setColor(Color.black);
      g.drawLine(175, 160, 150, 260);
   } // end paint
}// end class
   