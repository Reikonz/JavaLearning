package examples;

public class G_MyIntegerWrapper
{

	public static void main(String[] args)
	{
		Integer age = new Integer(40); // makes the integer a class
		System.out.println("My Integer age is "+age.toString()); // turns integer into a string
		
		int myAge = Integer.parseInt("46"); // turns string into integer
		System.out.println("My int age is " + myAge);
		
		Integer obj1;
		int num1 = 69;
		obj1 = num1;
		System.out.println("Autoboxing: My obj1 "+obj1.toString());
		
		Integer obj2 = new Integer(96);
		int num2;
		num2 = obj2;
		System.out.println("Unboxing: My num2 "+num2);		
		
		System.out.println("Maximum int "+Integer.MAX_VALUE);
	}
}
