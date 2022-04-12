public class Triangle extends Polygon {

    public Triangle() {
		super(3,"Triangle");
	}
	
    public double area() {
		Point[] vertices = getVertices();
		double side1 = Math.sqrt(Math.pow(vertices[0].getX()-vertices[1].getX(), 2) 
				+ Math.pow(vertices[0].getY()-vertices[1].getY(), 2));
		double side2 = Math.sqrt(Math.pow(vertices[2].getX()-vertices[1].getX(), 2) 
				+ Math.pow(vertices[2].getY()-vertices[1].getY(), 2));
		System.out.print("Area of a triangle: ");
		return (side1 * side2)/2;
	}
}
