import java.util.Arrays;
public class PrepExam {
    /*public static void swapRows(int[][] A, int[][] B){
        int[] aux;
        int count = 1;
        int min = A.length;
        if(A.length>B.length){
            min = B.length;
        }
        for(int i= 0; i< min; i++) {
            if(count%2==1 ) {
                aux=B[i];
                B[i]=A[i];
                A[i]=aux;
                count++;
            }
            else{
                count++;
            }
          }*/
       // public void levelOrder(){
         //   for(int i = 0; i<arrayTree.length(); i++){
           //     if(arrayTree[i] =! null)
             //   System.out.print(arrayTree.toString()[i]);
            //}
        //}
    
        
      //  for (int i = 0; i < A.length; i++) {
        //    System.out.println("a"+Arrays.toString(A[i]));
        //}
        //for (int i = 0; i < B.length; i++) {
          //  System.out.println("b"+Arrays.toString(B[i]));
        //}
    //}
    public static boolean areIdentical(int[][] A, int[][] B){
        if(A.length != B.length){
            return false;
        }
        for (int i=0; i<A.length; i++) {
            if (A[i] != B[i]) { 
                 return false;
            }
            return true;
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] A= {{1}, {2,3}, {4,5,6}};
        int[][] B= {{1}, {2,3}, {4,5,6}};
        System.out.println(areIdentical(A, B));
    }
}
