import java.io.*;
import java.util.*;
public class Wrap4 
{
	public static void main(String[] args) 
	{
		Employee emp = new Employee("Dark Lord");
		Employee empClone = emp.clone();
		empClone.setName("Anonymous User");
		System.out.println(empClone.getName());
		System.out.println(emp.getName());
	}

}
class Employee implements Cloneable {
	private String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
//	public Employee(Employee emp) {
//		this.name = emp.name;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public Employee clone() {
		try {
			return (Employee) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning Not Allowed");
			return this;
		}		
	}
}

