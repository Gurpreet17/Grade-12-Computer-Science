import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
public class Testing {

	public static void main(String[] args) throws FileNotFoundException  {
		// TODO Auto-generated method stub
		//CLASSES
		Scanner input = new Scanner (System.in);
		
		Title();
		Enter();
		
		//Test Case 1: Testing the Rectangle class.
		System.out.println("Case 1 - Testing Triangle class");
		Rectangle rectangle = new Rectangle ("red", 3,3);
		System.out.println(rectangle.toString());
		System.out.println("Area - " + rectangle.Area());
		System.out.println("Perimeter - " + rectangle.Perimeter());
		
		Enter();
		
		//Test Case 2: Testing the Square class 
		System.out.println("Case 2 - Testing Square class");
		Square square = new Square ("blue", 5);
		System.out.println(square.toString());
		System.out.println("Area - " + square.Area());
		System.out.println("Perimeter - " + square.Perimeter());
		
		Enter();
		
		//Test Case 3: Testing the Trapezoid class
		System.out.println("Case 3 - Testing Trapezoid class");
		Trapezoid trapezoid = new Trapezoid ("pink", 55, 15, 30, 20);
		System.out.println(trapezoid.toString());
		System.out.println("Area - " + trapezoid.Area());
		System.out.println("Perimeter - " + trapezoid.Perimeter());
		
		Enter();
		
		//Test Case 4: Testing the Ellipse class
		System.out.println("Case 4 - Testing the Ellipse class");
		double x = 7;
		double y = 6;
		Ellipse ellipse =  new Ellipse ("blue",x,y);
		System.out.println(ellipse.toString());
		System.out.println("Area - " + ellipse.Area());
		System.out.println("Circumference - " + ellipse.Circumference());
		
		Enter();
		
		//Test Case 5: Testing the Circle class
		System.out.println("Case 5 - Testing the Circle class");
		Circle circle = new Circle ("yellow", 5);
		System.out.println(circle.toString());
		System.out.println("Area - " + circle.Area());
		System.out.println("Circumference - " + circle.Circumference());
		
		Enter();

		//Test Case 6: Testing the Half-Circle class
		System.out.println("Case 6 - Testing the Half-Circle class");
		HalfCircle halfcircle = new HalfCircle ("violet", 3);
		System.out.println(halfcircle.toString());
		System.out.println("Area - " + halfcircle.Area());
		System.out.println("Circumference - " + halfcircle.Circumference());
		
		Enter();
		
		//Test Case 7: Testing the Donut class
		System.out.println("Case 7 - Testing the Donut class");
		Donut donut = new Donut ("orange", 6, 8);
		System.out.println(donut.toString());
		System.out.println("Area - " + donut.Area());
		System.out.println("Circumference - " + donut.Circumference());
		
		Enter();
		
		Room room = new Room (3,3);
		
		//Test Case 8: Testing the printTile() Method in Room class when ROOM IS EMPTY
		System.out.println("Case 8 - Testing the printTile() method in the Room class when ROOM IS EMPTY");
		room.printTile();
		
		Enter();
		
		//Test Case 9: Testing for insertTile() Method in Room class
		System.out.println("Case 9 - Testing for insertTile() Method in Room class");
		Tiles tile = new Square ("blue" , 5);
		room.insertTile(tile, 1, 1);
		System.out.println("Tile Inserted");
		
		Enter();
		
		//Test Case 10: Testing for printTile() Method in Room class when TILE IS INSERTED
		System.out.println("Case 10 - Testing for printTile() Method when TILE IS INSERTED");
		room.printTile();
		
		Enter();
		
		//Test Case 11: Testing for removeTile() Method in Room class
		System.out.println("Case 11 - Testing for removeTile() Method in Room class");
		room.removeTile(1,1);
		System.out.println("Tile Removed");
		
		Enter();
		
		//Test Case 12: Testing for printTile() Method in Room class when TILE IS REMOVED
		System.out.println("Case 12 - Testing for printTile() Method in Room class when TILE IS REMOVED");
		room.printTile();
		
		Enter();
		
		//Test Case 13: Testing for totalArea() method in Room class
		System.out.println("Case 13 - Testing for totalArea() method in Room class");
		Tiles rectangle1 = new Rectangle ("yellow", 4,4);
		Tiles circle1 = new Circle("maroon", 5);
		room.insertTile(rectangle1, 1, 1);
		room.insertTile(circle1, 2, 2);
		System.out.println("Total Area - " + room.totalArea() + " feet");
		
		Enter();
		
		//Test Case 14: Testing for totalCost() method in Room class
		System.out.println("Case 14 - Testing for totalCost() method in Room class");
		room.setPrice(2.50);
		System.out.println("Total Cost - $" + 	room.totalCost());
		
		Enter();
		
		//Test Case 15: Testing for RandomTile()  method in Room class
		System.out.println("Case 15 - Testing for RandomTile()  method in Room class");
		HashSet<String> colourList = new HashSet<String>();
		colourList = ColourList();
		Tiles tile2 = null;
		Room room2 = new Room (3,3);
		double maxWidth = 3;
		double maxLength = 3;
		int rowIndex;
		int columnIndex;
		boolean valid;
		while (room2.RoomStatus() == false) {
			tile2 = room2.RandomTile(maxWidth, maxLength, colourList);
			do {
				rowIndex = (int) (1 + (Math.random() * (3)));
				columnIndex = (int) (1 + (Math.random() * (3)));
				valid = room2.insertTile(tile2, rowIndex, columnIndex);
			}
			while (valid == false);
		}
		System.out.println("Random tiles generated successfully");
		
		Enter();
		
		//Test Case 16: Testing for printTile() Method in Room class when RANDOM TILES ARE GENERATED
		System.out.println("Case 16 - Testing for printTile() Method in Room class when RANDOM TILES ARE GENERATED");
		room2.printTile();
	
	
	}
	
	
	
	
	public static void Enter(){
		System.out.println();
		   System.out.println("Press \"ENTER\" to show the next test case.");
		   Scanner scanner = new Scanner(System.in);
		   scanner.nextLine();
	}
	
	public static void Title () {
		System.out.println(" ()()               ____ \r\n" + 
						" (..)              /|o  |\r\n" + 
						" /\\/\\  Test Cases /o|  o|\r\n" + 
						"c\\db/o.........../o_|_o_|\r\n" + 
						"           ");
	}
	
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
