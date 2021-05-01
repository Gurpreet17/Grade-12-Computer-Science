import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner (System.in);
		System.out.println("Enter Test number:");
		int testNumber = input.nextInt();
		System.out.println("Enter Test mark:");
		int score = input.nextInt();
		double weightedScore;
		switch(testNumber) {
		case 1: 
			weightedScore = score*0.10;
			System.out.println("A score of " + score + " on test" + testNumber + " gives a weighted score of " + weightedScore);
			break;
		
		case 2: 
			weightedScore = score*0.20;
			System.out.println("A score of " + score + " on test " + testNumber + " gives a weighted score of " + weightedScore);
			break;
		
		case 3: 
			weightedScore = score*0.20;
			System.out.println("A score of " + score + " on test " + testNumber + " gives a weighted score of " + weightedScore);
			break;
		
		case 4:
			weightedScore = score*0.15;
			System.out.println("A score of " + score + " on test " + testNumber + " gives a weighted score of " + weightedScore);
			break;
		
		case 5:
			weightedScore = score*0.15;
			System.out.println("A score of " + score + " on test " + testNumber + " gives a weighted score of " + weightedScore);
			break;
		
		case 6:
			weightedScore = score*0.20;
			System.out.println("A score of " + score + " on test " + testNumber + " gives a weighted score of " + weightedScore);
			break;
		
		default:
			System.out.println("Enter a valid test number or score");
		}




	}

}
