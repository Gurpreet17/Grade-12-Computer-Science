import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter birth year: ");
		int year = input.nextInt();
		int age = 2020 - year;
		System.out.println("You must be " + age + " years old");


	}

}
