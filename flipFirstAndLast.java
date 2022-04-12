public static string flipFirstAndLast(int[] array){
    for( int i=0;i<array.length;i++)
           System.out.println( " array in mathod : " +array[i]);
        System.out.println("");
    
        int i = array[0];
        int j = array[array.length-1];
    
        array[0]=j;
         array[array.length-1]=  i;
         System.out.println("after swap");
         for (int k = 0; k < 5; k++) {
             System.out.print(array[k]);
        }
    
         System.out.println("");
    }

    /*Method
    import java.util.Scanner;

public class ModifyArray {

   public static int [] swapArrayEnds(int [] sortArray) {
   int temp = sortArray[0];
   sortArray[0] = sortArray[sortArray.length-1];
   sortArray[sortArray.length-1] = temp;
   return sortArray;
   }

   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      int numElem = 4;
      int[] sortArray = new int[numElem];
      int i;
      int userNum;

      for (i = 0; i < sortArray.length; ++i) {
         sortArray[i] = scnr.nextInt();
      }

      swapArrayEnds(sortArray);

      for (i = 0; i < sortArray.length; ++i) {
         System.out.print(sortArray[i]);
         System.out.print(" ");
      }
      System.out.println("");
   }
}
/*