
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack ();
		
		//Testing push () method
		stack.push(1);
		stack.push(2);
		
		//Testing printStack () method
		stack.printStack();
		
		//Testing pop () method
		stack.pop();
		stack.printStack();
		
		//Testing isEmpty () method
		System.out.println(stack.isEmpty());
		
		

	}

}

class Stack {
	
	Node top = null;
	
	class Node {
		private int info;
		private Node link;
		
		public Node (int i, Node l) {
			info = i;
			link = l;
		}
	}
	
	/*
	 * This method prints Stack to the user.
	 * pre: none
	 * post: prints List
	*/
	public void printStack ( ) {
		for (Node temp = top; temp != null; temp = temp.link) 
			System.out.print(temp.info + "\t");
		System.out.println();
	}
	
	/*
	 * This method adds a new item onto one end of the list (the top).
	 * pre: item
	 * post: none
	*/
	public void push (int item) {
	   top = new Node(item,top);
	}
	
	/*
	 * This method returns the value of the item at the top.
	 * pre: none
	 * post: returns item at top
	*/
	public int peek () {
	   if (top == null)
	      throw new RuntimeException("peek: empty stack");
	   else
	      return top.info;
	} 

	/*
	 * this method deletes and returns the item at the top.
	 * pre: none
	 * post: returns item at the top
	*/
	public void pop () {
		if (top == null)
		      throw new RuntimeException("peek: empty stack");
		else
			top = top.link;
	}
	
	/*
	 * This method returns true if and only if the stack is empty.
	 * pre: none
	 * post: True (empty) or False (not empty)
	*/
	public boolean isEmpty () {	
		if (top == null) 
			return true;
		else 
			return false;
	}
}