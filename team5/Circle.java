public class Circle {

	double radius;
	
	Circle()
	{
		radius=Math.random();
	}
	
	public void display()
	{
		System.out.println("Radius is " + radius + " Area is " + ((22/7.0)*radius*radius) );
	}
	public static void main(String[] args) {
		
		Circle c=new Circle();
		c.display();

	}

}

