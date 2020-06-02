import java.util.*;
import java.io.*;
public class ExceptionHandling9
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		try 
		{
			System.out.println("Enter the 2 numbers");
			int a = s.nextInt();
			int b = s.nextInt();
			int quotient = a / b;
			System.out.println("The quotient of " + a + " / " + b + " = " + quotient);
		} 
		catch (ArithmeticException e) 
		{
			System.out.println(e.getMessage() + " caught");
		} 
		finally 
		{
			System.out.println("Inside finally block");
		}
		s.close();
	}
}
