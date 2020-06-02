import java.util.*;
import java.io.*;
public class ColorCode 
{
  public static void main(String[] args) 
  {
    Scanner s=new Scanner(System.in);
    System.out.println("enter starting colour in caps :");
    char ch=s.next().charAt(0);
    switch(ch)
    {
        case 'R':
                    System.out.println("Red");
                    break;
        case 'Y':
                    System.out.println("Yellow");
                    break;
        case 'G':
                    System.out.println("Green");
                    break;
        case 'B':
                    System.out.println("Blue");
                    break;
        case 'w':
                    System.out.println("White");
                    break;
        case 'O':
                    System.out.println("Orange");
                    break;
        default:
                    System.out.println("Invalid month");
    }
  }
}