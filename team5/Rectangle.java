
public class Rectangle 
{
    long length;
    long width;
    
    Rectangle()
    {
    	length = 3;
    	width = 5;
    }
    void DisplayArea()
    {
        System.out.println("Length is " + length + " Width is " + width + " Area is " + (length * width) );
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.DisplayArea();	
        
	}

}
