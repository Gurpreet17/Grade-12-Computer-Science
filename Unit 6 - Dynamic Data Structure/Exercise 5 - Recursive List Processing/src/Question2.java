/*
 * Author: Gurpreet Singh
 * Date: 2021-08-11
 * Purpose: This program analyses the results when the if statement in the insert () method is swapped 
 *		     from if (head == null || item < head.info) to if (item < head.info || head == null).
 *			 The results should be a null pointer exception error
 */

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List2 list = new List2 ();
		//Returns java.lang.NullPointerException error
		list.insert (1);
		list.insert (2);
		list.insert (3);
		list.insert (4);
	}

}

class List2
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
    * post: returns java.lang.NullPointerException error
    */
   public void insert (int item)
   {
      if (item < head.info || head == null)
         // insert item as first node of original list
         head = new Node(item,head);
      else
         // call recursive version to
         // insert item in tail of non-empty list
         head.insert(item);
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
   }
} 