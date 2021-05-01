/*
 * Gurpreet Singh
 * 2020-12-16
 * This program take the marks from the text file "markSet.txt" and returns the average of each mark set;
 */

//JAVA API CLASSES
import java.io.*;
import java.util.Scanner;


public class GurpreetSingh {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader ("./Marks/marks.txt");     //Declares file reader									 //imports file reade
		Scanner scan = new Scanner(fr);							  //Declares Scanner
		//TITTLE 
		Title ();
		
		//VARIABLES 
		String name;				        //stores the name of the student.
		String markString;					//stores the name + marks of the student as a string type
		double average;						//Stores the average of a student from the method CalcAvg
		double totalAverage = 0;			//Stores the total average of all students combined 
		int studentCount =0;				//Keeps track of the number of students 
		double highestMark = 0;				//Stores the highest mark in the class
		String highestStudent = "";			//Stores the name of the student that has the highest mark 
		//MARK SEQUENCE
		while (scan.hasNextLine()) {		//While loop that runs until the marks has not been read from file
			markString = scan.nextLine();	//Reads the names + marks from the file and stores it
			name = Name (markString);		
			average = CalcAvg(markString);
			if (average>highestMark) {		//If loop that keep tracks of the highest mark
				highestMark = average;		
				highestStudent = name;
			}
			if (average>=0 && average<=100) {											//If loop that checks if the mark is valid 0<=mark<=100
				System.out.println("The average of " + name + " is " + average + "%"); 	//Outputs the student name + average
				totalAverage = totalAverage + average;									//Keeps track of total average of the class		
				studentCount++;															//Increments by 1 each time a students mark has been input
			}
			else if (average == -1) {													//If loop that checks if mark is invalid (markCount<6)
				System.out.println(name + " doesn’t have at least six credits to apply to university.");
			}
			else if (average == -2) {													//If loop that checks if mark is invalid (markCount>8)
				System.out.println(name + " has more than 8 credits");
			}
			else if (average==-3) {														//If loop that checks if mark is invalid (0>mark>100)
				System.out.println(name + " marks are not valid to apply to university");
			}
			else {
				System.out.println(name + " marks are not valid to apply to university");
			}
		}
		totalAverage = totalAverage/studentCount;									  					//Calculates the total average of the class
		totalAverage = Math.round(totalAverage*100.0)/100.0;						   					//Rounds the total average to 2 decimal places 
		System.out.println("The total average of all student is " + totalAverage + "%");				//Outputs total average of the class
		System.out.println(highestStudent + " has the highest overall average of " + highestMark + "%");//Outputs the student with highest mark + highest mark 
		scan.close();
	}
	
	/*
	 * This method returns the name of the student 
	 */
	
	public static String Name (String markString) {
		String markArray [] = markString.split(" "); 				//Splits the name and marks from the string and stores the marks and name in its own index
		String name = markArray[0];									//Stores the name of the student at index 0
		return name;												//Returns the name of the student as a String type
	}
	
	/*
	 * This method calculates the average of each student and 
	 * checks weather students marks are eligible for university 
	 * Returns the average of each student.
	 */
	
	public static double CalcAvg (String markString) {
		//VARIABLES
		String markArray [] = markString.split(" ");				//String array that stores the name + marks of student in each index
		int markCount=0;											//Stores the number of marks that the student has
		int marks;													//Converts the mark from string to int type.						
		int markLength = markArray.length;							//Stores the length of the array
		double average =0;											//Stores the average of the student if valid
		
		for (int count = 1; count<markString.length(); count++) {	//For loop to counts the number of spaces which represent the number of marks
			if (markString.charAt(count) == ' ') {
				markCount++;										//Increments by 1 each time there is a "space"/mark
			}
		}
		
		if (markCount<6) {										   //If statement that checks if mark is invalid (markCount<6)
			average = -1;										   //Returns -1;
		}
		
		else if (markCount>8) {									   //If statement that checks if mark is invalid (markCount>6)
			average = -2;										   //Returns -2;
		}
		
		else {													   //Else statement that calculates the valid marks 
			for (int x=1; x<=markCount; x++) {
				marks = Integer.parseInt(markArray[x]);				//Converts the mark from String to int type
				average = average + marks;
			}
			average = average/markCount;							//Calculates the average of the student
		}
		
		for (int x=1; x<markCount; x++) {					
			marks = Integer.parseInt(markArray[x]);					
			if (marks<0) {											//If statement that checks if mark is invalid (0>mark>100)
				average = -3;										//Returns -3 if true
			}
		}
		
		average = Math.round(average*100.0)/100.0;					//Rounds average to 2 decimal place
		return average;										    	//Returns average valid/invalid
		
	}
	
	/*
	 * Method that stores the title of the program
	 */
	
	public static void Title () {
		System.out.println(" ________________ \r\n" + 
				"|  ____________  |\r\n" + 
				"| |   MARKS    | |\r\n" + 
				"| |____________| |\r\n" + 
				"|________________|" + "\n");
	}
		
		

}




