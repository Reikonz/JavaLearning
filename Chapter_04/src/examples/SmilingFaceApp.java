package examples;

import javax.swing.JFrame;

public class SmilingFaceApp
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Smiling Face");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		SmilingFacePanel panel = new SmilingFacePanel(); //creates a smilingfacepanel class

		frame.getContentPane().add(panel); //display the panel

		frame.pack();
		frame.setVisible(true);
	}
}
