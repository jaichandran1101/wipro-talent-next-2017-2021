import java.util.*;
import java.io.*;
public class SwapCharPos 
{
    public static void main(String[] args) 
    {
		String a = "Helloo";
		String b = "World";
        String str1 = a.length() > b.length() ? a : b;
		String str2 = a.length() < b.length() ? a : b;
        StringBuffer s = new StringBuffer();
        for (int i = 0; i < str2.length(); i++) 
        {
			s.append(a.charAt(i)).append(b.charAt(i));
		}
		s.append(str1.substring(str2.length(), str1.length()));
		System.out.println(s);
	}
}