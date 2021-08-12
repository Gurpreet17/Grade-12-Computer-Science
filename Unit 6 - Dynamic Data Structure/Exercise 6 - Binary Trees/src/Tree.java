
public class Tree {
	
	private Node root;
	
	public void inPrint() {
		if (root!=null)
			root.inPrint();
	}
	
	public int sum() {
		if (root==null)
			return 0;
		else
			return root.sum();
	}

	public class Node {
		int info;  // can be a link to an object
		Node lChild;// refers to another Node or Null if empty
		Node rChild;
		
		Node (int i, Node l, Node r){
		// constructor for node
			info = i;
			lChild = l;
			rChild = r;
		}
		
		void inPrint() {
			if (lChild!=null)
				//prints non-empty left subtree
				lChild.inPrint();
			System.out.println(info);
			if (rChild!=null)
				//print non-empty right subree
				rChild.inPrint();
		}
		
		int sum () {
			int sum = 0;
			if (lChild != null)
				sum = sum + lChild.sum();
			if (rChild != null)
				sum = sum + rChild.sum(); 
			return sum;
		}
	}		
}

