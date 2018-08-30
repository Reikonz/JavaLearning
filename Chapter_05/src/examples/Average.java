package examples;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Average
{

	public static void main(String[] args)
	{
		int sum = 0, value, count = 0;
		double average;

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter an integer (0 to quit): ");
		value = scan.nextInt();

		while (value != 0) // sentinel value of 0 to terminate loop
		{
			count++;

			sum += value;
			System.out.println("The sum so far is " + sum);

			System.out.print("Enter an integer (0 to quit): ");
			value = scan.nextInt();
		}
		System.out.println();

		if (count == 0)
			System.out.println("No values were entered.");
		else
		{
			average = (double) sum / count;

			DecimalFormat fmt = new DecimalFormat("0.###");
			System.out.println("The average is " + fmt.format(average));
		}
	}
}
