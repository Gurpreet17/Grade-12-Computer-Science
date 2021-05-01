/*
 * Author: Gurpreet Singh
 * Date: 2021-01-31
 * Description: This class contains all the attributes for the Ellipse shape including colour, vertical radius, horizontal radius etc.
 * This class extends other classes including Circle, half-circle, and donut.
 */
public class Ellipse extends Tiles {
	final double PI = 3.14;						//Stores value of PI (constant)														
	protected String colour;					//Stores colour
	protected double radius;					//Stores radius
	protected double verticalRadius;			//Stores vertical radius for Ellipse
	protected double horizontalRadius;			//Stores horizontal radius for Ellipse
	
	/*
	 * This constructor assigns values to colour, horizontal radius, and vertical radius of the Ellipse shape.
	 * pre: colour, horizontal radius and vertical radius
	 * post: none
	*/
	public Ellipse (String colour, double horizontalRad, double verticalRad) {
		this.colour = colour;																			
		horizontalRadius = horizontalRad;
		verticalRadius = verticalRad;
	}
	
	/*
	 * This constructor assigns values to colour and radius of the Circle and Half-Circle shapes
	 * pre: colour, and radius
	 * post: none
	*/
	public Ellipse (String colour, double radius) {
		this.colour = colour;
		this.radius = radius;
	}
	
	/*
	 * This constructor assigns values to colour, inner radius, and outer radius of the Donut shape
	 * pre: colour, inner radius, outer radius
	 * post: none
	*/
	public Ellipse (String colour, double innerRadius, float outerRadius) {
		this.colour = colour;
		this.radius = outerRadius - innerRadius;
	}
	
	/*
	 * This method calculates the area for the Ellipse shape
	 * pre: none
	 * post: none
	*/
	@Override
	public double Area () {
		double area = PI * verticalRadius * horizontalRadius;
		return area;
	} 
	
	/*
	 * This method calculates the circumference for the Ellipse shape
	*/
	public double Circumference () {
		double circumference = 2*PI*Math.sqrt((Math.pow(verticalRadius,2)+Math.pow(horizontalRadius,2))/2);
		return circumference;
	}
	
	/*
	 * This method returns the details about the ellipse shape
	 * pre: none
	 * post: returns details of Ellipse (colour, vertical radius, horizontal radius)
	*/
	@Override
	public String toString () {
		shapeString = "EL a: " + verticalRadius + " b: " + horizontalRadius + " c: " + colour;
		return shapeString;
	}
	
}

/*
 * Author: Gurpreet Singh
 * Date: 2021-01-31
 * Description: This class contains all attributes of Circle shape including colour, radius etc.
 * This class inheirts from the Ellipse class and it extends the HalfCircle and Donut class
*/
class Circle extends Ellipse {
	/*
	 * This constructor assigns values to colour and radius of the Circle shape
	 * pre: colour, and radius
	 * post: none
	*/
	public Circle (String colour, double radius) {
		super(colour, radius);
	}
	
	/*
	 * This constructor assigns values to colour, inner radius, and outer radius of the Donut shape and sends it to its super class
	 * pre: colour, inner radius, outer radius
	 * post: none
	*/
	public Circle (String colour, double innerRadius, float outerRadius) {
		super(colour, innerRadius, outerRadius);
	}

	/*
	 * This method calculates the area of a circle
	 * pre: none
	 * post: none
	*/
	@Override
	public double Area() {
		double area =  PI * Math.pow(radius, 2);;
		return area;
	}
	
	/*
	 * This method calculates the circumference of a circle
	 * pre: none
	 * post: none
	*/
	@Override
	public double Circumference () {
		double circumference = 2 * PI * radius;
		return circumference;
	}
	
	/*
	 * This method returns the details about the circle shape
	 * pre: none
	 * post: Returns details about circle (colour, and radius)
	*/
	@Override
	public String toString () {
		shapeString = "CI r: " + radius + " c: " + colour;
		return shapeString;
	}
}

/*
 * Author: Gurpreet Singh
 * Date: 2021-01-31
 * Description: This class contains all the attributes for the Half Circle shape including colour radius etc.
 * This class inherits the Circle class 
*/
class HalfCircle extends Circle {
	
	/*
	 * This constructor assigns values to colour and radius of the Half-Circle shape and sends it to its super class
	 * pre: colour, and radius
	 * post: none
	*/
	public HalfCircle (String colour, double radius) {
		super(colour,radius);
	} 
	
	/*
	 * This method calculates the area of a half-circle
	 * pre: none
	 * post: none
	*/
	@Override
	public double Area () {
		double area =  0.5 * PI * Math.pow(radius, 2);
		return area;
	} 
	
	/*
	 * This method calculates the circumference of a half-circle
	 * pre: none
	 * post: none
	*/
	@Override
	public double Circumference () {
		double circumference = radius * (PI+2);
		return circumference;
	}
	
	/*
	 * This method returns the details about the half-circle shape
	 * pre: none
	 * post: Returns details about half-circle (colour, and radius)
	*/
	@Override
	public String toString () {
		shapeString = "HC r: " + radius + " c: " + colour;
		return shapeString;
	}
}

/*
 * Author: Gurpreet Singh
 * Date: 2021-01-31
 * Description: This class contains all the attributes for the Donut shape including colour, inner radius, outer radius etc.
 * This class inherits the Circle class 
*/
class Donut extends Circle {
	double innerRadius;			 //Stores the inner radius of donut 		
	double outerRadius;			 //Stores the outer radius of donut
	
	/*
	 * This constructor assigns values to colour and inner radius and outer radius of donut shape and sends it to its super class
	 * pre: colour, inner radius, and outer radius
	 * post: none
	*/
	public Donut (String colour, double innerRadius, float outerRadius) {
		super(colour, innerRadius, outerRadius);
		this.innerRadius = innerRadius;
		this.outerRadius = outerRadius;
	}
	
	/*
	 * This method calculates the area of a donut
	 * pre: none
	 * post: none
	*/
	@Override
	public double Area () {
		double area = (PI * Math.pow((outerRadius),2)) - (PI * Math.pow((innerRadius),2)); 
		return area;
	}
	
	/*
	 * This method calculates the circumference of a donut
	 * pre: none
	 * post: none
	*/
	@Override
	public double Circumference () {
		double diameter = outerRadius * 2;
		double circumference =  PI * diameter;
		return circumference;
	}
	
	/*
	 * This method returns the details about the donut shape
	 * pre: none
	 * post: Returns details about the donut (colour, inner radius and outer radius)
	*/
	@Override
	public String toString() {
		outerRadius = Math.round(outerRadius*10.0)/10.0;
		shapeString = "DO i: " + innerRadius + " o: " + outerRadius + " c: " + colour;
		return shapeString;
	}
	
}
