
public class Polygon {

	/* Attributes */
	private int size; 
	private Point[] vertices = new Point[size]; // list of adjacent vertices
	private String name;
	
	/* Constructors ***************************************************/
	public Polygon() {}
	
	public Polygon(int size, String str) {
		this.size = size;
		name = str;
	}

	public Polygon(Point[] P, String str) {
		size = P.length;
		name = str;
		vertices = P;
	}

	/* Getters and Setters *********************************************/
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;	
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the vertices
	 */
	public Point[] getVertices() {
		return vertices;
	}

	/**
	 * @param vertices the vertices to set
	 */
	public void setVertices(Point[] vertices) {
		this.vertices = vertices;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
    
	/* Other Methods *********************************************************/
	public double perimeter() {
		if (size <= 1) return 0;
		double result = 0;
		Point current = vertices[0];
		for (int i = 1; i < vertices.length; i++) {
			result += Math.sqrt(Math.pow(current.getX()-vertices[i].getX(), 2) 
								+ Math.pow(current.getY()-vertices[i].getY(), 2));
			current = vertices[i];
		}
		result += Math.sqrt(Math.pow(current.getX()-vertices[0].getX(), 2) 
				+ Math.pow(current.getY()-vertices[0].getY(), 2));

		return result;
	}
	
	public double area() {
		System.out.println("I won't compute it at this level. Please run it at the subclass level");
		return -1;
	}
	
	public String toString() {
		String result = "{";
		for (int i = 0; i<vertices.length-1; i++)
			result += vertices[i].toString() + ", ";
		result += vertices[vertices.length-1].toString()+ "}";
		return result;
	}
	
	public double distanceMin(Polygon P) {
		double minDistance = this.vertices[1].distance(P.getVertices()[1]);
		for(int i=0; i<this.vertices.length; i++){
            for(int j=0; j<P.getVertices().length; j++){
                double currentDistance = this.vertices[i].distance(P.getVertices()[j]);
				if(currentDistance < minDistance){
					minDistance = currentDistance;
				}
            }
        }
		return minDistance; // This line is to be replaced: it is simply a placeholder so that you code compiles
	}
	/* This method will execute as P1*P2. Lets say P1 has 3 in the array and P2 has 4. P1[1] will go
	through every element at P2 which will be 4. Then so on with the next elements in P1, P1[2] will
	go trough all elements in P2 and the same for P2[3].*/
}
