package examples;
import javax.swing.JFrame;
public class FahrenheitApp
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Fahrenheit"); //creates the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FahrenheitPanel panel = new FahrenheitPanel(); //creating an instance of the class
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}
