package examples;

import javax.swing.JFrame;

public class QuoteOptionsPanelApp
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Quote Options");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		QuoteOptionsPanel panel = new QuoteOptionsPanel();
		frame.getContentPane().add(panel);

		frame.pack();
		frame.setVisible(true);
	}
}
