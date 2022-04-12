/* This file is given to you
 * DO NOT MODIFY IT
 */

public class Rectangle extends Polygon {

	/* Attributes */
	// No attribute specific to Rectangle
	
	/* Constructors */
	public Rectangle() {
		super(4,"rectangle");
	}
	
	public double area() {
		Point[] vertices = getVertices();
		double side1 = Math.sqrt(Math.pow(vertices[0].getX()-vertices[1].getX(), 2) 
				+ Math.pow(vertices[0].getY()-vertices[1].getY(), 2));
		double side2 = Math.sqrt(Math.pow(vertices[2].getX()-vertices[1].getX(), 2) 
				+ Math.pow(vertices[2].getY()-vertices[1].getY(), 2));
		return side1 * side2;
	}
		
}
