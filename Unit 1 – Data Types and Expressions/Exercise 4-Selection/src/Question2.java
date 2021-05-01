import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println ("Enter the amount of pellets to feed Pacman (no half pellets please)");
		int pellets = input.nextInt();
		if (pellets<=100) {
			System.out.println("I’m still hungry. FEED me MORE!!");
		}
		else if (pellets>=101 && pellets<=150) {
			System.out.println("Thanks!");
		}
		else if (pellets>151) {
			System.out.println("no more please. I’m full");
		}


	}

}
