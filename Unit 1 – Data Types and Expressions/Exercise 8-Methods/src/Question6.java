import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter total cost:");
		double cost = input.nextDouble();
		System.out.println("Enter discount:");
		double discount = input.nextDouble();
		System.out.println("The final price after " + discount + " discount and taxes is $" + Checkout(cost,discount));

	}
	
	//This method will calculate and return the final price after the discount and taxes.
	public static double Checkout(double sum, double discount) {
		double cost = sum - (sum*discount);
		double totalCost = cost * 0.13;
		return totalCost;
	}




}
