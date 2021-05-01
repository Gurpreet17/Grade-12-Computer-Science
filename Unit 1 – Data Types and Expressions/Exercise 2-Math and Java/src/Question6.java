import java.util.Scanner;
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in);
		System.out.print("Enter Celsius: ");
		double celcius = input.nextDouble();
		double fahrenheit = ((9.0/5.0)*celcius)+32;
		System.out.print(celcius + " degrees celsius " + "= " + fahrenheit + " degrees Farenheit.");


	}

}
