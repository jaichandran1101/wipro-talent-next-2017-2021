import java.util.*;
import java.io.*;
public class ExceptionHandling2 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements in the array: ");
		int n = s.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the elements in the array: ");
		for (int i = 0; i < n; i++)
		{
			arr[i] = s.nextInt();
		}
		System.out.println("Enter the index of the array element you want to access");
		int index = s.nextInt();
		try 
		{
			System.out.println("The array element at index " + index + " = " + arr[index]);
			System.out.println("The array element successfully accessed");
		}
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		}
		s.close();
	}
}
