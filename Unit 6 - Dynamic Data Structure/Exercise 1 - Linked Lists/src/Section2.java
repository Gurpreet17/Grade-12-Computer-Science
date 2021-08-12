import java.util.Scanner;
public class Section2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		//QUESTION 4
		LinkedList fraction = new LinkedList();
		for (int x = 1; x <= 3; x++){
			System.out.println("Enter fraction " + x + " NUMERATOR:");
			int numerator = input.nextInt();
			System.out.println("Enter fraction " + x + " DENOMINATOR:");
			int denominator = input.nextInt();
			
			if (x == 1) 
				fraction.insertFirst(numerator, denominator);
			else if (x == 2)
				fraction.insertSecond(numerator, denominator);
			else
				fraction.insertThird(numerator, denominator);
		}
		
		//QUESTION 5
		for (int x = 1; x <= 3; x++){
			System.out.println("Enter fraction " + x + " NUMERATOR:");
			int numerator = input.nextInt();
			System.out.println("Enter fraction " + x + " DENOMINATOR:");
			int denominator = input.nextInt();
			fraction.addatFront(numerator, denominator);
			fraction.printList();	
		}
		
		//QUESTION 6
		int option = 0;
		do {
			System.out.println("\t\t *MENU*");
			System.out.println("1 - Specify Any Fraction To Be Printed Out.");
			System.out.println("2 - Modify Any Specified Fraction In The List.");
			System.out.println("3 - Exit.");
			option = input.nextInt();
			if (option == 1) {
				System.out.println("Enter the nth fraction from the linked list to be printed out:");
				int location = input.nextInt();
				fraction.printFraction(location);
			}
				
			else if (option == 2) {
				System.out.println("Enter the nth fraction from the linked list to be changed:");
				int location = input.nextInt();
				System.out.println("Enter the NUMERATOR of nth fraction:");
				int numerator = input.nextInt();
				fraction.putNum(location, numerator);
				System.out.println("Enter the DENOMINATOR of nth fraction:");
				int denominator = input.nextInt();
				fraction.putDen(location, denominator);
			}
			else if (option == 3) 
				System.out.println("Have a good day !");
			else
				System.out.println("Invalid option, Please try again !");
		}
		while (option != 3);
		
		
	
	   
	    

	}

}

class Fraction {
	private int num;
	private int den;
	Fraction link ;
	
	public Fraction () {
		num = 1;
		den = 1;
		link = null;
	}
	
	public Fraction (int n, int d, Fraction f) {
		num = n;
		den = d;
		link = f;
	}
	
	public int num () {
		return num;
	}
	
	public int den () {
		return den;
	}
} 

class LinkedList {
	
	Fraction head;
	
	public void insertFirst (int n, int d){
		if (head == null) {
			head  = new Fraction (n,d,null);
		}
		else {
			head = head  = new Fraction (n,d,head.link);
		}
	}
	
	public void insertSecond (int n, int d){
		if (head.link == null) {
			head.link = new Fraction (n,d,null);
		}
		else {
			head.link = new Fraction (n,d,head.link.link);
		}
	}
	
	public void insertThird (int n, int d){
		if (head.link.link == null) {
			head.link.link = new Fraction (n,d,null);
		}
		else {
			head.link.link = new Fraction (n,d,head.link.link.link);
		}
	}
	
	public void addatEnd(int n, int d) {
		if (head == null) {
			head = new Fraction (n,d,null);
		}
		else {
			Fraction current = head;
			while (current.link != null) {
				current = current.link;
			}
			current.link = new Fraction (n,d,null);
		}
	}
	
	public void addatFront () {
		head = new Fraction (1,1,head.link);
	}
	
	public void addatFront(int n, int d) {
		Fraction temp = head;
		head = new Fraction (n,d,temp);
	}
	
	public boolean emptyList () {
		if (head == null)
			return true;
		else
			return false;
	}
	
	public void printList() {
		Fraction current = head;
		if (current == null){
			System.out.println("The list is EMPTY");
		}
		else {
			while (current.link != null || current != null) {
				System.out.print(current.num() + "/" + current.den() + " \t");
				if (current.link != null)
					current = current.link;
				else {
					break;
				}
			}
			System.out.println();
		}
	}
	
	public void printFraction(int x) {
		Fraction current = head;
		int count = 0;
		if (head == null) {
			System.out.println("The list is EMPTY");
		}
		else {
			while (count < x && (current.link != null || current != null)) {
				count++;
				if (current.link != null && count < x) {
					current = current.link;
				}
				else {
					break;
				}
			}
			if (count < x) {
				System.out.println(x + "th fraction does not EXIST !");
			}
			else {
				System.out.println(x + "th fraction is " + current.num() + "/" + current.den());
			}
		}
	}
	
	public int getNum (int x) {
		Fraction current = head;
		int count = 1;
		int num = 0;
		if (head == null) {
			num = -1;
		}
		else {
			while (count < x && (current.link != null || current != null)) {
				count++;
				if (current.link != null) {
					current = current.link;
				}
				else {
					break;
				}
			}
			if (count < x) {
				num =  -1;
			}
			else {
				num = current.num();
			}
		}
		return num;
	}
	
	public void putNum(int x, int n) {
		Fraction current = head;
		int count = 0;
		if (head == null) {
			System.out.println("The list is EMPTY");
		}
		else {
			while (count < x && (current.link != null || current != null)) {
				count++;
				if (current.link != null && count < x) {
					current = current.link;
				}
				else {
					break;
				}
			}
			if (count < x) {
				System.out.println(x + "th fraction does not EXIST !");
			}
			else {
				current = new Fraction (n,current.den(), current.link);
			}
		}
	}
	
	public int getDen (int x) {
		Fraction current = head;
		int count = 1;
		int den = 0;
		if (head == null) {
			den = -1;
		}
		else {
			while (count < x && (current.link != null || current != null)) {
				if (current.link != null)
					current = current.link;
				else 
					break;
				count++;
			}
		}
		
		if (count < x)
			den = -1; 
		else
			den = current.den();
		
		return den;
	}
	
	public void putDen(int x, int d) {
		Fraction current = head;
		int count = 1;
		
		if (head == null) {
			System.out.println("The list is EMPTY");
		}
		else {
			while (count < x && (current != null || current != null)) {
				count++;
				if (current.link != null && count < x) {
					current = current.link;
				}
				else {
					break;
				}
				
				if (count < x) {
					System.out.println(x + "th fraction does not EXIST !");
				}
				else {
					current = new Fraction (d,current.den(), current.link);
				}
			}
			
			
		}
			
	}
	
}