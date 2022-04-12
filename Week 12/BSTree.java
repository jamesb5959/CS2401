/**
 * Binary Search Trees require their content data to be comparable, hence the syntax you see below:
 * <T extends Comparable<T>>
 */

public class BSTree<T extends Comparable<T>> extends BTree<T> {
	
	public BSTree(BTNode<T> node) {
		super(node);
	}	
	
	/* A BST is a BT. The main difference is the order of nodes:
	 * This shows when we add or remove nodes. Therefore add and remove are the 
	 * only methods that need to be implemented here.
	 */
	
	/** TODO 2.1: Complete the body of method add where prompted
	 * Add a node
     * This method takes data to be added to the current BST and adds it where it belongs 
     * in the BST, so that the current tree is still a BST. 
     * THIS METHOD MUST BE RECURSIVE.
	 */
	public void add(T data) {
		if (getRoot() == null) {
			BTNode<T> node = new BTNode<T>(data);
			setRoot(node);
			return;
		}
		if (data.compareTo(getRoot().getData()) > 0) {
			// insert in the right side
            // PLEASE COMPLETE CODE HERE
			BSTree<T> R = new BSTree<T>(getRoot().getRight());
			BTNode<T> node = new BTNode<T>(data);
			if (getRoot().getRight() == null){
				getRoot().setRight(node); 
			}
			else 
			R.add(data);
		} else {
			// insert in the left side
            // PLEASE COMPLETE CODE HERE
			BSTree<T> L = new BSTree<T>(getRoot().getLeft());
			BTNode<T> node = new BTNode<T>(data);
			if (getRoot().getLeft() == null){
				getRoot().setLeft(node);
			}
			else 
			L.add(data);
		}
	}
	
	/** BONUS: Complete the body of method remove
	 * Remove the root of the current tree
     * This method removes the root of the current tree and transforms the tree 
     * in such a way that it is still a BST.
	 */
	public void remove() {
		if (getSize() <= 1) {
			reset();
			return;
		}
		// First, we look for the node N to replace the root: the rightmost of the left subtree
		// PLEASE COMPLETE CODE HERE TO DO WHAT'S DESCRIBED AT THE LINE BEFORE
		BSTree<T> L = new BSTree<T>(getRoot().getLeft());
		BSTree<T> R = new BSTree<T>(getRoot().getRight());
		while(getRoot().getRight()!=null && getRoot().getRight().getRight()!=null){
			BSTree<T> parent = new BSTree<T>(getRoot());
			BSTree<T> N = new BSTree<T>(getRoot().getRight());
		}
		
		// If N has a left child L, we connect L to the parent of N
		// PLEASE COMPLETE CODE HERE TO DO WHAT'S DESCRIBED AT THE LINE BEFORE
		if(N.hasLeft() == true){
			parent.setRight(N.getLeft());
		}
        
        // We connect N to the left child of root and to the right child of root
		// PLEASE COMPLETE CODE HERE TO DO WHAT'S DESCRIBED AT THE LINE BEFORE
		N.setLeft(L);
		N.setRight(R);
        
        // We make N the new root
		// PLEASE COMPLETE CODE HERE TO DO WHAT'S DESCRIBED AT THE LINE BEFORE
		setRoot(N);
        
        // We update the size of the tree
		// PLEASE COMPLETE CODE HERE TO DO WHAT'S DESCRIBED AT THE LINE BEFORE
		

        // We update the height of the tree
		// PLEASE COMPLETE CODE HERE TO DO WHAT'S DESCRIBED AT THE LINE BEFORE
		
	}
	
	
}
