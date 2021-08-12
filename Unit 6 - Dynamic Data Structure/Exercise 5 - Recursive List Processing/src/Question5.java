

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List5 list = new List5 ();
		System.out.println("List BEFORE deleting");
		list.insert (1);
		list.insert (2);
		list.insert (3);
		list.insert (4);
		list.printList();
		
		System.out.println("List AFTER deleting");
		list.delete();
		list.printList();
		
	}

}

class List5
{
   private Node head;
   
  /*
   * This method uses recursion to print the List
   * pre: none
   * post:none
   */
   public void printList ()
   {
      if (head != null)
         head.printList();
   }
   /*
    * This method uses recursion to insert items into the list in ascending order
    * pre:none
    * post: none
   */
   public void insert (int item)
   {
      if (head == null || item < head.info)
         // insert item as first node of original list
         head = new Node(item,head);
      else
         // call recursive version to
         // insert item in tail of non-empty list
         head.insert(item);
   }
   
   /*
    * This method deletes the last node in the List
    * pre: none
    * post: none
   */
   public void delete () {
	   if (head == null)
		   System.out.println("List is already empty");
	   else if (head.link == null)
		   head = null;
	   else 
		   head.delete();
   }

   class Node // an inner class
   {
      int info;
      Node link;

      Node (int i, Node n)
      {
         info = i;
         link = n;
      }
   
      /*
       * This method prints the list
       * pre: none
       * post: none
       */
      void printList ()
      {
    	  System.out.println(info);
    	  if (link != null) 
            link.printList();
      }
      
      /*
       * This method inserts items into the List in ascending order 
       * pre: none
       * post: none
       */
      void insert (int item)
      {
         if (link == null || item < link.info)
            // insert item right after first node
            link = new Node(item,link);
         else
            // insert after first node of non-empty tail
            link.insert(item);
      }
      
      /*
       * This method uses recursion to delete the last node in the List
       * pre: none
       * post: none
      */
      void delete () {
    	  if (link.link == null) 
    		  link = null;
    	  else 
    		  link.delete();
      }
   }
} 
