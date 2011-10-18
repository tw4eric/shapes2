
public class Rectangle {

	int length; 
	int width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}
	public void draw(Bitmap bMap) {
		bMap.drawArea("Rectangle: Area = " + length * width);
		bMap.drawShape("Rectangle: length = " + length + ", width = " + width);
	}
}
