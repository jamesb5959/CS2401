public class Situation2 {

	public static String removeMystery1(String str) { 
		int[] array = new int[str.length()]; 
		String newStr = ""; 
		int sum = 0; 
		int increment = -1; 
		for (int i=0; i<str.length(); i++) { 
			sum = sum + ((increment++) + 1); 
			array[i] = sum; 
		} 
		// array is being filled with odd numbers starting at 1, 3, 5, 7… 
		boolean addIndexOrNot = true; 
		for (int i = 0; i<str.length(); i++) { 
			for (int j = 0; j < array.length; j++) { 
				if (i == array[j]) addIndexOrNot = false;  
			} 
			if (addIndexOrNot) { 
				char currentChar = str.charAt(i); 
				newStr = newStr + currentChar; 
			} 
			addIndexOrNot = true; 
		} 
		return newStr; 
	}  
		
	public static String removeMystery2(String str) { 
		String result = ""; 
		int toBeRemoved=0; 
		int count = 1; 
		// this for loop looks at every char of str and decides whether to copy it in result or not. 
		for (int i = 0; i < str.length(); i++) { 
		// decide whether to copy char in result 
			if (i != toBeRemoved) {  
				result += str.charAt(i);				 
			}
			else { 
				toBeRemoved = toBeRemoved + count; 
				count++; 
			} 
		}  
		return result; 
	} 

	public static int removeMystery1withNumSteps(String str) {
        int[] array = new int[str.length()];
		int numSteps = 0;
        String newStr = "";
        int sum = 0;
        int increment = -1;
        numSteps += 4;
        numSteps += 2;
        for (int i = 0; i < str.length(); i++) {
            sum = sum + ((increment++) + 1);
            array[i] = sum;
            numSteps += 4;
        }
        boolean addIndexOrNot = true;
        numSteps++;
        numSteps += 2;
        for (int i = 0; i<str.length(); i++) {
            numSteps += 2;
            for (int j = 0; j < array.length; j++) {
                if (i == array[j]){
                    addIndexOrNot = false;
                    numSteps++;
                }
                numSteps += 3;
            }
            if (addIndexOrNot) {
                char currentChar = str.charAt(i);
                newStr = newStr + currentChar;
                numSteps+=2;
            }
            numSteps++;
            addIndexOrNot = true;
            numSteps++;
        }
        return numSteps;
    }
		
	public static int removeMystery2withNumSteps(String str) { 
		int numSteps = 0;
		String result = ""; 
		int toBeRemoved=0; 
		int count = 1; 
		numSteps++;
		// this for loop looks at every char of str and decides whether to copy it in result or not. 
		for (int i = 0; i < str.length(); i++) { 
			numSteps+=2;
		// decide whether to copy char in result 
			if (i != toBeRemoved) {  
				result += str.charAt(i);
				numSteps++;			 
			}
			else { 
				toBeRemoved = toBeRemoved + count; 
				count++; 
				numSteps++;
			} 
		}  
		numSteps++;
		return numSteps; 
	}

	//This is the file where you copy the code for Situation2 into. Make sure you copy and paste all the code necessary and to ensure that formatting is preserved.
	public static void main(String[] args) {
		//This is where you call your testing methods.
		String str1 = "abcdef";
		String str2 = "abcdefghijklmnopqrstuvwxyz";
		String str3 = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";

		System.out.println(removeMystery1withNumSteps(str3));
		System.out.println(removeMystery2withNumSteps(str3));
	}
}