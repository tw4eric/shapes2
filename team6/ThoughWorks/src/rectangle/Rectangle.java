package rectangle;

public class Rectangle 
{
	public Rectangle(double length, double breadth)
	{
		this.length = length;
		this.breadth = breadth;
	}

	public void drawRectangle()
	{
		System.out.println("length of the Rect is: "+length);
		System.out.println("Breadth of the Rect is: "+breadth);
		System.out.println("Area of the Rect is: "+length*breadth);
		System.out.println("Perimeter of the Rect is: "+2*(length+breadth));
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	
	
	private double length;
	private double breadth;
}
