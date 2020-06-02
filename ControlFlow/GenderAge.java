import java.util.*;
import java.io.*;
public class GenderAge 
{
  public static void main(String[] args) 
  {
    String gen=args[0];
    int age= Integer.parseInt(args[1]);
    if(gen.equalsIgnoreCase("Female"))
        {
            if(age>=1 && age<=58)
            {
                System.out.println("Interest == 8.2%");
            }
            else if (age>=58 && age<=120)
            {
                System.out.println("Interest == 7.6%");
            }
        }
    else
        {
            if(age>=1 && age<=60)
            {
                System.out.println("Interest == 9.2%");
            }
            else if(age>=60 && age<=120)
            {
                System.out.println("Interest == 8.3%");
            }
        }
    }
}
