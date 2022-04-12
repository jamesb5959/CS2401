import java.util.Scanner;
public class StudentScores {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int SCORES_SIZE = 4;
      int[] bonusScores = new int[SCORES_SIZE];
      int i;

      for (i = 0; i < bonusScores.length; ++i) {
         bonusScores[i] = scnr.nextInt();
      }
      for (i = 0; i < bonusScores.length; ++i){
      if(i!=SCORES_SIZE -1 ){
      bonusScores[i] = bonusScores[i] + bonusScores[i+1];
      }
      else{
      bonusScores[i] = bonusScores[i];
              }
          }
      for (i = 0; i < bonusScores.length; ++i) {
         System.out.print(bonusScores[i] + " ");
      }
      System.out.println();
   }
}