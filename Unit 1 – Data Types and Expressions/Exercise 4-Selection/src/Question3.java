import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the number of cones sold:");
		int cones = input.nextInt();
		double bonus;
		if (cones>=350) {
			bonus = (cones*0.35)+10;
			System.out.println("He will earn $" + bonus + " If he sells " + cones +  " cones");
		}
		else if (cones>=250) {
			bonus = (cones*0.25)+10;
			System.out.println("He will earn $" + bonus + " If he sells " + cones +  " cones");
		}
		else if (cones>=150) {
			bonus = (cones*0.10)+10;
			System.out.println("He will earn $" + bonus + " If he sells " + cones +  " cones");
		}
		else {
			System.out.println("Enter a valid number for the cones sold");
		}


	}

}
