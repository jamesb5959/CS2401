/* Week 2 Review Lab:
 * Student name: Bradley Beltran
 */

public class Week2Review {
	
	public Week2Review() {}
	
	/*************************************************************************************/

	/* Method stars4Vowels: (Problem 1) -- 10 pts
	 * Given a string str, you are to produce (and return) a string, built from str, 
	 * such that all vowels are replaced by a character ‘*’. 
	 */
	public String stars4Vowels(String str) {
		String newString = "";
		for(int i = 0; i < str.length(); i++){
		   char replace = str.charAt(i);
		   if ( ((((str.charAt(i) == 'A') || (str.charAt(i) == 'a')) || (str.charAt(i) == 'e') || (str.charAt(i) == 'E')) || (((str.charAt(i) == 'I') || (str.charAt(i) == 'i')) || (str.charAt(i) == 'O') || (str.charAt(i) == 'o')) || (((str.charAt(i) == 'U') || (str.charAt(i) == 'u')) || ((str.charAt(i) == 'Y') || (str.charAt(i) == 'y'))) ) ){
			replace = '*';
		   }
		   newString = newString + (Character.toString(replace));
		}
		return newString;
	 }
	
	/* Bonus Method stars4VowelsAlt: (Problem 1 - Bonus) -- 3 pts
	 * Produce an alternative implementation for stars4Vowels. 
	 */
	public String stars4VowelsAlt(String str) {
   	String newString = "";
   	char[] vowelArray = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U', 'y', 'Y'};
   	for(int i = 0; i < str.length(); i++){
      char replace = str.charAt(i);
      for(int j = 0; j < vowelArray.length; j++){
         if( str.charAt(i) == vowelArray[j]){
            replace = '*';
         }
      }
      newString = newString + (Character.toString(replace));
   }
   return newString;
}

	/* Method one2TwoD: (Problem 2) -- 10 pts
	 * Given a 1D array of integers A, you are to produce (and return) a 2D array B of integers that is as follows:
		• B has as many rows as A.length
		• B has as many columns as A.length
		• B contains only values 0 except for its diagonal elements: for all elements B[i][i], we have B[i][i] = A[i].
	 * Note: you get bonus points when you implement this method using only one for loop. -- 3 pts	
	 */
	public int[][] one2TwoD(int[] A) {
        int[][] B = new int[A.length][A.length];
        for(int i = 0; i < A.length; i++){
            B[i][i] = A[i];
        }
		return B;
	}
	
	/* Method one2TwoDMulti: (Problem 3) -- 10 pts
	 * Given a 1D array of integers A, you are to produce (and return) a 2D array B of positive integers that is as follows:
		• B has as many rows as A.length
		• Each ith row of B is of length A[i] and contains only values A[i]
	 */
	public int[][] one2TwoDMulti(int[] A) {
        int[][] B = new int[A.length][]; // to be modified of course :)
        for(int i = 0; i < A.length; i++){
            B[i] = new int [A[i]];
            for(int j = 0; j < B[i].length ; j++){
                B[i][j] = A[i];
            }           
		}		
		return B;
	}
	
	/* Method string2Array: (Problem 4) -- 10 pts
	 * Given a string str, you are to produce (and return) a 1D array S of strings of length = the length of str, 
	 * and where each element S[i] = str.substring(0,i+1).
	 */
	public String[] string2Array(String str) {
        String[] S = new String[str.length()];        
        for(int i = 0; i < str.length(); i++) {
		S[i]=str.substring(0,i+1); 
	}
        return S;
	}

	 public static void main(String[] args) {
	 	Week2Review testing = new Week2Review();


	    System.out.println(testing.stars4Vowels("enter a string for testing here"));
	    

	    int[] z = {1, 2, 5, 3};
	    int[][] B = testing.one2TwoD(z);
	    for (int i = 0; i < B.length; i++) {
	     	for (int j = 0; j < B[i].length; j++) {
	        	System.out.print(B[i][j] + " ");
	      	}
	      	System.out.println();
	    }
	    
	    B = testing.one2TwoDMulti(z);
	    for (int i = 0; i < B.length; i++) {
	      for (int j = 0; j < B[i].length; j++) {
	        System.out.print(B[i][j] + " ");
	      }
	      System.out.println();
	    }

	    String [] S = testing.string2Array("abcde");
	    for (int i = 0; i < S.length; i++) {
	      System.out.println(S[i]);
	    }
	    
	 }
}
