import java.io.*;
import  java.util.*;
class UserMainCode
{
  public int  UniqueDigits(int input1) 
  {
		int Count = 0;
		boolean[] unique= {false, false, false, false, false, false, false, false, false, false};
		while (input1 != 0) 
		{
			int digit = input1 % 10;
			if (unique[digit] == false) 
			{
				unique[digit] = true;
				Count++;
			}
			number /= 10;
		}
		return Count;
	}
}