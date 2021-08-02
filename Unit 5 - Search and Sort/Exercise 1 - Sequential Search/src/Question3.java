import java.util.*;
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		//PART B
		System.out.println("Enter the length of the list to be searched:");
		int length = input.nextInt();
		int [] list = new int [length];
		int value = 1;
		for(int x = 0; x < length; x++) {
			System.out.println("Enter integer " + (x+1));
			list[x] = input.nextInt();
		}
		int [] temp = new int [list.length];
		for (int x = 0; x < list.length; x++) 
			temp[x] = list[x];
		
		do {
			System.out.println("Enter value to be located");
			value = input.nextInt();
			if (value == 0)
				break;
			int [] resultingList = seqSearch(list, value);
			System.out.print("Initial Array\t-\t");
			for (int x = 0; x < temp.length; x++) 
				System.out.print(temp[x] + "\t");
			System.out.print("\nResulting Array\t-\t");
			for (int x = 0; x < resultingList.length; x++)
				System.out.print(resultingList[x] + "\t");
			System.out.println();
		}
		while (value !=0);
			
		
			
	}
	
	
	/*
	 * PART A
	 * This method tries to locate the item in a array and interchange with the item that preceded it
	 * pre: array and item
	 * post: sorted array
	 */
	public static int [] seqSearch (int [] list, int item) {
		int temp = 0;
		for (int x = 0; x < list.length; x++) {
			if (list[x] == item && x != 0) {
				temp = list[x];
				list[x] = list[x-1];
				list[x-1] = temp;
				return list;
			}
		}
		return list;
	}
}
