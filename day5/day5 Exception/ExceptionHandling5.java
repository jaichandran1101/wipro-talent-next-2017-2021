import java.util.*;
import java.io.*;
public class ExceptionHandling5
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		try 
		{
			double r = division(a, b);
			System.out.println(r);
		} 
		catch (ArithmeticException e) 
		{
			System.out.println(e.getMessage());
		}
		s.close();
	}
	public static double division(int a, int b) throws ArithmeticException 
	{
		return a / b;
	}
}
