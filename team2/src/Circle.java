
public class Circle extends Shape {
	
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void display() {
		System.out.println("Circle:");
		System.out.println("Radius: " + radius);
		System.out.println("Area:" + (22/7) * radius);
	}

}
