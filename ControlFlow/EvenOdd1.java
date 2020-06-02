import java.util.*;
import java.io.*;
public class EvenOdd1
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=s.nextInt();
        if(n%2==0)
        {
            System.out.print("The entered number");
            System.out.println( n +"is an even number");
        }
        else
        {
            System.out.print("The entered number");
            System.out.println( n +"is a odd number");
        }
    }
}