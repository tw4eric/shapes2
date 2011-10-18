package rectangle;

public class Main 
{
	public static void main(String args[])
	{
		try
		{
			
			if (args == null || args.length != 2)
			{
				System.out.println("Usage : java Main <lenght> <breadth>");
				System.exit(1);
			}
			
			double length = Double.parseDouble(args[0]);
			double breadth = Double.parseDouble(args[1]);
			
			if ((length <= 0) ||  (breadth <= 0))
			{
				System.out.println("Length and Breadth can't be zero or negative");
				System.exit(1);
			}
			
			Rectangle rectangle = new Rectangle(length, breadth);
			
			rectangle.drawRectangle();
		
		}
		catch(NumberFormatException e)
		{
			System.out.println("Lenght and Breadth should be numeric");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
