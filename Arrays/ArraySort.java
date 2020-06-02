import java.util.*;
import java.io.*;
public class ArraySort 
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n,t;
        System.out.println("Enter the length of the array:");
        n=s.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=s.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(array[i]>array[j])
                {
                    t=array[i];
                    array[i]=array[j];
                    array[j]=t;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(array[i] + " ");
        }
    }    
}