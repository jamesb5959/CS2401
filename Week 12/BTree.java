public class BTree<T> {

	private BTNode<T> root;
    private int size;
    private int height;
    
    // Constructors ****************************************************************
    public BTree() {}
    
    public BTree(BTNode<T> N) {
        root = N;
        if (N != null) {
        	size = N.sizeBelow();
        	height = N.height();
        }
    }
    
    // Setters *********************************************************************
    public void setRoot(BTNode<T> N) {
        root = N;
        size = N.sizeBelow();
        height = N.height();
    }
    
    // Getters **********************************************************************
    public BTNode<T> getRoot() {
        return root;   
    }

    public int getSize() {
        return size;   
    }

    public int getHeight() {
        return height;   
    }
    
    // Other methods ***************************************************************
    /**
     * This method computes and returns the total number of nodes in the tree
     * @return
     */
    public int size() {
    	if (root == null) return 0;
    	else return 1 + new BTree<T>(root.getLeft()).size() + new BTree<T>(root.getRight()).size(); 
    }
    
    /**
     * This method computes and returns the height of the tree (i.e., the height of its root)
     * @return
     */
    public int height() {
    	if (root == null) return -1;
    	else return 1 + new BTree<T>(root.getLeft()).size() + new BTree<T>(root.getRight()).size(); 
    }
    
    /**
     * Reset: is a method that resets the tree to empty.
     * root = null; size = 0; height = - 1
     */
    public void reset() {
    	root = null;
    	size = 0;
    	height = -1;
    }
    
    /**
     * This method is given some data. It looks for and returns the node in the tree that 
     * contains the parameter data. If it does not find it, it will return null.
     * @param data
     * @return
     */
    public BTNode<T> find(T data) {
    	if (root.getData().toString().equals(data.toString())) return root;
    	if (root.getLeft() != null) {
    		BTree<T> L = new BTree<T>(root.getLeft());
    		BTNode<T> leftFind = L.find(data);
    		if (leftFind != null) return leftFind;
    	}
    	if (root.getRight() != null) {
        	BTree<T> R = new BTree<T>(root.getRight());
    		BTNode<T> rightFind = R.find(data);
    		if (rightFind != null) return rightFind;
    	}
    	return null;
    }
    
    /** This method, given data, will find how far the node that contains this data is from
     * the root of the tree. If the data is not in any node, your method will return -1.
     * @param data
     * @return
     */
    public int depth(T data) {
    	BTNode<T> found = find(data);
    	if (found == null) return -1; 
    	if (root == found) return 0;
    	
    	BTree<T> L = new BTree<T>(root.getLeft());
		BTree<T> R = new BTree<T>(root.getRight());
    	if (root.hasLeft() && root.hasRight()) {
    		return 1 + Math.max(L.depth(found), R.depth(found));
    	} else if (root.hasLeft()) {
    		return 1 + L.depth(found);
    	} else if (root.hasRight()) {
    		return 1 + R.depth(found);
    	} else return 0;
    	
    }
    
    /** From LAB WEEK 11
     * This method is similar to the first depth method. However, it is now looking for a node, 
     * not simply its content, and can assume that this node does exist in the tree.
     * @param node
     * @return
     */
    // Precondition: we know that node is in the tree
    public int depth(BTNode<T> node) {
          // GET CODE FROM LAB WEEK 11
          if (root == node) return 0;
          BTree<T> L = new BTree<T>(root.getLeft());
          BTree<T> R = new BTree<T>(root.getRight());
          if (root.hasLeft() && root.hasRight()) {
              return 1 + Math.min(L.depth(node), R.depth(node));
          } 
          else if (root.hasLeft()) {
              return 1 + L.depth(node);
          } 
          else if (root.hasRight()) {
              return 1 + R.depth(node);
          } 
          else return 0;
    }
    
    /** From LAB WEEK 11
     * The print method traverses and prints the content of the binary tree in a 
     * pre-order fashion:
     *      - root first, 
     *      - then pre-order of left subtree, 
     *      - then pre-order of right subtree.
     */
    public void printPre() {
         // GET CODE FROM LAB WEEK 11
         if (root == null) return;
         root.printNode();
         if (root.getLeft() != null) {
             BTree<T> L = new BTree<T>(root.getLeft());
             L.printPre();
         }
         if (root.getRight() != null) {
             BTree<T> R = new BTree<T>(root.getRight());
             R.printPre();
         }
   }
       
    public void printPost() {
    	if (root == null) return;
    	if (root.getLeft() != null) {
    		BTree<T> L = new BTree<T>(root.getLeft());
    		L.printPost();
    	}
    	if (root.getRight() != null) {
        	BTree<T> R = new BTree<T>(root.getRight());
        	R.printPost();
    	}
    	root.printNode();
    }
       
    /** From LAB WEEK 11
     * Method inOrderTraversal:
     * This method traverses and prints the content of the binary tree in an in-order fashion:
     * in-order traversal of left subtree, then root, then in-order traversal of right subtree.
     */
    public void printIn() {
        // GET CODE FROM LAB WEEK 11
        if (root == null) return;
    	if (root.getLeft() != null) {
    		BTree<T> L = new BTree<T>(root.getLeft());
    		L.printIn();
    	}
        root.printNode();
    	if (root.getRight() != null) {
        	BTree<T> R = new BTree<T>(root.getRight());
        	R.printIn();
    	}
    }
    
}
