import java.io.*;
import java.util.*;
public class RemoveFirstLastChar 
{
    public static void main(String[] args) 
    {
		String str = "Wipro";
		str = str.substring(1, str.length() - 1);
		System.out.println(str);
	}
}