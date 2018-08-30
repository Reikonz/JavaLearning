package Projects;

import java.util.Scanner; //scanning variables


public class project2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius, surfArea, volume;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		
		radius = scan.nextFloat();
		volume = (4.0/3.0)*Math.PI*Math.pow(radius, 3); //calculate volume
		surfArea = 4.0*Math.PI*Math.pow(radius,2); //calculate surface area
		System.out.printf("Volume: %.2f \n", volume);
		System.out.printf("Surface Area: %.2f", surfArea);

	}

}
