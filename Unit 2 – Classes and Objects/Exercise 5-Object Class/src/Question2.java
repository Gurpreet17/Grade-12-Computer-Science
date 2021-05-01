
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle a = new Rectangle ();
		Rectangle b = a;
		a.length = 10;
		a.width = 5;
		System.out.println(a.equals(b));
		System.out.println(a.toString());
		System.out.println(b.toString());

	}

}

/*
 * Class for rectangle that contains 
 * the field length and width
 */
class Rectangle {
	double length;
	double width;
	
	public boolean equals(Rectangle x) {
		if (this.length == x.length && this.width == x.width)
			return true;
		else
			return false;
	}
	
	public String toString () {
		String rectangleDimension = "Rectangle length: " + length + "\n" + "Rectangle width: " + width;
		return rectangleDimension;
	}
	
}
