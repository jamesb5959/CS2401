import java.util.Scanner;

public class CourseGradePrinter {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_VALS = 4;
      int [] courseGrades = new int[NUM_VALS];
      int i;

      for (i = 0; i < courseGrades.length; ++i) {
         courseGrades[i] = scnr.nextInt();
      }
   for (int x = 0; x < 4; x++) {
   System.out.print(courseGrades[x] + " ");
 }
   System.out.println("");
   for (int x = 4 - 1; x >= 0; x--) {
   System.out.print(courseGrades[x] + " ");
 }
   System.out.println(""); 
   }
}