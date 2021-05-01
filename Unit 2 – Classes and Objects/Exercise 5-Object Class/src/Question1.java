
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creates object of class Circle
		Circle a = new Circle ();
		Circle b = new Circle ();
		
		//Initializes the radius of both objects 
		a.radius = 10;
		b.radius= 10;
		
		//Compares the fields of both objects 
		boolean compareRadius;
		compareRadius = a.equals(b);
		System.out.println(compareRadius);
		
		//Outputs the radius of both objects
		System.out.println(a.toString());
		System.out.println(b.toString());
		
	}

}

class Circle {
	double radius;
	/*
	 * Compares if this object's field equals to the field of object passed in as a parameter
	 * pre: takes circle object as a parameter 
	 * post: returns true if object fields are equal and false if object fields are not equal
	 */
	public boolean equals(Circle x) {
		if (this.radius == x.radius) 
			return true;
		else 
			return false;
	}
	
	/*
	 * Returns a String that represents radius of the circle. 
	 * pre: none 
	 * post: A String representing the Circle object has been 
	 */
	public String toString() {
		String circleString;
		circleString = "Circle has radius " + radius;
		return circleString;
	}
}

	

