public class Compartment 
{
	private double height;
	private double width;
	private double breadth;
	public Compartment(double height, double width, double breadth) 
	{
		super();
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}
	public String toString() 
	{
		return "Compartment [height=" + height + ", width=" + width + ", breadth=" + breadth + "]";
	}
}
