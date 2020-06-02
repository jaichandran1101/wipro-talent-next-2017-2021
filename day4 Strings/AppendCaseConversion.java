import java.io.*;
import java.util.*;
public class AppendCaseConversion 
{
    public static void main(String[] args) 
    {
		String str1 = "Mark";
		String str2 = "Kate";
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		StringBuffer s = new StringBuffer();
		s.append(str1);
        if (str1.charAt(str1.length() - 1) == str2.charAt(0)) 
        {
			s.append(str2.substring(1, str2.length()));
        } 
        else 
        {
			s.append(str2);
		}
		System.out.println(s);		
		s.append(str1);
	}
}