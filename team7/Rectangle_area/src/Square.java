
public class Square {
	private int length;
	
	public Square(int length) {
		this.length = length;
	}
	
	public void draw(Bitmap bMap) {
		bMap.drawArea("Square: Area = " + length * length);
		bMap.drawShape("Square: length = " + length);
	}
}
