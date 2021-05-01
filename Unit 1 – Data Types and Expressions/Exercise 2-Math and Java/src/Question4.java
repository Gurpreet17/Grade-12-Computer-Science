import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the total number of hours");
		int totalHours = input.nextInt();
		int days = totalHours/24;
		int hours = totalHours-(24*days);
		System.out.println("There are " + days + " days and " + hours + " hours in " + totalHours + " hours");


	}

}
