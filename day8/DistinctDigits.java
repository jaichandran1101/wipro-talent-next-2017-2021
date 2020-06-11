import java.io.*;
import  java.util.*;
class UserMainCode
{
  public int   DistinctDigits(int input1) 
  {
	int Count = 0;   
	int[] repeat = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	while (input1 != 0) 
	{
		int digit = input1 % 10;
		repeat[digit]++;
		input1/= 10;
	}
	for (int i = 0; i < 10; i++) 
	{
		if (repeat[i] == 1) 
     		{
			 Count++;
		}
		return Count;
	}
}
}