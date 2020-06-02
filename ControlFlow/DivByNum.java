import java.io.*;
import java.util.*;
public class DivByNum
{
  public static void main(String args[])
  {
    int count=0,i=1;
    {
      while(count<5)
      {
        if(i%2==0 && i%3==0 && i%5==0)
        {
          System.out.println(i);
          count++;
        }
        i++;
      }
    }
  }
}    

