import java.util.Scanner;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		boolean UP = false;
		int count = 1;
		while (UP==false && count<=3) {
			System.out.println ("Username:");
			String username = input.next();
			System.out.println("Password:");
			String password = input.next();
			count++;
			if (username.equals("user") && password.equals("pass")) {
				UP = true;
				System.out.println("Identity confirmed");
			}
		}

	}

}
