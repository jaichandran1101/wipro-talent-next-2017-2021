class UserMaincode 
{
	public palindromeornot(int input1) 
	{
		int reversedInteger = 0, remainder, originalInteger;
		originalInteger = input1;
		while(input1!= 0 )
        {
            remainder = input1 % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            input1 /= 10;
        }

        if (originalInteger == reversedInteger)
        {
	    return 2;
        }
	else
        {
	    return 1;
	}
}
}