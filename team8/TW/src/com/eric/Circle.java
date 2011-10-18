package com.eric;

public class Circle {

	private int radius;

	public Circle(int rad) {
		radius = rad;
	}

	public int getRadius() {
		return radius;
	}

	public int getArea() {
		return (22/7) * radius * radius;
	}

	public void draw() {
		System.out.println("radius : " + radius);
		System.out.println("area : " + getArea());
	}

}
