package examples;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
@SuppressWarnings("serial") public class PushCounterPanel extends JPanel
{
	private int		count;
	private JButton	push;
	private JLabel	label;
	public PushCounterPanel()
	{
		count = 0;
		push = new JButton("Push Here!"); // creates the button
		push.addActionListener(new ButtonListener()); //adds the listener to the button
		label = new JLabel("Number of Pushes: " + count);
		add(push);
		add(label);
		setPreferredSize(new Dimension(300, 40));
		setBackground(Color.cyan);
	}
	// *****************************************************************
	// Represents a listener for button push (action) events.
	// *****************************************************************
	private class ButtonListener implements ActionListener //determines that this is a listener
	{
		// --------------------------------------------------------------
		// Updates the counter and label when the button is pushed.
		// --------------------------------------------------------------
		public void actionPerformed(ActionEvent event)
		{
			// System.out.println(event.getActionCommand());
			push.setText("Hi There");
			count += 1;
			// System.out.println("The event is :" + event);
			label.setText("Pushes: " + count);
		}
	}
}
