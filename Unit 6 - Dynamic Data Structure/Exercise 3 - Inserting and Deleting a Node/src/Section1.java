
public class Section1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//TESTING ALL METHODS
		List list = new List();
		list.addatFront(1, 2);
		list.addatFront(1, 1);
		list.addatFront(1, 4);
		list.addatFront(3, 4);
		list.Sort();
		list.Insert(5, 4);
		list.printList();
		list.Remove(1, 4);
		list.printList();
	}
}

class List {
	
	Fraction head = null;
	class Fraction {
		private int num;
		private int den;
		private Fraction link;
		
		public Fraction (int n, int d, Fraction l) {
			num = n;
			den = d;
			link = l;
		}
	}
	
	/*
	 * This method prints List to the user
	 * pre: none
	 * post: prints List
	*/
	public void printList ( ) {
		for (Fraction temp = head; temp != null; temp = temp.link) 
			System.out.print(temp.num + "/" + temp.den + "\t");
		System.out.println();
	}
	
	/*
	 * This method adds a Fraction to the front of List
	 * pre: numerator and denominator
	 * post: none
	*/
	public void addatFront(int n, int d) {
		Fraction temp = head;
		head = new Fraction (n,d,temp);
	}
	
	/*
	 *This method sorts the List in order of values of Fractions (smallest to greatest)
	 *pre: none
	 *post: none 
	*/
	public void Sort () {
		Fraction small;
		for (Fraction top = head; top != null; top = top.link) {
			small = top;
			for (Fraction i = top; i != null; i = i.link) {
				if ((double) i.num/i.den < (double) small.num/small.den) {
					small = i;	
				}
				int n = small.num;
				int d = small.den;
				small.num = top.num;
				small.den = top.den;
				top.num = n;
				top.den = d;
			}
		}
	}
	
	/*
	 * This method inserts a fraction with num = n and den = d in the linked list in order of value.
	 * pre: numerator and denominator
	 * post: none
	*/
	public void Insert (int n, int d) {
		Fraction previous = null;
		Fraction current = head;
		boolean located = false;
		while (!located && current != null) {
			if ((double) n/d < (double) current.num/current.den) {
				located = true;
			}
			else {
				previous = current;
				current = current.link;
			}
		} 
		Fraction newFraction = new Fraction (n,d,current);
	      // set link to refer to new node
	      if (current == head)
	         head = newFraction;
	      else
	         previous.link = newFraction;
	}
	
	/*
	 *This method Removes a Fraction from List
	 *pre: numerator and denominator
	 *post: none 
	*/
	public void Remove(int n, int d) {
		Fraction current = head;
		Fraction previous = null;
		boolean located = false;
		if (head == null) 
			System.out.println("This list is EMPTY !");
		else {
			while (!located && current != null) {
				if (current.num == n && current.den == d)
					located = true;
				else {
					previous = current;
					current = current.link;
				}
			}
		}
		if (located == false) 
			System.out.println(n + "/" + d + " does not EXIST is List " + current.num + "/" + current.den);
		else if (current == head)
			head = head.link;
		else {
			previous.link = current.link;
		}
	}
}
