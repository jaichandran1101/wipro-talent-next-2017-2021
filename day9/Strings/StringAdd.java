import java.io.*;
import  java.util.*;
import java.math.BigDecimal;
class StringAdd 
{
	public String addNumberStrings(String input1,String input2)
	{
		BigDecimal a = new BigDecimal(input1);
		BigDecimal b = new BigDecimal(input2);
		return String.valueOf(a.add(b));
	}
}
