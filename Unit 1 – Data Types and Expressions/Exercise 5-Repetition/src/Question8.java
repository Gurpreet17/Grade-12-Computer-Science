import java.util.Scanner;
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter the first number of the sequence:");
		int a = input.nextInt();
		System.out.println("Enter the number of terms in the sequence:");
		int n= input.nextInt();
		System.out.println("Enter the multiplier between the terms");
		int r= input.nextInt();
		if (r>1) {
			double  Sn = (a*((Math.pow(r,n))-1))/(r-1);
			System.out.println("The sum of the geometric series is " + Sn);
		}
		else {
			System.out.println("Error, multiplier value cannot be 1");
		}


	}

}
