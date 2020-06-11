import java.io.*;
import  java.util.*;
class UsermainCode{
public int SumOfNdigits(int input1)
{
	int rem=0,sum=0,rem1=0,sum1=0;
	if(input1!=0)
	{
		while(input1>0)
		{
			rem=input1%10;
			sum=sum+rem;
			input1/=10;
		}
		rem1=sum%10;
		sum1=rem1+sum1;
		sum=sum/10;
		if(input1<0)
		{
			rem=input1%10;
			sum=sum+rem;
			input1/=10;
		}
		rem1=sum%10;
		sum1=rem1+sum1;
		sum=sum/10;
			
	}
	return sum1;
}
}