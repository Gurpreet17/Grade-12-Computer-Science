package Section2;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int [] scores = new int [0];
		int temp;
		int mark;
		int mean = 0;
		int count = 0;
		do {
			System.out.println("Supply a score (out of 10) on a test:");
			mark = input.nextInt();
			scores = addMark(mark, scores); 
		}
		while (mark > 0);
		
		for (int x = 0; x < scores.length; x++) {
			for (int y = 0; y < scores.length; y++){
				if (scores[x] < scores[y]) {
					temp = scores[x];
					scores[x] = scores[y];
					scores[y] = temp;
				}
			}
		}
		
		
		System.out.println("Score" + "\t\t" + "# of Occurences");
		for (int x = 0; x < scores.length; x = x + count) {
			count = 0;
			for (int y = x; y < scores.length; y++) {
				if (scores[x] == scores[y]) 
					count++;
			}
			System.out.println(scores[x] + "\t\t" + count);
		}
		
		for (int x = 0; x < scores.length; x++)
			mean = mean + scores[x];
		mean = mean/scores.length;
		System.out.println("The MEAN score is " + mean);

	}
	
	/*
	 *This method adds the students score into the array
	 *pre : Mark & old array of scores
	 *post: New array of scores 
	*/
	public static int [] addMark (int mark, int [] scores) {
		if (mark <= 10 && mark >= 0) {
			int [] temp = new int [scores.length + 1];
			for (int x = 0; x < scores.length; x++) {
				temp[x] = scores[x];
			}
			temp [temp.length-1] = mark;
			return temp;
		}
		else 
			return scores;
	}
}
