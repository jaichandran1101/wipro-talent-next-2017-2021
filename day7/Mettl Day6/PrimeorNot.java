import java.io.*;
import  java.util.*;
Class UserMainCode
{
	public int PrimeorNot(int input1)
	{
		boolean flag=false;
		for(int i=2;i<input1/2;i++)
		{
			if(input1%i==0)
			{
				flag=true;
				break;
			}
		}
		if(!flag)
		{
			return 2;
		}
		else
		{
			return 1;
		}
		
	}
}