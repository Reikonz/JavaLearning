// ********************************************************************
// TempConverter.java Author: Lewis/Loftus
//
// Demonstrates the use of primitive data types and arithmetic
// expressions.
// ********************************************************************
package examples;

public class G_TempConverter
{
	// -----------------------------------------------------------------
	// F = (9/5)C + 32.
	// -----------------------------------------------------------------
	public static void main(String[] args)
	{
		final int BASE; // = 32;
		final double CONVERSION_FACTOR = 9.0 / 5.0;

		double fahrenheitTemp;
		BASE = 32;
		int celsiusTemp = 24; // value to convert
		fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;
		System.out.println("Celsius Temperature: " + celsiusTemp);
		System.out.println("Fahrenheit Equivalent: " + fahrenheitTemp);
//		BASE = 23; // will cause error cause you cannot change a final
	}
}
