
public class Rectangle {
	protected float length;
	protected float width;
	
	Rectangle () {
		width = (float) (1 + Math.random() * 100);
		length = (float) (1 +Math.random() * 100);
	} 
	
	Rectangle (float length, float width){
		this.length = length;
		this.width = width;
	}
	
	public float getLength () {
		return length;
	}
	
	public void setLength (float length) {
		this.length = length;
	} 
	
	public float getWidth () {
		return width;
	}
	
	public void setWidth (float width) {
		this.width = width;
	}
	
	public double getArea () {
		double area;
		area = length * width;
		return area;
	} 
	
	public double getPerimeter () {
		double perimeter;
		perimeter = (2 * length) + (2 * width);
		return perimeter;
	}
	
	public String toString () {
		String string;
		string = "This rectangle has a length of " + this.length + " and width of " + this.width + ". It has a perimeter of " + this.getPerimeter() + " and an area of " + this.getArea();
		return string;
	}
	
}
