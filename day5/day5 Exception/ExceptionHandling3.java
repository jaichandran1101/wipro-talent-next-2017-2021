import java.util.*;
import java.io.*;
public class ExceptionHandling3 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of elements in the arrays");
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in the array: ");
		try 
		{
			for (int i = 0; i < n; i++)
			{
				arr[i] = s.nextInt();
			}
			System.out.println("Enter the index of the array element you want to access");
			int index = s.nextInt();
			System.out.println("The array element at index " + index + " = " + arr[index]);
			System.out.println("The array element successfully accessed");
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		} 
		catch (InputMismatchException e) 
		{
			System.out.println("java.util.InputMismatchException");
		}
		s.close();
	}
}
