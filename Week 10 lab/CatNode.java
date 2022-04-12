
public class CatNode {

	/* Attributes ***************************/
	// Data: a Cat
	private Cat catData;
	// Link/address to next
	private CatNode next;
	
	/* Constructors *************************/
	public CatNode() {}
	
	public CatNode(Cat data) {
		catData = data;
		next = null;
	}

	public CatNode(Cat data, CatNode restOfList) {
		catData = data;
		next = restOfList;
	}

	/* Getters & Setters ********************/
	/**
	 * @return the catData
	 */
	public Cat getCatData() {
		return catData;
	}

	/**
	 * @param catData the catData to set
	 */
	public void setCatData(Cat catData) {
		this.catData = catData;
	}

	/**
	 * @return the next
	 */
	public CatNode getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(CatNode next) {
		this.next = next;
	}

	/* Other Methods ************************/
	/**
	 * This method computes and returns the size of the list.  
	 * The size of a list is its number of nodes.
	 */	
	public int size() {
		CatNode iter = this;
		int size = 0;
		while (iter != null) {
			size++;
			iter = iter.getNext();
		}
		return size;
	}
	
	/**
	 * TODO 2.1: PLEASE COMPLETE THE CODE BELOW.
	 * This method prints the content of each node of a list,
	 * from the front node to the last node.
	 */
    public void print() {
        CatNode iter = this;
        // WRITE YOUR CODE HERE
        while (iter != null) {
                iter.getCatData().print();
                iter = iter.getNext();
        }
    }
}
