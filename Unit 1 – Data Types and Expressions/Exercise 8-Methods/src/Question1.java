import java.util.*;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println ("Enter a number to be rounded");
		double number = input.nextDouble();
		System.out.println("Enter the decimal place you want to round " + number);
		int decimalPlace = input.nextInt();
		double round = Round (number, decimalPlace);
		System.out.println(number + " rounded to " + decimalPlace + " place " + "is " + round);
		
		
		
	
	}
	/*
	 *  This method will round the double x to y decimal places. 
	 *  This method will return the rounded value.  
	 *  If the y is an invalid decimal place, a -1 is returned.  
	 */
	public static double Round (double x, int y) {
		String decimal = String.valueOf(y);
		String round = String. format("%." + decimal + "f", x);
		double roundNum;
		if (y<1) {
			roundNum = -1;
		}
		else {
			roundNum = Double.parseDouble(round);
		}
		
		return roundNum;
	}
}
