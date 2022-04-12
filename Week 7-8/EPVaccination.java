import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class EPVaccination {
		
	/* You will now use the methods you designed to handle patient profiles for vaccination */
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String filename = "C:/Users/james/OneDrive/Desktop/program/Programing 2/Week 7-8/myDB.txt"; // please change this path to where your file is
		EPProfileDB EPDB1 = new EPProfileDB(filename); 
		EPDB1.print();
		EPDB1.moveDoneToEnd();
		EPDB1.print();
		double[] stats = EPDB1.compareAgeMCRankings();
		System.out.println("max Change = "     + stats[0] + "; "
				         + "min Change = "     + stats[1] + "; "
						 + "average Change = " + stats[2] + ".");
	}
}
