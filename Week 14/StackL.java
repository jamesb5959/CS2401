
public class StackL<T> {
	
	// Attributes *****************************************************************
	private Node<T> top;
	private int size;
	
    // Constructors ****************************************************************
	public StackL() {}
	
	/** TODO 1.1: 
	 * Complete the implementation below.
	 * @param N of type Node<T>
	 */
	public StackL(Node<T> N) {
		// YOUR CODE GOES HERE
		size = 0;
		top = N;
	}

    // Getters *********************************************************************
	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

    // Other methods ***************************************************************
	/* 	o	Push: takes data T (see Person.java) and adds it to the stack 
	 *	o	Pop: void method that removes the top element of the stack, if the stack is not empty
	 *	o	Peek: returns the top element of the stack (without removing it)
	 *	o	Clear: empties the stack
	 *	o	isEmpty: returns true if the stack is empty, false otherwise
	 */
	public void push(T data) {
		Node<T> N = new Node<T>(data);
		N.setNext(top);
		top = N;
		size++;
	}
	
	/** TODO 1.2: 
	 * Complete the implementation below of the push method that takes a node.
	 * @param N
	 */
	public void push(Node<T> N) {
		// YOUR CODE GOES HERE
		N.setNext(top);
		top = N;
		size++;
	}
	
	/** TODO 1.3:
	 * Complete the implementation below of the pop method that removes and returns the top node.
	 */
	public Node<T> pop() {
		// YOUR CODE GOES HERE
		Node<T> temp = top;
		top=top.getNext();
		return temp;
	}
	
	public Node<T> peek() {
		return top;
	}
	
	public void clear() {
		size = 0;
		top = null;
	}
	
	/** TODO 1.4:
	 * Complete the implementation below of the isEmpty method that returns true when the stack is empty
	 * and returns false when it is not empty (hint: one line of code only). 
	 * @return
	 */
	public boolean isEmpty() {
		// YOUR CODE GOES HERE
		return size == 0 || top == null;
	}
	
}
