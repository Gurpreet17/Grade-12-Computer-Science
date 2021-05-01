import java.io.*;
import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader ("./Marks Folder/marks3.txt");
		Scanner scan = new Scanner (fr);
		String mark;
		int setCount = 0;											//Counts the total set of marks 
		double average = 0;												//Stores the average of the set of marks			
		double overallSum = 0; 											//Adds the marks from each set
		double overallAverage = 0;										//Calculates the Overall Average															                         
		
		while (scan.hasNextLine()) {									//Reads the mark format as a String
			mark = scan.nextLine();
			System.out.println(mark);
			average = Average (mark);
			overallSum = overallSum + average;
			setCount++;
			System.out.println("Set #" + setCount + " average: " + average + "\n");
		}
		scan.close();
		overallAverage = Math.round((overallSum/setCount)*10.0)/10.0;
		System.out.println ("Overall Average: " + overallAverage);
	}
	
	public static double Average (String mark) {
		int totalMarks = Integer.parseInt(mark.substring(0,1));
		double markConverter=0; 										//Converts each mark from string to int		
		double sum = 0;                                                 //Adds all the set of marks
		double  average =0;                                             //Calculates the Average of the set of marks  
		for (int x=totalMarks, y=1; y+2<=mark.length(); x--, y=y+2) {
			markConverter = Integer.parseInt(mark.substring(y,y+2));
			System.out.print(markConverter + " ");
			sum = sum + markConverter;
			average = Math.round((sum/totalMarks)*10.0)/10.0;
		}
		System.out.println();
		return average;
	}

}
