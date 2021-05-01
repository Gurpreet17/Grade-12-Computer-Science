import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a number between 1 and 1000:");
		int number = input.nextInt();
		int quarters; int dimes; int nickels; int pennies; int count;
		if (number>1) {
			quarters = number/25;
			count = number-(25*quarters);
			dimes = count/10;
			count = count-(10*dimes);
			nickels = count/5;
			count = count-(5*nickels);
			pennies = count/1;
			count = count-pennies;
			System.out.println(number + " of coints is:");
			System.out.println(quarters + " quarters");
			System.out.println(dimes + " dime");
			System.out.println(nickels + " nickels and ");
			System.out.println(pennies + " pennies");
		}
		else if (number==0) {
			System.out.println("Thanks for coming out!");
		}
		else {
			System.out.println("Invalid entry");
		}




	}

}
