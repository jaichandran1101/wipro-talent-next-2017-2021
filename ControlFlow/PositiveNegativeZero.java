import java.util.*;
import java.io.*;
public class PositiveNegativeZero
{
    public static void main(String[] args)
    {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=n.nextInt();
        if(num>0)
        {
            System.out.println("It is a positive integer.");
        }
        else if(num==0)
        {
            System.out.println("It is Zero.");
        }
        else
        {
            System.out.println("It is a negative integer.");
        }
    }
}