import java.io.*;
import  java.util.*;
class TheNambiarNumberGenerator 
{
	public int nnGenerator(String input1)
	{
		String num1 = input1;
		StringBuilder num2 = new StringBuilder();
		for (int i = 0; i < num1.length(); i++) 
		{
			int d1 = Integer.parseInt(String.valueOf(num1.charAt(i)));
			int d2 = d1 % 2 == 0 ? 0 : 1; 
			int sum = firstDigit;
			int j = i + 1;
			if (j == num1.length()) 
			{
				num2.append(d1);
				break;
			}
			while (true) 
			{
				sum += Integer.parseInt(String.valueOf(num1.charAt(j++)));
				if (sum % 2 != d2 || j >= num1.length()) 
				{
					num2.append(sum);
					i = j - 1;
					break;
				}
			}
		}
		return Integer.parseInt(num2.toString());
	}
}