// ********************************************************************
// Addition.java Author: Lewis/Loftus
//
// Demonstrates the difference between the addition and string
// concatenation operators.
// ********************************************************************
package examples;

public class C_Addition
{
	public static void main(String[] args)
	{
		System.out.println("24 and 45 concatenated: " + 24 + 45);
		System.out.println("24 and 45 added: " + (24 + 45)); //parenthesis gets priority
	}
}
