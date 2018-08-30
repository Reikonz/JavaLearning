package examples;

public class Z_ImmutableString
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String myName = new String( "Ibrahim Imam" );
		System.out.println( myName );
//		myName.replaceAll( "I", "E" );
		System.out.println( myName );
		
		myName = myName.replaceAll( "I", "E" );
		System.out.println( myName );		
	}

}
