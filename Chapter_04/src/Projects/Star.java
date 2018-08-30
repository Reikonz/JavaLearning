package Projects;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;


public class Star {
	
	private int x, y, side;

	public Star(int x_i, int y_i, int length) //CONSTRUCTOR
	{

		x = x_i;			//	Define top of the star
		y = y_i;
		side = length;		//	Define side length
	}
	
	public void draw(Graphics page) //draws an circle
	{
		
		//	Sets the color of the stars
		page.setColor(Color.white);
		
		
		
		//	Define the increments	
		int a,b,c,d,e,f,g,h;
		a = (int) (side*Math.sin(Math.toRadians(72)));
		b = (int) (Math.sqrt(Math.pow(side, 2)-Math.pow(a,2)));
		c = (int) (side*Math.sin(Math.toRadians(54)));
		d = (int) (Math.sqrt(Math.pow(side, 2)-Math.pow(c,2)));
		e = (int) (side*Math.sin(Math.toRadians(72)));
		f = (int) (Math.sqrt(Math.pow(side, 2)-Math.pow(e,2)));
		g = (int) (side*Math.sin(Math.toRadians(36)));
		h = (int) (Math.sqrt(Math.pow(side, 2)-Math.pow(g,2)));
		
		//	Make the right side
		page.drawLine(x, y, x+b, y+a);
		page.drawLine(x+b, y+a, x+b+side, y+a);
		page.drawLine(x+b+side, y+a, x+b+side-c, y+a+d);
		page.drawLine(x+b+side-c, y+a+d, x+b+side-c+f, y+a+d+e);
		page.drawLine(x+b+side-c+f, y+a+d+e, x+b+side-c+f-h, y+a+d+e-g);
		
		//	Make the left side
		page.drawLine(x, y, x-b, y+a);
		page.drawLine(x-b, y+a, x-b-side, y+a);
		page.drawLine(x-b-side, y+a, x-b-side+c, y+a+d);
		page.drawLine(x-b-side+c, y+a+d, x-b-side+c-f, y+a+d+e);
		page.drawLine(x-b-side+c-f, y+a+d+e, x-b-side+c-f+h, y+a+d+e-g);

	}
	

}
