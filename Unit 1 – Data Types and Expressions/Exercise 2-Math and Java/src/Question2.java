import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter Age: ");
		int age = input.nextInt();
		System.out.print("Enter number of tv hours watched per day: ");
		int hours = input.nextInt();
		int average = ((age-2)*365)*hours;
		System.out.println("You’ve watched approx: " + average + " hours in your life");



	}

}
