//CS 172
//lab 5 Crayon.java
//Written by: Jeremiah Smith
//Sept 21, 2014

import java.awt.*;

public class Crayon
{
	//instance variables
	private Color crayonColor;
	private int height;

	//constructors
	public Crayon()
	{
		crayonColor = Color.red;
		height = 200;
	}

	public Crayon(Color c, int h)
	{
		crayonColor = c;

		if (h > 0)
		{
			height = h;	
		}
		else
		{
			height = 200;
		}
		
	}

	//accessor methods
	public Color getCrayonColor()
	{
		return crayonColor;
	}

	public int getHeight()
	{
		return height;
	}

	//mutator methods
	public void setCrayonColor(Color c)
	{
		crayonColor = c;
	}

	public void setHeight(int h)
	{
		if (h > 0)
		{
			height = h;
		}
	}

	//draw method
	public void draw(Graphics screen, int x, int y)
	{
		int width = (int)(height/5);
		int[] polyX = {x + (int)(width/2), x + width, x};
		int[] polyY = { y - width, y, y};

		int[] borderX = {x, x, x + (int)(width/2), x + width, x + width};
		int[] borderY = { y + height, y, y - width, y, y + height};

		screen.setColor(crayonColor);
		screen.fillRect(x,y,width, height);
		screen.fillPolygon(polyX, polyY, 3);

		//draw border
		screen.setColor(Color.black);
		screen.drawPolygon(borderX, borderY, 5);

	}



}