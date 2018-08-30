package examples;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class J_Authority
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Authority");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // assigns the x button to close
//		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // assigns the x button to do nothing on close

		JPanel primary = new JPanel(); // creates a new primary panel
		primary.setBackground(Color.yellow); // makes the panel yellow
		primary.setPreferredSize(new Dimension(250, 75));

		JLabel label1 = new JLabel("D_Question authority,");
		JLabel label2 = new JLabel("but raise your hand first.");

		primary.add(label1); // adds the labels
		primary.add(label2);

		frame.getContentPane().add(primary); // returns the panel
		frame.pack();
		frame.setVisible(true);
	}
}
