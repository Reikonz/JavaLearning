package examples;

import java.io.File;
import java.util.Scanner;

public class H_URLDissector
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String url;

		Scanner fileScan, urlScan;

		try
		{
			String path = new java.io.File("urls.inp").getCanonicalPath();
			System.out.println(path);
			fileScan = new Scanner(new File("urls.inp"));
			// Read and process each line of the file
			while (fileScan.hasNext())
			{
				url = fileScan.nextLine();
				System.out.println("URL: " + url);

				urlScan = new Scanner(url);
				urlScan.useDelimiter("/");

				// Print each part of the url
				while (urlScan.hasNext())
					System.out.println("   " + urlScan.next());

				System.out.println();
			}
		}
		catch (Exception e)
		{
			System.out.println("Cannot open file: " + e.getMessage());
		}
	}
}
