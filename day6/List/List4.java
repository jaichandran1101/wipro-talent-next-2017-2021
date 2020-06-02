import java.util.*;
import java.io.*;
public class List4 {
	public static void main(String[] args) 
	{
		List<Object> list = new MyArrayList<>();
		try 
		{
			list.add(15);
			list.add(1.2F);
			list.add(3.1415D);
			list.add("Test");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		System.out.println(list);
	}
}
class MyArrayList<E> extends ArrayList<E> {
	@Override
	public boolean add(E e) {
		if (e instanceof Integer || e instanceof Float || e instanceof Double) {
			super.add(e);
			return true;
		} else {
			throw new ClassCastException("Only Integer, Float, and Double are supported.");
		}
	}
}
