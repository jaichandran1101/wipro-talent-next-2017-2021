import java.io.*;
import java.util.*;
public class ArrElementsCheck
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int n,c,flag=0,i=0;
        System.out.println("Enter the length of the array:");
        n=s.nextInt();
        int array[]=new int[n];
        for(i=0;i<n;i++)
        {
            array[i]=s.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        c=s.nextInt();
        for( i=0;i<n;i++)
        {
            if(array[i]==c)
            {
                flag=1;
                break;
            }
            else
            {
                flag=0;
            }
        
        }
        if(flag==1)
        {
            System.out.println(i+1);
        }
        else
        {
            System.out.println("-1");
        }
    }
}