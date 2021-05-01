import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the total purchases made:");
		double purchases = input.nextDouble();
		double subtotal; 
		double discount;
		double total;
		double tax;
		if (purchases>100) {
			discount = purchases*0.15;
			subtotal = purchases - discount;
			tax = subtotal*0.13;
			total = Math.round((subtotal + tax)*100.0)/100.0;
			System.out.println("Subtotal with discount: $" + subtotal);
			System.out.println("Total after taxes: $" + total);
		}
		else {
			tax = purchases*0.13;
			total = Math.round((purchases + tax)*100.0)/100.0;
			System.out.println("Total after taxes: $" + total);
		}


	}

}
