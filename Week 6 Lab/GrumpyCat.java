
public class GrumpyCat extends Cat { // a grumpy cat IS A cat
	/* Attributes *********************************************/
	// It inherits the attributes of Cat
	// Here we are defining a new attribute
	private int levelOfGrumpiness;
	
	/* Constructors */
	public GrumpyCat() {
		super();
	}
	
	public GrumpyCat(String breed, String name, int age) {
		super(breed, name, age);
	}
	
	// This second constructor is an overload of the first one (polymorphism)
	public GrumpyCat(int grump) {
		super();
		levelOfGrumpiness = grump;
	}
	
	/* Getters & Setters ****************************************/
	/**
	 * @return the levelOfGrumpiness
	 */
	public int getLevelOfGrumpiness() {
		return levelOfGrumpiness;
	}

	/**
	 * @param levelOfGrumpiness the levelOfGrumpiness to set
	 */
	public void setLevelOfGrumpiness(int levelOfGrumpiness) {
		this.levelOfGrumpiness = levelOfGrumpiness;
	}
	
	
	/* Other methods ********************************************/
	
	/* MEOW 
	 * is used from the parent class
	 */
	
	/* PLAYS 
	 * is overridden (polymorphism)
	 */
	public void plays() { // over ride of plays from class Cat + polymorphism
		if (levelOfGrumpiness >= 2)
			System.out.println("it does not play!!!");
		else 
			System.out.println("it only sometimes plays!!!");
	}

}