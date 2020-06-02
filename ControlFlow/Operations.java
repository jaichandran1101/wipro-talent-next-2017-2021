import java.io.*;
import java.util.*;
public class Operations
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int x,i=0,y,sum,diff;
        char ch;
        x=s.nextInt();
        y=s.nextInt();
        System.out.println("a.Add");
        System.out.println("b.Sub");
        System.out.println("y.Exit");
        System.out.println("Enter the operation to be performed:");
        ch=s.next().charAt(0);
        switch(ch)
        {
            case 'a':
                sum=x+y;
                System.out.print("Addition of");
                System.out.print(x + " and " + y + " is: " +sum);
                break;
            case 'b':
                diff=x-y;
                System.out.print("Subtraction of");
                System.out.print(x + " and " + y + " is: " +diff);
                break;
            case 'y':
                break;
            case 'Y':
                break;
            default:
                System.out.println("Enter Valid Option");
        }
    }
}