package examples;

import javax.swing.JFrame;

public class LeftRightPanelApp
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Left Right");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.getContentPane().add(new LeftRightPanel());

		frame.pack();
		frame.setVisible(true);
	}
}
