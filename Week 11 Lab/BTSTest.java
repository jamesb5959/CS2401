import static org.junit.jupiter.api.Assertions.*;
public class BTSTest {
    public static BTree<String> BuildaBTRight(int size){
        BTNode<String> root =  new BTNode<String>("1");
		BTree<String> result = new BTree<String>(root);
        for(int i = 1; i<size; i++){
            BTNode<String> N = new BTNode<String>(String.valueOf(i+1));
            BTNode<String> iter = result.getRoot();
            while(iter.getRight()!=null){
                iter = iter.getRight();
            }
            iter.setRight(N);
        }
        return result;
    }
    public static BTree<String> BuildaBTLeft(int size){
        BTNode<String> root =  new BTNode<String>("1");
		BTree<String> result = new BTree<String>(root);
        for(int i = 1; i<size; i++){
            BTNode<String> N = new BTNode<String>(String.valueOf(i+1));
            BTNode<String> iter = result.getRoot();
            while(iter.getLeft()!=null){
                iter = iter.getLeft();
            }
            iter.setLeft(N);
        }
        return result;
    }

    BTree<String> Right = BuildaBTRight(10);
    BTree<String> Left = BuildaBTLeft(10);
    BTree<String> Both = PlayWithBTs.BuildaBT(10);


    @org.junit.jupiter.api.Test   
    void storeNode(){
        assertEquals("3", Both.find("3").getData());
    }
    @org.junit.jupiter.api.Test   
    void resetTODO1(){
        Both.reset();
        assertEquals(null, Both.getRoot());
        assertEquals(0, Both.getSize());
        assertEquals(-1, Both.getHeight());
    }
    @org.junit.jupiter.api.Test   
    void depthTODO2(){
        assertEquals(2, Right.depth(Right.find("3")));
    }
    @org.junit.jupiter.api.Test   
    void nullDepth(){
        assertEquals(-1, Both.depth("25"));
    } 
}