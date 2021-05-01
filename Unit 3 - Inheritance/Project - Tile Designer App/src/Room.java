/*
 * Author: Gurpreet Singh
 * Date: 2021-01-31
 * Description: This class contains a 2D array that stores the tile objects. 
 * It performs tasks like adding & removing tiles from an array, and calculating the total area or cost of all tiles in the array  
 * 
 */
import java.util.*;

public class Room {
	Tiles [] [] tile;															//Array that stores the tile objects
	double price;																//Stores price per tie
	
	/*
	 * This constructor takes in the number of rows and column and creates a tile array of the specified size (row x column)
	 * pre: row and column 
	 * post: none
	 */
	public Room (int row, int column) {
		this.tile = new Tiles [row] [column];									//Creates a new tile
		for (int x = 0; x < tile.length; x++) {									//For loop initializes all tiles to an random value
			for (int y = 0; y < tile[x].length; y++) {								
				tile[x][y] = new Quadrilateral ("red", 0, 0);					//Initializes all tiles to default
			}
		}
	}
	
	/*
	 * This mutator method sets up the price per square feet of each tile
	 * pre: price per square foot
	 * post: none
	 */
	public void setPrice (double price) {
		this.price = price;														//Initializes price per square foot
	}
	
	/*
	 * This method generates random tiles and populates the 2D array.
	 * pre: max width, max length and colour list of tiles
	 * post: returns the randomly generated tile  
	*/
	public Tiles RandomTile (double maxWidth, double maxLength, HashSet <String> colourList) {
		String[] colourArray = colourList.toArray(new String[colourList.size()]);
		Tiles tile = null;																 
		int randomShape = (int) (1 + (Math.random() * 7));						
		if (randomShape == 1) {															
			String colour = colourArray[(int) (0 + (Math.random() * (colourArray.length - 1)))]; 
			double length = 1 + (Math.random() * maxLength);
			double width = 1 + (Math.random() * maxWidth);
			length = Math.round(length * 10.0)/10.0;
			width = Math.round(width * 10.0)/10.0;
			tile = new Rectangle (colour, length, width);
		}
		
		else if (randomShape == 2) {
			String colour = colourArray[(int) (0 + (Math.random() * (colourArray.length - 1)))];
			double side = 0;
			if (maxLength > maxWidth) {
				side = 1 + (Math.random() * maxLength);
			}
			else {
				side =  1 + (Math.random() * maxWidth);
			}
			side = Math.round(side*10.0)/10.0;
			tile = new Square (colour, side);
		}
		
		else if (randomShape == 3) {
			String colour = colourArray[(int) (0 + (Math.random() * (colourArray.length - 1)))];
			double longBase = 1 + (Math.random() * maxWidth);
			double shortBase =  1 + (Math.random() * (longBase-1));
			double side1 = 1 + (Math.random() * maxLength);
			double side2 = 1 + (Math.random() * maxLength);
			longBase = Math.round(longBase*10.0)/10.0;
			shortBase = Math.round(shortBase*10.0)/10.0;
			side1 = Math.round(side1*10.0)/10.0;
			side2 = Math.round(side2*10.0)/10.0;
			tile = new Trapezoid(colour,longBase, side1, shortBase, side2);
		}
		
		else if (randomShape == 4) {
			String colour = colourArray[(int) (0 + (Math.random() * (colourArray.length - 1)))];
			double verticalRadius = 1 + (Math.random() * maxLength);
			double horizontalRadius = 1 + (Math.random() * maxWidth);
			verticalRadius = Math.round(verticalRadius * 10.0)/10.0;
			horizontalRadius = Math.round(horizontalRadius * 10.0)/10.0;
			tile = new Ellipse(colour,verticalRadius, horizontalRadius);
		}
		
		else if (randomShape == 5) {
			String colour = colourArray[(int) (0 + (Math.random() * (colourArray.length - 1)))];
			double radius = 0; 
			if (maxLength > maxWidth) {
				radius = 1 + (Math.random() * maxLength);
			}
			else {
				radius =  1 + (Math.random() * maxWidth);
			}
			radius = Math.round(radius * 10.0)/10.0;
			tile = new Circle (colour,radius);
		}
		
		else if (randomShape == 6) {
			String colour = colourArray[(int) (0 + (Math.random() * (colourArray.length - 1)))];
			double radius = 0; 
			if (maxLength > maxWidth) {
				radius = 1 + (Math.random() * maxLength);
			}
			else {
				radius =  1 + (Math.random() * maxWidth);
			}
			radius = Math.round(radius * 10.0)/10.0;
			tile = new HalfCircle (colour,radius);
		}
		
		else if (randomShape == 7) {
			String colour = colourArray[(int) (0 + (Math.random() * (colourArray.length - 1)))];
			float outerRadius = 0;
			if (maxLength > maxWidth) {
				outerRadius = (float) (1 + (Math.random() * maxLength));
			}
			else {
				outerRadius =  (float) (1 + (Math.random() * maxWidth));
			}
			double innerRadius = 1 + (Math.random() * (outerRadius - 1));
			innerRadius = Math.round(innerRadius*10.0)/10.0;
			tile = new Donut (colour,innerRadius, outerRadius);
		}
		return tile;
	} 
	
