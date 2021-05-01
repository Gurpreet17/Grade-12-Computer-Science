import java.util.Scanner;
import java.io.*;
public class Question2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		FileWriter fr = new FileWriter ("./Marks Folder/marks2.txt"); //File Writer Directory 
		PrintWriter pw = new PrintWriter (fr);
		int mark=1;
		while (mark!=0) {
			System.out.println("Enter mark:");
			mark = input.nextInt();
			pw.write(mark + "\n");
		}
		pw.close();
		
		
		

	}

}
