/*
 * Gurpreet Singh
 * 2020-12-16
 * This program take the marks from the text file "markSet.txt" and returns the average of each mark set;
 */


import java.io.*;
import java.util.Scanner;
public class Review {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader ("./Marks Folder/markSet.txt");									 //imports file reade
		Scanner scan = new Scanner(fr);															 //imports scanner
		String markString;                                                                       //Stores the set of mark from text file
		double average;																			 //Stores the average calculates in the method CalcAvg
		while (scan.hasNextLine()) {															 //While loop that runs until the marks has not been read from file
			markString = scan.nextLine();
			average = CalcAvg(markString);
			System.out.println("The average of the mark set " + markString + " is "  + average); //Outputs average of the mark set
		}
		scan.close();
	}
	
	/*
	 * This method conves the marks into an integer 
	 * and calculates the average of the set of mark
	 */
	public static double CalcAvg (String markSet) {
		String names [] = markSet.split(",");
		int comas=0;
		int mark;
		double average = 0;
		for (int x=0; x<markSet.length(); x++) {
			if (markSet.charAt(x) == ',') {
				comas++;
			}
		}
		if (comas==3) {
			for (int x=0; x<=comas; x++) {
				mark = Integer.parseInt(names[x]);
				average = average + mark;
			}
			average = average/(comas+1);
		}
		else {
			average = -1;
		}
		return average;
	}

}
