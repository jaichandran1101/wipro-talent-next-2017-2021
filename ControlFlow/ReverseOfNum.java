import java.io.*;
import java.util.*;
public class ReverseOfNum
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter number:");
    int n=s.nextInt();
    int rev=0;
    while(n!= 0) 
    {
        int digit = n % 10;
        rev = rev * 10 + digit;
        n /= 10;
    }
    System.out.println("Reversed Number: " + rev);
  }
}
