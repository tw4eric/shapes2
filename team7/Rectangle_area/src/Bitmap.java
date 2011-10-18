
public class Bitmap {
	private String area;
	private String shape;
	
	public void drawArea(String area) {
		this.area = area;
	}
	
	public void drawShape(String shape) {
		this.shape = shape;
	}
	
	public void display() {
		System.out.println(area);
		System.out.println(shape);
	}
	
}
