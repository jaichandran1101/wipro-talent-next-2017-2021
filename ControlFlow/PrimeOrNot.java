import java.io.*;
import java.util.*;
public class PrimeOrNot 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter number:");
        int n=s.nextInt();
        boolean prime=false;
        for(int i = 2; i <= n/2; ++i)
        {
            if(n % i == 0)
            {
                prime= true;
                break;
            }
        }
        if (!prime)
        {
            System.out.println(n + " is a prime number.");
        }
        else
        {
            System.out.println(n + " is not a prime number.");
        }
    }
}