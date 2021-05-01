import java.io.*;
import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader ("./Marks Folder/marks.txt");
		Scanner scan = new Scanner(fr); //Reads the file
		int mark; //Reads in the marks
		double count=0; //counts the number of marks
		double sumMark = 0; //Sum of all marks
		double average = 0; //Calculates the average of marks
		
		while (scan.hasNextInt()) {
			mark = scan.nextInt();
			sumMark = sumMark + mark;
			count++;
		}
		scan.close(); //Closes the file
		average = sumMark/count;
		System.out.println(Math.round(average*100.0)/100.0);
		


	}

}
