import java.util.*;
import java.io.*;
public class Backwards
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        for(int i=100;i>=0;i--)
        {
            System.out.print(i);
            System.out.print(" ");
        }
    }

}