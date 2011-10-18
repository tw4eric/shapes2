package com.test;

public class Circle extends Shape {
	
	private double radius;
	
	private double area;

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * @return the area
	 */
	public double getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	public void calcuateAreaOfCircle(double radius) {
		this.area = (22/7)*radius*radius;
	}

	@Override
	public void draw(BitMap bmp) {
		bmp.setDescription(getDescription());
	}

	public String getDescription()
	{
		return "Circle: radius : " + radius;
	}
	
}
