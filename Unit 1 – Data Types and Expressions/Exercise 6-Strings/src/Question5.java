import java.util.Scanner;
public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Enter a string: ");
		String string = input.next();
		for (int x=string.length(); x>=1; x--){
		System.out.println(string.substring(0,x));
		}


	}

}
