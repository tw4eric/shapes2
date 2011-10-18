
public abstract class Shape {
	public static Shape getRectangle()
	{
		return new Rectangle(10,20);
	}

	public static Shape getCircle()
	{
		return new Circle(10);
	}

	abstract public void display();

}
