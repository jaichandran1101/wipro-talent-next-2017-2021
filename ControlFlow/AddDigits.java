import java.io.*;
import java.util.*;
public class AddDigits 
{
  public static void main(String args[])
  {
    int sum=0,rem=0;
    Scanner s=new Scanner(System.in);
    System.out.println("enter n :");
    int n=s.nextInt();
    while(n>0)
    {
      rem=n%10;
      sum=sum+rem;
      n=n/10;
    }
    System.out.println("Sum of Digits : "+ sum);
 }
}
