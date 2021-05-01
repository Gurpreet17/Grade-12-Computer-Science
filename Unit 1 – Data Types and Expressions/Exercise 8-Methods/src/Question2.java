import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a value");
		double  x = input.nextDouble();
		System.out.println("Enter another value");
		double y = input.nextDouble();
		System.out.println("The sum of " + x + " and " + y + " is " + Increase(x,y));

	}
	
	public static double Increase (double x, double y) {
		double sum = x + y;
		return sum;
	}

}
