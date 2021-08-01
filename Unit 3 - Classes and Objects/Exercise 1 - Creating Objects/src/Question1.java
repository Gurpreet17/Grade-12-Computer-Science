
public class Question1 {

	public static void main(String[] args) {
		//Exercise 1.5 - Creating Objects
		
		volleyball MVA200 = new volleyball();
		volleyball VLS300 = new volleyball();
		volleyball MVT500 = new volleyball();
		volleyball SKV5 = new volleyball();
		
		//Inventory system of MVA200 
		MVA200.weight = 280;
		MVA200.circumfrence = 67;
		MVA200.brand = "Mikasa";
		MVA200.colour = "yellow and blue";
		MVA200.price = 249;
		
		//Inventory system of VLS300 
		VLS300.weight = 280;
		VLS300.circumfrence = 67;
		VLS300.brand = "Mikasa";
		VLS300.colour = "yellow and blue";
		VLS300.price = 209;
		
		//Inventory system of MVT500
		MVT500.weight = 280;
		MVT500.circumfrence = 67;
		MVT500.brand = "Mikasa";
		MVT500.colour = "yellow and blue";
		MVT500.price = 209;
		
		//Inventory system of SKV5
		SKV5.weight = 180;
		SKV5.circumfrence = 67;
		SKV5.brand = "Mikasa";
		SKV5.colour = "yellow and cyan";
		SKV5.price = 79;
		
		//Question3
		double totalPrice = MVA200.price + VLS300.price + MVT500.price + SKV5.price; 
		System.out.println("The total price of the inventory is " + totalPrice +"zl");
	}
}

class volleyball {
	double  weight;			// in grams (start with the lowest listing)
	double circumfrence;	// circumference  // in cm
	double panels;			// the number of panels on the outside of the ball
	String brand;			// string representing the name of the manufacturer
	String colour;			// dominant color of ball
	double price; 			// the retail cost of the ball
}
