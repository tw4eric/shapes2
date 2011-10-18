//import Rectangle_area.Rectangle
public class Rectangle_gui {
	

	/**
	 * @param args
	 */
	Rectangle r1 = new Rectangle();
	int lenght;
	int width;
	public void Area (int length, int width)
	{
		 length =r1.getlenght();
		 width =r1.getwidth();
	System.out.println("the rectangle area is " + length* width);	
	r1.setlength(5);
	r1.setwidth(6);
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	    Rectangle_gui rg1 = new Rectangle_gui();
	    rg1.Area(2, 3);
	    
	}

}
