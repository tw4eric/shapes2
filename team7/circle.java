
public class circle {

	/**
	 * @param args
	 */
	int radius;
	public void area (int radius)
	{
		System.out.println("the cirlce radius is::"+ radius);
		System.out.println("the cirlce area is::"+ 3.14*radius*radius);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    circle c1 = new circle();
    c1.area(4);
    	    	
    
	}

}
