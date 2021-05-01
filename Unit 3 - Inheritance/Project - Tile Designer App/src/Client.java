/*
 * Author: Gurpreet Singh
 * Date: 2021- 01-31
 * Description: This Client class designs tiles for the user and lets them pick various of shapes.
 * 				It runs until the user enters "q/"Q or the user makes an payment and decides to exit. 
 */
import java.util.*;
import java.io.*;
public class Client {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);							//Declares Scanner for user input
		Tiles tile = null;													//Stores tile
		HashSet<String> colourList = new HashSet<String>();					//Stores colour from the Colour text file
		//VARIABLES
		int row = 0;														//Stores the number of row in tiles 2D array
		int column = 0;														//Stores the number of columns in tiles 2D Array
		double maxLength = 0;												//Stores max length of tiles
		double maxWidth = 0;												//Stores max width of tiles
		
		//OPTION 2 VARIABLES
		String colour = null;												//Stores tile colour
		double length;														//Stores tile length
		double width;														//Stores tile width
		double side; 														//Stores trapezoid side
		double longBase; 													//Stores trapezoid long side
		double shortBase;													//Stores trapezoid short side
		double side1;														//Stores trapezoid side a
		double side2;														//Stores trapezoid side b
		double radius;														//Stores circle/half-circle radius
		double verticalRadius;												//Stores ellipse vertical radius
		double horizontalRadius;											//Stores ellipse horizontal radius
		float outerRadius;													//Stores donut outer radius
		double innerRadius;													//Stores donut inner radius
		
		int rowIndex;														//Stores row index where the user wants to place a tile
		int columnIndex;													//Stores column index where the user wants to place a tile
		int option = 0;														//Stores user options (menu option, tile option etc)
		String userOption= " ";												//Stores user option in String (to avoid program from crashing)
		double totalCost;													//Stores total cost of tiles
		double totalArea;													//Stores total area of tiles
		double price;														//Stores tile price
		boolean valid = false;												//Determines if user input is valid or not.
		Room room = null;													//Declares room object 
		colourList = ColourList();											//Declares colourList to all colours stored in ColourList.txt
		boolean tileShopping = true;										//Keeps tracks if weather user wants to exit program or not (true = keep shopping false = exit)
		boolean payment = false;											//Keeps track if user has paid for tiles or not (true = paid false = unpaid)
		
		//TILES SEQUENCE
		do {																//Loop runs until user decides to exit
			payment = false;												//Sets payment to false (user had not paid yet)
			valid = false;													//Sets valid to false
			while (valid == false) {										//While loop that runs until user does not enter information
				try {														//Tries to run this segment of code
					//INITILIAL MENU		
					System.out.println("Enter the size of room in terms of ROWS");	//Prompts ROW size for 2D tiles array
					row = input.nextInt();									//Stores row size
					System.out.println("Enter the size of room in terms of COLUMNS");//Prompts COLUMNS size for 2D tiles array
					column = input.nextInt();								//Stores column size
					System.out.println("Enter the max length of a tile:");	//Prompts for max length of all tiles
					maxLength = input.nextDouble();							//Stores max length of all tiles
					System.out.println("Enter the max width of a tile:");	//Prompts max width of all tiles
					maxWidth = input.nextDouble();							//Stores max width of all tiles
					System.out.println("Enter the price per square foot");	//Prompts price of each tile per square foot
					price = input.nextDouble();								//Stores price of tiles per square foot
					if (row > 0 && column > 0 && maxLength > 0 && maxWidth > 0 && price > 0) {	//Checks if user inputs are all valid
						room = new Room (row, column);						//Creates a new room of tiles 
						room.setPrice(price);								//Sets the price of all tiles
						valid = true;										//Turns valid to true
					}
					else {													//Loop runs if user input is invalid
						System.out.println("Error ! You have entered an invalid digits, please enter digits greater than 0");//Outputs an error message
					}
				}
				catch (Exception e) {										//Catches any invalid inputs fom user 
					System.out.println("Invalid input! Please try again:");	//Outputs an error message
					input.next();											
				}
			}
			do {
				//MENU
				do {																							//Loop runs until user enters a valid option
					System.out.println ("\t\t\t**MENU**");														//Outputs official MENU
					System.out.println("1 - Randomly assign a tile and appropriate dimensions in a random cell");//Option to assing room to random tiles
					System.out.println("2 - Create a new tile");												//Option to create a tile
					System.out.println("3 - Delete an existing tile");											//Option to delete an existing tile
					System.out.println("4 - Display the whole floor layout with the tile info printed inside"); //Option to display the room layout
					System.out.println("5 - Calculate the total cost");											//Outputs total cost of all tiles
					System.out.println("6 - Calculate the total area of all of the tiles placed so far");		///Outputs total area of all tiles
					System.out.println("7 - Clear the array of tiles to start over again");						//Clears the room
					System.out.println("8 - Pay for all tiles");												//Lets the user pay for all tiles
					System.out.println("* - You may enter Q or q to QUIT anytime during the program");			//Exits program anytime user enters "Q" or "q"
					userOption = input.next();																//Stores user input
					if (Option (userOption) > 8 || Option (userOption) < 1)									//Checks if option are valid
						System.out.println("Invalid option ! Please try again");							//Outputs an error if option is not valid
					else 																					//Runs only if user option is valid
						option = Option(userOption);														//Converts user option from string to int
					}
				while (Option (userOption) > 8 || Option (userOption) < 1);									//Checks if user input is valid
				
				if (option == 1) {																			//Runs if user option is 1
					while (room.RoomStatus() == false) {													//Runs until the room empty
						tile = room.RandomTile(maxWidth, maxLength, colourList);							//Generates random tiles
						do {																				//Runs until the generated row and columns are valid
							rowIndex = (int) (1 + (Math.random() * (row)));							//Generates an random row index
							columnIndex = (int) (1 + (Math.random() * (column)));						//Generates an random column index
							valid = room.insertTile(tile, rowIndex, columnIndex);							//Checks if rows and column index are valid
						}
						while (valid == false);																//Runs the loop again if the row and column index are invaid
					}
					System.out.println("Random tiles generated successfully");								//Outputs when the room is filled with randomly generated tiles
				}

				else if (option == 2) {																		//Runs if user option is 2
					if (room.RoomStatus() == false) {														//Runs only if room is empty
						valid = false;																		//Sets valid to false
						do {																				//Runs until user enters an valid shape
							System.out.println("Pick any of the following tile shape");						//Prompts for a shape
							System.out.println("1 - Rectangle");												
							System.out.println("2 - Square");
							System.out.println("3 - Trapezoid");
							System.out.println("4 - Ellipse");
							System.out.println("5 - Circle");
							System.out.println("6 - Half Circle");
							System.out.println("7 - Donut");
							userOption = input.next();														//Stores user option
							if (Option (userOption) > 7 || Option (userOption) < 1)							//Runs if user enters an invalid option
								System.out.println("Invalid option ! Please try again");					//Outputs an error message if user option is invalid
							else 																			//Runs if user option is valid
								option = Option(userOption);												//Converts user option from String to int
							}
						while (Option (userOption) > 7 || Option (userOption) < 1);							//Runs again if user option is invalid
						
						if (option == 1) {																	//Runs if user enters option 1 (RECTANGLE)
							while (valid == false) {														//Runs until user enters an valid option
								try {																		//Tries to run the segment of code
									System.out.println("Enter rectangle colour");							//Prompts user for colour
									colour = input.next();													//Stores colour
									colour = colour.toLowerCase();											//Converts colour to lower case
									System.out.println("Enter rectangle length");							//Prompts for the length of rectangle
									length = input.nextDouble();											//Stores length
									System.out.println("Enter rectangle width");							//Prompts the width fo rectanglw
									width = input.nextDouble();												//Stores width
									if (length <= maxLength && width <= maxWidth && colourList.contains(colour)) { //Checks if rectangle dimensions are valid
										tile = new Rectangle (colour,length,width);							//Stores the rectangle in the room
										valid = true;														//Sets valid = true
									}
									else {																	//Runs if user enters invalid dimensions
										System.out.println("Invalid dimensions or/and colour for RECTANGLE, please try again:");//Outputs an error message
									}
								}
								catch (Exception e) {														//Runs if it encounters an error
									System.out.println("Error, you have entered an invalid input");			//Outputs an error message 
									input.next();
								}
							}
						}
						else if (option == 2) {																//Runs if user enters option 2 (SQUARE)
							while (valid == false) {														//Runs until user enters an valid option
								try {																		//Tries to run the segment of code
									System.out.println("Enter square colour");								//Prompts user for colour
									colour = input.next();													//Stores colour
									colour = colour.toLowerCase();											//Convert colour to lowercase
									System.out.println("Enter square side");								//Prompts for square sides
									side = input.nextDouble();												//Stores sides
									if (side <= maxLength && side <= maxWidth && colourList.contains(colour)) { //Checks if square dimensions are valid
										tile = new Square(colour,side);										//Stores square tile in the room
										valid = true;														//Sets valid = true
									}
									else {																	//Runs if user enters invalid dimensions
										System.out.println("Invalid dimensions or/and colour for SQUARE, please try again:");//Outputs an error message
									}
								}
								catch (Exception e) {														//Runs if it encounters an error
									System.out.println("Error, you have entered an invalid input");			//Outputs an error message
									input.next();
								}
							}
						}
						else if (option == 3) {																//Runs if user enters option 3 (TRAPEZOID)
							while (valid == false) {														//Runs until user enters an valid option
								try {																		//Tries to run the segment of code
									System.out.println("Enter trapezoid colour");							//Prompts user for colour
									colour = input.next();													//Stores colour
									colour = colour.toLowerCase();											//Converts colour to lowercase
									System.out.println("Enter trapezoid long base");						//Prompts for trapezoid long base
									longBase = input.nextDouble();											//Stores long base
									System.out.println("Enter trapezoid short base");						//Prompts trapezoid short base
									shortBase = input.nextDouble();											//Stores short base
									System.out.println("Enter trapezoid side");								//Prompts trapezoid side
									side1 = input.nextDouble();												//Stores side
									System.out.println("Enter trapezoid side");								//Prompts trapezoid side2
									side2 = input.nextDouble();												//Stores side2
									if (longBase <= maxWidth && longBase > shortBase && shortBase > 0 && side1 <= maxLength && side2 <= maxLength && colourList.contains(colour)) {//Checks if trapezoid dimensions are valid
										tile = new Trapezoid(colour,longBase, side1, shortBase, side2);		//Stores trapezoid tile in the room
										valid = true;														//Sets valid = true
									}
									else {																	//Runs if user enters invalid dimensions
										System.out.println("Invalid dimensions or/and colour for TRAPEZOID, please try again:"); //Outputs an error message
									}
								}
								catch (Exception e) {														//Runs if it encounters an error
									System.out.println("Error, you have entered an invalid input");			//Outputs an error message
									input.next();
								}
							}
						}
						else if (option == 4) {																//Runs if user enters option 4 (ELLISE)
							while (valid == false) {														//Runs until user enters an valid option
								try {																		//Tries to run the segment of code
									System.out.println("Enter ellipse colour");								//Prompts for ellipse colour
									colour = input.next();													//Stores colour
									colour = colour.toLowerCase();											//Converts colour to lowercase
									System.out.println("Enter ellipse vertical radius");					//Prompts ellipse vertical radius
									verticalRadius = input.nextDouble();									//Stores ellipse vertical radius
									System.out.println("Enter ellipse horizontal radius");					//Prompts ellipse horizontal radius
									horizontalRadius = input.nextDouble();									//Stores ellipse horizontal radius
									if (verticalRadius <= maxLength && horizontalRadius <= maxWidth && colourList.contains(colour)) {  //Checks if ellipse dimensions are valid
										tile = new Ellipse(colour,verticalRadius, horizontalRadius);		//Stores ellipse tile in the room
										valid = true;
									}
									else {																	//Runs if user enters invalid dimensions
										System.out.println("Invalid dimensions or/and colour for ELLIPSE, please try again:"); //Outputs a error message
									}
								}
								catch (Exception e) {														//Runs if it encounters an error
									System.out.println("Error, you have entered an invalid input");			//Outputs an error message
									input.next();
								}
							}
						}
						else if (option == 5) {																//Runs if user enters option 5 (CIRCLE)
							while (valid == false) {														//Runs until user enters an valid option
								try {																		//Tries to run the segment of code
									System.out.println("Enter circle colour");								//Prompts for circle colour
									colour = input.next();													//Stores circle colour
									colour = colour.toLowerCase();											//Converts circle colour to lowercase
									System.out.println("Enter circle radius");								//Prompts for circle radius
									radius = input.nextDouble();											//Stores circle radius
									if (radius <= maxLength && radius <= maxWidth && colourList.contains(colour)) {//Checks if circle dimensions are valid
										tile = new Circle (colour,radius);									//Stores circle tile in the room
										valid = true;														//Sets valid = true
									}	
									else {																	//Runs if user enters invalid dimensions
										System.out.println("Invalid dimensions or/and colour for CIRCLE, please try again:");//Outputs a error message
									}
								}
								catch (Exception e) {														//Runs if it encounters an error
									System.out.println("Error, you have entered an invalid input");			//Outputs an error message
									input.next();
								}
							}
						}
						else if (option == 6) {																//Runs if user enters option 6 (HALF-CIRCLE)
							while (valid == false) {														//Runs until user enters an valid option
								try {																		//Tries to run the segment of code
									System.out.println("Enter half-circle colour");							//Prompts for half-circle colour
									colour = input.next();													//Stores half-circle colour
									colour = colour.toLowerCase();											//Converts colour to lowercase
									System.out.println("Enter half-circle radius");							//Prompts for half-circle radius
									radius = input.nextDouble();											//Stores half-circle radius
									if (radius <= maxLength && radius <= maxWidth && colourList.contains(colour)) {//Checks if half-circle dimensions are valid
										tile = new HalfCircle (colour,radius);								//Stores half-circle tile in the room
										valid = true;														//Sets valid = true
									}
									else {																	//Runs if user enters invalid dimensions
										System.out.println("Invalid dimensions or/and colour for HALF-CIRCLE, please try again:");//Outputs error message
									}
								}
								catch (Exception e) {														//Runs if it encounters an error
									System.out.println("Error, you have entered an invalid input");			//Outputs error message
									input.next();
								}
							}
						}
						else if (option == 7) {																//Runs if user enters option 7 (DONUT)
							while (valid == false) {														//Runs until user enters an valid option
								try {																		//Tries to run the segment of code
									System.out.println("Enter donut colour");								//Prompts for DONUT colouR
									colour = input.next();													//Stores donut colour
									colour = colour.toLowerCase();											//Converts donut to lowercase
									System.out.println("Enter donut outer radius");							//Prompts donut outer radius
									outerRadius = input.nextFloat();										//Stores donut outer radius
									System.out.println("Enter donut inner radius");							//Prompts donut inner radius
									innerRadius = input.nextDouble();										//Stores donut inner radius
									if (outerRadius > innerRadius && outerRadius <= maxLength && outerRadius <= maxWidth && colourList.contains(colour)) {//
										tile = new Donut (colour,innerRadius, outerRadius);					//Stores donut tile in the room
										valid = true;														//Sets valid = true
									}
									else {																	//Runs if user enters invalid dimensions
										System.out.println("Invalid dimensions or/and colour for DONUT, please try again:");////Outputs error message
									}			
								}
								catch (Exception e) {														//Runs if it encounters an error
									System.out.println("Error, you have entered an invalid input");			//Outputs error message
									input.next();
								}
							}
						}
						valid = false;																		//Sets valid = false
						do {																				//Runs until user enters a valid row index and column index
							try {																			//Tries to run the segment of code
								System.out.println("Enter ROW where you wish to place this tile:");			//Prompts the row index the user wishes to place the tile into
								rowIndex = input.nextInt();													//Stores the row index
								System.out.println("Enter COLUMN where you wish to place this tile:");		//Prompts the column index the user wishes to place the tile into
								columnIndex = input.nextInt();												//Stores the column index
								if (rowIndex > row && columnIndex > column && rowIndex <= 0 && columnIndex <= 0) { //Runs if row index and column index are too large for the array
									System.out.println("Invalid row and/or column, please enter a ROW between 1-" + row + " and a column between 1-" + column);	//Outputs an error message
								}
								else {																		//Runs if row and column index are valid
									valid = room.insertTile(tile, rowIndex, columnIndex);					//Inserts tile the index speicifed by the user
									if (valid == false) {													//Runs if the row index and column index is full
										System.out.println("Row " + rowIndex + " and column " + columnIndex + " is already full !");//Outputs an error message
										System.out.println("Please try again:");							
									}
								}
							}
							catch (Exception e) {															//Runs if it encounters an error
								System.out.println("Invalid input! Please try again:");						//Outputs an error message
								input.next();
							}
						}
						while (valid == false);																//Runs until row index and column index are valid
						valid = false;																		//Sets valid = false
					}
					else {																					//Runs if the entire room is full
						System.out.println("The room is FULL! There is NO more room to place any more tiles.");//Outputs the user that the room is full therefore it cannot add any further ties
					}
				}
				
				else if (option == 3) {																		//Runs if user option is 3 (remove a tile)
					try {
						System.out.println("Enter ROW where you wish to remove a tile");					//Prompts user for row index it wish to remove an tile
						rowIndex = input.nextInt();															//Stores row index
						System.out.println("Enter COLUMN where you wish to remove a tile");					//Prompts user for column index it wish to remove an tile
						columnIndex = input.nextInt();														//Stores column index
						if (rowIndex > row && columnIndex > column && rowIndex <= 0 && columnIndex <= 0) {	//Runs if row index and/or column index are too large for the array
							System.out.println("Invalid row and/or column, please enter a ROW between 1-" + row + " and a column between 1-" + column); //Outputs an error message
						}
						else {																				//Runs if user input is valid
							room.removeTile(rowIndex, columnIndex);											//Removes tile from the specified location
							System.out.println("Tile on ROW " + rowIndex + " and COLUMN " + columnIndex + " removed SUCCESSFULLY"); //Outputs the user that the tile was removed
						}
					}	
					catch (Exception e){																	//Runs if it encounters an error
						System.out.println("Invalid input! Please try again:");								//Outputs an error message
						input.next(); 
						
					}
				}
				
				else if (option == 4) {																		//Runs if user option is 4 (Print the tile array/room) 
					room.printTile();																		//Outputs the tile array/room
				}
				
				else if (option == 5) {																		//Runs if user option is 5 (Calculate total cost)
					totalCost = room.totalCost();															//Stores total cost
					System.out.println("Total Cost: $" +  totalCost);										//Outputs total cost
				}
				
				else if (option == 6) {																		//Runs if user option is 6 (Calculate total Area)
					totalArea = room.totalArea();															//Stores total area
					System.out.println("Total Area: " + totalArea + " feet");								//Outputs total area
				}
				
				else if (option == 7) {																		//Runs if user option is 7 (Clearing the room)
					room = new Room (row, column);															//Clears the room
					System.out.println("Room cleared");														//Outputs the user that the room is cleared
				}
				
				else if (option == 8) {																		//Runs if user option is 8 (Pay for all tiles)
					if (room.Payment() == false) {															//Runs if room is NOT full
						tileShopping = true;																//Sets tile shopping to true
						payment = false;																	//Sets payment to false (user cannot pay if room is not full)
					}
					
					else {																					//Runs if room is Full
						do {																				//Runs until user enters valid option 
							System.out.println("Option:");													//Outputs option
							System.out.println("1 - Create another room");									//Option to create a new room
							System.out.println("2 - Exit");													//Option to exit the program
							userOption = input.next();														//Stores user input
							if (!userOption.equals("1") && !userOption.equals("2"))							//Runs if user input is not 1 or 2
								System.out.println("Invalid input! Please try again:");						//Outputs an error message
						}
						while (!userOption.equals("1") && !userOption.equals("2"));							//Checks if user input is valid or not
						
						if (userOption.equals("1")){														//Runs if user decides to make another room 
							tileShopping = true;															//Sets tile shopping to true (user still wants to shop for tiles)
							payment = true;																	//Sets payment to true (User had paid for all tiles)
						}
						else {																				//Runs if user decides to exit program
							System.out.println("Thank you for shopping with us, have a marvelous day!");	//Greets user 
							tileShopping = false;															//Sets tile shopping to false (User does not want to shop for more tiles)
							payment = true;																	//Sets paymenet to true (User has paid for all tiles)
						}
					}
				}
			}
			while (payment == false);																		//Runs until user does not pay for all tiles
		}
		while (tileShopping == true);																		//Runs until user keeps on creating more rooms of tiles
	}
	
	/*
	 * This method converts user input from String to integer
	 * Whole point of this method is to avoid the program from crashing when user enters other data type than int
	 * pre: String option
	 * post: returns int option (if option = q or Q program stops)
	 */
	private static int Option (String option) {
		int userOption = 0;
		if (option.equals("q") || option.equals("Q")) {
			System.out.println("Have a nice day !");
			System.exit(1);
		}
		else {
			try {
				userOption = Integer.parseInt(option);
			}
			catch (Exception e) {
				userOption = -1;
			}
		}
		return userOption;
	}

	/*
	 * This method stores all the colours from ColourList.txt in an Hashset of type String 
	 * pre: none
	 * post: returns colour list
	 */
	public static HashSet<String> ColourList () throws FileNotFoundException {
		HashSet<String> colourList = new HashSet<String>();
		FileReader fr = new FileReader ("./Colours/ColourList.txt");
		Scanner scan = new Scanner (fr);
		while (scan.hasNext()) {
			colourList.add(scan.nextLine());
		}
		scan.close();
		return colourList;
	} 
	
}

