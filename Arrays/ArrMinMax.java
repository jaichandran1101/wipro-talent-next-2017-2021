import java.io.*;
import java.util.*;
public class ArrMinMax
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
        int min=array[0];
        for(int i=0;i<n;i++)
        {
            if(min>=array[i])
            {
                min=array[i];
            }
        }
        System.out.println("Minimum value is " +min);
        int max=array[0];
        for(int i=0;i<n;i++)
        {
            if(max<array[i])
            {
                max=array[i];
            }      
        }
        System.out.println("Maximum value is " +max);
    }
}