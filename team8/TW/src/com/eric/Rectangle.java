package com.eric;

public class Rectangle {

	private int length;
	private int breadth;
	
	public Rectangle(int len, int bre)
	{
		length = len;
		breadth = bre;
	}
	
	public int getLength()
	{
		return length;
	}

	public int getBreadth()
	{
		return breadth;
	}

	public int getArea()
	{
		return length*breadth;
	}
	
	public void drawRectangle()
	{
		System.out.println("length : " + length);
		System.out.println("breadth : " + breadth);
		System.out.println("area : " + length*breadth);
	}
	
	public static void main(String[] args)
	{
		Rectangle rec = new Rectangle(10, 20);
		rec.drawRectangle();
	}
}
