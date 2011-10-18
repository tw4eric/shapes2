package com.test;

public class Rectangle extends Shape {
	
	private double length;
	
	private double breadth;
	
	private double area;

	/**
	 * @return the length
	 */
	public double getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * @return the breadth
	 */
	public double getBreadth() {
		return breadth;
	}

	/**
	 * @param breadth the breadth to set
	 */
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}
	
	public void calcuateAreaOfRectangle()
	{
		area = length*breadth;
	}

	@Override
	public void draw(BitMap bmp) {
		bmp.setDescription(getDescription());
	}

	public String getDescription()
	{
		return "Rectangle: length : " + length + " breadth : " + breadth;
	}
	
}
