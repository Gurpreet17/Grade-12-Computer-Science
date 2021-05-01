import java.util.Scanner;
import java.text.NumberFormat;

public class Bank {
	public static void main(String[] args) {
		Account munozAccount = new Account(250, "Maria", "Munoz", "110  Glades Road", "Mytown", "FL", "33445");
		Customer customer = new Customer("Maria", "Munoz", "110  Glades Road", "Mytown", "FL", "33445");
		Scanner input = new Scanner(System.in);
		double data;
		NumberFormat money = NumberFormat.getCurrencyInstance();
		System.out.println(munozAccount);
		System.out.print("Enter deposit amount: ");
		data = input.nextDouble();
		munozAccount.deposit(data);
		System.out.println("Balance is: " + money.format(munozAccount.getBalance()));
		System.out.print("Enter withdrawal amount: ");
		data = input.nextDouble();
		munozAccount.withdrawal(data);
		System.out.println("Balance is: " + money.format(munozAccount.getBalance()));
		int option;
		do {
			System.out.println ("Would you like to edit your profile ?");
			System.out.println ("1 - Yes");
			System.out.println("2 - No");
			option = input.nextInt();
			if (option != 1 && option != 2)
				System.out.println("Invalid option, please enter 1 for yes or 2 for No:");
		}
		while (option != 1 && option != 2);
		
		if (option == 1) {
			do {
				System.out.println("Enter changes you wish to make");
				System.out.println("1 - Edit Street");
				System.out.println("2 - Edit City");
				System.out.println("3 - Edit State");
				System.out.println("4 - Edit zip");
				option = input.nextInt();
				if (option > 4 || option < 1)
					System.out.println ("Invalid option, please enter one of the following options");
			}
			while (option > 4 || option < 1);
			if (option == 1) {
				System.out.println("Enter new street:");
				String newStreet = input.next();
				customer.changeStreet(newStreet);
				System.out.println("Changes Successful");
			}
			else if (option == 2) {
				System.out.println("Enter new city:");
				String newCity = input.next();
				customer.changeStreet(newCity);
				System.out.println("Changes Successful");
			}
			else if (option == 3) {
				System.out.println("Enter new State");
				String newState = input.next();
				customer.changeStreet(newState);
				System.out.println("Changes Successful");
			}
			else if (option == 4) {
				System.out.println("Enter new Zip:");
				String newZip = input.next();
				customer.changeStreet(newZip);
				System.out.println("Changes Successful");
			}
			System.out.println("New Profile");
			System.out.println(customer.toString());
		}
		else {
			System.out.println("Thank you for choosing our bank, have a wonderful day !");
		}
	}
}
