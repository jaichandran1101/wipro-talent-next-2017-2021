import java.io.*;
import java.util.*;
public class PalindromeNum
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter number:");
    int n=s.nextInt();
    int rev = 0, rem, d;
    ori_int = n;
    while( n != 0 )
    {
        rem = n % 10;
        rev = rev * 10 + rem;
        n /= 10;
    }
    if (d == rev)
    {
        System.out.println(ori_int + " is a palindrome.");
    }
    else
    {
        System.out.println(ori_int + " is not a palindrome.");
    }
  }
}    

