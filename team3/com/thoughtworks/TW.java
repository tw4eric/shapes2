package com.thoughtworks;


public class TW {
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		
			
		rect.length=4;
		rect.breadth=4;
		rect.area=rect.length*rect.breadth;
		rect.display();
		
		new Circle(10).display();
		
				
		
	}

}

class Circle {
	int radius;
	
	Circle(int radius) {
		this.radius = radius;
	}
	
	public void display() {
		System.out.println("radius is : "  + radius);
		System.out.println("aread is : " + Math.PI*radius*radius);
	}
}
class Rectangle {
	
	int length;
	int breadth;
	int area;
	public void display(){
		System.out.println("Length is: " +length + " Breadth is: "+ breadth + " Area is: " +area);
	}
	
}