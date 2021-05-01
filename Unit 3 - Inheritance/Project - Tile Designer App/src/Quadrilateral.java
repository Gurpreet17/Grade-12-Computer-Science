

/*
 * Author: Gurpreet Singh
 * Date: 2021-01-31
 * Description: This class extends the Rectangle Square and Trapezoid classes and it contains all the attributes that other classes inherit from Quadrilateral class such as colour, length, wdith, etc
 * This class inherits from the Tiles class.
 */
public class Quadrilateral extends Tiles {
	protected String colour;						//Stores colour
	protected double length;						//Stores length
	protected double width;							//Stores width
	protected double height;						//Stores height of trapezoid
	protected double sideA, sideB, sideC, sideD;	//Stores all the sides of trapezoid
	
	
	/*
	 * This constructor initializes the colour length and width of the Rectangle and Square class.
	 * pre: colour, length and width
	 * post: none
	*/
	public Quadrilateral (String colour, double length, double width) {
		this.colour = colour;
		this.length = length;
		this.width = width;
	}
	
	/*
	 * This constructor initializes all the 4 sides of a Trapzoid 
	 * pre: colour, and all 4 sides
	 * post: none 
	*/
	public Quadrilateral (String colour, double a, double b, double c, double d) {
		this.colour = colour;
		sideA = a;
		sideB = b;
		sideC = c;
		sideD = d;
		height = Math.round(Math.sqrt(((a+b-c+d) * (-a+b+c+d) * (a-b-c+d) * (a+b-c-d)) / ((4 * Math.pow(a-c, 2))))*10.0)/10.0;
	}
	
	/*
	 * This method calculates the area of the Rectangle or Square
	 * pre: none
	 * post: none 
	*/
	@Override
	public double Area () {
		double area = width * length;
		return area;
	}
	
	/*
	 * This method calculates the perimeter of Rectangle and Square
	 * pre: none
	 * post: none
	*/
	public double Perimeter () {
		double perimeter = (2 * length) + (2 * width);
		return perimeter;
	}
}

/*
 * Author: Gurpreet Singh
 * Date: 2021-01-31
 * Description: This class contains all the attributes of an Trapezoid shape including the colour, and all 4 sides of an trapezoid
 * This class inherits a lot of its property form the Quadrilateral class
 */
class Trapezoid extends Quadrilateral {

	/*
	 * This constructor takes in all the 4 sides of a Trapezoid and passes it along to its super
	 *  class in order to initialize the colour, and the 4 sides of the trapezoid
	 * pre: colour, and the 4 sides of a trapezoid
	 * post: none
	 */
	public Trapezoid (String colour, double a, double b, double c, double d) {
		super (colour,a,b,c,d);
	}

	/*
	 * This method calculates the area of the Trapezoid
	 * pre: none
	 * post: none
	*/
	@Override
	public double Area () {
		double area = ((sideA*sideC)/2) * height;
		return area;
	}
	
	/*
	 * This method calculates the perimeter of a trapezoid
	 * pre: none
	 * post: none
	*/
	@Override
	public double Perimeter () {
		double perimeter = sideA + sideB+ sideC+ sideD;
		return perimeter;
	}
	
	/*
	 * This method returns the details about the Trapezoid
	 * pre: none
	 * post: returns details of Trapezoid (colour, and all 4 sides of Trapezoid)
	*/
	@Override
	public String toString () {
		shapeString = "TR a: " + sideA + " b " + sideB + " c: " + sideC + " d: " + sideD + " h: " + height + " c: " + colour;
		return shapeString;
	}
}

/*
 * Author: Gurpreet Singh
 * Date: 2021-01-31
 * This class contains all the attributes of a rectangle and square shape including the length, width etc.
 * This class inherits a lot of its property form the Quadrilateral class
 */
class Rectangle extends Quadrilateral {
	
	/*
	 * This constructor takes in the length and width of the rectangle as a parameter and passes along to its
	 * super class in order to initialize the colour, height and the width of the rectangle
	*/
	public Rectangle (String colour, double length, double width) {
		super(colour, length, width);
	}
	
	/*
	 * This method returns the details about the Rectangle
	 * pre: none
	 * post: returns details of Rectangle (colour length, and width) 
	*/
	@Override
	public String toString () {
		shapeString = "RE l: " + length + " w: " + width + " c: " + colour;
		return shapeString;
	}
}

/*
 * Author: Gurpreet Singh
 * Date: 2021-01-31 
 * Description: This class contains the attributes of a Square class including the side lenghts and colour
 * This class inherits a lot of its property from the Rectangle class
 */
class Square extends Rectangle {

	/*
	 * This constructor takes in the colour and side of the square as the parameters and passes along to its
	 * super class in order to initialize the colour, and the sides of the square
	*/
	public Square (String colour, double side) {
		super(colour, side, side);
	}
	
	/*
	 * This method returns the details about the Square
	 * pre: none
	 * post: returns details of Square (colour and sides) 
	*/
	@Override
	public String toString () {
		shapeString = "SQ s: " + length + " c: " + colour;
		return shapeString;
	}
	
}