	/*
	 * This method takes in the tile object, row index and column index as parameters 
	 * and inserts the tile in the array at the row and column index passed to it 
	 * pre: tile, row index, and column index
	 * pro: returns true if tile is inserted in the 2D array and returns false if tile was unable to be inserted in the 2D array
	*/
	public boolean insertTile (Tiles shape, int rowIndex, int columnIndex) {
		boolean emptyIndex = true;
		if (tile[rowIndex - 1][columnIndex - 1].shapeString == "EMPTY") {
			tile[rowIndex - 1][columnIndex - 1] = shape;
			tile[rowIndex - 1][columnIndex - 1].toString();
		}
		else {
			emptyIndex = false;
		}
		return emptyIndex;
	}
	
	/*
	 *  This method takes in row index and column index as parameets and 
	 *  removes the tile from the row and column index in the 2D array
	 *  pre: row index and column index
	 *  post: none 
	*/
	public void removeTile (int rowIndex, int columnIndex) {
		if (tile[rowIndex - 1] [columnIndex - 1].shapeString != "EMPTY" && rowIndex < tile.length && columnIndex < tile[0].length) {
			tile[rowIndex - 1][columnIndex - 1] = new Quadrilateral ("red", 0, 0);
		}
		else {
			System.out.println("Row " + rowIndex + " and column " + columnIndex + " is already empty !");
		}
	}
	
	/*
	 * This method displays the 2D array on the montior
	 * pre: none
	 * post: 2D array
	 */
	public void printTile () {
		for (int x = 0; x < tile.length; x++) {
			for (int y = 0; y < tile[x].length; y++) {
				tile[x][y].toString();
				System.out.printf("%-75s",tile[x][y].shapeString);
			}
			System.out.println();
		}
		
	}
	
	/*
	 * This method calculates the total cost of all tiles in the 2D Array
	 * pre: none
	 * post: total cost 
	*/
	public double totalCost() {
		double totalCost = 0;
		double totalArea = 0;
		for (int x = 0; x < tile.length; x++) {
			for (int y = 0; y < tile[x].length; y++) {
				totalArea = tile[x][y].Area() + totalArea;
			}
		}
		totalCost = totalArea * price;
		totalCost = Math.round(totalCost*100.0)/100.0;
		return totalCost;
	}
	
	/*
	 * This method calculates the total area of all tiles in the 2D Array
	 * pre: none
	 * post: total area
	*/
	public double totalArea () {
		double totalArea = 0;
		for (int x = 0; x < tile.length; x++) {
			for (int y = 0; y < tile[x].length; y++) {
				totalArea = tile[x][y].Area() + totalArea;
			}
		}
		totalArea = Math.round(totalArea * 10.0)/10.0;
		return totalArea;
	}
	
	/*
	 * This method allows the user to make a payment ONLY if all rooms are filled
	 * pre: none
	 * post: returns true if user payed and array is full and returns false if user did not pay and the room is not full
	 */
	public boolean Payment () {
		boolean roomStatus = true;
		for (int x = 0; x < tile.length; x++) {
			for (int y = 0; y < tile[x].length; y++) {
				if (tile[x][y].shapeString == "EMPTY")
					roomStatus = false;
			}
		}
		
		if (roomStatus == true) {
			System.out.println("Payment of $" + totalCost() + " Confirmed");
		}
		else {
			System.out.println("The room is not completely filled yet !");
			roomStatus = false;
		}
		return roomStatus;
	}
	
	/*
	 * This method checks if the 2D array is full or empt
	 * pre: none
	 * post: returns true if room is full and returns false if room is not full
	*/
	public boolean RoomStatus () {
		boolean roomStatus = true;
		for (int x = 0; x < tile.length; x++) {
			for (int y = 0; y < tile[x].length; y++) {
				if (tile[x][y].shapeString == "EMPTY")
					roomStatus = false;
			}
		}
		return roomStatus;
	}
	
}
