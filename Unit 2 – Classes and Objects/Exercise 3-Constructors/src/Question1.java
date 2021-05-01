import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println ("Enter the radius of the circle:");
		double radius = input.nextDouble();
		Circle area = new Circle(radius);
		
	

	}

}

class Circle {
	double PI = 3.14159;
	public Circle (double radius){
		double area = Math.round((2*PI*radius)*100.0)/100.0;
		System.out.println("The area of the circle is  " + area);
	}
}
