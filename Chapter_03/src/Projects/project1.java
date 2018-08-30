package Projects;

import java.util.Scanner; //scanning variables
import java.util.Random; //random number

public class project1 {

	public static void main(String[] args) {
		Random generator = new Random(21);
		int num1 = generator.nextInt(100)+10; //generates random number between 10 to 99
		
		String first = "-------";
		String last = "-------";
		String username = "-------";
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		first = scan.next();
		
		System.out.print("Enter your last name: ");
		last = scan.next();
		
		System.out.println(first);
		System.out.println(last);
		
		username = first.substring(0, 1); //adds the first letter of first name
		username = username.concat(last.substring(0,5)); //adds the first five letters of last name
		username = username.concat(Integer.toString(num1)); //adds the random number
		System.out.print(username);
		
	}

}
