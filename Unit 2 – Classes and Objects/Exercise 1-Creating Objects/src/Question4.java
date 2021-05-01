
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//PART A
		//Creates 2 objects of class Circle
		Circle c1 = new Circle ();
		Circle c2 = new Circle ();
		// Assigns c1 the values of center (1,2) and radius 4.
		c1.x = 1;
		c1.y = 2;
		c1.r = 4;
		// Assigns c2 the values of center (-2,0) and radius 2
		c2.x =-2;
		c2.y = 0;
		c2.r = 2;
		
		//PART B
		//Distance from the origin to the centre of c1
		double distance;
		distance = Math.sqrt(Math.pow(c1.x,2) + Math.pow(c1.y,2));
		System.out.println(distance);
		
		//PART C
		Double centreSeparation = Math.sqrt(Math.pow((c1.x - c2.x), 2) + Math.pow((c1.y - c2.y), 2)); 
		System.out.println(centreSeparation);
		
		//PART D
		//Minimum distance from a point on c1 to a point on c2 
		Double minDistance = Math.sqrt(Math.pow(((c1.x + c1.r) - (c2.x + c2.r)), 2) + Math.pow((c1.y - c2.y), 2));
		System.out.println(minDistance);
		
		
		
		
	}

}
class Circle 
{ 
     double x;           // x-coordinate of centre 
     double y;           // y-coordinate of centre 
     double r;           // radius 
} 


