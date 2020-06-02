import java.util.*;
import java.io.*;
public class RemoveCharCondtion 
{
    public static void main(String[] args) 
    {
		String str = "ab*cd";
		String[] str1 = str.split(".[\\*]+.");
		StringBuffer s = new StringBuffer();
        for (String x : str1)
        {
			s.append(x);
        }
		System.out.println(s);
    }
}