//CS 172
//lab 5 Crayon.java
//Written by: Jeremiah Smith
//Sept 21, 2014

import javax.swing.JApplet;
import java.awt.*;

public class TestCrayon extends JApplet
{
	public void paint(Graphics g)
	{
		//declare variables
		Crayon c1 = new Crayon();
		Crayon c2 = new Crayon(new Color(genRandomNumber(0,255), genRandomNumber(0,255), genRandomNumber(0,255)), genRandomNumber(50, 200));
		int positionX = 40, positionY = 40, newHeight;

		//draw crayons
		for(int i = 0; i < 8; i++)
		{
			if (i == 0)
			{
				c1.draw(g, positionX, positionY);
			}
			else
			{
				newHeight = genRandomNumber(50, 200);
				positionX  = positionX + (int)c1.getHeight()/5 + 5;
				positionY = positionY + (c1.getHeight() - newHeight);

				c1.setHeight(newHeight);
				c1.setCrayonColor(new Color(genRandomNumber(0,255), genRandomNumber(0,255), genRandomNumber(0,255)));
				c1.draw(g, positionX, positionY);
			}
		}
		

		
	}

	//method to return a random int
	public int genRandomNumber(int min, int max)
	{
		return ((int)(Math.random() * (max - min +1) + min));
	}


}