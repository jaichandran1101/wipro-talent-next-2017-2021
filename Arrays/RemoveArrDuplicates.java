import java.util.*;
import java.io.*;
public class  RemoveArrDuplicates  
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
        int[] temp = new int[n];  
        int j = 0;  
        for (int i=0; i<n-1; i++)
        {  
            if (array[i] != array[i+1])
            {  
                temp[j++] = array[i];  
            }  
         }  
        temp[j++] = array[n-1];     
        for (int i=0; i<j; i++)
        {  
            array[i] = temp[i];  
        }
        for (int i=0; i<j; i++)  
        {
           System.out.print(array[i]+" ");   
    
        }
    }
}