package examples;

import java.awt.Color;
import java.awt.Graphics;

public class Circle
{
	private int		diameter, x, y;

	private Color	color;

	public Circle(int size, Color shade, int upperX, int upperY) //CONSTRUCTOR
	{
		diameter = size;
		color = shade;
		x = upperX;
		y = upperY;
	}

	public void draw(Graphics page) //draws an circle
	{
		page.setColor(color);
		page.fillOval(x, y, diameter, diameter);
	}

	public void setDiameter(int size) //sets diameter
	{
		diameter = size;
	}

	public void setColor(Color shade) //sets the color
	{
		color = shade;
	}

	public void setX(int upperX)
	{
		x = upperX;
	}

	public void setY(int upperY)
	{
		y = upperY;
	}

	public int getDiameter()
	{
		return diameter;
	}

	public Color getColor()
	{
		return color;
	}

	public int getX()
	{
		return x;
	}

	public int getY()
	{
		return y;
	}
}
