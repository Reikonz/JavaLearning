package Projects;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;



public class SkyPanel extends JPanel{
	
	private Star star1, star2, star3, star4;
	

	public SkyPanel()
	{
	    
		star1 = new Star(200, 100, 100);
		star2 = new Star(400, 200, 200);
		star3 = new Star(800, 400, 400);
		star4 = new Star(1600, 800, 800);

		setPreferredSize(new Dimension(300, 200));
		setBackground(Color.black);
	}
	
	public void paintComponent(Graphics page)
	{
		super.paintComponent(page);

		star1.draw(page);
		star2.draw(page);
		star3.draw(page);
		star4.draw(page);

	}

}
