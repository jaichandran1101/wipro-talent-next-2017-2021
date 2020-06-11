import java.io.*;
import  java.util.*;
Class UserMainCode
{
	public int isPrime(int input1)
	{
		int num, count, i;
    num=1;
    count=0;
 
    while (count < input1){
      num=num+1;
      for (i = 2; i <= num; i++){ //Here we will loop from 2 to num
        if (num % i == 0) {
          break;
        }
      }
      if ( i == num){//if it is a prime number
        count = count+1;
      }
    }
    return  num;
		