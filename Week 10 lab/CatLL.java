
public class CatLL {

	/* Attributes ***************************/
	// Head: a CatNode
	private CatNode head;
	// List size
	private int size;

	/* Constructors ************************/
	public CatLL() {}
	
	public CatLL(CatNode head) {
		this.head = head;
		this.size = head.size();
	}

	/* Getters & Setters ********************/
	/**
	 * @return the head
	 */
	public CatNode getHead() {
		return head;
	}

	/**
	 * @param head the head to set
	 */
	public void setHead(CatNode head) {
		this.head = head;
	}

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
	
	/* Add Methods *************************/
	/**
	 * This method adds a node at the front of the list.
	 * This node contains the value of the parameter:
	 * @param mycat
	 */
	public void addFront(Cat mycat) {
		CatNode newFront = new CatNode(mycat,head);
		head = newFront;
		size++;
	}

	/**
	 * This method adds a node at the end of the list.
	 * This node contains the value of the parameter:
	 * @param mycat
	 */
	public void addEnd(Cat mycat) {
		CatNode newNode = new CatNode(mycat);
		if (head == null) head = newNode;
		else {
			CatNode iter = head;
			while (iter.getNext() != null) {
				iter = iter.getNext();
			}
			iter.setNext(newNode);
		}
		size++;
	}

	/**
	 * This method adds a node after the rank-th node: 
	 *  @param rank
	 * This node contains the value of the parameter:
	 * @param mycat
	 */
	public void add(Cat mycat, int rank) {
		if (rank >= size) { // then: we add the node at this end
			addEnd(mycat);
		} else {
			CatNode iter = head;
			for (int i=0; i<rank-1; i++) {
				iter = iter.getNext();
			}
			CatNode newNode = new CatNode(mycat, iter.getNext());
			iter.setNext(newNode);
		}
		size++;
	}

	/* Remove Methods *************************/
	/**
	 * This method removes a node at the front of the list.
	 */
	public void removeFront() {
		if (head == null) return;
		head = head.getNext();
		size--;
	}

	/**
	 * This method removes a node at the end of the list.
	 */
	public void removeEnd() {
		if (head == null) return;
		CatNode iter = head;
		while (iter.getNext() != null && iter.getNext().getNext() != null) {
			iter = iter.getNext();
		}
		iter.setNext(null);
		size--;
	}

	/**
	 * TODO 2.3: PLEASE COMPLETE CODE BELOW WHERE INSTRUCTED
	 * This method removes the rank-th node: 
	 *  @param rank
	 */
	public void remove(int rank) {
		if (rank > size) { // then: no node at rank, we do nothing
			return;
		} else if (rank == 1) {
			removeFront();
			return;
		} else {
			CatNode iter = head;
			// WRITE YOUR CODE HERE
			for (int i=1; i<rank; i++) {
				iter = iter.getNext();
			}
			iter.setNext(iter.getNext().getNext());
		}
		size--;
	}

	/* Other Methods **************************/
	/**
	 * TODO 2.2: PLEASE COMPLETE THE CODE BELOW.
	 * This method prints the content of the list,
	 * from the head node to the last node.
	 */
	public void print() {
		// WRITE YOUR CODE HERE
		//CatNode myCat = new CatNode();
		if (this.head == null) return;
		CatNode iter = head;
		while (iter != null) {
			iter.print();
			iter = iter.getNext();
		}
	}
}
