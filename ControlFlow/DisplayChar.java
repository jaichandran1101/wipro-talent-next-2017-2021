import java.util.*;
import java.io.*;
public class DisplayChar
{
	public static void main(String[] args) 
    {
	    char item1,item2;
        Scanner sc=new Scanner(System.in);
	    System.out.println("enter the item1");
	    System.out.println("enter item2");
		item1=sc.next().charAt(0);  
        item2=sc.next().charAt(0);
        if (item1>item2)
         {  
            System.out.println(item2+" , "+item1);
         }
        else
         { 
            System.out.println(item1+" , "+item2);
         }
    }
    
}