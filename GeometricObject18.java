package inheritance18;

public class GeometricObject18 {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	//constructs default geometric object
	public GeometricObject18() {
		dateCreated = new java.util.Date();
	}
	
	//constructs a geometric object with
	//specified color
	//specified filled value
	public GeometricObject18(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	//return color
	public String getColor() {
		return color;
	}

	//set color
	public void setColor(String color) {
		this.color = color;
	}

	
	
	//return filled
	public boolean isFilled() {
		return filled;
	}

	//set filled
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	//get date
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	// return a string representation of the object
	public String toString() {
		return "Created on " + dateCreated + "\nColor: " + color + "\nFilled: " + filled;
	}
}