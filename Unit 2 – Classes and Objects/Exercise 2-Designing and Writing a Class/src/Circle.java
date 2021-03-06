/* 
 * Circle class 
 */
public class Circle {
	private static final double PI = 3.14;
	private double radius;
	/**
	 * constructor pre: none post: A Circle object created. Radius initialized to 1.
	 */
	public Circle() {
		radius = 1; // default radius
	}

	/** 
	 * Calculates the radius of the circle 
	 * pre: none 
	 * post: Radius has been changed 
	 */ 
	public void setRadius(double newRadius) { //this is a modifier method 
		radius = newRadius; 
	}

	/**
	 * Calculates the area of the circle. pre: none post: The area of the circle has
	 * been returned
	 */
	public double area() {
		double circleArea;
		circleArea = PI * radius * radius;
		return (circleArea);
	}

	/**  
	 * Returns the radius of the circle 
	 * pre: none 
	 * post: The radius of the circle has been returned 
	 */ 
	public double getRadius() { //this is an accessor method 
		return(radius); 
	}
	
	public double circumference() { //this method calculates the circumference of the circle 
		double circleCircumference = 2 * radius * PI;
		return circleCircumference;
	}
}
