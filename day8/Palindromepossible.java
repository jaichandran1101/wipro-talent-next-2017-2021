class UserMaincode
{  
 public int isPalinNumPossible(int input1)
 {  
  	int r,sum=0,temp;
	temp=input1;
	while(input1>0)
	{
		r=input1%10;
		sum=(sum*10)+r;
		input1/=10;	
	}
	if(temp==sum)
	{
		return 2;
	}
	else
	{
		return 1; 
	}
}  
}