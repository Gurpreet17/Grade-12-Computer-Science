/*
 * Author: Gurpreet Singh
 * Date: 2021-08-11
 * Purpose: This program changes the insert () methods such that it inserts the item in the tail of a non-empty list.
 */
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List3 list = new List3 ();
		list.insert (2);
		list.insert (1);
		list.insert (4);
		list.insert (3);
		list.printList();
	}

}

class List3
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
    * This method uses recursion to insert items in the tail of a non-empty list
    * pre: none
    * post: none
    */
   public void insert (int item)
   {
      if (head == null)
    	  head = new Node (item, null);
      else {
    	  head.insert(item);
      }
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
       * This method inserts items in the tail of a non-empty list
       * pre: none
       * post: none
       */
      void insert (int item)
      {
         if (link == null)
            // insert item right after first node
            link = new Node(item,null);
         else
            // insert after first node of non-empty tail
            link.insert(item);
      }
   }
} 
