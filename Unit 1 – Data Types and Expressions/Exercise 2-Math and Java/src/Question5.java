import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter desk length in inches:");
		double inches = input.nextDouble();
		double conversionFactor = 2.54;
		double centimeters = inches*conversionFactor;
		System.out.print("Desk length = " + centimeters);



	}

}
