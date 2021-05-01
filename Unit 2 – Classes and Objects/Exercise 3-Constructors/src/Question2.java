import java.util.Scanner;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Enter length of the rectangle:");
		double length = input.nextDouble();
		System.out.println("Enter width of the rectangle:");
		double width = input.nextDouble();
		Rectangle rectangle = new Rectangle (length,width);
	}
}

class Rectangle {
	public Rectangle () {
		
	}
	
	public Rectangle (double x, double y) {
		double length = x;
		double width = y;
		double area = length * width;
		double perimeter = 2 * (length * width);
		System.out.println ("The area of the rectangle is " + area);
		System.out.println("The perimeter of the rectangle is " + perimeter);
	}
}
