import java.util.*;
import java.io.*;
public class CmdLineArg 
{
  public static void main(String[] args) 
  {
        if(args.length==0)
        {
            System.out.println("no values");
        }
        else
        {
            for(i=0;i<=args.length;i++)
            {
                System.out.println(args[i]+ " ,");
            }
        }
   }
}