package examples;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class SplatPanel extends JPanel
{
	private Circle	circle1, circle2, circle3, circle4, circle5;
	
	// sub functions in the constructor
	public SplatPanel()
	{
		circle2 = new Circle(50, Color.green, 30, 20);
		circle1 = new Circle(30, Color.red, 70, 35);
		circle3 = new Circle(100, Color.cyan, 60, 85);
		circle4 = new Circle(45, Color.yellow, 170, 30);
		circle5 = new Circle(60, Color.blue, 200, 60);

		setPreferredSize(new Dimension(300, 200));
		setBackground(Color.black);
	}

	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);

		circle2.draw(page);
		circle1.draw(page);
		circle3.draw(page);
		circle4.draw(page);
		circle5.draw(page);
	}
}
