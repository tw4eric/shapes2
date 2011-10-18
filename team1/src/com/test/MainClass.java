package com.test;

public class MainClass {
	
	public static void main(String[] args) {
		
		double length = Math.random();
		double breadth = Math.random();
		
		double radius = Math.random();
		
		Rectangle rectangle = new Rectangle();
		
		Circle circle = new Circle();
		
		length = getPositiveValue(length);
		breadth = getPositiveValue(breadth);
		radius = getPositiveValue(radius);
		
		
		rectangle.setLength(length);
		rectangle.setBreadth(breadth);
		
		rectangle.calcuateAreaOfRectangle();
		
		circle.setRadius(radius);
		circle.calcuateAreaOfCircle(radius);
		
		System.out.println("The length of rectangle is :" + length);
		System.out.println("The breadth of rectangle is :" + breadth);
		System.out.println("The Area of rectangle is :" + rectangle.getArea());
		
		System.out.println("The radius of circle is :" + radius);
		System.out.println("The Area of circle is :" + circle.getArea());
		
		
	}
	
	public static double getPositiveValue(double value)
	{
		while(value<=0)
		{
			value = Math.random();
		}
		
		return value;
	}
	

}
