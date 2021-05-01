/*
 * Author: Gurpreet Singh
 * Date: 2021-01-31
 * Description: This abstract class contains attributes like cost per square 
 * foot and others members that are inherited by other tile shapes.
 */

public abstract class Tiles  {
	int maxLength;									//Stores the max length of all tiles
	int maxWidth;									//Stores the max width of all tiles
	double cost;									//Stores the cost per square feet of all tiles
	String shapeString = "EMPTY";					//Default value of all toString() methods 
	
	
	
	public abstract double Area();					//Abstract method for area 
	
	public void SetCost (double cost) {				//Sets the cost of tile per square foot
		this.cost = cost;							//Initializes cost
	}
	
	public void SetDimension (int maxL, int maxW) {	//this method sets the dimension of max length and max width
		maxLength = maxL;							//Initializes max length
		maxWidth = maxW;							//Initializes max width
	}
	
	
	
	
	
	

}
