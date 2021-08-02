
public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] list = {2,3,4,2,4,3,10,1};
		insertSort(list);
		for (int x = 0; x < list.length; x++) 
			System.out.print(list[x] + " \t");
		

	}
	
	public static void insertSort (double [] list) {
		for (int x = 0; x < list.length; x++) {
			double item = list[x];
			int i = x;
			while (i > 0 && item < list[i-1]) {
				list[i] = list[i-1]; 
				i--;
			}
			list[i] = item;
		}
	}

}
