
public class Section2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	    List1 list = new List1();
		//Adds items to List
	    list.addatFront(5);
		list.addatFront(4);
		list.addatFront(4);
		list.addatFront(3);
		list.addatFront(2);
		list.addatFront(1);
		list.printList();
		
		//Testing the method contains ()
		System.out.println(list.contains(4));
		
		//Testing method deleteAll ()
		list.deleteAll(1);
		list.printList();
		
		//Testing method isOrderedlncreasing ()
		System.out.println(list.isOrderedlncreasing());
		
		//Testing method Insert ()
		list.Insert(6);
		list.printList();
		
		//Testing method isldentical ()
		List1 list1 = new List1 ();
		List1 list2 = new List1 ();
		list1.addatFront(1);
		list2.addatFront(1);
		System.out.println(list1.isldentical(list2));
	}
}

class List1 {
	
	Node head = null;
	class Node {
		private int info;
		private Node link;
		public Object item;
		
		public Node (int d, Node l) {
			info = d;
			link = l;
		}
	}
	
	/*
	 * This method prints List to the user
	 * pre: none
	 * post: prints List
	*/
	public void printList ( ) {
		for (Node temp = head; temp != null; temp = temp.link) 
			System.out.print(temp.info + "\t");
		System.out.println();
	}
	
	/*
	 * This method adds a Node to the front of List
	 * pre: item
	 * post: none
	*/
	public void addatFront(int item) {
		Node temp = head;
		head = new Node (item,temp);
	}
	
	/*
	 * This method returns true only when its implicit List object contains item.  
	 * pre: item
	 * post = true (if it contains item) or false (Does not contain item)
	*/
	public boolean contains (int item) {
		boolean located = false;
		for (Node temp = head; temp != null; temp = temp.link) {
			if (temp.info == item) {
				located = true;
				break;
			}
		}
		return located;
	}
	
	/*
	 * This method deletes all Nodes in the List that contain item in their info fields.
	 * pre: item
	 * post: none
	*/
	public void deleteAll (int item) {
		Node previous = null;
		Node current = head;
		while (current != null) {
			if (item == head.info) {
				head = head.link;
				current = current.link;
			}
			else if (item == current.info) {
				previous.link = current.link;
				current = current.link;
			}
			else {
				previous = current;
				current = current.link;
			}
		}
	}

	/*
	 * This method returns true only if the info fields of the List object are in strictly increasing order
	 * pre: none
	 * post: returns true or false
	*/
   public boolean isOrderedlncreasing () {
	   boolean increasing = true;
	   Node current = head;
	   while (current.link != null) {
		   if (current.info > current.link.info) {
			   increasing = false;
			   break;
			}
		   else {
			   current = current.link;
		   }
	   }
	   return increasing;
   }
   
   /*
    * This method inserts an item in List in the correct order
    *  pre: item
    *  post: none
   */
   public void Insert (int item) {
	   Node current = head;
	   boolean largest = true;
	   while (current.link != null) {
		   if (item < current.info) {
			   largest = false;
			   break;
		   }
		   else 
			   current = current.link;
		   	   
	   }
	
	   if (largest == true) {
		   Node temp = new Node (item, null);
		   current.link = temp;
	   }
	   else {
		   Node temp = new Node (current.info, current.link);
		   current.info = item;
		   current.link = temp;
	   }
   }
   
   /*
    * This method returns true only if its implicit List object is identical to other
    * pre: List other
    * post: true (identical) or false (not identical)
   */
   boolean isldentical (List1 other) {
	   boolean identical = true;
	   Node current = this.head;
	   Node current1 = other.head;
	   while (current != null && current1 != null ) {
		   if (current.info != current1.info) {
			   identical = false;
			   break;
		   }
		   else {
			   current = current.link;
			   current1 = current1.link;
		   }
	   }
	   return identical;
   }
}