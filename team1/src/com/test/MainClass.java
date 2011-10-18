package com.test;

public class MainClass {
	
	public static void main(String[] args) {
		
		double length = Math.random();
		double breadth = Math.random();
		
		Rectangle rectangle = new Rectangle();
		
		while(length<=0)
		{
			length = Math.random();
		}
		
		while(breadth<=0)
		{
			breadth = Math.random();
		}
		
		rectangle.setLength(length);
		rectangle.setBreadth(breadth);
		
		rectangle.calcuateArea();
		
		
		
		System.out.println("The length of rectangle is :" + length);
		System.out.println("The breadth of rectangle is :" + breadth);
		System.out.println("The Area of rectangle is :" + rectangle.getArea());
		
	}
	

}
