package examples;

import javax.swing.JFrame;

public class StyleOptionsPanelApp
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Style Options");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		StyleOptionsPanel panel = new StyleOptionsPanel();
		frame.getContentPane().add(panel);

		frame.pack();
		frame.setVisible(true);
	}
}
