package inheritance18;

import java.util.Scanner;

public class TestCicleRectangleTriangle18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle18 circle = new Circle18(1);
		System.out.println("A circle " + circle.toString());
		System.out.println("The color is " + circle.getColor());
		System.out.println("The radius is " + circle.getRadius());
		System.out.println("The area is " + circle.getArea());
		System.out.println("The diameter is " + circle.getDiameter());
		
		Rectangle18 rectangle = new Rectangle18(2, 4);
		System.out.println("\nA rectangle " + rectangle.toString());
		System.out.println("The area is " + rectangle.getArea());
		System.out.println("The perimeter is " + rectangle.getPerimeter());
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nInput side a of the triangle: ");
		double a = sc.nextDouble();
		System.out.println("\nInput side b of the triangle: ");
		double b = sc.nextDouble();
		System.out.println("\nInput side c of the triangle: ");
		double c = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("Input color of the triangle: ");
		String color = sc.nextLine();
		System.out.println("Is the triangle filled (true/false): ");
		boolean isFilled = sc.nextBoolean();
		
		Triangle18 triangle = new Triangle18(a,b,c);
		triangle.setColor(color);
		triangle.setFilled(isFilled);
		System.out.println(triangle.triangleDescription() + "\n" + triangle.toString());
		System.out.println("Perimeter: " + triangle.getPerimeter());
		System.out.println("Area: " + triangle.getArea());
		sc.close();
	}

}