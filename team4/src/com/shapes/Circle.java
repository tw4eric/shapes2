package com.shapes;

import com.shapes.interfaces.Shape;

public class Circle implements Shape {
	private double radius;
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double draw()
	{
		System.out.println("Radius"+this.getRadius());
		System.out.println("Radius"+(3.14 * this.getRadius()*this.getRadius()));
		return (3.14 * this.getRadius()*this.getRadius());
	}
}
