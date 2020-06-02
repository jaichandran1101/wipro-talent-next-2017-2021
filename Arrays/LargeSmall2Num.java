import java.io.*;
import java.util.*;
public class LargeSmall2Num 
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
        int i,max1,max2,min1,min2;
        max1=array[1];
        max2=array[1];
        min1=array[1];
        min2=array[1];
        for(i=0;i<n;i++)
        {
            if(array[i]>max1)
            {
                max1=array[i];
            }
        }
        System.out.println("First Maximum Number is " +max1);
        for(i=0;i<n;i++)
        {
            if(array[i]>max2 && array[i]!=max1)
            {
                max2=array[i];
            }
        }
        System.out.println("Second Maximum Number is " +max2);
        for(i=0;i<n;i++)
        {
            if(array[i]<min1)
            {
                min1=array[i];
            }
        }
        System.out.println("First Minimum Number is " +min1);
        for(i=0;i<n;i++)
        {
            if(array[i]<min2 && array[i]!=min1)
            {
                min2=array[i];
            }
        }
        System.out.println("Second Minimum Number is " +min2);
    }    
}