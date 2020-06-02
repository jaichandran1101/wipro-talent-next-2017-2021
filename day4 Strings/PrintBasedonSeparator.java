import java.util.*;
import java.io.*;
public class PrintBasedonSeparator 
{
    public static void main(String[] args) 
    {
		String str1 = "Wipro";
		String str2 = "X";
		int n= 3;
		StringBuffer s = new StringBuffer();
        for (int i = 0 ; i < n; i++)
        { 
            s.append(str1).append(str2);
        }
		System.out.println(s);
	}
}