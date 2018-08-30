package examples;

public class F_IceCream
{
	enum Flavor //determines discrete values for the flavor variable
	{
		vanilla, chocolate, strawberry, fudgeRipple, coffee, rockyRoad, mintChocolateChip, cookieDough
	}

	// -----------------------------------------------------------------
	// Creates and uses variables of the Flavor type.
	// -----------------------------------------------------------------
	public static void main(String[] args)
	{
		Flavor cone1, cone2, cone3;
		
		cone1 = Flavor.rockyRoad; // assigns the flavor variable 'rocky road'
		cone2 = Flavor.chocolate;

		System.out.println("cone1 value: " + cone1);
		System.out.println("cone1 ordinal: " + cone1.ordinal()); // outputs the position of the value in flavor (starts index at 0)
		System.out.println("cone1 name: " + cone1.name());

		System.out.println();
		System.out.println("cone2 value: " + cone2);
		System.out.println("cone2 ordinal: " + cone2.ordinal());
		System.out.println("cone2 name: " + cone2.name());

		cone3 = cone1;
		
		System.out.println();
		System.out.println("cone3 value: " + cone3);
		System.out.println("cone3 ordinal: " + cone3.ordinal());
		System.out.println("cone3 name: " + cone3.name());
	}
}