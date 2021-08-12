/*
 * Author: Gurpreet Singh
 * Date: 2021-08-11
 * Purpose: This program prompts the user for non-negative integers until the user enters 0.
  			The integers are all stored in List and then printed to the user after 0 is entered 
 */
import java.util.Scanner;
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		List4 list = new List4 ();
		int integer;
		do {
			System.out.println("Enter a non-negative integer:");
			integer = input.nextInt();
			if (integer < 0)
				System.out.println("Invalid integer ! Please try again.");
			else
				list.insert(integer);
		}
		while (integer != 0);
		list.printList();
	}

}

class List4
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
