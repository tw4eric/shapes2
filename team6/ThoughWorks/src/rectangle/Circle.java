package rectangle;

public class Circle implements Shape
{
	public Circle(double radius)
	{
		this.radius = radius;
	}
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void drawShape() {
		// TODO Auto-generated method stub
		System.out.println("The radius of Circle is:"+radius);
		System.out.println("The area of Circle is:"+ Math.PI * radius * radius );
		
	}
}
