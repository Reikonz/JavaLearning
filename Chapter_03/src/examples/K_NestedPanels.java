package examples;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class K_NestedPanels
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Nested Panels"); // creates frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel subPanel1 = new JPanel(); //creates panel 1
		subPanel1.setPreferredSize(new Dimension(150, 100));
		subPanel1.setBackground(Color.green);
		JLabel label1 = new JLabel("One");
		subPanel1.add(label1);

		JPanel subPanel2 = new JPanel(); //creates panel 2
		subPanel2.setPreferredSize(new Dimension(150, 100));
		subPanel2.setBackground(Color.red);
		JLabel label2 = new JLabel("Two");
		subPanel2.add(label2);

		JPanel primary = new JPanel(); //creates primary panel
		primary.setBackground(Color.blue);
		primary.setPreferredSize(new Dimension(300,100));
		primary.add(subPanel1); // adding the sub panels to primary
		primary.add(subPanel2);
		primary.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT); //orientate the text

		frame.getContentPane().add(primary); // displaying the primary panel
		frame.pack();
		frame.setVisible(true);
	}
}
