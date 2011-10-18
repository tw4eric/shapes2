
public class Rectangle {
	private double length;
	private double breadth;
public double draw()
{
System.out.println("Length:"+this.getLength());	
System.out.println("Breadth:"+this.getBreadth());
System.out.println("Area:"+(this.getLength()*this.getBreadth()));
return (this.getLength()*this.getBreadth());
}
public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length = length;
}
public double getBreadth() {
	return breadth;
}
public void setBreadth(double breadth) {
	this.breadth = breadth;
}

}
