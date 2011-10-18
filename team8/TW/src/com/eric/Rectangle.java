package com.eric;

public class Rectangle extends Shapes {

	private int length;
	private int breadth;

	public Rectangle(int len, int bre) {
		length = len;
		breadth = bre;
	}

	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}

	public int getArea() {
		return length * breadth;
	}

	public void draw() {
		System.out.println("length : " + length);
		System.out.println("breadth : " + breadth);
		System.out.println("area : " + getArea());
	}
}
