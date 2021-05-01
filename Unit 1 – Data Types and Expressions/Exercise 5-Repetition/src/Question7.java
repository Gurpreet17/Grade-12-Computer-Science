
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area = 1;
		double thickness = 0.09;
		double stack = 1;
		for (int x=0; x<40; x++) {
			area = area/2;
			stack = stack*2;
			thickness = thickness*stack;
		}
		System.out.println("The area of each piece is " + area + "m2");
		System.out.println("The thickness of the pile is " + thickness + "mm");


	}

}
