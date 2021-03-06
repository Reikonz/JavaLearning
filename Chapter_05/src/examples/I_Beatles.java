package examples;

import java.util.ArrayList;

public class I_Beatles
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ArrayList<String> band = new ArrayList<String>();

		band.add("Paul");
		band.add("Pete");
		band.add("John");
		band.add("George");

		System.out.println(band);
		int location = band.indexOf("Pete");
		band.remove(location);

		System.out.println(band);
		System.out.println("At index 1: " + band.get(1));
		band.add(2, "Ringo");
		

		System.out.println("Size of the band: " + band.size());
		int index = 0;
		while (index < band.size())
		{
			System.out.println(band.get(index));
			index++;
		}
		
		for (String string : band)
		{
			System.out.println("I am printing the names of my band: " + string);
		}
	}
}
