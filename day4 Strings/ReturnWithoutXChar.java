import java.io.*;
import java.util.*;
public class ReturnWithoutXChar 
{
    public static void main(String[] args) 
    {
		String str = "xHix";
        if (str.charAt(0) == 'x')
        {
			str = str.substring(1, str.length());
        }
        if (str.charAt(str.length() - 1) == 'x')
        {
			str = str.substring(0, str.length() - 1);
        }
		System.out.println(str);
	}   
}