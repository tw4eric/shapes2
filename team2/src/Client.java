public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape rectangle = Shape.getRectangle();
		rectangle.display();
		
		System.out.println("===========================");
		
		Shape circle = Shape.getCircle();
		circle.display();
	}
}

