//import Rectangle_area.Rectangle
public class Rectangle_gui {
	int lenght;
	int width;

	/**
	 * @param args
	 */
	
	public void Area (int length, int width)
	{
		
	System.out.println("the rectangle area is " + length* width);	
	
	}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle();
		r1.setlength(5);
		r1.setwidth(6);
		 int length =r1.getlenght();
		int  width =r1.getwidth();
	    Rectangle_gui rg1 = new Rectangle_gui();
	    rg1.Area(length, width);
	    
	}

}
