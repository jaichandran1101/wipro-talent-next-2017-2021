import java.io.*;
import java.util.*;


public class Positivenegativezero {
    public static void main(String args[] ) {
        int num;
        System.out.println("enter num:");
        Scanner sc=new Scanner(System.in);
        num = sc.nextInt();
		
		if(num > 0)
		{
			System.out.println(" num is postive ");
		}
		else if(num==0)
		{
			System.out.println(" num is zero ");
		}
		else
		{
			System.out.println(" num is negative ");
		}
    }
}