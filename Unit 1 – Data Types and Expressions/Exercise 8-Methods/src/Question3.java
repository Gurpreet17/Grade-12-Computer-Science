import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a value");
		double x = input.nextDouble();
		System.out.println("Enter another value");
		double y = input.nextDouble();
		System.out.println(y + " subtracted from " + x + " is " + Decrease(x,y));
	
	}
	
	public static double Decrease (double x, double y) {
		if (x>y) {
			double subtraction = x - y;
			return subtraction;
		}
		else {
			return x;
		}
	} 



}
