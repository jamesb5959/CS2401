
public class EPProfile {

	/* Attributes */
	private String First;
	private String Last;
	private int dob; // YYYYMMDD
	private int medConditions;
	private int firstDose;
	private int secondDose; 
	private boolean secondAdministered;
	
	/* Constructors */
	public EPProfile() {}
	
	public EPProfile(String First, String Last, int dob, int medConditions, 
					int firstDose, int secondDose, boolean secondAdministered) {
		this.First = First;
		this.Last = Last;
		this.dob = dob;
		this.medConditions = medConditions;
		this.firstDose = firstDose;
		this.secondDose = secondDose;
		this.secondAdministered = secondAdministered;
	}
	
	public EPProfile(EPProfile P) {
		this.First = P.getFirst();
		this.Last = P.getLast();
		this.dob = P.getDob();
		this.medConditions = P.getMedConditions();
		this.firstDose = P.getFirstDose();
		this.secondDose = P.getSecondDose();
		this.secondAdministered = P.getSecondAdministered();
	}

	/* Getters and Setters */
	/**
	 * @return the first
	 */
	public String getFirst() {
		return First;
	}

	/**
	 * @param first the first to set
	 */
	public void setFirst(String first) {
		First = first;
	}

	/**
	 * @return the last
	 */
	public String getLast() {
		return Last;
	}

	/**
	 * @param last the last to set
	 */
	public void setLast(String last) {
		Last = last;
	}

	/**
	 * @return the dob
	 */
	public int getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(int dob) {
		this.dob = dob;
	}

	/**
	 * @return the medConditions
	 */
	public int getMedConditions() {
		return medConditions;
	}

	/**
	 * @param medConditions the medConditions to set
	 */
	public void setMedConditions(int medConditions) {
		this.medConditions = medConditions;
	}

	/**
	 * @return the firstDose
	 */
	public int getFirstDose() {
		return firstDose;
	}

	/**
	 * @param firstDose the firstDose to set
	 */
	public void setFirstDose(int firstDose) {
		this.firstDose = firstDose;
	}

	/**
	 * @return the secondDose
	 */
	public int getSecondDose() {
		return secondDose;
	}

	/**
	 * @param secondDose the secondDose to set
	 */
	public void setSecondDose(int secondDose) {
		this.secondDose = secondDose;
	}

	/**
	 * @return the secondAdministered
	 */
	public boolean getSecondAdministered() {
		return secondAdministered;
	}

	/**
	 * @param secondAdministered the secondAdministered to set
	 */
	public void setSecondAdministered(boolean secondAdministered) {
		this.secondAdministered = secondAdministered;
	}
	
	/* Other methods */
	public String toString() {
		String output = Last + "' " + First + "\n";
		output += "Date of birth: " + dob + "\n";
		output += "Number of medical conditions: " + medConditions + "\n";
		output += "Date of first dose: " + firstDose + "\n";
		if (secondAdministered) 
			output += "Date of second dose: " + secondDose + "\n";
		else 
			output += "Second dose pending, to be administered: " + secondDose + "\n";
		return output;
	}
	
	public void print() {
		System.out.println(toString());
	}

	
}
