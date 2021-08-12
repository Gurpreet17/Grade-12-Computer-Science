
public class Section1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List list = new List();					//Creates object list of type List
		for (int x = 1; x <= 10; x++) {			//Inserts values in list
			list.insert(x);
		}
		
		//Question 2
		list.printList();
		
		//Question 3
		System.out.println("The sum of list is " + list.sum());
		
		//Question 4
		list.deleteFirst();
		
		//Question 5
		list.deleteLast();
		
		//Question 6
		System.out.println(list.toString());
		
		//Question7
		list.addAtRear(11);
		System.out.println(list.toString());
		
		
		
		
	}
}

class Node {
	int data;
	Node next;
	
	public Node (int data, Node next) {
		this.data = data;
		this.next = next;
	}
}

class List {
	Node head;
	
	/*
	 * This method inserts values in list
	 * pre: data
	 * post: none
	*/
	public void insert (int data) {
		if (head == null) {
			head = new Node (data, null);
		}
		else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new Node (data,null);
		}
	}
	
	/*
	 * This method prints the list
	 * pre: none
	 * post: Outputs list
	*/
	public void printList () {
		Node current = head;
		if (current == null){
			System.out.println("The list is EMPTY");
		}
		else {
			while (current.next != null || current != null) {
				System.out.print(current.data + " \t");
				if (current.next != null)
					current = current.next;
				else {
					current = current;
					break;
				}
			}
			System.out.println();
		}
	}
	
	/*
	 * This method returns the sum of list
	 * pre: none
	 * post: returns sum
	*/	
	public int sum () {
		Node current = head;
		int sum = 0;
		while (current != null || current.next != null) {
			sum = sum + current.data;
			if (current.next != null)
				current = current.next;
			else {
				current = current;
				break;
			}
		}
		return sum;
	}	
	
	/*
	 * This method deletes the FIRST node of the list
	 * pre: none
	 * post: none
	*/	
	public void deleteFirst () {
		if (head == null) {
			System.out.println("WARNING - This list is empty !");
		}
		else {
			head = head.next;
		}
	}
	
	/*
	 * This method deletes the LAST node of the list
	 * pre: none
	 * post: none
	*/	
	public void deleteLast () {
		Node current = head; 
		if (head == null) {
			System.out.println("WARNING - This list is empty !");
		}
		else {
			while (current.next.next != null) {
				
				current = current.next;
			}
			current.next = null;
		}
	}
	
	/*
	 * This method returns a string that contains all the info fields of the list
	 * pre: none
	 * post: returns string
	*/
	public String toString () {
		Node current = head;
		String string = "";
		if (head == null) {
			string = "WARNING - This list is empty";
		}
		else {
			while (current.next != null || current != null) {
				string = string + current.data + "//";
				if (current.next != null)
					current = current.next;
				else {
					current = current;
					break;
				}
			}
		}
		return string;
	}
	
	public void addAtRear (int item) {
		Node current = head;
		if (head == null) {
			head = new Node (item,null);
		}
		else {
			while (current.next != null) {
				current = current.next;
			}
			System.out.println(current.data);
			current.next = new Node (item,null);
		}
	}
	
	
}
