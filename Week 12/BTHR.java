//"I acknowledge that I have thoroughly tested my code, and it contains errors on the following set of test cases: " 
//The error would be on the Bonus question in which I have not finished. 
import java.util.Random;

public class BTHR {

	/**
	 * This method builds a company with size employees.
	 * @param size
	 * It returns a hierarchy of type BTreeCompany that contains the given number of employees,
	 * organized in a random hierarchy.
	 * @return
	 */
	public static BTreeCompany<String> HierarchyIntoBT(int size) {
		BTNode<String> boss =  new BTNode<String>("Person1");
		BTreeCompany<String> company = new BTreeCompany<String>(boss); 
		String name;
		boolean inserted;
		Random rnd = new Random();
		for (int i=1; i<size; i++) {
			name = "Person" + (i+1);
			BTNode<String> N = new BTNode<String>(name);
			inserted = false;
			BTNode<String> iter = company.getRoot();
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
		return company;
	}
	
	public static void main(String[] args) {
		/** COMP LAB PART 1 ************************************************/
		// Here we create a random binary tree of employees of size 10
		// It contains employees (as string) from "Person1" through "Person10"
		BTreeCompany<String> company = HierarchyIntoBT(10);
        
        /** TODO 1.5
		 * Below: print out company in pre-order fashion
		 * YOUR CODE GOES HERE
		 */
		company.printPre();
        /** TODO 1.6
		 * Below: print out company in post-order fashion
		 * YOUR CODE GOES HERE
		 */
		company.printPost();
        /** TODO 1.7
		 * Below: compute and print out the number of subordinates of "Person1"
		 * YOUR CODE GOES HERE
		 */
		System.out.println(company.responsibleFor("Person1"));
        /** TODO 1.8
		 * Below: compute and print out the distance from "Person3" to the boss (root) of the company
		 * YOUR CODE GOES HERE
		 */
		System.out.println(company.toTop("Person3"));
		/** COMP LAB PART 2 ************************************************/
		// Here we create a node that contains the String "root" and
		// we make it the root of our BSTree. 
		BTNode<String> node = new BTNode<String>("root");
		BSTree<String> myBST = new BSTree<String>(node);
        
        /** TODO 2.3
		 * Below: add the string "groot" in myBST
		 * YOUR CODE GOES HERE
		 */
		myBST.add("groot");
        /** TODO 2.4
		 * Below: add the string "zoo" in myBST
		 * YOUR CODE GOES HERE
		 */
		myBST.add("zoo");
        /** TODO 2.5
		 * Below: add the string "pear" in myBST
		 * YOUR CODE GOES HERE
		 */
		myBST.add("pear");
        /** TODO 2.6
		 * Below: add the string "pie" in myBST
		 * YOUR CODE GOES HERE
		 */
		myBST.add("pie");
        // Finally, we print myBST's content in order
        myBST.printPre();
	}
	
}
