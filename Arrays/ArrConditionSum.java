import java.util.*;
import java.io.*;
import java.lang.*;
public class  ArrConditionSum
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
        ArrayList<Int> b=new ArrayList<Int>();
        int i=0;
        while(i<array.length)
        {
            if(array[i]==6)
            {
                while(array[i]!=7)
                {
                    i=i+1;
                }
                i=i+1;
            }
            b.add(array[i]);
            i=i+1;
        }
        System.out.println(b);
    }
}