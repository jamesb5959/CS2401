import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class EPProfileDB {

	/* Attributes **********************************************************/
	private EPProfile[] ProfileDB;
	private int size;
	
	/* Constructors ********************************************************/
	public EPProfileDB() {}
	
	public EPProfileDB(int size) {
		this.size = size;
		ProfileDB = new EPProfile[size];
	}

	public EPProfileDB(EPProfile[] DB) {
		size = DB.length;
		ProfileDB = new EPProfile[size];
		for (int i=0; i<size; i++) { 
			ProfileDB[i] = DB[i];
		}
	}
	
    /* TO DO 1: 
     * Write a constructor that takes a file name (String) as only parameter
     * and reads the file information into an instance of an EPProfile with correct size and array of profiles.
     * The size if the first information read in the file (first line).
     * The EPProfile objects that go in the the ProfileDB are read from the file, one by one as follows:
     *      Last-name First-name
     *      DOB
     *      Number of medical conditions
     *      Date of first dose (YYYYMMDD)
     *      Date of second dose (YYYYMMDD)
     *      Second administered (as yes/no)
     * We give you starter code for this method, as available below (you have to complete it).
     */
	public EPProfileDB(String filename) throws FileNotFoundException, IOException {
		FileReader fr = new FileReader(filename);
        BufferedReader textReader = new BufferedReader(fr);

        /* We read the size of the DB as an integer on the first line of the file */
        if (textReader.ready()) {
        	size = Integer.valueOf(textReader.readLine());
        	ProfileDB = new EPProfile[size];
        }
        
        /* COMPLETE CODE HERE */
		for (int i = 0; i < ProfileDB.length; i++) {
            String name = textReader.readLine();
            String[] firstAndLast = name.split(" ");
            int dob = Integer.parseInt(textReader.readLine());
            int medConditions = Integer.parseInt(textReader.readLine());
            int firstDose = Integer.parseInt(textReader.readLine());
            int secondDose = Integer.parseInt(textReader.readLine());
            boolean hasHadSecondDose;
            if(textReader.readLine().equals("True")){
                hasHadSecondDose = true;
            }
            else{
                hasHadSecondDose = false;
            }
            ProfileDB[i] = new EPProfile(firstAndLast[1], firstAndLast[0], dob, medConditions,
            firstDose, secondDose, hasHadSecondDose);
        }
        textReader.close();
	}
		
	
	/* Getters and Setters **********************************************************/
	/**
	 * @return the profileDB
	 */
	public EPProfile[] getProfileDB() {
		return ProfileDB;
	}

	/**
	 * @param profileDB the profileDB to set
	 */
	public void setProfileDB(EPProfile[] profileDB) {
		ProfileDB = profileDB;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}
	
	/* Other methods **********************************************************/
	
    /* TO DO 2: 
	 * This method prints all profiles in the ProfileDB, one by one 
     */
	public void print() {
        // COMPLETE CODE HERE
		for(int i = 0; i<ProfileDB.length; i++){
			System.out.println(ProfileDB[i].getFirst()+" " +ProfileDB[i].getLast());
            System.out.println(ProfileDB[i].getDob());
            System.out.println(ProfileDB[i].getMedConditions());
            System.out.println(ProfileDB[i].getFirstDose());
            System.out.println(ProfileDB[i].getSecondDose());
            System.out.println(ProfileDB[i].getSecondAdministered());
		}
    }
	
	/* TO DO 3: 
     * This method moves all profiles of already twice vaccinated people
	 * at the end of the DB.
	 * It returns the number of people who have already been vaccinated twice.
	 */
	public int moveDoneToEnd() {
        // COMPLETE CODE HERE
		//sort
		for(int i = 0; i<ProfileDB.length; i++){
			for(int j = 0; j<ProfileDB.length - i - 1; j++){
				EPProfile temp = ProfileDB[j];
				if(ProfileDB[j].getSecondAdministered()){
					ProfileDB[j] = ProfileDB[j+1];
					ProfileDB[j+1] = temp;
				}
			}
		}
		//count twice vaccinated
		int twiceVaccinatedCount = 0;
		for(int i = 0; i<ProfileDB.length; i++){
			if(ProfileDB[i].getSecondAdministered()){
				twiceVaccinatedCount++;
			}
		}
        return twiceVaccinatedCount; // dummy return, just to ensure that code compiles: please modify
    }
	
	/* This method returns the index of the oldest person in the DB 
	 * among those who have not yet been vaccinated twice 
	 */
	public int maxAge(int range) {
		int indexMax = 0;
		for (int i=1; i<= range; i++) {
			if (ProfileDB[i].getDob() < ProfileDB[indexMax].getDob())
				indexMax = i;
		}
		return indexMax;
	}
	
	/* This method returns the index of the person with the largest number
	 * of medical conditions in the DB 
	 * among those who have not yet been vaccinated twice 
	 */
	public int maxMC(int range) {
		int indexMax = 0;
		for (int i=1; i<= range; i++) {
			if (ProfileDB[i].getMedConditions() < ProfileDB[indexMax].getMedConditions())
				indexMax = i;
		}
		return indexMax;
	}
	
	/* TO DO 4: 
     * Pre-condition to this method: method moveDoneToEnd has been applied already and all people vaccinated twice 
     * are now at the end of the array 
     * This method takes an int that represents the number of people in ProfileDB who have been vaccinated twice 
     * It sorts the people in the ProfileDB not vaccinated twice, by age (oldest to youngest) 
     * It returns a new array of EPProfile objects that is correctly sorted
     */
	public EPProfile[] sortByAge(int completed) {
		EPProfile[] sortedByAge = new EPProfile[ProfileDB.length - completed]; // dummy code, just to ensure that code compiles: please modify
        // COMPLETE CODE HERE
		for (int i = 0; i < sortedByAge.length; i++) {     
            sortedByAge[i] = ProfileDB[i];     
        } 
		for(int i = 0; i<sortedByAge.length; i++){
			for(int j = 0; j<sortedByAge.length - i - 1; j++){
				EPProfile temp = sortedByAge[j];
				if(sortedByAge[j].getDob() > sortedByAge[j+1].getDob()){
					sortedByAge[j] = sortedByAge[j+1];
					sortedByAge[j+1] = temp;
				}
			}
		}
		return sortedByAge;  // dummy code, just to ensure that code compiles: please modify
	}
	
	/* TO DO 5: 
     * Pre-condition to this method: method moveDoneToEnd has been applied already and all people vaccinated twice 
     * are now at the end of the array 
     * This method takes an int that represents the number of people in ProfileDB who have been vaccinated twice 
	 * It sorts the people in the DB not vaccinated twice, by decreasing number of 
	 * medical conditions 
     * It returns a new array of EPProfile objects that is correctly sorted
     */
	public EPProfile[] sortByMedicalConditions(int completed) {
		EPProfile[] sortedByMC = new EPProfile[ProfileDB.length - completed]; // dummy code, just to ensure that code compiles: please modify
        // COMPLETE CODE HERE
		for (int i = 0; i < sortedByMC.length; i++) {     
            sortedByMC[i] = ProfileDB[i];     
        } 
		for(int i = 0; i<sortedByMC.length; i++){
			for(int j = 0; j<sortedByMC.length - i - 1; j++){
				EPProfile temp = sortedByMC[j];
				if(sortedByMC[j].getMedConditions() < sortedByMC[j+1].getMedConditions()){
					sortedByMC[j] = sortedByMC[j+1];
					sortedByMC[j+1] = temp;
				}
			}
		}
		for(int i = 0; i < sortedByMC.length; i++){
			System.out.println("Test :"+ sortedByMC[i]);
		}
		return sortedByMC;
	}
	
	/* TO DO 6: 
     * This method compares the impact of rankings
	 * It sorts by age, sorts by medical conditions, and then compares the changes of rankings
	 * It reports the min change, the max change and the average change
     * You are given starter code here: you have to complete it.
	 */
	public double[] compareAgeMCRankings() {
		double[] stats = new double[3]; 
        // this array will hold the max change in stats[0], the min change in stats[1], and the average change in stats[2]
		
        /* in order to compare rankings, we start by applying the methods you have written so far:
         * moveDoneToEnd, sortByAge, sortByMedicalConditions
         */
        int completed = moveDoneToEnd();
		EPProfile[] sortedByAge = sortByAge(completed);
		EPProfile[] sortedByMC = sortByMedicalConditions(completed);
		// COMPLETE CODE HERE
		stats[0] = 0;
		int[] minMaxArray = new int[sortedByAge.length];
		for(int i = 0; i<sortedByAge.length; i++){
			int count = 0;
			for(int j = 0; j<sortedByMC.length; j++){
				if(sortedByAge[i]!=sortedByMC[j]){
					count++;
				}
			}
			minMaxArray[i]=count;
		}
		int min = minMaxArray[0];
		int max = minMaxArray[0];
		for(int i=1; i< minMaxArray.length; i++){
        	if(minMaxArray[i] > max){
    			max = minMaxArray[i];
			}
            else if (minMaxArray[i] < min){
                min = minMaxArray[i];
			}
        }
		int average = min+max/minMaxArray.length;
		stats[0] = max;
		stats[1] = min;
		stats[2] = average;
		return stats;
	}	
}
/*1. The cost of moveDoneToEnd done to end will be n^2+n as the worst case and n+n as the best case because I am using a bubble sort 
to move the people who have been vaccinated twice to the end which makes the worst case n^2 and the best case is n and then I use 
a for loop to count how many people who have been vaccinated which will be n for both worst and best case.*/
/*2. The cost of sortByAge will be n^2 as the worst case and the best cause will be n because I am also using another bubble sort which
makes the worst case n^2 and the best case n.*/