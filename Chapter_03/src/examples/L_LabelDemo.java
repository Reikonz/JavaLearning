package examples;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class L_LabelDemo
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Label Demo"); // making the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon icon = new ImageIcon("devil.gif");
		
		JLabel label1, label2, label3; // the three sub labels
		label1 = new JLabel("Devil Left", icon, SwingConstants.TRAILING); // positioning the text
		label2 = new JLabel("Devil Right", icon, SwingConstants.CENTER);
		
		label2.setHorizontalTextPosition(SwingConstants.LEFT);
		label2.setVerticalTextPosition(SwingConstants.BOTTOM);
		
		label3 = new JLabel("Devil Above", icon, SwingConstants.CENTER);
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		
		JPanel panel = new JPanel(); // making the main panel
		panel.setBackground(Color.cyan);
		panel.setPreferredSize(new Dimension(200, 250));
		panel.add(label1); // adding everything to main panel
		panel.add(label2);
		panel.add(label3);
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}
