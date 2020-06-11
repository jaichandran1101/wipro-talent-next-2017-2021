import java.io.*;
import  java.util.*;
class UserMainCode
{
	public int PrimeWithinrange(int input1, int input2) 
	{
		int pCount = 0;
		int n = input1;
		while(true) 
		{
			boolean Prime = true;
			for (int i = 2; i < n; i++) 
			{
				if (n % i == 0) 
        			{
					isPrime = false;
				}
				if (Prime) 
				{
					if (n > 1)
        				{
						pCount++;
					}
					n++;
				}
				if (n > input2) 
    				{
					  break;
				}
				return pCount;
			}
		}
	}
}