public class BTreeCompany<T> extends BTree<T> {

	public BTreeCompany(BTNode<T> boss) {
		super(boss);
	}

	public BTreeCompany() {
		super();
	}

	/** METHODS SPECIFIC TO COMPANY MANAGEMENT *******************/
	/**
	 * TODO 1.1: complete the body of the method responsibleFor
	 * This method computes the number of subordinates a node that contains data has 
	 * (i.e., the number of descendants a node has)
	 * and returns it
	 */
	public int responsibleFor(T data) {
		// First: find the node that contains data
		// YOUR CODE GOES HERE (you may want to use the method find from BTree.java)
		BTNode<T> findNode = find(data);
		if(findNode == null){
			return -1;
		}
        // Second proceed and count the number of nodes below this one
		// i.e., the number of nodes in the subtree originating at this node
		// YOUR CODE GOES HERE (you may want to use the method sizeBelow() from BTNode.java)
		int num = findNode.sizeBelow();
		// Last: return the number of nodes
		return num;
	}
	
	/** 
	 * TODO 1.2: complete the body of the method directlyResponsibleFor
	 * This method computes the number of direct subordinates a node has 
	 * (i.e., the number of children a node has)
	 * and returns it
	 */
	public int directlyResponsibleFor(T data) {
		// First: find the node that contains data
		// YOUR CODE GOES HERE (you may want to use the method find from BTree.java)
		BTNode<T> findNode = find(data);
		if(findNode == null){
			return -1;
		}
        int direct = 0;
		// Check if the node that contains data has 0, 1, or 2 chidren
        // YOUR CODE GOES HERE (you may want to use the hasleft, hasRight methods from BTNode.java)
		if(findNode.hasLeft() == true){
			direct++;
		}
		if(findNode.hasRight() == true){
			direct++;
		}
        return direct;
	}
	
	/** 
	 * TODO 1.3: complete the body of the method toTop
	 * This method computes how far from the top of the hierarchy an employee is 
	 * (i.e., the number of nodes in the above path from a given data and the root
	 */
	public int toTop(T data) {
        // YOUR CODE GOES HERE (hint: it is one line of code)
		return depth(data);
	}
}
