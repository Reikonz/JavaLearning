package examples;
import javax.swing.JFrame;
public class PushCounterApp
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("My Push Counter");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new PushCounterPanel());
		frame.pack();
		frame.setVisible(true);
	}
}
