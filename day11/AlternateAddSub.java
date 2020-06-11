import java.io.*;
import java.util.*;
class AlternateAddSub 
{
	public int AddSub(int input1,int input2)
	{
		int n = input1;
		int result = n;
		int var = 0;
		if (input2 == 1) 
		{
			var = 1;
		}
		else 
		{
			var = 0;
		}
		for (int i = n-1, j = 0; i >= 1; i--, j++) 
		{
			if (j % 2 == var) 
			{
				result += i;
			}
			else 
			{
				result -= i;
			}
			System.out.println(result + " ");
		}
		return result;
	}
}