import java.util.*;
import java.io.*;
public class Evensumodd
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter First number:");
        int a=s.nextInt();
        System.out.println("Enter Second number:");
        int b=s.nextInt();
        int c=a+b;
        if(c%2==0)
        {
            
            System.out.println( is an even number");
        }
        else
        {
            
            System.out.println( is a odd number");
        }
    }
}