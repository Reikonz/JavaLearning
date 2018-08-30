package examples;

import javax.swing.JFrame;

public class K_StyleOptionsPanelApp
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Style Options");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		K_StyleOptionsPanel panel = new K_StyleOptionsPanel();
		frame.getContentPane().add(panel);

		frame.pack();
		frame.setVisible(true);
	}
}
