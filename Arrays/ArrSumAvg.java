import java.io.*;
import java.util.*;
public class ArrSumAvg
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n,sum=0;
        float average;
        System.out.println("Enter the length of the array:");
        n=s.nextInt();
        int array[]=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=s.nextInt();
            sum=sum+array[i];
        }
        System.out.println("sum is " +sum);
        average=sum/n;
        System.out.println("Average is " +average);
    }
}