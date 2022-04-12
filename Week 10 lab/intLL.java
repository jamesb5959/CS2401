public class intLL {
	

public static void main(String[] args) {
	String x = "hello";
	System.out.print(test(x));
}
public void test(String hello) {
	if (charAt(0) == charAt(hello.length()-1))
		return charAt(0);
	return charAt(hello.length()-1)+test(hello.substring(0, hello.length()-1)); 
}


	/* Attributes ***************************/
	// Data: an int
	private int data;
	// Link/address to next
	private intLL next;
	
	/* Constructors *************************/
	public intLL() {}
	
	public intLL(int data) {
		this.data = data;
		next = null;
	}

	public intLL(int data, intLL restOfList) {
		this.data = data;
		next = restOfList;
	}

	/* Getters & Setters ********************/
	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * @return the next
	 */
	public intLL getNext() {
		return next;
	}

	/**
	 * @param next the next to set
	 */
	public void setNext(intLL next) {
		this.next = next;
	}
	
	/* Other Methods ************************/
	/**
	 * This method adds a new node at the start of the list. 
	 * This node contains the parameter int value: data.
	 * @param data
	 */
	public void addFront(int data) {
		intLL newList = new intLL(this.data, this.next);
		this.setData(data);
		this.setNext(newList);
	}
	
	/**
	 * This method add a new node at the end of the list. 
	 * This node contains the parameter int value: data.
	 * @param data
	 */
	public void addLast(int data) {
		intLL iter = this;
		while (iter.getNext() != null) {
			iter = iter.getNext();
		}
		iter.setNext(new intLL(data));
	}
	
	/**
	 * This method removes the first node of the list 
	 * if the list has at least 2 nodes
	 */
	public void removeFront() {
		if (this.size() > 1) {
			this.setData(this.getNext().getData());
			this.setNext(this.getNext().getNext());
		}
	}
	
	/**
	 * This method removes the last node of the list 
	 * if the list has at least 2 nodes
	 */
	public void removeLast() {
		if (this.size() > 1) {
			intLL iter = this;
			while (iter.getNext() != null) {
				iter = iter.getNext();
			}
			iter.setNext(null);
		}		
	}
	
	/**
	 * This method computes and returns the size of the list.  
	 * The size of a list is its number of nodes.
	 */	
	public int size() {
		intLL iter = this;
		int size = 0;
		while (iter != null) {
			size++;
			iter = iter.getNext();
		}
		return size;
	}
	
	/**
	 * This method prints the content of each node of a list,
	 * from the front node to the last node.
	 */
	public void print() {
		intLL iter = this;
		while (iter != null) {
			System.out.print(iter.getData() + " ");
			iter = iter.getNext();
		}
		System.out.println();
	}
	
	/**
	 * TODO 1.1: PLEASE COMPLETE THE CODE BELOW.
	 * This method prints the content of every other node in the list.
	 * It prints the first node, then the 3rd, the 5th, etc.
	 * Hint: make sure you understand well the code of the method print()
	 *  	and adapt it to write printSkip
	 */
	public void printEveryOther() {
		// WRITE YOUR CODE HERE
		intLL iter = this;
		while (iter != null) {
			System.out.print(iter.getData() + " ");
			if (iter.getNext() != null){
				iter = iter.getNext().getNext();
			}
			else{
				return;
			}
		}
		System.out.println();
	}
		public void printbw() { 
			intLL iter = this;
			if (iter.next == null) {  
			System.out.print(iter.getData()); 
			return; 
			}  
			next.printbw(); 
			System.out.print(iter.getData()); 
			}
		public int sumEven() { 
			intLL iter = this;
			if (iter.next == null) { 
				if (iter.getData() % 2 == 0 ) {
					return iter.getData(); 
				}
				else if(iter.getData() % 5 == 0){
					return 0; 
				}
			} 
			if (iter.getData() %  2 == 0 )  
			return iter.getData() + iter.next.sumEven(); 
			return iter.next.sumEven(); 
		} 
	
}
