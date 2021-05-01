import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter total cost:");
		double cost = input.nextDouble();
		System.out.println("Tax on $" + cost + " is $" + CalculateTax(cost));
		

	}
	
	public static double CalculateTax (double x) {
		double tax = x * 0.13;
		tax = Math.round(tax*100.0)/100.0;
		return tax;
	}

}
