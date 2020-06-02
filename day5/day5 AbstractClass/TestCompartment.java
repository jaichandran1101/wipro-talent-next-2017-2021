import java.util.*;
import java.io.*;
public class TestCompartment 
{
	public static void main(String[] args) 
	{
		Compartment[] compartments = new Compartment[10];
		Random rand = new Random();
	    	for (int i = 0; i < 10; i++) 
		{
	    		int randomNum = rand.nextInt((4 - 1) + 1) + 1;
	    		if (randomNum == 1)
			{
	    			compartments[i] = new FirstClass();
	    		}
			else if (randomNum == 2)
	    		{
				compartments[i] = new Ladies();
	    		}
			else if (randomNum == 3)
	    		{
				compartments[i] = new General();
	    		}
			else if (randomNum == 4)
	    		{
				compartments[i] = new Luggage();
	    		}
	    		compartments[i].notice();
	    	}
	}
}
