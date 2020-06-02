import java.util.*;
import java.io.*;
public class AlpDigitSpl
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter ch:");
        char ch =s.next().charAt(0);
        if(ch>=48 && ch<=57)
        {
            System.out.print(" Digit");
        }
        else if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
        {
            System.out.print("Alphabet");
        }
        else
        {
            System.out.print(" special character");
        }
    }
}
