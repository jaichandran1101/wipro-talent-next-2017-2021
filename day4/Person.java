public class Person 
{
	protected String name;
    public Person(String name) 
    {
		this.name = name;
	}
    public String getName() 
    {
		return name;
	}
    public String toString() 
    {
		return "Person [name=" + name + "]";
	}
}
