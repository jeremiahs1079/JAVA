//CS 172
//lab 2
//Written by: Jeremiah Smith
//Sept 2, 2014

import javax.swing.JApplet;
import java.awt.*;

public class Pie extends JApplet
{
	public void paint(Graphics g)
	{
		//declare variables

		Color[] colorList = new Color[8];//color list for loop
		colorList[0] = Color.pink;
		colorList[1] = Color.red;
		colorList[2] = Color.blue;
		colorList[3] = Color.magenta;
		colorList[4] = Color.orange;
		colorList[5] = Color.yellow;
		colorList[6] = Color.cyan;
		colorList[7] = Color.lightGray;
		int[] degrees = {0,45,90,135,180,225,270,315};//degrees list for 
		int circleX, circleY;
		double angleDegrees, angleRadians;
		double circleRadius = 150;//radius of the cicle

		


		
		//for loop to draw a different fillArch for each color in the colorList list
		for(int i = 0; i < 8; i++)
		{
			g.setColor(colorList[i]);
			g.fillArc(150,20,300,300,degrees[i],45);
		}

		//draw oval for pie chart
		g.setColor(Color.black); 
		g.drawOval(150,20,300,300);

		//for loop to draw each line dividing the eight section of the pie
		for(int i = 0; i < 8; i++)
		{
			angleRadians = (double)degrees[i] * Math.PI / 180.0;
			circleX = (int)(Math.cos(angleRadians) * circleRadius);
			circleY = (int)(Math.sin(angleRadians) * circleRadius);
			
			if (i == 0)
			{
				g.drawLine(300, 170, 450, 170);
			}
			else if (i == 1)
			{
				g.drawLine(300, 170, 300 + circleX, 170 - circleY);

			}
			else if (i == 2)
			{
				g.drawLine(300, 170, 300, 20);
			}
			else if (i == 3)
			{
				g.drawLine(300, 170, 300 + circleX, 170 - circleY);

			}
			else if (i == 4)
			{
				g.drawLine(300,170, 150, 170);
			}
			else if (i == 5)
			{
				g.drawLine(300, 170, 300 + circleX, 170 + (circleY * -1));
			}
			else if (i == 6)
			{
				g.drawLine(300,170, 300, 320);
			}
			else if (i == 7)
			{
				g.drawLine(300, 170, 300 + circleX, 170 + (circleY * -1));	
			}

		}

		//drawing the filled rect and my name 
		g.setColor(Color.black);
		g.fillRect(150, 340,300, 50);
		g.setColor(Color.pink);
		g.setFont(new Font("sansserif", Font.BOLD, 32));
		g.drawString("Jeremiah Smith",160, 380);

	}
   
}
