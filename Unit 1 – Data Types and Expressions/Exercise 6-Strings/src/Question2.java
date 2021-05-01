import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println ("Continue?");
		String response = input.next();
		while (!response.equals("y") || !response.equals("y") ) {
			System.out.println ("Continue?");
			response = input.next();
		}

	}

}
