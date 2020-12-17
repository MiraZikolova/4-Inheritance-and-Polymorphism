package inheritance18;

public class Circle18 extends GeometricObject18 {
	private double radius;

	public Circle18() {
	}
	
	public Circle18(double radius) {
		this.radius = radius;
	}
	
	public Circle18(double radius, String color, boolean filled) {
		this.radius = radius;
		setColor(color);
		setFilled(filled);
	}
	
	public double getRadius() {
		return radius;
	}
	
	//sets new radius
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//return area
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	//return diameter
	public double getDiameter() {
		return 2 * radius;
	}
	
	//return parimeter
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	//print circle description
	public void printCircle() {
		System.out.println("The circle is created " + getDateCreated() + 
				"\nThe radius is: " + getRadius());
	}
}