import java.util.*;
public class Rectangle_Tester {
	
	private Rectangle [] rectangleStorage;
	
	public Rectangle_Tester (int max) {
		rectangleStorage = new Rectangle [max];
		for (int x = 0; x < rectangleStorage.length; x++) {
			rectangleStorage[x] = new Rectangle ();
		}
	}
	
	public void addRectangle () {
		Scanner input = new Scanner (System.in);
		for (int x = 0; x < rectangleStorage.length; x++) {
			System.out.println("\t *Rectangle " + (x+1) + "*");
			System.out.println("Enter the width of rectangle " + (x+1));
			float width = input.nextFloat();
			System.out.println("Enter the length of rectangle " + (x+1));
			float length = input.nextFloat();
			rectangleStorage[x].setWidth(width);
			rectangleStorage[x].setLength(length);
		}
	}
	
	public void printAllInfo () {
		for (int x = 0; x < rectangleStorage.length; x++) {
			System.out.print("Rectanle " + x + " - ");
			System.out.print("•Length: " + rectangleStorage[x].length + " ");
			System.out.print("•Width: " + rectangleStorage[x].width + " ");
			System.out.print("•Area: " + rectangleStorage[x].getArea() + " ");
			System.out.print("•Perimeter: " + rectangleStorage[x].getPerimeter() + "\n");
		}
	}
	
	public float returnLargestArea () {
		float largest = 0;
		for (int x = 0; x < rectangleStorage.length; x++) {
			if (rectangleStorage[x].getArea()> largest) {
				largest = (float) rectangleStorage[x].getArea();
			}
		}
		return largest;
	}
	
	public float returnLargestPerimeter () {
		float largest = 0;
		for (int x = 0; x < rectangleStorage.length; x++) {
			if (rectangleStorage[x].getPerimeter()> largest) {
				largest = (float) rectangleStorage[x].getPerimeter();
			}
		}
		return largest;
	}
	
}
