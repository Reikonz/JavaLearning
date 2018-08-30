package examples;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Y_AlignmentExample
{
	public static void main(String[] args)
	{
		JLabel label1 = new JLabel("BottomRight", SwingConstants.RIGHT);
		JLabel label2 = new JLabel("CenterLeft", SwingConstants.LEFT);
		JLabel label3 = new JLabel("TopCenter", SwingConstants.CENTER);
		label1.setVerticalAlignment(SwingConstants.BOTTOM);
		label2.setVerticalAlignment(SwingConstants.CENTER);
		label3.setVerticalAlignment(SwingConstants.TOP);

		label1.setBorder(BorderFactory.createLineBorder(Color.black)); // creates boarders for each label
		label2.setBorder(BorderFactory.createLineBorder(Color.black));
		label3.setBorder(BorderFactory.createLineBorder(Color.black));

		JFrame frame = new JFrame("AlignmentExample");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel(new GridLayout(3, 1, 8, 8));
		p.add(label1);
		p.add(label2);
		p.add(label3);
		p.setBorder(BorderFactory.createEmptyBorder(8, 8, 8, 8));
		frame.setContentPane(p);
		frame.setSize(200, 200);
		frame.setVisible(true);
	}
}
