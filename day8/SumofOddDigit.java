import java.io.*;
import  java.util.*;
class UsermainCode{
public int SumofOddDigit(int input1)
{
	int rem=0,sum=0;
	while(input1>0)
	{
		rem=input1%10;
		if(rem%2!=0)
		{
		 	sum=sum+rem;
		}
		input1=input1/10;
	}
	return sum;
}
}