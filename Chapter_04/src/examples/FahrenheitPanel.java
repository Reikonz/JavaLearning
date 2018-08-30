package examples;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
@SuppressWarnings("serial") public class FahrenheitPanel extends JPanel
{
	private JLabel		inputLabel, outputLabel, resultLabel; //determing i/o variables
	private JTextField	fahrenheit;
	public FahrenheitPanel()
	{
		inputLabel = new JLabel("Enter Fahrenheit temperature:");
		outputLabel = new JLabel("Temperature in Celsius: ");
		resultLabel = new JLabel("---");
		fahrenheit = new JTextField(5);
		fahrenheit.addActionListener(new TempListener()); //listens for th euser input
		add(inputLabel); //adding all the labels
		add(fahrenheit); //adding the text filed
		add(outputLabel);
		add(resultLabel);
		setPreferredSize(new Dimension(300, 75));
		setBackground(Color.yellow);
	}
	private class TempListener implements ActionListener
	{
		// --------------------------------------------------------------
		// Performs the conversion when the enter key is pressed in
		// the text field.
		// --------------------------------------------------------------
		public void actionPerformed(ActionEvent event)
		{
			// System.out.println(event.getActionCommand());
			int fahrenheitTemp, celsiusTemp;
			String text = fahrenheit.getText();
			// System.out.println("My event :" + event.toString());
			fahrenheitTemp = Integer.parseInt(text);
			celsiusTemp = (fahrenheitTemp - 32) * 5 / 9;
			resultLabel.setText(Integer.toString(celsiusTemp));
		}
	}
}
