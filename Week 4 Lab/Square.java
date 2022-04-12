public class Square extends Rectangle{
    public Square() {
		super();
	}
	
	public double area() {
		System.out.print("This is the area method of class Square: ");
		return super.area();
	}
}