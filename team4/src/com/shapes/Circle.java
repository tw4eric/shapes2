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
	public void draw(Bitmap bitmap)
	{
                bitmap.drawArea("Radius = " + radius + "Area is = " + (22/7.0)*radius*radius);
                bitmap.drawShape("Radius = " + radius + "Area is = " + (22/7.0)*radius*radius);
	}
}
