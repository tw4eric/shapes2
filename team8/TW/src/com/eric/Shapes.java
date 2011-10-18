package com.eric;

public abstract class Shapes {

	public abstract int getArea();

	public abstract void draw();

	public static void main(String[] args) {
		Rectangle rec = new Rectangle(10, 20);
		rec.draw();
		Circle cir = new Circle(20);
		cir.draw();
	}
}
