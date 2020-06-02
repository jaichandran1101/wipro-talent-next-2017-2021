import java.util.*;
import java.io.*;
public class ReturnHalfStr 
{
    public static void main(String[] args) 
    {
		String str = "CatDogs";
		String res;
        if (str.length() % 2 == 0) 
        {
			res = str.substring(0, str.length() / 2);
        } 
        else 
        {
			res = null;
		}
		
		System.out.println(res);
	}

}