
public abstract class Shape {
	public static Shape getShape()
	{
		return new Rectangle(10,20);
	}
	abstract public void display();

}
