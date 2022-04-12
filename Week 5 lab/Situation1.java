import java.util.Random;

public class Situation1 {

/* input A: 
 * is non empty 
 * and contains only non-negative values */ 
	public static int MaxPairwiseProduct1(int[] A) { 
		int maxProduct = 0; 
		for (int i=0; i<A.length; i++) { 
			for (int j=i+1; j<A.length; j++) { 
				if (A[i]*A[j] > maxProduct) maxProduct = A[i]*A[j];  
			} 
		} 
		return maxProduct; 
	} 
	
/* input A: 
 * is non empty 
 * and contains only non-negative values */ 
	public static int MaxPairwiseProduct2(int[] A) { 
		int indexMax = 0; // index of max value in A 
		int indexMax2 = 0; // index of second max value in A 
		for (int i=1; i<A.length; i++) { 
			if (A[i] > A[indexMax]) indexMax = i; 
		} 
		for (int i=1; i<A.length; i++) { 
			if (i != indexMax && A[i] > A[indexMax2]) indexMax2 = i; 
		} 
		return A[indexMax]*A[indexMax2]; 
		}

/* input A: 
 * is non empty 
 * and contains only non-negative values */ 
	public static int MaxPairwiseProduct1withNumSteps(int[] A) { 
		int numSteps = 0; // we declare and initialize our number of steps. 
		int maxProduct = 0;  
		numSteps++; // for the declaration of maxProduct as a step 
		numSteps+=2; // for the declaration of i and checking the condition i<A.length 
		for (int i=0; i<A.length; i++) { 
			numSteps+=2; // for the declaration of j and checking the condition j<A.length 
			for (int j=i+1; j<A.length; j++) { 
				numSteps++; // for the condition A[i]*A[j] > maxProduct 
				if (A[i]*A[j] > maxProduct) { 
					maxProduct = A[i]*A[j]; 
					numSteps++; // for the update of maxProduct 
				} 
				numSteps += 2; // for the update of j checking the condition j<A.length 
			} 
			numSteps += 2; // for the update of i and checking the condition i<A.length 
		} 
		System.out.println(maxProduct); 
		return numSteps; 
	}  
	
	public static int MaxPairwiseProduct2withNumSteps (int[] A) { 
		int numSteps = 0; // we declare and initialize our number of steps. 
		int indexMax = 0; // index of max value in A 	
		int indexMax2 = 0; // index of second max value in A 
		numSteps += 2; // for the declaration of indexMax and indexMax2 
		numSteps += 2; // for the declaration of i and checking the condition i<A.length 
		for (int i=1; i<A.length; i++) { 
			numSteps++; // for the condition A[i] > A[indexMax] 
			if (A[i] > A[indexMax]) { 
				indexMax = i; 
				numSteps++; // for the update of indexMax 
			} 
			numSteps += 2; // for the update of i and checking the condition i<A.length 
		} 
		numSteps += 2; // for the declaration of i and checking the condition i<A.length 
		for (int i=1; i<A.length; i++) { 
			numSteps++; // for the condition (i != indexMax && A[i] > A[indexMax]) 
			if (i != indexMax && A[i] > A[indexMax2]) { 	
				indexMax2 = i; 
				numSteps++; // for the update of indexMax 
			} 
			numSteps += 2; // for the update of i and checking the condition i<A.length 
		} 
		System.out.println(A[indexMax]*A[indexMax2]); 
		return numSteps;	
	} 

	public static int[] costMaxPairwiseProduct1() { 
		// one int per cost, one average cost per size (3, 10, 50, 100, 200, 500, 1000) 
		int[] sizes = {3, 10, 50, 100, 200, 500, 1000}; 
		int[] averages = new int[7];  
		for (int i=0; i<sizes.length; i++) { 
			averages[i] = costMaxPairwiseProduct1(sizes[i]); 
			System.out.println("Average for size " + sizes[i] + " is: " + averages[i]); 
		} 
		return averages; 
	}		 

	public static int costMaxPairwiseProduct1(int size) { 	
		// we will run MaxPairwiseProduct1 on size different arrays of size size called input 
		int[] input = new int[size]; 
		int average = 0; 
		for (int i=0; i<size; i++) { 
			input = randomIntArray(size); 
			average += MaxPairwiseProduct1withNumSteps(input); 
		} 
		return average / size; 
	} 		 
		
	public static int[] costMaxPairwiseProduct2() { 	
		// one int per cost, one average cost per size (3, 10, 50, 100, 200, 500, 1000) 
		int[] sizes = {3, 10, 50, 100, 200, 500, 1000}; 
		int[] averages = new int[7];  
		for (int i=0; i<sizes.length; i++) { 
			averages[i] = costMaxPairwiseProduct2(sizes[i]); 
			System.out.println("Average for size " + sizes[i] + " is: " + averages[i]); 
		} 
		return averages; 
		} 
		
	public static int costMaxPairwiseProduct2(int size) { 	
		// we will run MaxPairwiseProduct1 on size different arrays of size size called input 
		int[] input = new int[size]; 
		int average = 0; 
		for (int i=0; i<size; i++) { 
			input = randomIntArray(size); 
			average += MaxPairwiseProduct2withNumSteps(input); 
		} 
		return average / size; 
		} 
		 
	public static int[] randomIntArray(int size) { 	
		Random rnd = new Random(); 
		rnd.setSeed(System.currentTimeMillis()); 
		int[] result = new int[size]; 
		for (int i=0; i<size; i++) {
			result[i] = rnd.nextInt(size); 
		} 
		return result; 
	}

	//Here is where you will copy and paste your code from the document. Make sure you copy and paste everything correctly - There are 9 functions total you need to paste here.
	//Make sure you maintain proper indentation and style. 
	public static void main(String[] args) {
		//Here is where you will call your functions for testing.
		costMaxPairwiseProduct1();
		costMaxPairwiseProduct2(); 
	}
}