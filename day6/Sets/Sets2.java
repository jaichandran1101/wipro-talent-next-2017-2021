import java.io.*;
import java.util.*;
public class Sets2 
{
	public static void main(String[] args) 
	{
		HashSet<String> set = new HashSet<>();
		set.add("Bob");
		set.add("Alice");
		set.add("John");
		set.add("Richard");
		Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}
}