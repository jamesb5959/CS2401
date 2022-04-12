import java.util.Scanner;
public class MultiplyArray {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_POINTS = 4;
      int[] dataPoints = new int[NUM_POINTS];
      int controlValue;
      int i;

      controlValue = scnr.nextInt();

      for (i = 0; i < dataPoints.length; ++i) {
         dataPoints[i] = scnr.nextInt();
      }

      for(i=0;i<NUM_POINTS;i++){
    if(dataPoints[i] < controlValue){
        dataPoints[i] *= 2;
    }
}

      for (i = 0; i < dataPoints.length; ++i) {
         System.out.print(dataPoints[i] + " ");
      }
      System.out.println();
   }
}