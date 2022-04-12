import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CatShelter {

	/* YOU HAVE TO COMPLETE THIS METHOD: */
	/* Method called readCatsIntoArray; ← you have to implement it
	 * Parameter: String filename (the file that contains the information about cats);
	 * Returns: an array of Cats.
	 */
	public static Cat[] readCatsIntoArray(String filename) throws FileNotFoundException, IOException {
		Cat[] Shelter; 

		FileReader fr = new FileReader(filename);
        BufferedReader textReader = new BufferedReader(fr);

        /* We read the size of the Shelter as an integer on the first line of the file */
        if (textReader.ready()) {
        	Shelter = new Cat[Integer.valueOf(textReader.readLine())];
        } else {
        	textReader.close();
        	return new Cat[0];
        }

		// COMPLETE CODE IN THE FOR LOOP, INCLUDING EXCEPTIONS IN CASE FILE IS NOT CORRECTLY FORMATTED
        for (int i = 0; i < Shelter.length; i++) {
            String catType = textReader.readLine();
            String name = textReader.readLine();
            String breed = textReader.readLine();
            int age = Integer.parseInt(textReader.readLine());
            if(catType.equals("Cat")){
                Shelter[i]  = new Cat(name, breed, age);
            }
            else if(catType.equals("Grumpy Cat")){
				Shelter[i]  = new GrumpyCat(name, breed, age);
            }
            else if(catType.equals("Cuddly Cat")){
                Shelter[i]  = new CuddlyCat(name, breed, age);
			}
			else{
				System.out.print("No cat type.");
			}
		}
        	// First read the type of cat: Cat, Grumpy Cat, Cuddly Cat
        	// Then read the information in the following order: name, breed, age
        textReader.close();
		return Shelter;
	}
	
	/* THIS METHOD IS GIVEN TO YOU: YOU SHOULD NOT MODIFY IT */
	/* Method called sortByCategory; ← it is given to you but you have to implement its parts (see below)
	 * Parameter: an array of objects of type Cat;
	 * Returns nothing (your method modifies the input array in place since its 
	 * 		reference – address – is passed to the method).
	 * This method uses:	
	 * 	- Insertion sort to sort the Cat category;
	 *  - Bubble sort to sort the GrumpyCat category; and 
	 *  - Selection sort to sort the CuddlyCat category. 
	 *  As well as a method to separate different types of cats: catCategories (see below).
	 *  You will have to implement each of the 4 above methods, but sortByCategory will be provided to you.
	 */
	public static void sortByCategory(Cat[] Shelter) {
		int[] catIndices = catCategory(Shelter);
		insertionSortRangeByAgeName(Shelter, 0, catIndices[0]-1);
		bubbleSortRangeByAgeName(Shelter, catIndices[0], catIndices[1]-1);
		selectionSortRangeByAgeName(Shelter, catIndices[1], Shelter.length-1);
		
	}
	
	/* YOU HAVE TO COMPLETE THIS METHOD: */
	/* Method catCategory: 
	 * Takes an array of Cat objects;
	 * Modifies this array in such a way that all generic cats come first, 
	 * 		followed by grumpy cats, and then all cuddly cats are at the end of the array.
	 * Returns the index of the first grumpy cat as well as the index of 
	 * 		the first cuddly cat, bundled into an array of 2 ints.
	 * Note: you are guaranteed to have at least one cat in each category
	 */
	public static int[] catCategory(Cat[] Shelter) {
		int[] indices = new int[2];
		// COMPLETE CODE HERE
		//sort
		for(int i = 0; i<Shelter.length; i++){
			for(int j = 0; j<Shelter.length - i - 1; j++){
				Cat temp = Shelter[j];
				if(Shelter[j] instanceof GrumpyCat && Shelter[j+1] instanceof Cat){
					Shelter[j] = Shelter[j+1];
					Shelter[j+1] = temp;
				}
				else if(Shelter[j] instanceof CuddlyCat && Shelter[j+1] instanceof GrumpyCat){
					Shelter[j] = Shelter[j+1];
					Shelter[j+1] = temp;
				}
			}
		}
		// position
		int GrumpyCatPosition = 0;
		int CuddlyCatPosition = 0;
		for(int i=0; i<Shelter.length; i++){
			if(Shelter[i] instanceof GrumpyCat && GrumpyCatPosition == 0){
				GrumpyCatPosition = i;
			}
			else if(Shelter[i] instanceof CuddlyCat && CuddlyCatPosition == 0){
				CuddlyCatPosition = i;
			}
			else{
				i++;
			}
		}
		indices[0] = GrumpyCatPosition;
		indices[1] = CuddlyCatPosition;
		return indices;
	}
	
	/* YOU HAVE TO COMPLETE THIS METHOD: */	
	/* Method insertionSortRangeByAgeName:
	 * 	Takes an array C of Cat objects, a start index, an end index; 
	 * 	Sorts the elements of array C between index start and index end 
	 * 		(included), by age and then by name, following the insertion sort algorithm; 
	 * 	Does not return anything (C is modified in place).
	 */
	public static void insertionSortRangeByAgeName(Cat[] Shelter, int start, int end) {
		// COMPLETE CODE HERE    
		for (int j = start; j < end; j++) {  
            Cat temp = Shelter[j];  
            int i = j-1;  
			Cat one = Shelter[i];
			Cat two = Shelter[j];
			int nameCompare = one.getName().compareTo(two.getName());
            while ( (i > -1) && ( one.getAge() > two.getAge() ) ) {  
                Shelter[i+1] = Shelter[i];  
                i--;  
            } 
			if(one.getAge() == two.getAge()){
            	while ( (i > -1) && ( nameCompare > 0 ) ) {  
                	Shelter[i+1] = Shelter[i];  
                	i--;  
            	} 
			} 
            Shelter[i+1] = temp;  
        }
	}
	
	/* YOU HAVE TO COMPLETE THIS METHOD: */	
	/* Method selectionSortRangeByAgeName:
	 * 	Takes an array C of Cat objects, a start index, an end index; 
	 * 	Sorts the elements of array C between index start and index end (included), 
	 * 		by age and then by name, following the selection sort algorithm; 
	 * 	Does not return anything (C is modified in place).
	 */
	public static void selectionSortRangeByAgeName(Cat[] Shelter, int start, int end) {
		// COMPLETE CODE HERE
		for (int i = start; i < end-1; i++) { 
			for(int j = i+1; j<end; j++){
				int indexSmallest = i;
				Cat one = Shelter[i];
				Cat two = Shelter[j];
				int nameCompare = one.getName().compareTo(two.getName());
				if(one.getAge() > two.getAge()){
					indexSmallest = j;	
					Cat temp = Shelter[indexSmallest];
					Shelter[indexSmallest] = Shelter[i];
					Shelter[i] = temp;
				}
				if(one.getAge() == two.getAge()){
					if(nameCompare > 0){
						indexSmallest = j;	
						Cat temp = Shelter[indexSmallest];
						Shelter[indexSmallest] = Shelter[i];
						Shelter[i] = temp;
					}
				}
			}
		}
	}

	/* YOU HAVE TO COMPLETE THIS METHOD: */	
	/* Method bubbleSortRangeByAgeName:
	 * 	Takes an array C of Cat objects, a start index, an end index; 
	 * 	Sorts the elements of array C between index start and index end (included), 
	 * 		by age and then by name, following the bubble sort algorithm; 
	 * 	Does not return anything (C is modified in place).
	 */
	public static void bubbleSortRangeByAgeName(Cat[] Shelter, int start, int end) {
		// COMPLETE CODE HERE
		for(int i = start; i<end; i++){
			for(int j = start; j<end - i - 1; j++){
				Cat one = Shelter[j];
				Cat two = Shelter[j+1];
				Cat temp = Shelter[j];
				int nameCompare = one.getName().compareTo(two.getName());
				if(one.getAge() > two.getAge()){	
					Shelter[j] = Shelter[j+1];
					Shelter[j+1] = temp;
				}
				if(one.getAge() == two.getAge()){
					if(nameCompare > 0) {
						Shelter[j] = Shelter[j+1];
						Shelter[j+1] = temp;
					}
				}				
			}
		}
	}
}