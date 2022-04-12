public class List<T> {

	/* Attributes *******************************************************************/
	private Node<T> head;
	private int size;
	
	/* Constructors *****************************************************************/
	/**
	 * Builds a list from data of type T:
	 * it creates a node that contains T and makes it the head.
	 * @param data
	 */
    public List(T data) {
		Node<T> N = new Node<T>(data);
		this.head = N;
		this.size = 1;
	}
	
    /**
     * Builds a list from a node
     * This node may come with following nodes, therefore we set the size of our list 
     * to the size of this node.
     * @param head
     */
	public List(Node<T> head) {
		this.head = head;
		this.size = head.size();
	}
	
	/**
	 * Builds a list from an array of elements of generic type T
	 * @param D
	 */
	public List(T[] D) {
		if (D.length == 0) {
			head = null;
			size = 0;
		}
		head = new Node<T>(D[0]);
		Node<T> iter = head;
		size = 1;
		for (int i=1; i<D.length; i++) {
			Node<T> N = new Node<T>(D[i]);
			iter.setNext(N);
			size++;
			iter = iter.getNext();
		}
	}
	
	/* Getters **********************************************************************/
    /**
	 * @return the head
	 */
	public Node<T> getHead() {
		return head;
	}
	
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}
	
	/* Setters **********************************************************************/
    /**
	 * @param head: the head to set
	 */
	public void setHead(Node<T> head) {
		this.head = head;
	}
	
	/**
	 * @param size: the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
	
    /* Other methods ***************************************************************/
	/**
	 * @param data
	 * Adds a node that contains param data at the head of the list
	 */
	public void addFront(T data) {
		Node<T> N = new Node<T>(data);
		N.setNext(head);
		head = N;
		size++;
	}
	
	/**
	 * TODO 3.2: PLEASE COMPLETE CODE BELOW WHERE PROMPTED 
	 * This method add a new node at the end of the list
	 * This new node contains the data passed as a parameter
	 * @param data
	 */
	public void addEnd(T data) {
		if (head == null) {
			addFront(data);
			return;
		}
		Node<T> iter = head;
        // WRITE YOUR CODE HERE
		Node<T> newNode = new Node<T>(data);
		while (iter.getNext() != null) {
			iter = iter.getNext();
		}
		iter.setNext(newNode);
 		size++;
	}
	
	/**
	 * This method creates a new node that contains the data passed as parameter
	 * @param data
	 * And adds this node after the rank-th node in the list
	 * @param rank
	 */
	public void add(T data, int rank) {
		if (rank >= size) { 
			addEnd(data);
			return;
		}
		Node<T> iter = head;
		for (int i=1; i<rank; i++) {
			iter = iter.getNext();
		}
		Node<T> newNode = new Node<T>(data);
		newNode.setNext(iter.getNext());
 		iter.setNext(newNode);
 		size++;
	}
	
	/**
	 * TODO 3.3: PLEASE COMPLETE CODE BELOW WHERE PROMPTED 
	 * This method removes the head of the list
	 */
	public void removeFront() {
		if (head != null) { 
			// WRITE YOUR CODE HERE
			head = head.getNext();
			size--;
		}
	}
	
	/**
	 * This method removes the last element of the list
	 */
	public void removeEnd() {
		if (size == 0) return;
		if (size == 1) {
			head = null;
			size = 0;
			return;
		}
		Node<T> iter = head;
		while (iter.getNext() != null && iter.getNext().getNext() != null) {
			iter = iter.getNext();
		}
		iter.setNext(null);
		size--;
	}
	
	/**
	 * This method removes the rank-th node in the list
	 * @param rank
	 */
	public void remove(int rank) {
		if (rank > size) return;
		if (rank == size) {
			removeEnd();
			return;
		}
		if (rank == 0) {
			removeFront();
			return;
		}
		Node<T> iter = head;
		for (int i=1; i<rank; i++) {
			iter = iter.getNext();
		}
		iter.setNext(iter.getNext().getNext());
		size--;
	}
	
	/**
	 * This method prints the content of every other node in the list,
	 * starting with the content of the head node
	 * @return
	 */
	public void print() {
		if (this.head == null) return;
		Node<T> iter = head;
		while (iter != null) {
			System.out.println(iter.getData().toString());
			iter = iter.getNext();
		}
	}
	
	/**
	 * This method prints the content of every other node in the list,
	 * starting with the content of the head node
	 * @return
	 */
	public void printEveryOther() {
		if (this.head == null) return;
		Node<T> iter = head;
		while (iter != null) {
			System.out.println(iter.getData().toString());
			if (iter.getNext() != null) iter = iter.getNext().getNext();
			else iter.getNext();
		}
	}
	
	/**
	 * This method prints the content of the list in reverse order:
	 * i.e., last node first, down to first node last.
	 */
	public void traverseReverse() {
		if (head.getNext() == null) { 
			System.out.println(head.getData().toString());
			return;
		} 
		List<T> L = new List<T>(head.getNext());
		L.traverseReverse();
		System.out.println(head.getData().toString());
	}

}

