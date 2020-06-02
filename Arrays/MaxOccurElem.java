import java.util.*;
import java.io.*;
public class  MaxOccurElem
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n;
        System.out.println("Enter the length of the array:");
        n=s.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=s.nextInt();
        }
        int max=0;
        for (int i = 0; i <array.length ; i++) 
        {
            if((array[i]/array.length)>max)
            {
                max=i;
            }
        }
        System.out.println("Maximum Occuring Element is " +max);
    }
}