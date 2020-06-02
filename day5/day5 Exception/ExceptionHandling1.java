import java.util.*;
import java.io.*;
public class ExceptionHandling1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		String str = s.nextLine();
		try 
		{
			int x = Integer.parseInt(str);
			System.out.println("The square value is: " + x * x);
			System.out.println("The work has been done successfully");
		} 
		catch (NumberFormatException e) 
		{
			System.out.println("Entered input is not a valid format for an integer.");
			//e.printStackTrace();
		}
		s.close();
	}
}
