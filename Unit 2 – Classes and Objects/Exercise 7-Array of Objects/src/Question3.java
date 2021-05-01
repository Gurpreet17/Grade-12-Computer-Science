
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle [] rectangle = new Rectangle [3];
		
		for (int x = 0; x < rectangle.length; x++)
			rectangle[x] = new Rectangle();
		
		rectangle[0].Mutator(25, 25);
		rectangle[1].Mutator(40, 10);
		rectangle[2].Mutator(30,20);
	
		double maxArea = 0;
		double maxWidth = 0;
		double maxHeight = 0;
		for (int x = 0; x+1<rectangle.length; x++) {
			if (rectangle[x].Area() > rectangle[x+1].Area()) {
				maxArea = rectangle[x].Area();
				maxWidth = rectangle[x].width;
				maxHeight = rectangle[x].height;
			}
		}
		System.out.println("The rectangle which produce the optimized area is the rectangle with a height of " + maxHeight + " and width of " + maxWidth + " which has an area of " + maxArea);
	

		
		

	}

}

class Rectangle {
	double width;				//Stores width
	double height;				//Stores height
	final double perimeter = 100;	//Stores the perimeter required for Rectangle
	
	/*
	 * This method calculates the area of the rectangle that has a perimeter of 100
	 * pre: none
	 * post: returns area only if the perimeter is 100 otherwise returns -1
	 */
	public double Area () {			
		double area = 0;					
		double perimeterCheck = (2*width) + (2*height);
		if (perimeterCheck == perimeter)
			area  = width * height;
		else
			area = -1;
		return area;
	}
	
	/*
	 * This method assigns values to width and length
	 * pre: width and length
	 * post: none
	 */
	public void Mutator (double w, double h) {
		width = w;
		height = h;
	}
} 