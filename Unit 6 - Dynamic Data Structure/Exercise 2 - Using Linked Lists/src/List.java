
class List {
	
	Node head = null;
	
	class Node {
		private int data;
		private Node link;
		
		public Node (int d, Node l) {
			data = d;
			link = l;
		} 
	}
	
	/*
	 * QUESTION 2
	 * This method prints the list
	 * pre: none
	 * post: prints List 
	*/
	public void printList () {
		for (Node temp = head; temp != null; temp = temp.link) {
			if (head == null) {
				System.out.println("This list is empty.");
				break;
			}
			else
				System.out.print(temp.data + "\t");
		}
	}
	
	/*
	 * QUESTION 3
	 * This method returns the sum of List
	 * pre: none
	 * post: returns sum 
	*/
	public int sum () {
		int sum = 0;
		for (Node temp = head; temp != null; temp = temp.link)
			sum = sum + temp.data;
		return sum;
	}
	
	
	/*
	 * QUESTION 4
	 * This method deletes the first node of a linked list.
	 * pre: none
	 * post: none
	*/
	public void deleteFirst () {
		if (head == null) 
			System.out.println("WARNING - This list is empty !");
		else {
			head = head.link;
		}
	}
	
	/*
	 * QUESTION 5
	 * This method deletes the last node of a linked list.
	 * pre: none
	 * post: none
	*/
	public void deleteLast () {
		if (head == null)
			System.out.println("WARNING - This list is empty !");
		else {
			Node temp = head;
			while (temp.link.link != null) {
				temp = temp.link;
			}
			temp.link = null;
		}
	} 
	
	/*
	 * QUESTION 6
	 * This method return a string that contains all the info fields of the list, separated by //
	 * pre: none
	 * post: string
	*/
	public String toString () {
		String string = "";
		if (head == null)
			string = "This list is empty !";
		else {
			for (Node temp = head; temp != null; temp = temp.link) {
				if (temp.link == null)
					string = string + temp.data;
				else
					string = string + temp.data + "//";
			}
		}
		return string;
	}
	
	/*
	 * QUESTION 7
	 * This method creates and adds a item at the end of the List
	 * pre: item
	 * post: none
	*/
	public void addAtRear (int item) {
		Node temp = head;
		if (head == null)
			head = new Node (item, null);
		else {
			while(temp.link != null)
				temp = temp.link;
			temp.link = new Node (item,null);
		}
	}
	
	
	
	
	
	
}
