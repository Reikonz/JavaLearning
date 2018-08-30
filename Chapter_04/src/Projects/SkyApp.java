package Projects;
import javax.swing.JFrame;


public class SkyApp {

	public static void main(String[] args) {

		JFrame frame = new JFrame("Sky");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.getContentPane().add(new SkyPanel());
		
		frame.pack();
		frame.setVisible(true);
	}

}
