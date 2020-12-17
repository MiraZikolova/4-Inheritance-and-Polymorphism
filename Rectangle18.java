package inheritance18;

public class Rectangle18 extends GeometricObject18{
	private double height;
	private double width;
	
	public Rectangle18() {
	}
	
	public Rectangle18(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
	public Rectangle18(double height, double width, String color, boolean filled) {
		this.height = height;
		this.width = width;
		setColor(color);
		setFilled(filled);
	}
	
	//return height
	public double getHeight() {
		return height;
	}
	
	//set height
	public void setHeight(double height) {
		this.height = height;
	}
	
	//return width
	public double getWidth() {
		return width;
	}
	
	//set width
	public void setWidth(double width) {
		this.width = width;
	}
	
	//return perimeter
	public double getPerimeter() {
		return 2 * (height + width);
	}
	
	//return area
	public double getArea() {
		return height * width;
	}
}