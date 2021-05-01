import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter name of boxer:");
		String name = input.nextLine();
		System.out.println("Enter weight of boxer:");
		double weight = input.nextDouble();
		if (weight>90.72) {
			System.out.println(name + " is Heavyweight");
		}
		else if (weight>79.4 && weight<=90.72) {
			System.out.println(name + " is Cruiserweight");
		}
		else if (weight>76.2 && weight<=79.4) {
			System.out.println(name + " is Light Heavyweight");
		}
		else if (weight>72.6 && weight<=76.2) {
			System.out.println(name + " is Super middleweight");
		}
		else if (weight>69.9 && weight<=72.6) {
			System.out.println(name + " is Middleweight");
		}
		else {
			System.out.println(name + " is unknown");
		}



	}

}
