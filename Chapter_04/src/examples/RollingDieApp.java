package examples;

public class RollingDieApp
{
	// -----------------------------------------------------------------
	// Creates two Die objects and rolls them several times.
	// -----------------------------------------------------------------
	public static void main(String[] args)
	{
		Die die1, die2; //creates two dies
		int sum;

		die1 = new Die(); //initiates the die class
		die2 = new Die();

		die1.roll(); //rolls to get a random face values
		die2.roll();
		System.out.println("Die One: " + die1 + ", Die Two: " + die2);

		die1.roll();
		die2.setFaceValue(4);
		System.out.println("Die One: " + die1 + ", Die Two: " + die2);

		sum = die1.getFaceValue() + die2.getFaceValue();
		System.out.println("Sum: " + sum);

		sum = die1.roll() + die2.roll();
		System.out.println("Die One: " + die1 + ", Die Two: " + die2);
		System.out.println("New sum: " + sum);
	}
}
