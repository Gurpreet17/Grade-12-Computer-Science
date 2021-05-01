import java.util.*;
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This code tests the Rectangle_Tester class
		Scanner input = new Scanner (System.in);								//Creates scanner for user input
		float largestArea;														//Stores largest area 
		float largestPerimeter;													//Stores largest perimeter
		System.out.println("Enter the number of rectangles");					//Prompts for number of rectangles
		int max = input.nextInt();												//Stores user input
		Rectangle_Tester rectangle_tester = new Rectangle_Tester(max);			//Creates Rectangle_Tester object and inputs max.
		rectangle_tester.addRectangle();										//Adds rectangles from user
		rectangle_tester.printAllInfo();										//Prints the information of all rectangles
		largestArea = rectangle_tester.returnLargestArea();						//Stores largest area out of all rectangles
		largestPerimeter = rectangle_tester.returnLargestPerimeter();			//Stores largest perimeter out of all rectangles 
		System.out.println("The largest area is " + largestArea);				//Outputs largest area 
		System.out.println("The largest perimeter is " + largestPerimeter);		//Outputs largest perimeter
	}
}
