package examples;

import javax.swing.JFrame;

public class L_QuoteOptionsPanelApp
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Quote Options");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		L_QuoteOptionsPanel panel = new L_QuoteOptionsPanel();
		frame.getContentPane().add(panel);

		frame.pack();
		frame.setVisible(true);
	}
}
