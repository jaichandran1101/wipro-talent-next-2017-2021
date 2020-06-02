import java.io.*;
import java.util.*;
public class Floyd 
{
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter number:");
    int n=s.nextInt();
    for(int i=1;i<=n;i++)
    {
      for(int j=1;j<=i;j++)
      {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
