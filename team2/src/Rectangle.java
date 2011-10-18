
public class Rectangle extends Shape{
	private int length;
	private int breadth;
	
	public Rectangle(int length, int breadth) {
		this.length=length;
		this.breadth=breadth;
		
	}
	
	@Override
	public void display() {
		System.out.println("Length: "+length);
		System.out.println("Breadth: "+breadth);
		System.out.println("Area: "+length*breadth);
	}

}
