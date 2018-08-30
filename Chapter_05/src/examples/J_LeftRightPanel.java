package examples;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class J_LeftRightPanel extends JPanel
{
	private JButton	left, right, center;
	private JLabel	label;
	private JPanel	buttonPanel;

	public J_LeftRightPanel()
	{
		left = new JButton("Left");
		center = new JButton("center");
		right = new JButton("Right");

		ButtonListener listener = new ButtonListener();
		left.addActionListener(listener);
		center.addActionListener(listener);
		right.addActionListener(listener);

		label = new JLabel("Push a button");

		buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(300, 40));
		buttonPanel.setBackground(Color.blue);
		buttonPanel.add(left);
		buttonPanel.add(center);
		buttonPanel.add(right);

		setPreferredSize(new Dimension(300, 80));
		setBackground(Color.cyan);
		add(label);
		add(buttonPanel);
	}

	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if (event.getSource() == left)
				label.setText("Left");
			else
				label.setText("Right");
		}
	}
}
