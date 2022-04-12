//I acknowledge that I have thoroughly tested my code and get no compilation or runtime errors.
import java.util.Random;

public class PlayWithBTs {
	/**
	 * This method builds a tree of the given size parameter.
	 * @param size
	 * It returns a binary tree of strings, organized in a random order.
	 * @return
	 */
	public static BTree<String> BuildaBT(int size) {
		BTNode<String> root =  new BTNode<String>("1");
		BTree<String> result = new BTree<String>(root); 
		boolean inserted;
		Random rnd = new Random();
		for (int i=1; i<size; i++) {
			BTNode<String> N = new BTNode<String>(String.valueOf(i+1));
			inserted = false;
			BTNode<String> iter = result.getRoot();
			while (!inserted) {
				if (rnd.nextInt(i) % 2 == 0) {// add to left
					if (!iter.hasLeft()) {
						iter.setLeft(N);
						inserted = true;
					} else {
						iter = iter.getLeft();
					}
				} else {
					if (!iter.hasRight()) {
						iter.setRight(N);
						inserted = true;
					} else {
						iter = iter.getRight();
					}
				}
			}
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		// Here we create a random binary tree of strings of size 10
		// It contains strings "1" through "10"
		BTree<String> mytree = BuildaBT(10);
		/** TODO 5
		 * Below: print out mytree in post-order fashion
		 * YOUR CODE GOES HERE
		 */
		mytree.printPost();
		
		/** TODO 6
		 * Below: Find and store the node that contains string "3" 
		 * YOUR CODE GOES HERE
		 */
		BTNode<String> storeNode = mytree.find("3");
		
		/** TODO 7
		 * Below: Compute and print out the depth of the node that contains "3" 
		 * YOUR CODE GOES HERE
		 */
		System.out.println(mytree.depth(storeNode));

		/** TODO 8
		 * Below: Compute and print out the depth of the node that contains "25" 
		 * YOUR CODE GOES HERE
		 */
		System.out.println(mytree.depth("25"));
		
	}

}
