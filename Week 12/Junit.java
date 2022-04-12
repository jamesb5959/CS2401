import static org.junit.jupiter.api.Assertions.*;
public class Junit {
	public static BTreeCompany<String> BtreeLeft(int size) {
		BTNode<String> boss =  new BTNode<String>("Person1");
		BTreeCompany<String> company = new BTreeCompany<String>(boss); 
		String name;
		boolean inserted;
		for (int i=1; i<size; i++) {
			name = "Person" + (i+1);
			BTNode<String> N = new BTNode<String>(name);
			inserted = false;
			BTNode<String> iter = company.getRoot();
			while (!inserted) {
					if (!iter.hasLeft()) {
						iter.setLeft(N);
						inserted = true;
					} else {
						iter = iter.getLeft();
					}
			}
		}
		return company;
	}
	public static BTreeCompany<String> BtreeRight(int size) {
		BTNode<String> boss =  new BTNode<String>("Person1");
		BTreeCompany<String> company = new BTreeCompany<String>(boss); 
		String name;
		boolean inserted;
		for (int i=1; i<size; i++) {
			name = "Person" + (i+1);
			BTNode<String> N = new BTNode<String>(name);
			inserted = false;
			BTNode<String> iter = company.getRoot();
			while (!inserted) {
					if (!iter.hasRight()) {
						iter.setRight(N);
						inserted = true;
					} else {
						iter = iter.getRight();
				}
			}
		}
		return company;
	}

	BTreeCompany<String> BT = BTHR.HierarchyIntoBT(10);
    BTreeCompany<String> BTL = BtreeLeft(10);
	BTreeCompany<String> BTR = BtreeRight(10);
	BTNode<String> node = new BTNode<String>("root");
	BSTree<String> BSTTest = new BSTree<String>(node);

	int x = 2*5;
    @org.junit.jupiter.api.Test   
    void kahoot(){
        assertTrue(10 == x);
    }

	@org.junit.jupiter.api.Test   
	void notFoundResponsibleFor(){
        assertEquals(-1, BTL.responsibleFor("Person"));
    }
	
    @org.junit.jupiter.api.Test   
	void directlyResponsibleFor(){
        assertEquals(1, BTL.directlyResponsibleFor("Person1"));
    }
	@org.junit.jupiter.api.Test   
	void notFounddirectlyResponsibleFor(){
        assertEquals(-1, BTL.directlyResponsibleFor("Person"));
    }

	@org.junit.jupiter.api.Test   
	void toTop(){
        assertEquals(0, BTL.toTop("Person1"));
    }
	@org.junit.jupiter.api.Test   
	void notFoundtoTop(){
        assertEquals(-1, BTL.toTop("Person"));
    }
	@org.junit.jupiter.api.Test   
	void add(){
		BSTTest.add("groot");
        assertEquals(1, BSTTest.depth("groot"));
    }
	@org.junit.jupiter.api.Test   
	void addTest2(){
		BSTTest.add("pie");
        assertEquals(1, BSTTest.depth("pie"));
    }
}
