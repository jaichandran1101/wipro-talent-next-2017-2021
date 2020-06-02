import java.util.*;
import java.io.*;
public class ReturnLastCharsCond 
{
    public static void main(String[] args) 
    {
		String str = "Wipro";
		int n = 3;
		StringBuffer s = new StringBuffer();
        for (int i = 0; i < n; i++) 
        {
			s.append(str.substring(str.length() - n));
		}
        System.out.println(s);
	}
}