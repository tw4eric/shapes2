package com.thoughworks;


public class TW {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		
		BitMap bitMap = new BitMap();
		
		
		rect.length=4;
		rect.breadth=4;
		rect.area=rect.length*rect.breadth;
		
		rect.draw(bitMap);
		bitMap.display();
		
		
		new Circle(10).draw(bitMap);
		bitMap.display();
		
		new Square(6).draw(bitMap);
		bitMap.display();
				
		
	}

}

class Circle {
	int radius;
	
	Circle(int radius) {
		this.radius = radius;
	}
	
	/*public void display() {
		System.out.println("radius is : "  + radius);
		System.out.println("aread is : " + Math.PI*radius*radius);
	}*/
	
	public void draw(BitMap bitMap)
	{
		bitMap.setDrawShape("Circle : radius = " + radius);
		bitMap.setDrawArea("Circle : Area = " + Math.PI*radius*radius);
	}
}

class Rectangle {
	
	int length;
	int breadth;
	int area;
	/*public void display(){
	
		System.out.println("Length is: " +length + " Breadth is: "+ breadth + " Area is: " +area);
	}*/
	
	public void draw(BitMap bitMap)
	{
		bitMap.setDrawShape("Rectangle : l = " + length + ", b = " + breadth);
		bitMap.setDrawArea("Rectangle : Area = " + (length * breadth));
	}
}

class Square {
	
	int length;
	
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Square(int length)
	{
		this.length = length;
	}
	
	int area;
	/*public void display(){
	
		System.out.println("Length is: " +length + " Breadth is: "+ breadth + " Area is: " +area);
	}*/
	
	public void draw(BitMap bitMap)
	{
		bitMap.setDrawShape("Square : side = " + length);
		bitMap.setDrawArea("Square : Area = " + (length * length));
	}
}

class BitMap
{
	private String drawArea;
	private String drawShape;
	
	public String getDrawArea() {
		return drawArea;
	}
	public void setDrawArea(String drawArea) {
		this.drawArea = drawArea;
	}
	public String getDrawShape() {
		return drawShape;
	}
	public void setDrawShape(String drawShape) {
		this.drawShape = drawShape;
	}
	
	public void display()
	{
		System.out.println(drawArea);
		System.out.println(drawShape);
	}
}