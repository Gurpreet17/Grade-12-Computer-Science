import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle ();
		circle.displayAreaFormula();

	}

}

class Circle {
	/*
	 * Displays the formula for the area of a circle pre: none post: The formula for
	 * area of a circle has been displayed
	 */
	public static void displayAreaFormula() {
		System.out.println("The formula for the area of a circle is a = pi*r*r");
	}
}