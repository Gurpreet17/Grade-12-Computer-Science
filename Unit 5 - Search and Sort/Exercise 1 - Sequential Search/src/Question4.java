
public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] list = {4,3,9,5,7,2,8,4};
		int [] newlist = new int [list.length];
		for (int x = 0; x < list.length; x++)
			newlist[x] = list[x];
		int [] resultingList = seqSearch(newlist, 7);
		
		System.out.print("Initial Array\t-\t");
		for (int x = 0; x < list.length; x++) 
			System.out.print(list[x] + "\t");
		
		System.out.print("\nResulting Array\t-\t");
		for (int x = 0; x < resultingList.length; x++)
			System.out.print(resultingList[x] + "\t");
	}
	
	public static int [] seqSearch (int [] list, int item) {
		int temp = 0;
		int [] newList = list;
		for (int x = 0; x < newList.length; x++) {
			if (newList[x] == item && x != 0) {
				temp = list[x];
				newList[x] = newList[x-1];
				newList[x-1] = temp;
				return newList;
			}
		}
		return newList;
	}

}
