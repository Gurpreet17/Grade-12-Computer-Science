import java.util.Scanner;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter an integer");
		int x = input.nextInt();
		for (int a=1; a<=x; a++) {
			System.out.print(a + " times table\t");
			for (int b=1; b<=x; b++) {
				int calculation = a*b;
				System.out.print(calculation + "\t");
			}
			System.out.println();
		}



	}

}
