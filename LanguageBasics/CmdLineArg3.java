import java.io.*;
import java.util.*;
public class CmdLineArg3 
{
    public static void main(String [] args)
    {
        int c;
        c=Integer.parseInt(args[0])+ Integer.parseInt(args[1]);
        System.out.print("The sum of ");
        System.out.print(args[0] +" and " +args[1] +" is " +c);
    }
}