import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter an integer:");
		int x = input.nextInt();
		String [] [] stars = new String [x+1][];
		
		//Declares the COLUMNS for each ROW.
		for (int row = 0; row < stars.length; row++) {
			stars[row] = new String [row];
		}
		
		for (int row = 0; row < stars.length; row++) {
			for (int column = 0; column < stars[row].length; column++) {
				stars[row][column] = "* ";
				System.out.print(stars[row][column]);
			}
			System.out.println();
		}
		
		
		

	}

}
