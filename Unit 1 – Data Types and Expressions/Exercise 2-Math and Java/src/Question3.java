import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the object’s mass in kg ");
		double mass = input.nextInt();
		System.out.print("Enter the object’s acceleration in m/s**2: ");
		double acceleration = input.nextDouble();
		double force = (mass*acceleration);
		force = Math.round(force*10)/10.0;
		System.out.println("The force of the object with a mass of " + mass + "kg and acceleration of " + acceleration + "m/s**2 is " + force + "N");



	}

}
