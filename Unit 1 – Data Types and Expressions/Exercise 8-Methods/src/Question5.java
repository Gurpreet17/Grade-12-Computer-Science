import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the total cost");
		double cost = input.nextDouble();
		System.out.println("Enter the discount:");
		double discount =input.nextDouble();
		System.out.println("The discount on $" + cost + " is $" + CalculateDiscount(cost,discount));

	}
	
	//This method calculates the discount 
	public static double CalculateDiscount (double x, double y) {
		double discount = x * y;
		return discount;
	}




}

