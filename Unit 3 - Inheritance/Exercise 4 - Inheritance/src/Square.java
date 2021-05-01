
public class Square extends Rectangle {
	public Square () {
		float side = (float) (1 + Math.random() * 100);
		super.setWidth(side);
		super.setLength(side);
	} 
	
	public Square (float side) {
		super(side,side);
	}
	
	public void setSide (float side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	public String toString () {
		String string;
		string = "This square has a length and width of " + super.getWidth() + ". Its perimeter is " + super.getPerimeter() + " and its area is " + super.getArea() + "."; 
		return string;
	}
	
	
}
