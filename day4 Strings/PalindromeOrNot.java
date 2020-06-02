import java.util.*;
import java.io.*;
public class PalindromeOrNot 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter any string : ");
        Scanner s = new Scanner(System.in);
        String Str = s.nextLine();
        String revStr = "";
        char[] c = Str.toCharArray();
        for( int i = c.length-1;i>=0;i--) 
        {
            revStr = revStr+c[i];
        }
        if (Str.equals(revStr)) 
        {
            System.out.println("String is a palindrome.");
        } 
        else 
        {
            System.out.println("String is not a palindrome.");
        }
    }
}