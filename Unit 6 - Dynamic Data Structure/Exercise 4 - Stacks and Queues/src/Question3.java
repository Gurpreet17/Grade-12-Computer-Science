
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue ();
		
		//Testing enqueue () method
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		
		//Testing printQueue () method
		queue.printQueue();
		
		//Testing peek () method
		System.out.println("Peek - " + queue.peek());
		
		//Testing dequeue () method
		queue.dequeue();
		queue.printQueue();
		

	}

}

class Queue {
	
	private Node front;
	private Node rear;
	
	class Node {
		private int info;
		private Node link;
		
		public Node (int i, Node l) {
			info = i;
			link = l;
		}
	}
	
	/*
	 * This method prints Queue to the user.
	 * pre: none
	 * post: prints List
	*/
	public void printQueue ( ) {
		for (Node temp = front; temp != null; temp = temp.link) 
			System.out.print(temp.info + "\t");
		System.out.println();
	}
	
	/*
	 * This method adds a new item onto one end (the rear) of the list
	 * pre: item
	 * post: none
	*/
	public void enqueue (int item) {
	   Node temp = new Node(item,null);
	   if (rear == null)
	      // queue was empty
	      front = rear = temp;
	   else
	      // add node at rear of queue
	      rear = rear.link = temp;
	} 
	
	/*
	 *This method returns the value of the item at the front 
	 *pre: none
	 *post: returns item at the front
	*/
	public int peek () {
		if (rear == null) 
			throw new RuntimeException("peek: empty queue");
		else 
			return front.info;
			
	}
	
	/*
	 * This method deletes and returns the item at the other end (the front) of the list 
	 * pre: none
	 * post: returns front item
	*/
	public int dequeue () {
		if (rear == null) 
			throw new RuntimeException("peek: empty queue");
		else {
			front = front.link;
			return front.info;
		}
	}
}
