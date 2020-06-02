import java.util.*;
import java.io.*;
public class CaseConversion 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter character");
        char ch=s.next().charAt(0);
        int temp;
        if(ch>='a' && ch<='z')
        {
            System.out.println(ch+"->");
            temp=(int)ch;
            ch=(char)(temp-32);
            System.out.println(ch);
        }
        else
        {
            System.out.println(ch+"->");
            temp=(int)ch;
            ch=(char)(temp+32);
            System.out.println(ch);
          }
    }
}
