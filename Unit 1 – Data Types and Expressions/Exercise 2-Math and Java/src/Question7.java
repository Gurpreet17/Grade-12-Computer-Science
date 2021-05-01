import java.util.Scanner;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter first speed: ");
		double speed1 = input.nextDouble();
		System.out.print("Enter second speed: ");
		double speed2 = input.nextDouble();
		System.out.println("Enter total distance: ");
		double distance = input.nextDouble();
		double time1 = (distance/2)/speed1;
		double time2 = (distance/2)/speed2;
		double totalTime = Math.round((time1+time2)*100.0)/100.0;
		System.out.print("She was running for " + totalTime + " hours");



	}

}
