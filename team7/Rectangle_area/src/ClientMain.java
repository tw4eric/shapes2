public class ClientMain {

	private static Bitmap bitMap = new Bitmap();

	private static Rectangle r1 = new Rectangle(2, 3);
	private static Square s1 = new Square(2);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		r1.draw(bitMap);		
		bitMap.display();
		
		s1.draw(bitMap);
		bitMap.display();

	}
}
